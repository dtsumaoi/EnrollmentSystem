/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollmentsystem;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Betelgeuse
 */
public class Employee extends Person {

    private static int empId = 20170000;
    private int employeeNo;
    private Department department;
    private DateHired hireDate;

    public Employee(String name, char gender, Department department, int date, String month, int year) {
        super(name, gender);
        this.department = department;
        hireDate = new DateHired(date, month, year);
    }

    public static int getEmpId() {
        return empId;
    }

    public static void setEmpId(int empId) {
        Employee.empId = empId;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public DateHired getHireDate() {
        return hireDate;
    }

    public void setHireDate(DateHired hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getYearOfService() {
        return hireDate.getYear();
    }

    public int getYearsOfService() {
        Date date = new Date(); // your date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        return cal.get(Calendar.YEAR) - hireDate.getYear();
    }

    public String getDetails() {
        super.getDetails();
        return "Employee Number: " + employeeNo + "\nDepartment: " + department.getDeptName() + "\nDate Hired: " + hireDate + "\nYears of Service: " + getYearsOfService() + "\n";
    }
}
