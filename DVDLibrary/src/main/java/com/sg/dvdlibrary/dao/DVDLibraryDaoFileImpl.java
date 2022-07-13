
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author angeladrees
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {
    
    //hashMap for DVDs
    Map<String, DVD> dvds = new HashMap<>();
    
    //public static final String DVD_FILE = "dvdLibrary.txt";
    private final String DVD_FILE;
    
    public DVDLibraryDaoFileImpl(){
        DVD_FILE = "dvdLibrary.txt";
    }
    public DVDLibraryDaoFileImpl (String fileName){
        DVD_FILE= fileName;
    }
    
    public static final String DELIMITER = "::";
    

    @Override
    public DVD addDVD(String title, DVD dvd) throws DVDLibraryDaoException {
        loadLibrary();
        DVD prevDvd = dvds.put(title, dvd);
        writeLibrary();
        return prevDvd;
    }

    @Override
    public DVD removeDVD(String title) throws DVDLibraryDaoException {
        loadLibrary();
        DVD dvdRemove = dvds.remove(title);
        writeLibrary();
        return dvdRemove;
    }

    @Override
    public DVD editDVD(String title, DVD dvd) throws DVDLibraryDaoException {
        loadLibrary();
        DVD editedDVD = dvds.put(title,dvd);
        writeLibrary();
        return editedDVD;
    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryDaoException {
        loadLibrary();
        return new ArrayList(dvds.values());
    }

    @Override
    public DVD getDVD(String title) throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.get(title);
    }
    
    private DVD unmarshallDVD(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);
        String title = dvdTokens[0];   
        DVD dvdFromFile = new DVD(title);
        dvdFromFile.setReleaseDate(Integer.parseInt(dvdTokens[1]));
        dvdFromFile.setRating(dvdTokens[2]);
        dvdFromFile.setDirectorsName(dvdTokens[3]);
        dvdFromFile.setStudio(dvdTokens[4]);
        dvdFromFile.setUserRating(dvdTokens[5]);
        
        return dvdFromFile;
    }
    
    private void loadLibrary() throws DVDLibraryDaoException {
        Scanner scanner;
        
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(DVD_FILE)));
        } catch(FileNotFoundException e) {
            throw new DVDLibraryDaoException("Could not load dvd library into memory.", e);
        }
        String currentLine;
        DVD currentDVD;
        while(scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentDVD = unmarshallDVD(currentLine);
            
            dvds.put(currentDVD.getTitle(),currentDVD);
        }
        scanner.close();
    }
    
    private String marshallDVD(DVD aDvd) {
        String aDvdAsText = aDvd.getTitle() + DELIMITER;
        aDvdAsText += aDvd.getReleaseDate() + DELIMITER;
        aDvdAsText += aDvd.getRating() + DELIMITER;
        aDvdAsText += aDvd.getDirectorsName() + DELIMITER;
        aDvdAsText+= aDvd.getStudio() + DELIMITER;
        aDvdAsText += aDvd.getUserRating();
        
        return aDvdAsText;
    }
    
    private void writeLibrary() throws DVDLibraryDaoException {
        
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(DVD_FILE));
        } catch(IOException e) {
            throw new DVDLibraryDaoException("Could not save dvd date",e);
        }
        String dvdAsText;
        List<DVD> dvdList = this.getAllDVDs();
        for(DVD dvd : dvdList) {
            dvdAsText = marshallDVD(dvd);
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
    }

    @Override
    public List<DVD> findAllReleaseYear(int year) {
        List<DVD> dvdList = new ArrayList(dvds.values());
        List<DVD> releasedInYear = dvdList.stream().filter((d) -> d.getReleaseDate() == year).collect(Collectors.toList());
        return releasedInYear;
    }

    @Override
    public List<DVD> findAllRating(String rating) {
        List<DVD> dvdList = new ArrayList(dvds.values());
        List<DVD> ratingList = dvdList.stream().filter((d) -> d.getRating().equals(rating)).collect(Collectors.toList());
        return ratingList;
    }

    //SORT ME!!!!
    @Override
    public Map<String, List<DVD>> findAllDirector(String directorName) {
        List<DVD> dvdList = new ArrayList(dvds.values());
        //List<DVD> directorList = dvdList.stream().filter((d) -> d.getDirectorsName().equals(directorName)).collect(Collectors.toList());
        Map<String, List<DVD>> directorRatings = dvdList.stream().filter((d) -> d.getDirectorsName().equals(directorName)).collect(Collectors.groupingBy((r) -> r.getRating()));
        return directorRatings;
    }

    @Override
    public List<DVD> findAllStudio(String studioName) {
        List<DVD> dvdList = new ArrayList(dvds.values());
        List<DVD> studioList = dvdList.stream().filter((d) -> d.getStudio().equals(studioName)).collect(Collectors.toList());
        return studioList;
    }

    @Override
    public int averageAgeOfMovies() {
        List<DVD> dvdList = new ArrayList(dvds.values());
        double total = dvdList.stream().mapToDouble((x) -> x.getReleaseDate()).average().orElse(0.0);
        return (int)Math.round(total);
    }

    @Override
    public DVD newestMovie() {
        List<DVD> dvdList = new ArrayList(dvds.values());
        DVD newest = dvdList.stream().max(Comparator.comparing(DVD::getReleaseDate)).orElseThrow();
        return newest;
    }

    @Override
    public DVD oldestMovie() {
        List<DVD> dvdList = new ArrayList(dvds.values());
        DVD oldest = dvdList.stream().min(Comparator.comparing(DVD::getReleaseDate)).orElseThrow();
        return oldest;
    }

}
