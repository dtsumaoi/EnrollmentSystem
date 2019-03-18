/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollmentsystem;

/**
 *
 * @author Betelgeuse
 */
public class Student extends Person {

    private static int studId = 20173000;
    private int studentNo;
    private Program degreeProgram;

    public Student(String name, char gender, Program degreeProgram) {
        super(name, gender);
        this.degreeProgram = degreeProgram;
    }

    public int getStudId() {
        return studId;
    }

    public static void setStudId(int studId) {
        Student.studId = studId;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studId + studentNo;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public Program getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(Program degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public String getDetails() {
        super.getDetails();
        return "Student Number: " + studentNo + "\n" + "Program Code: " + degreeProgram.getProgramCode() + "\n";
    }
}
