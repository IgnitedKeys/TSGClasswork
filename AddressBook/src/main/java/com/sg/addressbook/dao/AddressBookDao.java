/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author angeladrees
 */
public interface AddressBookDao {

    /**
     * Adds Address to address book
     *
     * @return Address object
     */
    Address addAddress(String lastName, Address address) throws AddressBookDaoException;

    /**
     * Removes Address from the address book.
     *
     * @return Address that was removed
     */
    Address removeAddreess(String lastName) throws AddressBookDaoException;

    /**
     * Returns the address with the given last Name.
     *
     * @return the Address associated with the last name or null if does not
     * exist.
     */
    Address findAddress(String lastName) throws AddressBookDaoException;

    /**
     * Returns the number of addresses in the address book.
     *
     * @return the number of addresses in given List.
     */
    int getAddressCount() throws AddressBookDaoException;

    /**
     * Returns list of all addresses.
     *
     * @return List of all addresses in the address book
     */
    List<Address> getAllAddresses() throws AddressBookDaoException;
}
