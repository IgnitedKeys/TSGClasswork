/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classRoster.classRosterDAO;

import com.sg.classRoster.classRosterDTO.Teacher;
import java.util.List;

/**
 *
 * @author adrees
 */

public interface TeacherDAO {
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    Teacher addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacherbyId(int id);
}
