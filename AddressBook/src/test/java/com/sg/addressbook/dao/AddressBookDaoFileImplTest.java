/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.io.FileWriter;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class AddressBookDaoFileImplTest {

    AddressBookDao testDao;

    public AddressBookDaoFileImplTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        String testFile = "testBook.txt";
        new FileWriter(testFile);
        //using new constructor with test txt file
        testDao = new AddressBookDaoFileImpl(testFile);
    }

    @Test
    public void testAddAddress() throws Exception {
        //added setUp() here and it worked???
        String testFile = "testBook.txt";
        new FileWriter(testFile);
        //using new constructor with test txt file
        testDao = new AddressBookDaoFileImpl(testFile);
        
        
        
        String lastName = "Potter";
        Address address = new Address(lastName);
        address.setFirstName("Harry");
        address.setStreetAddress("4 Privet Drive, Little");

        //add to DAO
        testDao.addAddress(address.getLastName(), address);
        Address retrievedAddress = testDao.findAddress(lastName);

        //Assert
        assertEquals(address.getLastName(), retrievedAddress.getLastName(), "Checking last name");
        assertEquals(address.getFirstName(), retrievedAddress.getFirstName(), "Checking first name");
        assertEquals(address.getStreetAddress(), retrievedAddress.getStreetAddress(), "Checking street address");

    }

    @Test
    public void testGetAllAddresses() throws Exception {
        Address firstAddress = new Address("Potter");
        firstAddress.setFirstName("Harry");
        firstAddress.setStreetAddress("4 Privet Drive, Little");

        Address secondAddress = new Address("Weasley");
        secondAddress.setFirstName("Ron");
        secondAddress.setStreetAddress("The Burrow");

        //add to the DAO
        testDao.addAddress(firstAddress.getLastName(), firstAddress);
        testDao.addAddress(secondAddress.getLastName(), secondAddress);

        //get List of addresses
        List<Address> allAddresses = testDao.getAllAddresses();

        //Assert
        assertNotNull(allAddresses, "The list should not be empty");
        assertEquals(2, allAddresses.size(), "The list should have two addresses");

        assertTrue(testDao.getAllAddresses().contains(firstAddress), "the list should include Potter");
        assertTrue(testDao.getAllAddresses().contains(secondAddress), "the list should include Weasley");
    }
    
    @Test
    public void testRemoveAddress() throws Exception {
        Address firstAddress = new Address("Potter");
        firstAddress.setFirstName("Harry");
        firstAddress.setStreetAddress("4 Privet Drive, Little");

        Address secondAddress = new Address("Weasley");
        secondAddress.setFirstName("Ron");
        secondAddress.setStreetAddress("The Burrow");
        
        //add to Dao
        testDao.addAddress(firstAddress.getLastName(), firstAddress);
        testDao.addAddress(secondAddress.getLastName(), secondAddress);
        
        //remove
        Address removeAddress = testDao.removeAddreess(firstAddress.getLastName());
        
        //Assert
        assertEquals(removeAddress, firstAddress, "The removed Address should be Potter");
        
        List<Address> allAddresses = testDao.getAllAddresses();
        assertNotNull(allAddresses, "All Addresses should not be null ");
        assertEquals(1, allAddresses.size(), "All addresses should equal 1");
        
        assertFalse(allAddresses.contains(firstAddress), "The list should NOT include Potter");
        assertTrue(allAddresses.contains(secondAddress), "the list should contains Weasley");
        
        //remove second address
        removeAddress = testDao.removeAddreess(secondAddress.getLastName());
        assertEquals(removeAddress, secondAddress,"the removed Address should be Weasley");
        
        allAddresses = testDao.getAllAddresses();
        assertTrue(allAddresses.isEmpty(), "the list should be empty");
        
        Address retrievedAddress = testDao.findAddress(firstAddress.getLastName());
        assertNull(retrievedAddress, "Potter was removed");
        
        retrievedAddress = testDao.findAddress(secondAddress.getLastName());
        assertNull(retrievedAddress, "Weasley was removed");
    }
    
    @Test
    public void testGetAddressCount() throws Exception {
        Address firstAddress = new Address("Potter");
        firstAddress.setFirstName("Harry");
        firstAddress.setStreetAddress("4 Privet Drive, Little");

        Address secondAddress = new Address("Weasley");
        secondAddress.setFirstName("Ron");
        secondAddress.setStreetAddress("The Burrow");
        
        //add to Dao
        testDao.addAddress(firstAddress.getLastName(), firstAddress);
        testDao.addAddress(secondAddress.getLastName(), secondAddress);
        
        //assert
        assertEquals(2, testDao.getAddressCount(),"There should be 2 addresses in the book" );
        
    }
}

