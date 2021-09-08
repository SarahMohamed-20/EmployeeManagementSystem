package project;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
/**
 *
 * @author 20128
 */
public class Employee extends Tasks{
 LocalDateTime attendance= LocalDateTime.now();
 LocalDateTime departure= LocalDateTime.now();;
  
 
    
    public Employee() {
        //attendance;
        //departure 
    }

    
    public Employee(int code, String title, String description, String assignedEmployee, String taskPhase,int estimatedHours,String startDate,String endDate) {
        super( code,  title,  description,  assignedEmployee,  taskPhase, estimatedHours, startDate, endDate);
        this.attendance= LocalDateTime.now();
        this.departure = LocalDateTime.now();

    }

    public void AttendTimeCard(LocalDateTime attend) {
        this.attendance = attend;
        LocalDateTime attendance = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = attendance.format(format);   
    System.out.println(formatDateTime);    
    }
public void DepartTimeCard(LocalDateTime depart) {
        this.departure = depart;
        LocalDateTime departure = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = departure.format(format);   
    System.out.println(formatDateTime);
        
    }
    public String MissionPermission(String mission) {
        String missionn = mission.toLowerCase();
        //int condition = 1;
        String[] MissAndPer = new String[]{"quit", "salar.raise", "late.excuse", "change.department", "change.office"};
        for (int i = 0; i < MissAndPer.length; i++) {
             if (MissAndPer[i].equals(missionn)) {
               System.out.println("approved");
              break;  
            } else {
                System.out.println("Disapproved");
                break;
            }
        }   
    return null;
    }
    public void LeaveRequest(String leave) {
        String leavee = leave.toLowerCase();
        //int condition = 1;
        String[] LeaveTypes = new String[]{"paid.vacation", "unpaid.time.off", "annual.leave","medical.leave"};
        for (int i = 0; i < LeaveTypes.length; i++) {
            if (LeaveTypes[i].equals(leavee)) {
               System.out.println("approved");
              break;  
            } else {
                System.out.println("Disapproved");
                break;
            }
        }
     

    }
    
}