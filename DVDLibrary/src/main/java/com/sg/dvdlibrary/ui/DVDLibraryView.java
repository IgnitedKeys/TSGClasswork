/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;
import java.util.Map;

/**
 *
 * @author angeladrees
 */
public class DVDLibraryView {

    private UserIO io;

    public DVDLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndSelection() {
        io.print("Main Menu");
        io.print("1. List of all DVDs");
        io.print("2. Add a DVD");
        io.print("3. Delete a DVD");
        io.print("4. Edit a DVD's information");
        io.print("5. View DVD information");
        io.print("6. Find all DVDs in a specific year");
        io.print("7. Find all DVDs with a specific rating");
        io.print("8. Find all DVDs with a specific director");
        io.print("9. Find all DVds with a specific studio");
        io.print("10. Find Average Age");
        io.print("11. Newest Movie");
        io.print("12. Oldest Movie");
        io.print("13. Exit");

        return io.readInt("Please select an option.", 1, 6);
    }

    public DVD getNewDvdInfo() {
        String title = io.readString("Please enter the title");
        String releaseDate = io.readString("Please enter the release date");
        String rating = io.readString("Please enter the MPAA rating");
        String directorName = io.readString("Please enter the director's name");
        String studio = io.readString("Please enter the studio");
        String userRating = io.readString("Please enter your own review/thoughts!");
        DVD newDvd = new DVD(title);
        newDvd.setReleaseDate(Integer.parseInt(releaseDate));
        newDvd.setRating(rating);
        newDvd.setDirectorsName(directorName);
        newDvd.setStudio(studio);
        newDvd.setUserRating(userRating);
        return newDvd;
    }

    public void displayAddDvdBanner() {
        io.print("=== ADD DVD ===\n");
    }

    public void displayAddDvdSuccess() {
        io.readString("DVD added. Please press enter to continue");
    }

    //alpha?
    public void displayDvdList(List<DVD> dvdList) {
        if (dvdList.isEmpty()) {
            io.print("No movies entered! Please add some!\n");
        }
        for (DVD currentDVD : dvdList) {
            String dvdInfo = String.format("%s -- %s ",
                    currentDVD.getTitle(),
                    currentDVD.getReleaseDate());
            io.print(dvdInfo);
        }
    }

    public void displayAllDvdBanner() {
        io.print("=== LIST DVD ===\n");
    }

    public void displaySuccessBanner() {
        io.readString("Please press enter to continue.");
    }

    //if empty? TODO!!!
    public void displayRemoveDVD(DVD dvd) {
        if (dvd != null) {
            io.readString("DVD Deleted. Please press enter to continue");
        } else {
            io.print("DVD does not exist.");
            io.readString("Please press enter to continue");
        }
    }


    public void displayDVDInfo(DVD dvd) {
        if (dvd != null) {
            String dvdInfo = String.format("Title: %s\nReleased: %s \nMPAA Rating: %s\nDirected By: %s\nStudio: %s\nUser Review: %s",
                    dvd.getTitle(),
                    dvd.getReleaseDate(),
                    dvd.getRating(),
                    dvd.getDirectorsName(),
                    dvd.getStudio(),
                    dvd.getUserRating());
            io.print(dvdInfo + "\n");

        } else {
            io.print("DVD does not exist.\n");
        }
        io.readString("Please press enter to continue");
    }

    public void displayDVDInfoBanner() {
        io.print("=== VIEW DVD ===\n");
    }

    public DVD editInfoMenu(String title, DVD dvd) {
        io.print("1. Release Date");
        io.print("2. MPAA Rating");
        io.print("3. Director's Name");
        io.print("4. Studio Name");
        io.print("5. User Review");
        int userOption = io.readInt("Please select what you would like to edit for " + title, 1, 5);
        String userEdit = io.readString("Please enter edit info.");
        //DVD editedDVD = dvd;
        switch (userOption) {
            case 1:
                dvd.setReleaseDate(Integer.parseInt(userEdit));
                break;
            case 2:
                dvd.setRating(userEdit);
                break;
            case 3:
                dvd.setDirectorsName(userEdit);
                break;
            case 4:
                dvd.setStudio(userEdit);
                break;
            case 5:
                dvd.setUserRating(userEdit);
                break;
            default:
                unknownCommand();
                break;
        }
        return dvd;
    }

    public void displayAllDVDsInYear(List<DVD> listOfDVD) {
        if (listOfDVD.isEmpty()) {
            io.print("No movies in given year!\n");
        }
        for (DVD currentDVD : listOfDVD) {

            io.print(currentDVD.getTitle());
        }
    }
    
    public void displayAllDVDsByRating(List<DVD> listOfDVD) {
        if (listOfDVD.isEmpty()) {
            io.print("No movies with that rating!\n");
        }
        for(DVD currentDVD : listOfDVD) {
            io.print(currentDVD.getTitle());
        }
    }
    
    public void displayAllDVDsDirector(Map<String, List<DVD>> listOfDVD) {
        if (listOfDVD.isEmpty()) {
            io.print("No movies with that director!\n");
        }
        listOfDVD.forEach((k,v) -> io.print(k + ":" + v));
    }
    
    public void displayAllDVDsStudio(List<DVD> listOfDVD){
        if(listOfDVD.isEmpty()) {
            io.print("No movies with that studio\n");
        }
        for(DVD currentDVD : listOfDVD) {
            io.print(currentDVD.getTitle());
        }
    }
    
    public void displayAverageAge(double average) {
        io.print("The average movie age in library is " + average);
    }
    
    public void displayNewestMovie(DVD dvd) {
        io.print("The newest movie in the library is " + dvd.getTitle() + "--" + dvd.getReleaseDate());
    }
    
    public void displayOldestMovie(DVD dvd) {
        io.print("The oldest movie in the library is " + dvd.getTitle() + "--" + dvd.getReleaseDate());
    }

    public void displayEditDVDBanner() {
        io.print("=== EDIT DVD ===\n");
    }

    public void displayGoodBye() {
        io.print("Logging off...");
    }

    public void unknownCommand() {
        io.print("Unknown Command");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
        public void displayDeleteDvdBanner() {
        io.print("=== DELETE DVD ===\n");
    }

    public String getDVDTitle() {
        return io.readString("Please enter DVD title");
    }
    
    public int getDVDYear() {
        return io.readInt("Please enter released year");
    }

    public String getDVDRating() {
        return io.readString("Please enter rating");
    }
    
    public String getDVDDirector() {
        return io.readString("Please enter director's name");
    }
    
    public String getDVDStudio() {
        return io.readString("Please enter studio name");
    }
    
    
    
    public boolean dvdExist(DVD dvd) {
        boolean doesExist = true;
        if (dvd == null) {
            doesExist = false;
        }
        return doesExist;
    }

    public void dvdNotExist() {
        io.print("Dvd does not exist. Cannot edit");
    }

   public void displayFindReleaseBanner(){
       io.print("=== Find DVDs by Release Year ===");
   }
   
   public void displayFindRatingBanner() {
       io.print("=== Find DVDs by Rating ===");
   }
   
   public void displayFindDirectorBanner() {
       io.print("=== Find DVDs by Director ===");
   }
   
   public void displayFindStudioBanner() {
       io.print("=== Find DVDs by Studio ===");
   }
   
   public void displayFindAverageAgeBanner() {
       io.print("=== Average Age ===");
   }
   
   public void displayFindNewestBanner() {
       io.print("=== Newest Movie ===");
   }
   
   public void displayFindOldestBanner() {
       io.print("=== Oldest Movie ===");
   }
}
