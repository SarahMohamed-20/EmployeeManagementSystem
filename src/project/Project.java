package project;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gamed = 1;
        while (gamed == 1) {
            System.err.println("Enter 1 to access Admin Acount");
            System.err.println("Enter 2 to access Tasks Module");
            System.err.println("Enter 3 to access Employee Account");
            int acc = 0;
            do {
                try {
                    acc = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Input Must Be NUMBERS ONLY");
                    System.err.println("Re-enter Your Choice");
                    scan.next();
                }
            } while (acc < 1);

            while (acc == 1) {
                System.out.println("Enter Username");
                String userName = scan.next();
                System.out.println("Enter Password");
                String pw = scan.next();
                if ("admin".equals(userName) && "admin123".equals(pw)) {
                    System.out.println("Welcome to Admin Account");
                    System.out.println("Enter A Field OR Choose:\n\t1: Employee's Type\n\t2: Task Phases\n\t0: LOGOUT");
                    String field = scan.next();
                    switch (field) {
                        case "User":
                        case "USER":
                        case "user":
                            admin use = new admin();
                            System.out.println("1: Add New User\n2: Delete A User\n3: Update A User\n4: Print Users");
                            int operation = 0;
                            do {
                                try {
                                    operation = scan.nextInt();
                                } catch (InputMismatchException e) {
                                    System.err.println("Input Must Be NUMBERS ONLY");
                                    System.err.println("Re-enter Your Choice");
                                    scan.next();
                                }
                            } while (operation < 1);

                            if (operation == 4) {
                                use.PrintUsers();
                                acc = 1;
                            } else if (operation == 2) {
                                System.out.println("Enter a Name");
                                String name = scan.next();
                                System.out.println("Enter email");
                                String email = scan.next();
                            }

                            while (true) {
                                if (operation == 1) {
                                    System.out.println("Enter a Name");
                                    String name = scan.next();
                                    System.out.println("Enter email");
                                    String email = scan.next();
                                    if (use.Users(operation, name, email) == true) {
                                        System.out.println(use.getUsers());
                                        System.out.println("Press 1 to ADD ANOTHER USER, 0 to EXIT");

                                        int ex = scan.nextInt();

                                        if (ex == 0) {
                                            System.exit(0);
                                        }
                                    } else {
                                        System.out.println("This Username Exists\nPress 1 to RETRY , 0 to EXIT");
                                        int ii = scan.nextInt();
                                        if (ii == 0) {
                                            break;
                                        }
                                    }
                                }
                            }

                            break;

                        case "Employee":
                        case "EMPLOYEE":
                        case "employee":
                            admin emp = new admin();
                            System.out.println("1: Add New Employee\n2: Delete An Employee\n3: Update An Employee\n4: Print Employees");
                            int operation1 = 0;
                            do {
                                try {
                                    operation1 = scan.nextInt();
                                } catch (InputMismatchException e) {
                                    System.err.println("Input Must Be NUMBERS ONLY");
                                    System.err.println("Re-enter Your Choice");
                                    scan.next();
                                }
                            } while (operation1 < 1);

                            if (operation1 == 4) {
                                emp.PrintEmployees();
                            } else if (operation1 == 2) {
                                System.out.println("Enter a Name");
                                String name1 = scan.next();
                                System.out.println("Enter email");
                                String email1 = scan.next();
                            }
                            while (true) {
                                if (operation1 == 1) {
                                    System.out.println("Enter a Name");
                                    String name1 = scan.next();
                                    System.out.println("Enter email");
                                    String email1 = scan.next();
                                    if (emp.Employees(operation1, name1, email1) == true) {
                                        System.out.println(emp.getEmployees());
                                        System.out.println("Press 1 to ADD ANOTHER EMPLOYEE, 0 to EXIT");
                                        int ex = 0;
                                        do {
                                            try {
                                                ex = scan.nextInt();
                                            } catch (InputMismatchException e) {
                                                System.err.println("Input Must Be NUMBERS ONLY");
                                                System.err.println("Re-enter Your Choice");
                                                scan.next();
                                            }
                                        } while (ex < 1);

                                        if (ex == 0) {
                                            System.exit(0);
                                        }
                                    } else {
                                        System.out.println("This Username Exists\nPress 1 to RETRY , 0 to EXIT");

                                        int ii = scan.nextInt();

                                        if (ii == 0) {
                                            break;
                                        }
                                    }
                                }
                            }

                            break;

                        case "Project":
                        case "PROJECT":
                        case "project":
                            admin project = new admin();
                            System.out.println("1: Add New Project\n2: Delete A Project\n3: Update A Project\n4: Print Projects");
                            int operation3 = 0;
                            do {
                                try {
                                    operation3 = scan.nextInt();
                                } catch (InputMismatchException e) {
                                    System.err.println("Input Must Be NUMBERS ONLY");
                                    System.err.println("Re-enter Your Choice");
                                    scan.next();
                                }
                            } while (operation3 < 1);

                            if (operation3 == 4) {
                                project.PrintProject();
                            } else {
                                System.out.println("Enter a Name");
                                String name3 = scan.next();
                                System.out.println("Enter TotalNumber of Phases");
                                String totalPhases = scan.next();
                                project.Project(operation3, name3, totalPhases);
                                System.out.print(project.getProject());
                            }
                            break;

                        case "Customer":
                        case "CUSTOMER":
                        case "customer":
                            admin cust = new admin();
                            System.out.println("1: Add New Customer\n2: Delete A Customer\n3: Update A Customer\n4: Print Customers");
                            int operation4 = 0;
                            do {
                                try {
                                    operation4 = scan.nextInt();
                                } catch (InputMismatchException e) {
                                    System.err.println("Input Must Be NUMBERS ONLY");
                                    System.err.println("Re-enter Your Choice");
                                    scan.next();
                                }
                            } while (operation4 < 1);

                            if (operation4 == 4) {
                                cust.PrintProject();
                            } else if (operation4 == 2) {
                                System.out.println("Enter a Name");
                                String name4 = scan.next();
                                System.out.println("Enter email");
                                String email4 = scan.next();
                            }

                            while (true) {
                                if (operation4 == 1) {
                                    System.out.println("Enter a Name");
                                    String name4 = scan.next();
                                    System.out.println("Enter email");
                                    String email4 = scan.next();
                                    if (cust.Customer(operation4, name4, email4) == true) {
                                        cust.Customer(operation4, name4, email4);
                                        System.out.println(cust.getCustomers());
                                        System.out.println("Press 1 to ADD ANOTHER CUSTOMER, 0 to EXIT");
                                        int ex = -1;
                                        do {
                                            try {
                                                ex = scan.nextInt();
                                            } catch (InputMismatchException e) {
                                                System.err.println("Input Must Be NUMBERS ONLY");
                                                System.err.println("Re-enter Your Choice");
                                                scan.next();
                                            }
                                        } while (ex < 1);

                                        if (ex == 0) {
                                            System.exit(0);
                                        }
                                    } else {
                                        System.out.println("This Username Exists\nPress 1 to RETRY , 0 to EXIT");
                                        int ii = scan.nextInt();

                                        if (ii == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                            break;

                        case "1":
                            admin empType = new admin();
                            System.out.println("1: Add New Employye Type\n2: Delete An Employee Type\n3: Update An Employee Type");
                            int operation5 = 0;
                            do {
                                try {
                                    operation5 = scan.nextInt();
                                } catch (InputMismatchException e) {
                                    System.err.println("Input Must Be NUMBERS ONLY");
                                    System.err.println("Re-enter Your Choice");
                                    scan.next();
                                }
                            } while (operation5 < 1);
                            if (operation5 == 2) {
                                System.out.println("Choose the Wanted Employee Type:\n\t1:TRAINEE\n\t2:HIRED\n\t3:FULL-TIMER\n\t4:PART-TIMER");
                                int typeNo = 0;
                                switch (typeNo) {
                                    case 1: {
                                        String type = "TRAINEE";
                                        int ind = 1;
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                    case 2: {
                                        String type = "HIRED";
                                        int ind = 2;
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                    case 3: {
                                        String type = "FULL-TIMER";
                                        int ind = 3;
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                    case 4: {
                                        String type = "PART-TIMER";
                                        int ind = 4;
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                }
                            } else if (operation5 == 3) {
                                System.out.println("Choose the Wanted Employee Type:\n\t1:TRAINEE\n\t2:HIRED\n\t3:FULL-TIMER\n\t4:PART-TIMER");
                                int typeNo = 0;
                                do {
                                    try {
                                        typeNo = scan.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Input Must Be NUMBERS ONLY");
                                        System.err.println("Re-enter Your Choice");
                                        scan.next();
                                    }
                                } while (typeNo < 1);

                                switch (typeNo) {
                                    case 1: {
                                        String type = "TRAINEE";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                    case 2: {
                                        String type = "HIRED";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                    case 3: {
                                        String type = "FULL-TIMER";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                    case 4: {
                                        String type = "PART-TIMER";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        empType.EmployeesType(operation5, ind - 1, type);
                                        System.out.println(empType.getEmployeesType());
                                        break;
                                    }
                                }
                            } else if (operation5 == 1) {
                                int ii = 1;
                                while (ii != 0) {
                                    System.out.println("Enter the Employee Type");
                                    String nType = scan.next();
                                    System.out.println("Enter the Wanted Index");
                                    int ind = scan.nextInt();
                                    if (empType.EmployeesType(operation5, ind - 1, nType) == 0) {
                                        ii = 0;
                                    }
                                }
                            }
                            break;
                        case "2":
                            admin taskphase = new admin();
                            System.out.println("1: Add New Task Phase\n2: Delete A Task Phase\n3: Update A Task Phase");
                            int operation6 = 0;
                            do {
                                try {
                                    operation6 = scan.nextInt();
                                } catch (InputMismatchException e) {
                                    System.err.println("Input Must Be NUMBERS ONLY");
                                    System.err.println("Re-enter Your Choice");
                                    scan.next();
                                }
                            } while (operation6 < 1);

                            if (operation6 == 2) {
                                System.out.println("Choose the Wanted Task Phase:\n\t1:PENDING\n\t2:UNDER-WORK\n\t3:TEST\n\t4:EVALUATION\n\t5:DONE\n\t6:CANCELED");
                                int phase = 0;
                                do {
                                    try {
                                        phase = scan.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Input Must Be NUMBERS ONLY");
                                        System.err.println("Re-enter Your Choice");
                                        scan.next();
                                    }
                                } while (phase < 1);

                                switch (phase) {
                                    case 1: {
                                        String type = "PENDING";
                                        int ind = 1;
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 2: {
                                        String type = "UNDER-WORK";
                                        int ind = 2;
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 3: {
                                        String type = "TEST";
                                        int ind = 3;
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 4: {
                                        String type = "EVALUATION";
                                        int ind = 4;
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 5: {
                                        String type = "DONE";
                                        int ind = 5;
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }

                                    case 6: {
                                        String type = "CANCELED";
                                        int ind = 6;
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                }

                            } else if (operation6 == 3) {
                                System.out.println("Choose the Wanted Task Phase:\n\t1:PENDING\n\t2:UNDER-WORK\n\t3:TEST\n\t4:EVALUATION\n\t5:DONE\n\t6:CANCELED");
                                int phase = 0;
                                do {
                                    try {
                                        phase = scan.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Input Must Be NUMBERS ONLY");
                                        System.err.println("Re-enter Your Choice");
                                        scan.next();
                                    }
                                } while (phase < 1);

                                switch (phase) {
                                    case 1: {
                                        String type = "PENDING";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 2: {
                                        String type = "UNDER-WORK";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 3: {
                                        String type = "TEST";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 4: {
                                        String type = "EVALUATION";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                    case 5: {
                                        String type = "DONE";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }

                                    case 6: {
                                        String type = "CANCELED";
                                        System.out.println("Enter the Wanted Index");
                                        int ind = scan.nextInt();
                                        taskphase.TaskPhases(operation6, ind - 1, type);
                                        System.out.println(taskphase.getTaskPhases());
                                        break;
                                    }
                                }
                            } else if (operation6 == 1) {
                                int ii = 1;
                                while (ii != 0) {
                                    System.out.println("Enter the Task Phase");
                                    String newPhase = scan.next();
                                    System.out.println("Enter the Wanted Index");
                                    int indd = scan.nextInt();
                                    if (taskphase.TaskPhases(operation6, indd - 1, newPhase) == 0) {
                                        ii = 0;
                                    }
                                }
                                break;
                            }
                        case "0":
                            acc=-1;
                            gamed=1;
                            break;
                        default:
                            System.err.println("Invalid Input");
                            acc = -1;
                            gamed = 1;

                    }
                } else {
                    System.out.println("Wrong Username OR Password\n\tPress 1 to RETRY\n\tPress 2 to exit");
                    int log = 0;
                    do {
                        try {
                            log = scan.nextInt();
                        } catch (InputMismatchException e) {
                            System.err.println("Input Must Be NUMBERS ONLY");
                            System.err.println("Re-enter Your Choice");
                            scan.next();
                        }
                    } while (log < 1);

                    if (log == 2) {
                        System.exit(0);
                    }

                }
            }
            //////////////////////////////////////////////admin finished/////////////////////////////////////
            while (acc == 2) {
                System.err.println("Enter Username");
                String userName = scan.next();
                System.err.println("Enter Password");
                String pw = scan.next();
                if ("tasks".equals(userName) && "tasks123".equals(pw)) {
                    System.err.println("Welcome to Task Module");
                    System.err.println(" Choose:\n\t1:Tasks Page\n\t2:Tasks Log\n\t3:Calender\n\t4:Leader page\n\t5 LOG OUT");
                    int option = 0;
                    do {
                        try {
                            option = scan.nextInt();
                        } catch (InputMismatchException e) {
                            System.err.println("Input Must Be NUMBERS ONLY");
                            System.err.println("Re-enter Your Choice");
                            scan.next();
                        }
                    } while (option < 1);

                    String x = "add";
                    while (x == "add") {
                        switch (option) {
                            case 1:
                                System.err.println("enter the task's code");
                                int c = 0;
                                do {
                                    try {
                                        c = scan.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Input Must Be NUMBERS ONLY");
                                        System.err.println("Re-enter Code");
                                        scan.next();
                                    }
                                } while (c < 1);

                                System.err.println("enter the task's title");
                                String t = scan.next();
                                System.err.println("enter the task's description");
                                String d = scan.next();
                                System.err.println("enter the task's assigned employee");
                                String ae = scan.next();
                                System.err.println("enter the task's task phase");
                                String tp = scan.next();
                                System.err.println("enter the task's project");
                                String p = scan.next();
                                System.err.println("enter the task's priority");
                                String pr = scan.next();
                                System.err.println("enter the task's creator's name");
                                String cn = scan.next();
                                System.err.println("enter the task's estimated hours");
                                int eh = 0;
                                do {
                                    try {
                                        eh = scan.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Estimated Hours Must Be NUMBERS ONLY");
                                        System.err.println("Re-enter The Estimated Hours");
                                        scan.next();
                                    }
                                } while (eh < 1);

                                System.err.println("enter the task's start date");
                                String sd = scan.next();
                                System.err.println("enter the task's end date");
                                String ed = scan.next();
                                Tasks tpage = new Tasks(c, t, d, ae, tp, p, pr, cn, eh, sd, ed);
                                System.err.println("Do you wanna print data (print)? or exit ? (0)");
                                String option2 = scan.next();
                                if ("print".equals(option2)) {
                                    System.err.println("the tasks title is" + tpage.getTitle());
                                    System.err.println("the tasks code is" + tpage.getCode());
                                    System.err.println("the tasks description is" + tpage.getDescription());
                                    System.err.println("the assigned employee is" + tpage.getAssignedEmployee());
                                    System.err.println("the tasks creator's name" + tpage.getCreatorName());
                                    System.err.println("the tasks estimated hours is " + tpage.getEstimatedHours());
                                    System.err.println("the tasks start date is" + tpage.getStartDate());
                                    System.err.println("the tasks end date is" + tpage.getEndDate());

                                } else if ("out".equals(option2)) {
                                    break;
                                }

                                System.err.println("Do you want to add another task?(add) or exit(out)? (press any key)");
                                String lala = scan.next();
                                if ("add".equals(lala)) {
                                    option = 1;
                                } else if ("out".equals(lala)) {

                                    System.exit(1);
                                }

                                break;

                            case 2:
                                System.err.println("enter the task's from time");
                                int ft = scan.nextInt();
                                System.err.println("enter the task's to time");
                                int tt = scan.nextInt();
                                TaskLog tlog = new TaskLog(tt, ft);
                                int y = 0;
                                while (y != 1) {

                                    System.err.println(" 1- print from time and to time \n 2 - print the time required \n 3- Add another time \n 5- exit(out)");
                                    int op = 0;
                                    do {
                                        try {
                                            op = scan.nextInt();
                                        } catch (InputMismatchException e) {
                                            System.err.println("Input Must Be NUMBERS ONLY");
                                            System.err.println("Re-enter The Input");
                                            scan.next();
                                        }
                                    } while (op < 1);

                                    switch (op) {
                                        case 1:
                                            System.err.println("the from time is " + tlog.getFromTime());
                                            System.err.println("the from time is " + tlog.getToTime());
                                            break;
                                        case 2:
                                            System.err.println("the from time taken by the task is  " + tlog.time());
                                            break;
                                        case 3:
                                            option = 2;
                                            y = 1;

                                            break;
                                        case 5:
                                            x = "out";
                                            y = 1;
                                            break;

                                    }
                                }
                                break;

                            case 4:
                                System.err.println(" 1- Create task  \n 2- Change task");
                                int option4 = 0;
                                do {
                                    try {
                                        option4 = scan.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Input Must Be NUMBERS ONLY");
                                        System.err.println("Re-enter The Input");
                                        scan.next();
                                    }
                                } while (option4 < 1);

                                Leader L1 = new Leader();
                                switch (option4) {
                                    case 1:
                                        System.err.println("enter the code");
                                        int ccc = scan.nextInt();
                                        System.err.println("enter the title");
                                        String tttt = scan.next();
                                        System.err.println("enter the description");
                                        String des = scan.next();
                                        System.err.println("enter the assigned employee");
                                        String assigEmp = scan.next();
                                        System.err.println("enter the task phase");
                                        String ttpp = scan.next();

                                        L1.createNewTask(ccc, tttt, des, assigEmp, ttpp);
                                        //break;
                                        System.err.println("do you want tp print the data ? yes , no\n");
                                        String yala = scan.next();
                                        if ("yes".equals(yala)) {
                                            L1.printTasks(ccc, tttt, des, assigEmp, ttpp);
                                            System.err.println("do you want to exit(0) or add new operation (1) ?\n");

                                            int ooo = scan.nextInt();
                                            if (ooo == 0) {
                                                System.exit(0);
                                            } else if (ooo == 1) {
                                                option4 = 1;
                                            }
                                        } else if ("no".equals(yala)) {
                                            System.err.println("do you want to exit(0) or add new operation (1) ?\n");
                                            int oo = scan.nextInt();
                                            if (oo == 0) {
                                                System.exit(0);
                                            } else if (oo == 1) {
                                                option4 = 1;
                                            }
                                        }
                                        break;

                                    case 2:
                                        System.err.println("enter the task's code");
                                        int cc = scan.nextInt();
                                        System.err.println("enter the task's title");
                                        String ttt = scan.next();
                                        System.err.println("enter the task's description");
                                        String dd = scan.next();
                                        System.err.println("enter the task's assigned employee");
                                        String aee = scan.next();
                                        System.err.println("enter the task's task phase");
                                        String tpp = scan.next();
                                        L1.changeTasks(cc, ttt, dd, aee, tpp);
                                        break;

                                }

                                break;

                            case 3:
                                System.err.println(" THE CALENDER OF THE SYSTEM");
                                Calender c1 = new Calender();
                                System.err.println("" + c1.toString());

                                x = "22";
                                break;
                            case 5:
                                x = " ";
                                acc = -1;
                                gamed = 1;
                                break;

                        }
                    }

                } else {
                    System.err.println("WRONG USERNAME OR PASSWORD");
                }
            }
            ///////////////////////////////////////tasks////////////////////////////////////////////
            while (acc == 3) {
                System.err.println("Enter Username");
                String userName = scan.next();
                System.err.println("Enter Password");
                String pw = scan.next();
                if ("Employee".equals(userName) && "Employee123".equals(pw)) {
                    System.err.println("Welcome to Your Account");
                    System.err.println(" Choose:\n\t1:Attendance Time Card Page\n\t2:Departure Time Card\n\t3:Mission/Permission Request\n\t4:Leave Request\n\t5 LOGOUT");
                    int option = 0;
                    do {
                        try {
                            option = scan.nextInt();
                        } catch (InputMismatchException e) {
                            System.err.println("Input Must Be NUMBERS ONLY");
                            System.err.println("Re-enter The Input");
                            scan.next();
                        }
                    } while (option < 1);

                    Employee empp = new Employee();
                    switch (option) {
                        case 1:

                            empp.AttendTimeCard(LocalDateTime.MIN);
                            break;
                        case 2:
                            empp.AttendTimeCard(LocalDateTime.MIN);
                            break;
                        case 3:
                            System.err.println("Enter Permission");
                            String mission = scan.next();

                            empp.MissionPermission(mission);
                            System.err.println();
                            break;
                        case 4:
                            System.err.println("Enter Leave Request");

                            String leave = scan.next();

                            empp.LeaveRequest(leave);

                            break;
                        case 5:
                            acc = 0;
                            gamed = 1;

                    }

                } else {
                    System.err.println("WRONG USERNAME OR PASSWORD");
                }

            }
        }
    }
}
