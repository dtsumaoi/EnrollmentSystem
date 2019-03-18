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
public class Teacher extends Employee {

    private static final int MAX_LOAD = 3;
    private ArrayList<Course> courseLoad = new ArrayList<>(MAX_LOAD);

    public Teacher(String name, char gender, Department department, int date, String month, int year) {
        super(name, gender, department, date, month, year);
    }

    public Boolean addCourse(Course course) {
        try {
            courseLoad.add(course);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Course removeCourse(String courseCode, String section) {
        int i = 0;
        for (Course course : courseLoad) {
            if (course.getCourseCode().equals(courseCode) && course.getSection().equals(section)) {
                return courseLoad.remove(i);
            }
            i++;
        }
        return null;
    }

    public Course getCourse(String courseCode, String section) {
        for (Course course : courseLoad) {
            if (course.getCourseCode().equals(courseCode) && course.getSection().equals(section)) {
                return course;
            }
        }
        return null;
    }

    public String getCourses() {
        String programs = "\n";
        int i = 0;
        for (Course course : courseLoad) {
            programs += "[" + i + "] ";
            programs += course.getCourseCode() + "\n";
            i++;
        }
        return programs;
    }

    public String getDetails() {
        super.getDetails();
        return "Course Load: " + getCourses() + "\n";
    }
}
