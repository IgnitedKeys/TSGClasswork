/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classRoster.classRosterDAO;

import com.sg.classRoster.classRosterDTO.Course;
import com.sg.classRoster.classRosterDTO.Student;
import com.sg.classRoster.classRosterDTO.Teacher;
import java.util.List;

/**
 *
 * @author adrees
 */
public interface CourseDAO {
    Course getCourseById(int id);
    List<Course> getAllCourse();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
