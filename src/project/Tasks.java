/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
 import java.util.*;

/**
 *
 * @author Sarah Refaat
 */
public class Tasks {
    
   

    protected int code;
    protected String title;
    protected String description;
    protected String assignedEmployee;
    protected String taskPhase;
    private String project;
    private String priority;
    private String creatorName;
    protected int estimatedHours;
    protected String startDate;
    protected String endDate;
    
    
 Tasks()
 {
 
 }
    public Tasks(int code, String title, String description, String assignedEmployee, String taskPhase, String project, String priority, String creatorName, int estimatedHours, String startDate, String endDate) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.assignedEmployee = assignedEmployee;
        this.taskPhase = taskPhase;
        this.project = project;
        this.priority = priority;
        this.creatorName = creatorName;
        this.estimatedHours = estimatedHours;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    

    public Tasks(int code, String title, String description, String assignedEmployee, String taskPhase) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.assignedEmployee = assignedEmployee;
        this.taskPhase = taskPhase;
    }
    public Tasks(int code, String title, String description, String assignedEmployee, String taskPhase,int estimatedHours,String startDate,String endDate) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.assignedEmployee = assignedEmployee;
        this.taskPhase = taskPhase;
        this.estimatedHours= estimatedHours;
        this.endDate = endDate;
        this.startDate = startDate;
    }

  

  
    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedEmployee() {
        return assignedEmployee;
    }

    public void setAssignedEmployee(String assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    public String getTaskPhase() {
        return taskPhase;
    }

    public void setTaskPhase(String taskPhase) {
        this.taskPhase = taskPhase;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
        public String toString()
    {
    return "code" +code+ "\ntitle" +title+ "\ndescription" +description+ "\nassigned Employee" +assignedEmployee+"\ntask Phase"+taskPhase+"\nproject"+project+"\nstartDate"+startDate+"\nend Date"+endDate;

    
    }

}