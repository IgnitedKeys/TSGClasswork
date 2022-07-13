/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gavinlinnihan
 */
public class DVDLibraryDaoFileImplTest {

    DVDLibraryDao testDao;

    public DVDLibraryDaoFileImplTest() {
        
    }

    @BeforeEach
    public void setUp() throws Exception {

        String testFile = "testLibrary.txt";
        new FileWriter(testFile);
        testDao = new DVDLibraryDaoFileImpl(testFile);
    }

    @Test
    public void testAddDVD() throws Exception {
        String testFile = "testLibrary.txt";
        new FileWriter(testFile);
        testDao = new DVDLibraryDaoFileImpl(testFile);

        String title = "The Shawshank Redemption";
        DVD dvd = new DVD(title);
        dvd.setRating("R");
        dvd.setDirectorsName("Darabont");
        dvd.setReleaseDate(1994);
        dvd.setStudio("Warner Brothers");
        dvd.setUserRating("A Classic");

        //Add DVD to DAO
        testDao.addDVD(title, dvd);
        //Get DVD Object from DAO
        DVD retrievedDVD = testDao.getDVD(title);
        //Assert
        assertEquals(dvd.getTitle(), retrievedDVD.getTitle(), "Checking title");
        assertEquals(dvd.getRating(), retrievedDVD.getRating(), "Checking rating");
        assertEquals(dvd.getDirectorsName(), retrievedDVD.getDirectorsName(), "Checking director's name");
        assertEquals(dvd.getStudio(), retrievedDVD.getStudio(), "Checking studio");
        assertEquals(dvd.getReleaseDate(), retrievedDVD.getReleaseDate(), "Checking release date");
        assertEquals(dvd.getUserRating(), retrievedDVD.getUserRating(), "Checking user rating");

    }

    @Test
    public void testGetAllDVDs() throws Exception {
        DVD firstDVD = new DVD("The Shawshank Redemption");
        firstDVD.setRating("R");
        firstDVD.setDirectorsName("Darabont");
        firstDVD.setStudio("Warner Brothers");
        firstDVD.setReleaseDate(1994);
        firstDVD.setUserRating("A Classic");

        DVD secondDVD = new DVD("The Wailing");
        secondDVD.setRating("TV-MA");
        secondDVD.setDirectorsName("Na Hong-Jin");
        secondDVD.setStudio("20 Century Fox Korea");
        secondDVD.setReleaseDate(2016);
        secondDVD.setUserRating("Favorite Horror Movie");

        //add to DAO
        testDao.addDVD(firstDVD.getTitle(), firstDVD);
        testDao.addDVD(secondDVD.getTitle(), secondDVD);

        //get list of DVD
        List<DVD> allDVDs = testDao.getAllDVDs();

        //assert
        assertNotNull(allDVDs, "The list should not be null");
        assertEquals(2, allDVDs.size(), "The list should have two DVDs");

        assertTrue(allDVDs.contains(firstDVD), "The list should include Shawshank");
        assertTrue(allDVDs.contains(secondDVD), "The list should include Wailing");

    }

    @Test
    public void testRemoveDVD() throws Exception {
        DVD firstDVD = new DVD("The Shawshank Redemption");
        firstDVD.setRating("R");
        firstDVD.setDirectorsName("Darabont");
        firstDVD.setStudio("Warner Brothers");
        firstDVD.setReleaseDate(1994);
        firstDVD.setUserRating("A Classic");

        DVD secondDVD = new DVD("The Wailing");
        secondDVD.setRating("TV-MA");
        secondDVD.setDirectorsName("Na Hong-Jin");
        secondDVD.setStudio("20 Century Fox Korea");
        secondDVD.setReleaseDate(20216);
        secondDVD.setUserRating("Favorite Horror Movie");

        //add to DAO
        testDao.addDVD(firstDVD.getTitle(), firstDVD);
        testDao.addDVD(secondDVD.getTitle(), secondDVD);

        //remove firstDVD and assert
        DVD removedDVD = testDao.removeDVD(firstDVD.getTitle());
        assertEquals(removedDVD, firstDVD, "The removed DVD should be Shawshank");
        
        //Get list of students and assert
        List<DVD> allDVDs = testDao.getAllDVDs();
        assertNotNull(allDVDs,"The list should not be null");
        assertEquals(1, allDVDs.size(), "The list should have 1 DVD");
        
        assertFalse(allDVDs.contains(firstDVD),"The list should not have Shawshank");
        assertTrue(allDVDs.contains(secondDVD), "The list should have Wailing");
        
        //remove secondDVD
        removedDVD = testDao.removeDVD(secondDVD.getTitle());
        assertEquals(removedDVD, secondDVD, "The removed DVD should be Wailing");
        
        //Get new list and assert
        allDVDs= testDao.getAllDVDs();
        assertTrue(allDVDs.isEmpty(),"The list should be empty");
        
        //try to get both DVDS
        DVD retrievedDVD = testDao.getDVD(firstDVD.getTitle());
        assertNull(retrievedDVD, "Shawshank should be removed");
        retrievedDVD = testDao.getDVD(secondDVD.getTitle());
        assertNull(retrievedDVD, "Wailing should be removed");
    }
   
}
