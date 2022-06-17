package com.syntax.homework1606;

public class Task4 {
    /*Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    private int taskNumber;
    private String taskName;
    private String taskTopic;

    public Task4(){
    }
    public Task4(int taskNumber, String taskName, String taskTopic){
        this.taskNumber = taskNumber;
        this.taskName = taskName;
        this.taskTopic = taskTopic;
    }

    @Override
    public String toString() {
        return "Task4{" +
                "taskNumber=" + taskNumber +
                ", taskName='" + taskName + '\'' +
                ", taskTopic='" + taskTopic + '\'' +
                '}';
    }
}
