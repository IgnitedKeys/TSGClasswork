/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.studentquizgrades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author angeladrees
 */
public class StudentGradesImpl implements StudentGrades {

    private Map<String, List<Double>> studentGrades = new HashMap<>();

    private List<String> studentNames = new ArrayList<>();

    public Map<String, List<Double>> getStudentGrades() {
        return studentGrades;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    @Override
    public void viewStudents() {

        for (String name : studentNames) {
            System.out.println(name);
        }

    }

    @Override
    public void addStudent(String name, List<Double> grades) {
        studentGrades.put(name, grades);
        studentNames.add(name);

    }

    @Override
    public void removeStudent(String name) {
        studentNames.remove(name);
        studentGrades.remove(name);

    }

    @Override
    public void quizScores(String name) {
        List<Double> nameScores = studentGrades.get(name);

        for (Double s : nameScores) {
            System.out.println(s);
        }

    }

    @Override
    public void averageScore(String name) {
        double total = 0;
        List<Double> nameScores = studentGrades.get(name);
        for (Double score : nameScores) {
            total += score;
        }
        double average = total / studentGrades.get(name).size();
        System.out.println(average);

    }

    @Override
    public void highestScore() {
        double highestScore = 0;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < studentGrades.size(); i++) {
            List<Double> nameScores = studentGrades.get(studentNames.get(i));

            for (Double score : nameScores) {
                if (score == highestScore) {
                    //add student to list
                    names.add(studentNames.get(i));
                }
                if (score > highestScore) {
                    highestScore = score;
                    //clear list of student names
                    names.clear();
                    //add student to list
                    names.add(studentNames.get(i));
                }

            }
        }
        //print list of students
        for (String name : names) {
            System.out.println(name);
        }

    }

    @Override
    public void lowestScore() {
        double lowestScore = 100;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < studentGrades.size(); i++) {
            List<Double> nameScores = studentGrades.get(studentNames.get(i));

            for (Double score : nameScores) {
                if (score == lowestScore) {
                    //add student to list
                    names.add(studentNames.get(i));
                }
                if (score < lowestScore) {
                    lowestScore = score;
                    //clear list of student names
                    names.clear();
                    //add student to list
                    names.add(studentNames.get(i));
                }

            }
        }
        //print list of students
        for (String name : names) {
            System.out.println(name);
        }

    }

    @Override
    public void classAverage() {
        //go through each key and total up values
        double total = 0;
        double totalNumberOfScores = 0;

        for (int i = 0; i < studentGrades.size(); i++) {
            List<Double> nameScores = studentGrades.get(studentNames.get(i));
            for (Double score : nameScores) {
                total += score;
                totalNumberOfScores++;
            }
        }

        double average = total / totalNumberOfScores;
        System.out.println(average);

    }

}
