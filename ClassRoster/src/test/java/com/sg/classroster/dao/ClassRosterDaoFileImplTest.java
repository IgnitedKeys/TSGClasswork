/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.io.FileWriter;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class ClassRosterDaoFileImplTest {

    ClassRosterDao testDao;

    public ClassRosterDaoFileImplTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        String testFile = "testroster.txt";
        new FileWriter(testFile);
        testDao = new ClassRosterDaoFileImpl(testFile);
    }

    @Test
    public void testAddGetAllStudents() throws Exception {
       
        
        Student firstStudent = new Student("0001");
        firstStudent.setFirstName("Ada");
        firstStudent.setLastName("Lovelace");
        firstStudent.setCohort("Java-May-1845");

        Student secondStudent = new Student("0002");
        secondStudent.setFirstName("Charles");
        secondStudent.setLastName("Babbage");
        secondStudent.setCohort(".NET-May-1845");

        testDao.addStudent(firstStudent.getStudentId(), firstStudent);
        testDao.addStudent(secondStudent.getStudentId(), secondStudent);

        List<Student> allStudents = testDao.getAllStudents();

        assertNotNull(allStudents, "The list of students must not be null");
        assertEquals(2, allStudents.size(), "List of students should have two students");

        assertTrue(testDao.getAllStudents().contains(firstStudent), "The list of students should include Ada.");
        assertTrue(testDao.getAllStudents().contains(secondStudent), "The list of students should include Charles.");
    }
    
    @Test
    public void testRemoveStudent() throws Exception {
        Student firstStudent = new Student("0001");
        firstStudent.setFirstName("Ada");
        firstStudent.setLastName("Lovelace");
        firstStudent.setCohort("Java-May-1845");

        Student secondStudent = new Student("0002");
        secondStudent.setFirstName("Charles");
        secondStudent.setLastName("Babbage");
        secondStudent.setCohort(".NET-May-1845");
        
        testDao.addStudent(firstStudent.getStudentId(), firstStudent);
        testDao.addStudent(secondStudent.getStudentId(), secondStudent);
        
        Student removeStudent = testDao.removeStudent(firstStudent.getStudentId());
        assertEquals(removeStudent, firstStudent, "The removed student should be Ada");
        
        List<Student> allStudents = testDao.getAllStudents();
        assertNotNull(allStudents, "All students list should not be null");
        assertEquals(1, allStudents.size(), "All students should only have one student");
        
        assertFalse(allStudents.contains(firstStudent),"All students should not contain Ada");
        assertTrue(allStudents.contains(secondStudent),"All students should include Charles");
        
        removeStudent = testDao.removeStudent(secondStudent.getStudentId());
        allStudents = testDao.getAllStudents();
        
        assertTrue(allStudents.isEmpty(), "The retrieved list of students should be empty");
        Student retrievedStudent = testDao.getStudent(firstStudent.getStudentId());
        assertNull(retrievedStudent,"Ada was removed, should be null");
        retrievedStudent = testDao.getStudent(secondStudent.getStudentId());
        assertNull(retrievedStudent,"Charles was removed, should be null");
        
        
        
    }

}
