/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DVDLibraryController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author angeladrees date 2021-10-14 email: drees.angie@gmail.com
 */
public class App {

    public static void main(String[] args) {
        /*UserIO io = new UserIOImpl();
        DVDLibraryDao dao = new DVDLibraryDaoFileImpl();
        DVDLibraryView view = new DVDLibraryView(io);
        DVDLibraryController controller = new DVDLibraryController(dao, view);

        controller.run();
*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DVDLibraryController controller = ctx.getBean("controller", DVDLibraryController.class);
        controller.run();
    }
}
