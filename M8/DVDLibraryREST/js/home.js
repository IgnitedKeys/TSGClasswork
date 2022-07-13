$(document).ready(function () {

    loadDvds();
    addDvd();
    updateDvd();

});

function loadDvds() {
    clearContactTable();
    var contentRows = $('#contentRows');

    $.ajax({
        type: 'GET',
        url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvds',
        success: function (dvdArray) {
            $.each(dvdArray, function (index, dvd) {

                var title = dvd.title;

                var releaseYear = dvd.releaseYear;
                var director = dvd.director;
                var rating = dvd.rating;
                var dvdId = dvd.id;



                var row = '<tr>';
                row += '<td> <a onclick ="showDvdInfo(' + dvdId + ')" href="javascript:void(0);">' + title + '</a></td>';
                row += '<td>' + releaseYear + '</td>';
                row += '<td>' + director + '</td>';
                row += '<td>' + rating + '</td>';
                row += '<td> <a onclick="showEditForm(' + dvdId + ')" href="javascript:void(0);">' + "edit" + '</a>' + " | " + '<a onclick="deleteAlert(' + dvdId + ');"  href="javascript:void(0);">' + "delete" + '</a></td>|';

                row += '</tr>';

                contentRows.append(row);
            });
        },
        error: function () {
            $('#errorMessages')
                .append($('<li>')
                    .attr({ class: 'list-group-item list-group-item-danger' })
                    .text('Error calling web service. Please try again later'));
        }
    })
}

function clearContactTable() {
    $('#contentRows').empty();
}

function showCreateForm() {
    $('#errorMessages').empty();

    $("#mainPageDiv").hide();
    $("#addFormDiv").show();
}

function hideCreateForm() {
    $('#errorMessagesAdd').empty();

    $('#mainPageDiv').show();
    $('#addFormDiv').hide();
}

