/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.studentquizgrades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author angeladrees
 */
public interface StudentGrades {

    Map<String, Integer> studentGrades = new HashMap<>();
    //view list of students

    void viewStudents();

    // add student
    void addStudent(String name, List<Double> grades);

    //remove student
    void removeStudent(String name);

    //view a list of quiz score fro a give nstudent
    void quizScores(String name);

    //view average quiz score for a given student
    void averageScore(String name);

    //view student with highest score
    void highestScore();

    //view student with lowest score
    void lowestScore();

    //view class average
    void classAverage();
}
