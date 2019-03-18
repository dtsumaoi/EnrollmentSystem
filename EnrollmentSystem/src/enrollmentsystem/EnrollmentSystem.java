/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollmentsystem;

import java.util.Scanner;

/**
 *
 * @author Betelgeuse
 */
public class EnrollmentSystem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean finished = false;
        char choice;

        System.out.print("Please enter school name: ");
        School school = School.getInstance(s.nextLine());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+ _____                _ _                      _     _____           _                 +"
                + "\n+|  ___|              | | |                    | |   /  ___|         | |                +"
                + "\n+| |__ _ __  _ __ ___ | | |_ __ ___   ___ _ __ | |_  \\ `--. _   _ ___| |_ ___ _ __ ___  +"
                + "\n+|  __| '_ \\| '__/ _ \\| | | '_ ` _ \\ / _ \\ '_ \\| __|  `--. \\ | | / __| __/ _ \\ '_ ` _ \\ +"
                + "\n+| |__| | | | | | (_) | | | | | | | |  __/ | | | |_  /\\__/ / |_| \\__ \\ ||  __/ | | | | |+"
                + "\n+\\____/_| |_|_|  \\___/|_|_|_| |_| |_|\\___|_| |_|\\__| \\____/ \\__, |___/\\__\\___|_| |_| |_|+"
                + "\n+                                                            __/ |                      +"
                + "\n+                                                           |___/       - for " + school.getSchoolName()
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");

        while (!finished) {
            System.out.print("+++++++++++++++ MENU +++++++++++++++"
                    + "\n[1] - DEPARTMENTS"
                    + "\n[2] - PROGRAMS"
                    + "\n[3] - COURSES"
                    + "\n[4] - STUDENTS"
                    + "\n[5] - EMPLOYEES"
                    + "\n[6] - EXIT"
                    + "\nEnter Choice: ");

            try {
                switch (s.nextInt()) {
                    case 1:
                        System.out.print("+++++++++++++++ DEPARTMENTS +++++++++++++++"
                                + "\n[1]  - CREATE NEW DEPARTMENT"
                                + "\n[2]  - REMOVE EXISTING DEPARTMENT"
                                + "\n[3]  - VIEW DEPARTMENT DETAILS"
                                + "\n[4]  - CREATE NEW PROGRAM OF DEPARTMENT"
                                + "\n[5]  - REMOVE EXISTING PROGRAM FROM DEPARTMENT"
                                + "\n[6]  - VIEW ALL PROGRAMS OF DEPARTMENT"
                                + "\n[7]  - OFFER NEW COURSE / SUBJECT"
                                + "\n[8]  - REMOVE EXISTING COURSE / SUBJECT"
                                + "\n[9]  - VIEW ALL COURSES / SUBJECTS OF DEPARTMENT"
                                + "\n[10] - VIEW ALL DEPARTMENTS"
                                + "\n[11] - VIEW ALL EMPLOYEES OF DEPARTMENT"
                                + "\n[12] - VIEW ALL STUDENT OF DEPARTMENT"
                                + "\nEnter Choice: ");
                        switch (s.nextInt()) {
                            case 1:
                                s.nextLine();
                                System.out.print("Enter Department Code: ");
                                String deptCode = s.nextLine();
                                System.out.print("Enter Department Name: ");
                                String deptName = s.nextLine();
                                if (school.addDepartment(new Department(deptCode, deptName))) {
                                    System.out.println("Department Creation Success!");
                                } else {
                                    System.out.println("Department Creation Failed! Please try again.");
                                }
                                break;
                            case 2:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code to DELETE: ");
                                    try {
                                        System.out.println("Successfully removed " + school.removeDepartment(s.nextLine()).getDeptName() + ".");
                                    } catch (Exception e) {
                                        System.out.println("Error removing department. Please try again");
                                    }
                                }
                                break;
                            case 3:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        System.out.println(school.getDepartment(s.nextLine()).getDetails());
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 4:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        System.out.print("Enter Program Code: ");
                                        String programCode = s.nextLine();
                                        System.out.print("Enter Program Description: ");
                                        String programDescription = s.nextLine();
                                        if (department.addProgram(new Program(programCode, programDescription))) {
                                            System.out.println("Program creation success!");
                                        } else {
                                            System.out.println("Program creation failed! Please try again.");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 5:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        if (department.getProgramList().isEmpty()) {
                                            System.out.println("No Programs found. Please create a program");
                                        } else {
                                            for (Program program : department.getProgramList()) {
                                                System.out.println(" > " + department.getProgram(program.getProgramCode()).getProgramCode());
                                            }
                                            System.out.print("Enter Program Code to DELETE: ");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 6:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        if (department.getProgramList().isEmpty()) {
                                            System.out.println("No Programs found. Please create a program");
                                        } else {
                                            System.out.println("PROGRAMS IN " + department.getDeptName());
                                            for (Program program : department.getProgramList()) {
                                                int i = 1;
                                                System.out.println("[" + i++ + "] " + department.getProgram(program.getProgramCode()).getProgramDescription());
                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 7:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        System.out.print("Enter Course Code: ");
                                        String courseCode = s.nextLine();
                                        System.out.print("Enter Section: ");
                                        String section = s.nextLine();
                                        if (department.addCourse(new Course(courseCode, section))) {
                                            System.out.println("Course creation success!");
                                        } else {
                                            System.out.println("Course creation failed! Please try again.");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 8:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        if (department.getCourseList().isEmpty()) {
                                            System.out.println("No Courses found. Please create a course");
                                        } else {
                                            for (Course course : department.getCourseList()) {
                                                System.out.println(" > " + department.getCourse(course.getCourseCode()).getCourseCode());
                                            }
                                            System.out.print("Enter Course Code to DELETE: ");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 9:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        if (department.getCourseList().isEmpty()) {
                                            System.out.println("No Course found. Please create a course");
                                        } else {
                                            System.out.println("COURSE IN " + department.getDeptName());
                                            for (Course course : department.getCourseList()) {
                                                int i = 1;
                                                System.out.println("[" + i++ + "] " + department.getCourse(course.getCourseCode()).getCourseCode() + " " + department.getCourse(course.getCourseCode()).getSection());
                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 10:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    int i = 1;
                                    System.out.println("DEPARTMENTS");
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println("[" + i++ + "] " + school.getDepartment(department.getDeptCode()).getDeptName());
                                    }
                                }
                                break;
                            case 11:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        if (department.getCourseList().isEmpty()) {
                                            System.out.println("No Employees found. Please add an employee");
                                        } else {
                                            System.out.println("EMPLOYEES IN " + department.getDeptName());
                                            for (Employee employee : school.getEmployeeList()) {
                                                int i = 1;
                                                if (employee.getDepartment().getDeptCode() == department.getDeptCode()) {
                                                    System.out.println("[" + i++ + "] " + employee.getName());
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 12:
                                if (school.getDepartmentList().isEmpty()) {
                                    System.out.println("No Departments found. Please create a department");
                                } else {
                                    for (Department department : school.getDepartmentList()) {
                                        System.out.println(" > " + school.getDepartment(department.getDeptCode()).getDeptCode());
                                    }
                                    s.nextLine();
                                    System.out.print("Enter Department Code: ");
                                    try {
                                        Department department = school.getDepartment(s.nextLine());
                                        if (department.getProgramList().isEmpty()) {
                                            System.out.println("No Students found. Please add a student");
                                        } else {
                                            System.out.println("STUDENTS IN " + department.getDeptName());
                                            int i = 1;
                                            for (Program program : department.getProgramList()) {
                                                for (Student student : school.getStudentList()) {
                                                    if (student.getDegreeProgram().getProgramCode().equals(program.getProgramCode())) {
                                                        System.out.println("[" + i++ + "] " + student.getName());
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error fetching department. Please try again");
                                    }
                                }
                                break;
                            case 13:
                                break;
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        System.out.print("Are you sure? [Y/N] ");
                        choice = s.next().charAt(0);
                        if (choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n') {
                            if (choice == 'Y' || choice == 'y') {
                                System.out.println("Thank you for using. Good Bye!");
                                finished = true;
                            }
                        } else {
                            System.out.println("Invalid Enter! Please try again.");
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Enter! Please try again.");
            }

        }
    }
}
