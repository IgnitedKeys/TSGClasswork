/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.ui;

import com.sg.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author angeladrees
 */
public class AddressBookView {

    private UserIO io;
    
    public AddressBookView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {

        io.print("Please Select the operation you wish to perform");
        io.print("1. Add Addreess");
        io.print("2. Delete Address");
        io.print("3. Find Address");
        io.print("4. List Address Count");
        io.print("5. List All Addresses");
        io.print("6. Exit");

        return io.readInt("Please select operation you wish to perform", 1, 6);
    }

    public Address getNewAddressInfo() {
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        String address = io.readString("Please enter Street Address");
        Address currentAddress = new Address(lastName);
        currentAddress.setFirstName(firstName);
        currentAddress.setStreetAddress(address);
        return currentAddress;
    }

    public void displayCreateAddressBanner() {
        io.print("Add Address Menu");
    }

    public void displayCreateSuccessBanner() {
        io.readInt("Address Added. Press 1 to go to Main Menu", 1, 1);
    }

    public void displayAddressList(List<Address> addressList) {
        for (Address currentAddress : addressList) {

            String addressInfo = String.format("%s %s\n%s",
                    currentAddress.getFirstName(),
                    currentAddress.getLastName(),
                    currentAddress.getStreetAddress());

            io.print(addressInfo + "\n");
        }
    }

    public void displayAddressListBanner() {
        io.print("List Addresses Menu");
    }

    public void displaySuccessBanner() {
        io.readInt("Press 1 to go to Main Menu", 1, 1);
    }

    public void displayRemoveAddreesBanner() {
        io.print("Delete Address Menu");
    }

    public void displayRemoveAddress(Address currentAddress) {
        if (currentAddress != null) {
            io.readString("Really Delete?");
        } else {
            io.print("No such student");
        }
    }

    public void displayRemoveSuccessBanner() {

        io.readInt("Address Deleted. Press 1 to go to Main Menu", 1, 1);
    }

    public String getAddressLastNameDelete() {
        return io.readString("Please enter Last name to remove");
    }

    public void displayFindAddressBanner() {
        io.print("Find Address Menu");
    }

    public String getAddressLastNameFind() {
        return io.readString("Please enter Last name to find");
    }

    public void displayAddressInfo(Address address) {
        if (address != null) {
            String addressInfo = String.format("%s %s\n%s",
                    address.getFirstName(),
                    address.getLastName(),
                    address.getStreetAddress());
            io.print(addressInfo);
        } else {
            io.print("No such Address");
        }

    }
    
    public void displayCountBanner() {
        io.print("List Address Count Menu");
    }
    
    public void displayListAddressCount(int count) {
        io.readInt("There are " + count + " addresses in the book. Please Press 1 to go to Main Menu",1,1);
    }

    public void unknownCommand() {
        io.print("Unknown Command");
    }
    
    public void goodByeBanner() {
        io.print("Goodbye");
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("ERROR");
        io.print(errorMsg);
    }
}
