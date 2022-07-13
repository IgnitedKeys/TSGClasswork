/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.birthdaycalculator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author angeladrees
 */
public class BirthdayCalculator {
   
    
    public static void main(String[] args) {
        
        UserIO io = new UserIOImpl();
        io.print("Welcome to the Magical BirthDAY Calulator");
        
        String birthday = io.readString("What's your birthday?");
        
        //parse String to birthday
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate day = LocalDate.parse(birthday, formatter);
        
        DayOfWeek dayOfWeek = DayOfWeek.from(day);
        
        
        //get current date
        LocalDate currentDay = LocalDate.now();
        //get current year
        int year = currentDay.getYear();
        //get birthday for current year
        LocalDate currentBirthYear = day.withYear(year);
        
        //day of the week for today
        DayOfWeek weekDay = DayOfWeek.from(currentDay);
        //day of the week for this year's birthday
        DayOfWeek currentWeek = DayOfWeek.from(currentBirthYear);
        
        //get # of days to next birthday
        long result = ChronoUnit.DAYS.between(currentDay, currentBirthYear);
        
        //makes changes if next birthday runs into next next calendar year
        long age = ChronoUnit.YEARS.between(day, currentBirthYear);
        if(result < 0) {
            result += 364;
            age++;
            currentWeek = DayOfWeek.from(day.withYear(year + 1));
        }
        
        io.print("That means you were born on a " + dayOfWeek);
       
        io.print("This year it falls on a " + currentWeek);
        //and since today is ---, theres is only - days left until the next one
        
        io.print("and since today is " + weekDay + ", there is only " + result + " days left until the next one.");
        
        //bet you're excited to be turning --!
        io.print("bet you're excited to be turning " + age);
       
        
    }
}
