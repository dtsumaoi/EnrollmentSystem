/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollmentsystem;

import java.util.ArrayList;

/**
 *
 * @author Betelgeuse
 */
public class Course {

    public static final int MAX_STUDENTS = 5;
    private ArrayList<Student> studentList = new ArrayList<>();
    private String courseCode;
    private String section;

    public Course(String courseCode, String section) {
        this.courseCode = courseCode;
        this.section = section;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean addStudent(Student student) {
        try {
            studentList.add(student);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Student removeStudent(int studentNo) {
        int i = 0;
        for (Student student : studentList) {
            if (student.getStudentNo() == studentNo) {
                return studentList.remove(i);
            }
            i++;
        }
        return null;
    }

    public Student getStudent(int studentNo) {
        for (Student student : studentList) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
    }

    public String getStudents() {
        String students = "\n";
        int i = 0;
        for (Student student : studentList) {
            students += "[" + i + "] ";
            students += student.getName() + "\n";
            i++;
        }
        return students;
    }

    public String getDetails() {
        return "Course Code: " + courseCode + "\nSection: " + section + "\nNo. of Enrolled Students: " + studentList.size() + "\nStudents: " + getStudents();
    }
}