function addDvd() {
    $("#addButton").click(function (event) {

        var haveValidationErrors = checkAddValidationErrors($('#addForm').find('input'));

        if (haveValidationErrors) {
            //$('#errorMessagesAdd').append($('<li>').attr({class: "list-group-item list-group-item-danger"})
            //.text("Title and 4-digit Release Year are required"));
            return false;

        }
        $.ajax({
            type: 'POST',
            url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvd',
            data: JSON.stringify({
                title: $('#addTitle').val(),
                releaseYear: $('#addYear').val(),
                director: $('#addDirector').val(),
                rating: $('#addRating').val(),
                notes: $('#addNotes').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'data-Type': 'json',
            success: function () {
                $('#errorMessagesAdd').empty();
                $('#addTitle').val('');
                $('#addYear').val('');
                $('#addDirector').val('');
                $('#addRating').val('');
                $('#addNotes').val('');

                hideCreateForm();
                loadDvds();
            },
            error: function () {
                $('#errorMessagesAdd')
                    .append($('<li>')
                        .attr({ class: 'list-group-item list-group-item-danger' })
                        .text('Error calling web service. Please try again later.'));
            }
        })
    });
}

function deleteAlert(dvdId) {
    let confirmAction = confirm("Are you sure you want to delete this dvd from your collection?");
    if (confirmAction) {
        $.ajax({
            type: 'DELETE',
            url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvd/' + dvdId,
            success:
                function () {
                    loadDvds();
                }

        });
    }

}

function showEditForm(id) {
    $('#errorMessagesEdit').empty();
    //$('#errorMessage').empty();

    $.ajax({
        type: 'GET',
        url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvd/' + id,
        success: function (data, status) {
            $('#editTitle').val(data.title);
            $('#editYear').val(data.releaseYear);
            $('#editDirector').val(data.director);
            $('#editRating').val(data.rating);
            $('#editNotes').val(data.notes);
            $('#editDvdId').val(parseInt(data.id));
        },
        error: function () {
            $('#errorMessagesEdit')
                .append($('<li>')
                    .attr({ class: 'list-group-item list-group-item-danger' })
                    .text('Error calling web service. Please try again later.'));
        }

    });

    $('#mainPageDiv').hide();
    $('#editFormDiv').show();
}

function hideEditForm() {
    $('#errorMessagesEdit').empty();

    $('#editTitle').val('');
    $('#editYear').val('');
    $('#editDirector').val('');
    $('#editRating').val('');
    $('#editNotes').val('');

    //$('#editDvdId').val('');
    $('#mainPageDiv').show();
    $('#editFormDiv').hide();
}




function updateDvd(dvdId) {
    $('#updateButton').click(function (event) {

        var haveValidationErrors = checkEditValidationErrors($('#editForm').find('input'));

        if (haveValidationErrors) {

            return false;
        }

        $.ajax({
            type: 'PUT',
            url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvd/' + $('#editDvdId').val(),
            data: JSON.stringify({
                id: $('#editDvdId').val(),

                title: $('#editTitle').val(),
                releaseYear: $('#editYear').val(),
                director: $('#editDirector').val(),
                rating: $('#editRating').val(),
                notes: $('#editNotes').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            //dataType: 'json',
            'success': function () {
                $('#errorMessagesEdit').empty();
                hideEditForm();
                loadDvds();
            },
            'error': function () {
                $('#errorMessagesEdit')
                    .append($('<li>')
                        .attr({ class: 'list-group-item list-group-item-danger' })
                        .text('Error calling web service. Please try again later.'));
            }
        });

    })
}

function showDvdInfo(dvdId) {
    $('#errorMessages').empty();

    clearDvdData();

    var dvdHeader = $('#dvdHeader');
    var dvdYear = $('#dvdYear');
    var dvdDirector = $('#dvdDirector');
    var dvdRating = $('#dvdRating');
    var dvdNotes = $('#dvdNotes');

    $.ajax({
        type: 'GET',
        url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvd/' + dvdId,
        success: function (data, status) {
            dvdHeader.append(data.title);
            dvdYear.append(data.releaseYear);
            dvdDirector.append(data.director);
            dvdRating.append(data.rating);
            dvdNotes.append(data.notes);
        }
    });

    $('#mainPageDiv').hide();
    $('#dvdInfoDiv').show();
}

function hideDvdInfo() {


    $('#mainPageDiv').show();
    $('#dvdInfoDiv').hide();
}

function clearDvdData() {


    $('#dvdHeader').empty();
    $('#dvdYear').empty();
    $('#dvdDirector').empty();
    $('#dvdRating').empty();
    $('#dvdNotes').empty();

}

function searchDvds() {
    $('#errorMessages').empty();
    clearContactTable();

    var contentRows = $('#contentRows');
    var searchTerm = $('#searchTerm');
    var category = $('#dropDown option');
    $.ajax({
        type: 'GET',
        url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvds/' + $('#dropDown').val() + '/' + $('#searchTerm').val(),
        success: function (dvdArray) {
            $.each(dvdArray, function (index, dvd) {
                var title = dvd.title;

                var releaseYear = dvd.releaseYear;
                var director = dvd.director;
                var rating = dvd.rating;
                var dvdId = dvd.id;



                var row = '<tr>';

                row += '<td> <a onclick ="showDvdInfo(' + dvdId + ')" href="javascript:void(0);">' + title + '</a></td>';
                row += '<td>' + releaseYear + '</td>';
                row += '<td>' + director + '</td>';
                row += '<td>' + rating + '</td>';
                row += '<td> <a onclick="showEditForm(' + dvdId + ')" href="javascript:void(0);">' + "edit" + '</a>' + " | " + '<a onclick="deleteAlert(' + dvdId + ');"  href="javascript:void(0);">' + "delete" + '</a></td>|';
                //row +=  '<td> <a onclick="showAddForm()">' + "edit" + '</a></td>';
                // row += '<td> <a onclick="deleteAlert(this);"  href="javascript:void(0);">' + "delete" + '</a></td>';
                row += '</tr>';

                contentRows.append(row);






            });
        },
        error: function () {
            $('#errorMessages')
                .append($('<li>')
                    .attr({ class: 'list-group-item list-group-item-danger' })
                    .text('Both Search Category and Search Term are required.'));
        }
    })

}

function checkAddValidationErrors(input) {
    $('#errorMessagesAdd').empty();

    var errorMessages = [];

    input.each(function (index) {
        if (index == $('#addYear').val() < 1000) {
            var errorField = $('label[for=' + this.id + ']').text();
            errorMessages.push(errorField + ' Please enter 4-digits year');
        }
        if (index == $('#addTitle').val() && this.validity.valueMissing) {
            var errorField = $('label[for=' + this.id + ']').text();
            errorMessages.push(errorField + ' Please enter a title for the DVD');
        }
        if (this.validity.valueMissing && index == $('#addYear').val()) {
            var errorField = $('label[for=' + this.id + ']').text();
            errorMessages.push(errorField + 'Please enter a 4-digit year');
        }
        // if (!this.validity.valid) {
        //     var errorField = $('label[for=' + this.id + ']').text();
        //     errorMessages.push(errorField + ' ' + this.validationMessage);
        // }
    });

    if (errorMessages.length > 0) {
        $.each(errorMessages, function (index, message) {
            $('#errorMessagesAdd').append($('<li>').attr({ class: 'list-group-item list-group-item-danger' }).text(message));
        });
        // return true, indicating that there were errors
        return true;
    } else {
        // return false, indicating that there were no errors
        return false;
    }
}

function checkEditValidationErrors(input) {
    $('#errorMessagesEdit').empty();

    var errorMessages = [];

    input.each(function () {
        if (!this.validity.valid) {
            var errorField = $('label[for=' + this.id + ']').text();
            errorMessages.push(errorField + ' ' + this.validationMessage);
        }
    });

    if (errorMessages.length > 0) {
        $.each(errorMessages, function (index, message) {
            $('#errorMessagesEdit').append($('<li>').attr({ class: 'list-group-item list-group-item-danger' }).text(message));
        });
        // return true, indicating that there were errors
        return true;
    } else {
        // return false, indicating that there were no errors
        return false;
    }
}