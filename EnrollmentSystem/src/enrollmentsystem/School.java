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
public class School {

    private static final int MAX_STUDENTS = 40;
    private static final int MAX_EMPLOYEES = 10;
    private static final int MAX_DEPARTMENTS = 3;
    private static School school;
    private String schoolName;
    private ArrayList<Department> departmentList = new ArrayList<>(MAX_DEPARTMENTS);
    private ArrayList<Person> people = new ArrayList<>();

    private ArrayList<Student> studentList = new ArrayList<>(MAX_STUDENTS);
    private ArrayList<Employee> employeeList = new ArrayList<>(MAX_EMPLOYEES);

    public static School getInstance(String name) {
        if (school == null) {
            school = new School(name);
        }

        return school;
    }

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public ArrayList<Person> getPerson() {
        return people;
    }

    public void setPerson(ArrayList<Person> people) {
        this.people = people;
    }

    public boolean addDepartment(Department department) {
        try {
            departmentList.add(department);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Department removeDepartment(String deptCode) {
        int i = 0;
        for (Department department : departmentList) {
            if (department.getDeptCode().equals(deptCode)) {
                return departmentList.remove(i);
            }
            i++;
        }
        return null;
    }

    public Department getDepartment(String deptCode) {
        for (Department department : departmentList) {
            if (department.getDeptCode().equals(deptCode)) {
                return department;
            }
        }
        return null;
    }

    public boolean addStudent(Student student) {
        try {
            studentList.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
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

    public boolean addTeacher(Teacher teacher) {
        try {
            employeeList.add(teacher);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Teacher removeTeacher(int employeeNo) {
        int i = 0;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeNo() == employeeNo) {
                return (Teacher) employeeList.remove(i);
            }
            i++;
        }
        return null;
    }

    public Teacher getTeacher(int employeeNo) {
        int i = 0;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeNo() == employeeNo) {
                return (Teacher) employee;
            }
            i++;
        }
        return null;
    }

    public boolean addAssociate(Associate associate) {
        try {
            employeeList.add(associate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Associate removeAssociate(int employeeNo) {
        int i = 0;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeNo() == employeeNo) {
                return (Associate) employeeList.remove(i);
            }
            i++;
        }
        return null;
    }

    public Associate getAssociate(int employeeNo) {
        int i = 0;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeNo() == employeeNo) {
                return (Associate) employee;
            }
            i++;
        }
        return null;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
