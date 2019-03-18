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
public class Associate extends Employee {

    private String position;

    public Associate(String name, char gender, Department department, int date, String month, int year) {
        super(name, gender, department, date, month, year);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDetails() {
        super.getDetails();
        return "Position: " + position + "\n";
    }
}
