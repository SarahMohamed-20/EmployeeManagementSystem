/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Sarah Refaat
 */
    public class TaskLog extends Tasks {

    protected int fromTime;
    protected int toTime;
    protected String task;

    TaskLog()
    {
    }

    TaskLog(int fromTime,int toTime )
    {
    this.fromTime = fromTime;
    this.toTime = toTime;
    }
      
    TaskLog(int code, String title, String description, String assignedEmployee, String taskPhase, int fromTime, int toTime, String task) {
        super(code, title, description, assignedEmployee, taskPhase);
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.task = task;

    }
  

    @Override
    public String getAssignedEmployee() {
        return assignedEmployee;
    }

    public int getFromTime() {
        return fromTime;
    }

    public void setFromTime(int fromTime) {
        this.fromTime = fromTime;
    }

    public int getToTime() {
        return toTime;
    }

    public void setToTime(int toTime) {
        this.toTime = toTime;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public double time() {
        double timee = toTime - fromTime;

        return timee;
    }
    
     public String toString()
    {
    return super.toString() + "from time" +fromTime+ "\n to Time" +toTime;
    
    }

    
}