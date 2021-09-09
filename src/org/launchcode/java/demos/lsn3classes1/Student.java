package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;

    }

    public int getStudentId(){
        return studentId;

    }

    public int getNumberOfCredits(){
        return numberOfCredits;

    }
    public double getGpa(){
        return gpa;
    }

    public void setName(String newName){
        name = newName;

    }
    public void setStudentId(int newId){
        studentId = newId;

    }
    public void setNumberOfCredits(int newCredits){
        numberOfCredits = newCredits;

    }
    public void setGpa(double newGpa){
        gpa = newGpa;

    }



}