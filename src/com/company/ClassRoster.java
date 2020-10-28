package com.company;

public class ClassRoster {
    public String className; //Yellow light
    public Student[] classRoster; //Yellow light!
    public int classSize; //Yellow light!

    public ClassRoster(String theClassName, int numOfStudents) { //This entire constructor is a yellow light!
        theClassName = className;
        numOfStudents = classSize;
        classRoster = new Student[numOfStudents];
    }

    public void addToRoster(Student kidToAdd) {  //This entire method is a green light...duh!

    }

    public int numOfStudentsAbsent() { //This entire method is a yellow light!
        int counter = 0;
        for(int i = 0; i <= classRoster.length; i++) {
            if(classRoster[i].getAttendance())
                counter++;
        }
        return counter;
    }

    public int howManyAbsent() { //This entire method is a yellow light!
      return 0;
    }

    public Student[] getClassRoster() { //This entire method is a yellow light!
        return classRoster;
    }

    public void displayRoster() { //This entire method is a green light! Ruh-roh!

    }
}
