/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classRoster.Controller;

import com.sg.classRoster.classRosterDAO.CourseDAO;
import com.sg.classRoster.classRosterDAO.StudentDAO;
import com.sg.classRoster.classRosterDAO.TeacherDAO;
import com.sg.classRoster.classRosterDTO.Student;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author adrees
 */

@Controller
public class StudentController {
    
    @Autowired
    TeacherDAO teacherDao;
    
    @Autowired
    StudentDAO studentDao;
    
    @Autowired
    CourseDAO courseDao;
    
    
    @GetMapping("/students")
    public String displayStudents(Model model){
        List<Student> students = studentDao.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }
    
    @PostMapping("/addStudent")
    public String addStudent(String firstName, String lastName){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        studentDao.addStudent(student);
        
        return "redirect:/students";
    }
    
    @GetMapping("/deleteStudent")
    public String deleteStudent(Integer id){
        studentDao.deleteStudentbyId(id);
        return "redirect:/students";
    }
    
    @GetMapping("/editStudent")
    public String editStudent(Integer id, Model model){
        Student student = studentDao.getStudent(id);
        model.addAttribute("student", student);
        return "editStudent";
    }
    
    @PostMapping("/editStudent")
    public String performEditStudent(@Valid Student student, BindingResult result) {
        if(result.hasErrors()) {
            return "editStudent";
        }
        studentDao.updateStudent(student);
        return "redirect:/students";
    }
        
}
