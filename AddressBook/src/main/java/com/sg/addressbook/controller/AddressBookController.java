/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.controller;

import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoException;
import com.sg.addressbook.dto.Address;
import com.sg.addressbook.ui.AddressBookView;
import java.util.List;

/**
 *
 * @author angeladrees
 */
public class AddressBookController {

    private AddressBookView view;
    private AddressBookDao dao;

    public void run() {
        boolean keepRunning = true;
        int menuSelection = 0;
        try {
            while (keepRunning) {
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        createAddress();
                        break;
                    case 2:
                        removeAddress();
                        break;
                    case 3:
                        findAddress();
                        break;
                    case 4:
                        listAddressCount();
                        break;
                    case 5:
                        listAddresses();
                        break;
                    case 6:
                        keepRunning = false;
                        break;
                    default:
                        unknownCommand();
                        break;
                }
            }
            exitMessage();

        } catch (AddressBookDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }

    }

    public AddressBookController(AddressBookDao dao, AddressBookView view) {
        this.dao = dao;
        this.view = view;
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createAddress() throws AddressBookDaoException {
        view.displayCreateAddressBanner();
        Address newAddress = view.getNewAddressInfo();
        dao.addAddress(newAddress.getLastName(), newAddress);
        view.displayCreateSuccessBanner();
    }

    private void listAddresses() throws AddressBookDaoException {
        view.displayAddressListBanner();
        List<Address> addressList = dao.getAllAddresses();
        view.displayAddressList(addressList);
        view.displaySuccessBanner();
    }

    private void removeAddress() throws AddressBookDaoException {
        view.displayRemoveAddreesBanner();
        String addressLastName = view.getAddressLastNameDelete();
        Address removedAddress = dao.removeAddreess(addressLastName);
        view.displayRemoveAddress(removedAddress);
        view.displayRemoveSuccessBanner();
    }

    private void findAddress() throws AddressBookDaoException {
        view.displayFindAddressBanner();
        String addressLastName = view.getAddressLastNameFind();
        Address findAddress = dao.findAddress(addressLastName);
        view.displayAddressInfo(findAddress);
        view.displaySuccessBanner();
    }

    private void listAddressCount() throws AddressBookDaoException {
        view.displayCountBanner();
        int count = dao.getAddressCount();
        view.displayListAddressCount(count);
    }

    private void unknownCommand() {
        view.unknownCommand();
    }

    private void exitMessage() {
        view.goodByeBanner();
    }

}
