/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.studentquizgrades;

/**
 *
 * @author angeladrees
 */
import com.sg.userioclasslab.*;
import java.util.ArrayList;

import java.util.List;

public class App {

    public static void main(String[] args) {
        UserIO userIo = new UserIOImpl();
        StudentGrades studentGrades = new StudentGradesImpl();
        boolean useApp = true;

        while (useApp == true) {
            String options = userIo.readString("PICK AN OPTION:\nadd student\nremove student\nlist of students\nget grades\nget average\nget class average\nsee lowest\nsee highest"
                    + "\n------------------------------------------------------------------------");

            if (options.equals("add student")) {
                List<Double> gradeList = new ArrayList<>();
                String studentName = userIo.readString("What is the student's name?");
                int numOfGrades = userIo.readInt("How many grades to enter?");
                for (int i = 0; i < numOfGrades; i++) {
                    Double grade = userIo.readDouble("Enter grade");
                    gradeList.add(grade);
                }
                studentGrades.addStudent(studentName, gradeList);

            }
            if (options.equals("remove student")) {
                String studentName = userIo.readString("Which student would you like to remove?");
                studentGrades.removeStudent(studentName);

            }
            if (options.equals("list of students")) {
                studentGrades.viewStudents();

            }
            if (options.equals("get grades")) {
                String studentName = userIo.readString("Which student's grades would you like to view?");
                studentGrades.quizScores(studentName);

            }
            if (options.equals("get average")) {
                String studentName = userIo.readString("Which student's average grade would you like to view?");
                studentGrades.averageScore(studentName);
            }
            if (options.equals("get class average")) {
                studentGrades.classAverage();
            }
            if (options.equals("see lowest")) {
                studentGrades.lowestScore();
            }
            if (options.equals("see highest")) {
                studentGrades.highestScore();
            }

            String check = userIo.readString("WOULD YOU LIKE TO SEE MORE OPTIONS? y/n");
            if (check.equals("n")) {
                useApp = false;
            }

        }
        System.out.println("------------------------------------------------------------------------\nLogging off...");

    }

}
