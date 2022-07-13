/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classRoster.classRosterDAO;

import com.sg.classRoster.classRosterDTO.Student;
import java.util.List;

/**
 *
 * @author adrees
 */
public interface StudentDAO {
    Student getStudent(int id);
    List<Student> getAllStudents();
    Student addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentbyId(int id);
}
