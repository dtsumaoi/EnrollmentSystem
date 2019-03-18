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
public class Program {

    private String programCode;
    private String programDescription;

    public String getProgramCode() {
        return programCode;
    }

    public Program(String programCode, String programDescription) {
        this.programCode = programCode;
        this.programDescription = programDescription;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramDescription() {
        return programDescription;
    }

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public String getDetails() {
        return "Program Code: " + programCode + "\nProgram Description: " + programDescription;
    }
}
