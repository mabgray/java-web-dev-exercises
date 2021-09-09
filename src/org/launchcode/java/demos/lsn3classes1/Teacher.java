package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String  firstName;
    private String  lastName;
    private String  subject;
    private int yearsTeaching;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newName){
         firstName = newName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }
    public String getSubject(){
        return subject;
    }

    public void setSubject(String newSubject){
       subject = newSubject;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }

    public void setYearsTeaching(int years){
      yearsTeaching = years;
    }





    Teacher(){

    }
}
