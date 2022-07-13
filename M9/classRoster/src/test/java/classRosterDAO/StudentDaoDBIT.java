/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package classRosterDAO;

import com.sg.classRoster.classRosterDAO.TeacherDAO;
import com.sg.classRoster.classRosterDAO.CourseDAO;
import com.sg.classRoster.classRosterDAO.StudentDAO;
import com.sg.classRoster.classRosterDTO.Course;
import com.sg.classRoster.classRosterDTO.Student;
import com.sg.classRoster.classRosterDTO.Teacher;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author adrees
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplicationConfiguration.class)
public class StudentDaoDBIT {
    
    @Autowired
    TeacherDAO teacherDao;
    
    @Autowired
    StudentDAO studentDao;
    
    @Autowired
    CourseDAO courseDao;
    
    public StudentDaoDBIT() {
    }

    @BeforeEach
    public void setUp() {
        List<Teacher> teachers = teacherDao.getAllTeachers();
        for(Teacher teacher : teachers) {
            teacherDao.deleteTeacherbyId(teacher.getId());
        }
        
        List<Student> students = studentDao.getAllStudents();
        for(Student student : students) {
            studentDao.deleteStudentbyId(student.getId());
        }
        
        List<Course> courses = courseDao.getAllCourse();
        for(Course course : courses) {
            courseDao.deleteCourseById(course.getId());
        }
        
    }
    
    /**
     * Test of getStudent method and addStudent method, of class StudentDaoDB.
     */
    @Test
    public void testAddAndGetStudent() {
        Student student = new Student();
        student.setFirstName("Test Student First");
        student.setLastName("Test Student Last");
        student = studentDao.addStudent(student);
        
        Student fromDao = studentDao.getStudent(student.getId());
        
        assertEquals(student, fromDao);
    }

    /**
     * Test of getAllStudents method, of class StudentDaoDB.
     */
    @Test
    public void testGetAllStudents() {
        Student student = new Student();
        student.setFirstName("Test Student First ");
        student.setLastName("Test Student Last ");
        student = studentDao.addStudent(student);
        
        Student student2 = new Student();
        student2.setFirstName("Test Student First 2");
        student2.setLastName("Test Student Last 2");
        student2 = studentDao.addStudent(student2);
        
        List<Student> students = studentDao.getAllStudents();
        
        assertEquals(2, students.size());
        assertTrue(students.contains(student));
        assertTrue(students.contains(student2));
    }

    /**
     * Test of updateStudent method, of class StudentDaoDB.
     */
    @Test
    public void testUpdateStudent() {
        Student student = new Student();
        student.setFirstName("Test Student First");
        student.setLastName("Test Student Last");
        student = studentDao.addStudent(student);
        
        Student fromDao = studentDao.getStudent(student.getId());
        
        assertEquals(student, fromDao);
        
        student.setFirstName("New Test Student First");
        studentDao.updateStudent(student);
        
        assertNotEquals(student, fromDao);
        
        fromDao = studentDao.getStudent(student.getId());
        assertEquals(student, fromDao);
    }

    /**
     * Test of deleteStudentbyId method, of class StudentDaoDB.
     */
    @Test
    public void testDeleteStudentbyId() {
        Teacher teacher = new Teacher();
        teacher.setFirstName("Test First");
        teacher.setLastName("Test Last");
        teacher.setSpecialty("Test Specialty");
        teacher = teacherDao.addTeacher(teacher);
        
        Student student = new Student();
        student.setFirstName("Test Student First");
        student.setLastName("Test Student Last");
        student = studentDao.addStudent(student);
        List<Student> students = new ArrayList<>();
        students.add(student);
        
        Course course = new Course();
        course.setName("Test Name");
        course.setTeacher(teacher);
        course.setStudents(students);
        course = courseDao.addCourse(course);
        
        Student fromDao = studentDao.getStudent(student.getId());
        assertEquals(student, fromDao);
        
        studentDao.deleteStudentbyId(student.getId());
        
        fromDao = studentDao.getStudent(student.getId());
        assertNull(fromDao);
        
    }
    
}
