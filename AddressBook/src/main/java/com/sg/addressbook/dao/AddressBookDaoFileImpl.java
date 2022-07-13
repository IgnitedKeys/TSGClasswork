/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author angeladrees
 */
public class AddressBookDaoFileImpl implements AddressBookDao {

    //public static final String BOOK_FILE = "AddressBook.txt";
    private final String BOOK_FILE;
    //two new Constructors
    public AddressBookDaoFileImpl(){
        BOOK_FILE = "AddressBook.txt";
    }
    
    public AddressBookDaoFileImpl(String addressBookFile){
        BOOK_FILE = addressBookFile;
    }
    
  
    public static final String DELIMITER = "::";

    //map to hold addresses in k=lastName
    private Map<String, Address> addresses = new HashMap<>();

    @Override
    public Address addAddress(String lastName, Address address) throws AddressBookDaoException {
        loadBook();
        Address prevAddress = addresses.put(lastName, address);
        writeAddress();
        return prevAddress;
    }

    @Override
    public Address removeAddreess(String lastName) throws AddressBookDaoException {
        loadBook();
        Address removedAddress = addresses.remove(lastName);
        writeAddress();
        return removedAddress;
    }

    @Override
    public Address findAddress(String lastName) throws AddressBookDaoException {
        loadBook();
        return addresses.get(lastName);
    }

    @Override
    public int getAddressCount() throws AddressBookDaoException {
        loadBook();
        Set<String> keys = addresses.keySet();
        int total = keys.size();
        return total;
    }

    @Override
    public List<Address> getAllAddresses() throws AddressBookDaoException {
        loadBook();
        return new ArrayList<Address>(addresses.values());
    }

    private Address unmarshallAddress(String addressAsText) {
        String[] addressTokens = addressAsText.split(DELIMITER);
        String lastName = addressTokens[0];
        Address addressFromFile = new Address(lastName);
        addressFromFile.setFirstName(addressTokens[1]);
        addressFromFile.setStreetAddress(addressTokens[2]);
        return addressFromFile;
    }

    private void loadBook() throws AddressBookDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(BOOK_FILE)));
        } catch (FileNotFoundException e) {
            throw new AddressBookDaoException(
                    "Count not load address book into memory", e);
        }

        String currentLine;
        Address currentAddress;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentAddress = unmarshallAddress(currentLine);
            addresses.put(currentAddress.getLastName(), currentAddress);
        }
        scanner.close();

    }

    private String marshallAddress(Address anAddress) {
        String addressAsText = anAddress.getLastName() + DELIMITER;
        addressAsText += anAddress.getFirstName() + DELIMITER;
        addressAsText += anAddress.getStreetAddress();
        return addressAsText;
    }

    private void writeAddress() throws AddressBookDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(BOOK_FILE));
        } catch (IOException e) {
            throw new AddressBookDaoException(
                    "Count not save address to book", e);
        }

        String addressAsText;
        List<Address> addressList = this.getAllAddresses();
        for (Address currentAddress : addressList) {
            addressAsText = marshallAddress(currentAddress);
            out.println(addressAsText);
            out.flush();
        }
        out.close();
    }

}
