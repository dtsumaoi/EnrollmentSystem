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
public class Department {

    private static final int MAX_PROGRAMS = 3;
    private static final int MAX_COURSES = 8;
    private String deptCode;
    private String deptName;
    private ArrayList<Program> programList = new ArrayList<>(MAX_PROGRAMS);
    private ArrayList<Course> courseList = new ArrayList<>(MAX_COURSES);

    public Department(String deptCode, String deptName) {
        this.deptCode = deptCode;
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ArrayList<Program> getProgramList() {
        return programList;
    }

    public void setProgramList(ArrayList<Program> programList) {
        this.programList = programList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public boolean addProgram(Program program) {
        try {
            programList.add(program);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Program removeProgram(String programCode) {
        int i = 0;
        for (Program program : programList) {
            if (program.getProgramCode().equals(programCode)) {
                return programList.remove(i);
            }
            i++;
        }
        return null;
    }

    public Program getProgram(String programCode) {
        for (Program program : programList) {
            if (program.getProgramCode().equals(programCode)) {
                return program;
            }
        }
        return null;
    }

    public boolean addCourse(Course course) {
        try {
            courseList.add(course);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Course removeCourse(String courseCode) {
        int i = 0;
        for (Course course : courseList) {
            if (course.getCourseCode().equals(courseCode)) {
                return courseList.remove(i);
            }
            i++;
        }
        return null;
    }

    public Course getCourse(String courseCode) {
        for (Course course : courseList) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public String getPrograms() {
        String programs = "\n";
        int i = 0;
        for (Program program : programList) {
            programs += "[" + i + "] -";
            programs += program.getProgramCode() + "\n";
            i++;
        }
        return programs;
    }

    public String getCourses() {
        String programs = "\n";
        int i = 0;
        for (Course course : courseList) {
            programs += "[" + i + "] -";
            programs += course.getCourseCode() + "\n";
            i++;
        }
        return programs;
    }

    public String getDetails() {
        return "Department Name: " + deptName + "\nPrograms Offered: " + getPrograms() + "\nCourses Offered: " + getCourses();
    }
}
