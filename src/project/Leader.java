package project;
   import java.util.Scanner;
/**
 *
 * @author Sarah Refaat
 */

public class Leader extends Tasks {

    Scanner scan = new Scanner(System.in);

    Leader(int code, String title, String description, String assignedEmployee, String taskPhase) {
        super(code, title, description, assignedEmployee, taskPhase);

    }
    
    
    public Leader()
    {
    
    
    }

    public void createNewTask(int code, String title, String description, String assignedEmployee, String taskPhase)
    {
         this.code = code;
        this.title = title;
        this.description = description;
        this.assignedEmployee = assignedEmployee;
        this.taskPhase = taskPhase;

    }

    public void changeTasks(int code, String title, String description, String assignedEmployee, String taskPhase) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.assignedEmployee = assignedEmployee;
        this.taskPhase = taskPhase;

    }

    public void printTasks(int code, String title, String description, String assignedEmployee, String taskPhase) {
         System.out.println(" the code"+ code);
         System.out.println("the title" +title);
         System.out.println("the description"+ description);
         System.out.println("the assigned Employee"+assignedEmployee);
         System.out.println("the task Phase"+taskPhase);
        
        
   

    }

}
