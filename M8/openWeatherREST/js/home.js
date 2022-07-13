$(document).ready(function () {
    getCurrentWeather();
    getFiveDayForecast();

});

function getCurrentWeather() {
    $('#weatherButton').click(function (event) {
        //window.location.reload(true);

        var apiKey = "80e583586099d47ea1db7775519aff7d";
        var zipCode = $('#zipcode').val();
        $('#errorMessages').empty();

        if ($('#weatherReport').is(':visible')) {
            var saveZip = window.name
            window.name = zipCode;
            location.reload();

        }

        $.ajax({
            type: 'GET',
            url: 'https://api.openweathermap.org/data/2.5/weather?zip=' + zipCode + ',us&exclude=hourly,daily&appid=' + apiKey + '&units=' + $('#dropDown').val(),
            success: function (data) {
                var cityName = data.name;

                var weather = data.weather[0].main;
                var description = data.weather[0].description;
                var temp = data.main.temp;
                var humidity = data.main.humidity;
                var wind = data.wind.speed;
                var icon = data.weather[0].icon;

                $('#currentCity').append(' ' + cityName);
                $('#currentWeather').append(weather + " : " + description);
                if ($('#dropDown').val() == 'imperial') {
                    $('#currentTemp').append(temp + ' F');
                } else {
                    $('#currentTemp').append(temp + ' C');
                }

                $('#currentHumidity').append(humidity + '%');
                $('#currentWind').append(wind + ' miles/hour');
                $('#currentImg').attr('src', 'http://openweathermap.org/img/w/' + icon + '.png');
                $('#errorMessages').hide();

                $('#weatherReport').show();
            },
            error: function () {
                $('#errorMessages').append($('<li>')).attr({ class: 'list-group-item list-group-item-danger' }).text("Zipcode: Please enter a 5 digits zip code.");

            }
        });
    })

}

function getFiveDayForecast() {
    $('#weatherButton').click(function (event) {



        var apiKey = "80e583586099d47ea1db7775519aff7d";
        var zipCode = $('#zipcode').val();
        var contentRows = $('#contentRows');
        var contentHead = $('#contentHead');

        $.ajax({
            type: 'GET',
            url: 'https://api.openweathermap.org/data/2.5/forecast?zip=' + zipCode + ',us&appid=' + apiKey + '&units=' + $('#dropDown').val(),
            success: function (data) {


                const months = ["JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"];
                var day1Date = eval(data.list[0].dt * 1000);
                var firstDate = new Date(day1Date);
                var secondDate = new Date(eval(data.list[6].dt * 1000));
                var thirdDate = new Date(eval(data.list[12].dt * 1000));
                var fourthDate = new Date(eval(data.list[18].dt * 1000));
                var fifthDate = new Date(eval(data.list[26].dt * 1000));

                //var image1 = $('#currentImg').attr('src', 'http://openweathermap.org/img/w/01n.png');                
                // $('#day1').append(firstDate.getDate() + ' ' + months[firstDate.getMonth()]);
                // $('#day2').append(firstDate.getDate() + ' ' + months[firstDate.getMonth()]);
                // $('#day3').append(firstDate.getDate() + ' ' + months[firstDate.getMonth()]);
                // $('#day4').append(firstDate.getDate() + ' ' + months[firstDate.getMonth()]);
                // $('#day5').append(firstDate.getDate() + ' ' + months[firstDate.getMonth()]);

                var header = '<tr>';
                header += '<th>' + firstDate.getDate() + ' ' + months[firstDate.getMonth()] + '</th>';
                header += '<th>' + secondDate.getDate() + ' ' + months[secondDate.getMonth()] + '</th>';
                header += '<th>' + thirdDate.getDate() + ' ' + months[thirdDate.getMonth()] + '</th>';
                header += '<th>' + fourthDate.getDate() + ' ' + months[fourthDate.getMonth()] + '</th>';
                header += '<th>' + fifthDate.getDate() + ' ' + months[fifthDate.getMonth()] + '</th>';
                header += '</tr>';


                var row = '<tr>';
                row += '<td><img style="width:50px;height:50px;" src="http://openweathermap.org/img/w/' + data.list[0].weather[0].icon + '.png">' + data.list[0].weather[0].main + '</td>';
                row += '<td><img style="width:50px;height:50px;" src="http://openweathermap.org/img/w/' + data.list[6].weather[0].icon + '.png">' + data.list[6].weather[0].main + '</td>';
                row += '<td><img style="width:50px;height:50px;"src="http://openweathermap.org/img/w/' + data.list[12].weather[0].icon + '.png">' + data.list[12].weather[0].main + '</td>';
                row += '<td><img style="width:50px;height:50px;"src="http://openweathermap.org/img/w/' + data.list[18].weather[0].icon + '.png">' + data.list[18].weather[0].main + '</td>';
                row += '<td><img style="width:50px;height:50px;"src="http://openweathermap.org/img/w/' + data.list[26].weather[0].icon + '.png">' + data.list[26].weather[0].main + '</td>';

                //row += '<td><img src="http://openweathermap.org/img/w/01n.png">' + data.list[0].weather[0].main + '<td>';
                row += '</tr>';

                if ($('#dropDown').val() == 'imperial') {
                    row += '<tr>';
                    row += '<td>' + data.list[0].main.temp + ' F</td>';
                    row += '<td>' + data.list[6].main.temp + ' F</td>';
                    row += '<td>' + data.list[12].main.temp + ' F</td>';
                    row += '<td>' + data.list[18].main.temp + ' F</td>';
                    row += '<td>' + data.list[26].main.temp + ' F</td>';
                    row += '</tr>';
                } else {
                    row += '<tr>';
                    row += '<td>' + data.list[0].main.temp + ' C</td>';
                    row += '<td>' + data.list[6].main.temp + ' C</td>';
                    row += '<td>' + data.list[12].main.temp + ' C</td>';
                    row += '<td>' + data.list[18].main.temp + ' C</td>';
                    row += '<td>' + data.list[26].main.temp + ' C</td>';
                    row += '</tr>';
                }


                contentRows.append(row);
                contentHead.append(header);

                $('#weatherReport').show();
            }
        });
    })
}
