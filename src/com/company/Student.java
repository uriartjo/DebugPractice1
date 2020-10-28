package com.company;

public class Student {
    public String name; //Yellow light!
    public int grade; //Yellow light!
    public Boolean isAbsent; //Yellow light!

    public Student(String theirName, int theirGrade) { //Entire constructor is a yellow light!
        name = theirName;
        grade = theirGrade;
        isAbsent = determineIfAbsent();
        if(grade <= 12)
            System.out.println(name + " is a 12th grader!");
        if(grade <= 11)
            System.out.println(name + " is a 11th grader!");
        if(grade <= 10)
            System.out.println(name + " is a 10th grader!");
        if(grade <= 9)
            System.out.println(name + " is a 9th grader!");
    }

    public boolean determineIfAbsent() { //Oh yeah, we got a green light situation!
        int absentValue = 0; //absentValue is RANDOMLY (coughcoughHINTcough) either 0 or 1. If 0, student is in class. If 1, student is absent.
        return false;
    }

    public boolean getAttendance() { //Yellow light!
        return isAbsent;
    }

    public String getName() { //Yellow light!
        return name;
    }


}
