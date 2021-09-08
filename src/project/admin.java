/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sarah Refaat
 */
public class admin {

    Scanner scan = new Scanner(System.in);

    private ArrayList<String> users = new ArrayList<>();
    private ArrayList<String> employees = new ArrayList<>();
    private ArrayList<String> employeesType = new ArrayList<>();
    private ArrayList<String> taskPhases = new ArrayList<>();
    private ArrayList<String> project = new ArrayList<>();
    private ArrayList<String> customers = new ArrayList<>();

    public ArrayList<String> getUsers() {
        return users;
    }

    public admin() {

    }

    boolean Users(int list, String name, String email) {
        if (list == 1) {
            users.add(name);
            users.add(email);
            for (int i = 0; i < users.size(); i++) {
                return !name.equalsIgnoreCase(users.get(i));
            }
        }
        if (list == 2) {
            users.remove(name);
            users.remove(email);
        }
        if (list == 3) {
            System.out.println("Enter the Name Index ");
            Scanner scan = new Scanner(System.in);
            int index = scan.nextInt();
            users.set(index, name);
            users.set(index + 1, email);

        }
        return true;
    }

    boolean Employees(int list, String name, String email) {
        if (list == 1) {
            employees.add(name);
            employees.add(email);
            for (int i = 0; i < employees.size(); i++) {
                return !name.equalsIgnoreCase(employees.get(i));
            }
        }
        if (list == 2) {
            employees.remove(name);
            employees.remove(email);
        }
        if (list == 3) {
            System.out.println("Enter the Name Index ");
            Scanner scan = new Scanner(System.in);
            int index = scan.nextInt();
            employees.set(index, name);
            employees.set(index + 1, email);
        }
        return true;
    }

    int EmployeesType(int list, int ind, String type) {
        employeesType.add("TRAINEE");
        employeesType.add("HIRED");
        employeesType.add("FULL TIMER");
        employeesType.add("PART TIMER");  
        if (list == 1) {
            for (int i = 0; i < employeesType.size(); i++) {
                if (employeesType.get(i).equalsIgnoreCase(type)) {
                    System.out.println("Employee's Type Exists\nPress 1 to RETRY , 0 to EXIT");
                    int ii = scan.nextInt();
                    if (ii == 1) {
                        return 1;
                    } else if (ii == 0) {
                        System.exit(0);
                    }
                } else {
                    employeesType.add(ind, type.toUpperCase());
                    System.out.println("\tPress 1 to ADD ANOTHER EMPLOYEE TYPE\n\tPRESS 0 TO EXIT");
                    int ex = scan.nextInt();
                    if (ex == 1) {
                        return 1;
                    } else {
                        System.exit(0);
                    }
                }
            }
        }
        if (list == 2) {
            employeesType.remove(ind);
        }
        if (list == 3) {
            employeesType.set(ind, type);
        }
    return 10;}

    int TaskPhases(int list, int index, String name) {
        taskPhases.add("PENDING");
        taskPhases.add("UNDER WORK");
        taskPhases.add("TEST");
        taskPhases.add("EVALUATION");
        taskPhases.add("DONE");
        taskPhases.add("CANCELED");

        if (list == 1) {
            for (int i = 0; i < taskPhases.size(); i++) {
                if (taskPhases.get(i).equalsIgnoreCase(name)) {
                    System.out.println("TaskPhase Exists\nPress 1 to RETRY , 0 to EXIT");
                    int ii = scan.nextInt();
                    if (ii == 1) {
                        return 1;
                    } else if (ii == 0) {
                        System.exit(0);
                    }
                } else {
                    taskPhases.add(index, name.toUpperCase());
                    System.out.println("\tPress 1 to ADD ANOTHER TASKPHASE\n\tPRESS 0 TO EXIT");
                    int ex = scan.nextInt();
                    if (ex == 1) {
                        return 1;
                    } else {
                        System.exit(0);
                    }
                }
            }
        }
        if (list == 2) {
            taskPhases.remove(name);
        }
        if (list == 3) {
            taskPhases.set(index, name.toUpperCase());
        }

        return 10;
    }

    boolean Project(int list, String name,
            String noOfPhases
    ) {

        if (list == 1) {
            project.add(name);
            project.add(noOfPhases);
            for (int i = 0; i < project.size(); i++) {
                return !name.equalsIgnoreCase(project.get(i));
            }
        }
        if (list == 2) {
            project.remove(name);
        }
        if (list == 3) {
            //Scanner scan = new Scanner(System.in);
            System.out.println("\tPress 1 to Update the Project's NAME\n\tPress 2 to Update the Project's NUMBER OF PHASES");
            int op = scan.nextInt();
            if (op == 1) {
                System.out.println("Enter OLD NAME");
                String old = scan.next().toUpperCase();
                if (project.contains(old) == true) {
                    int indd = project.indexOf(old);
                    System.out.println("Enter NEW NAME");
                    String neww = scan.next();
                    project.add(indd, neww);
                } else {
                    System.out.println("NAME DOES NOT EXIST");

                }
            } else if (op == 2) {
                System.out.println("Enter WANTED PROJECT NAME TO UPDATE PHASES");
                String old = scan.next().toUpperCase();
                if (project.contains(old) == true) {
                    int indd = project.indexOf(old) + 1;
                    System.out.println("Enter NEW NUMBER OF PHASES");
                    String neww = scan.next();
                    project.add(indd, neww);
                } else {
                    System.out.println("NAME DOES NOT EXIST\n\tPress 1 to ADD a NEW PROJECT\n\tPress 0 to EXIT");
                    int op1 = scan.nextInt();
                    if (op1 == 1) {
                        list = 1;
                    } else {
                        System.exit(0);
                    }
                }
            }

        }

        return true;
    }

    boolean Customer(int list, String name,
            String email
    ) {
        if (list == 1) {
            customers.add(name);
            customers.add(email);

            for (int i = 0; i < customers.size(); i++) {
                return !name.equalsIgnoreCase(customers.get(i));
            }

        }
        if (list == 2) {
            customers.remove(name);
            customers.remove(email);
        }
        if (list == 3) {
            System.out.println("Enter the Name Index ");
            Scanner scan = new Scanner(System.in);
            int index = scan.nextInt();
            customers.set(index, name);
            customers.set(index + 1, email);
        }
        return true;
    }

    void PrintUsers() {
        System.out.println(users.toString().toUpperCase());
    }

    void PrintEmployees() {
        System.out.println(employees.toString().toUpperCase());
    }

    void PrintProject() {
        System.out.println(project.toString().toUpperCase());
    }

    void PrintCustomers() {
        System.out.println(customers.toString().toUpperCase());
    }

    public ArrayList<String> getEmployees() {
        return employees;
    }

    public ArrayList<String> getEmployeesType() {
        return employeesType;
    }

    public ArrayList<String> getTaskPhases() {
        return taskPhases;
    }

    public ArrayList<String> getProject() {
        return project;
    }

    public ArrayList<String> getCustomers() {
        return customers;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public void setEmployees(ArrayList<String> employees) {
        this.employees = employees;
    }

    public void setEmployeesType(ArrayList<String> employeesType) {
        this.employeesType = employeesType;
    }

    public void setTaskPhases(ArrayList<String> taskPhases) {
        this.taskPhases = taskPhases;
    }

    public void setProject(ArrayList<String> project) {
        this.project = project;
    }

    public void setCustomers(ArrayList<String> customers) {
        this.customers = customers;
    }

}
