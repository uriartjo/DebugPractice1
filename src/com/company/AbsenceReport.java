package com.company;

public class AbsenceReport {
    private String reportName; //Yellow light!
    private Student[] listOfAbsences; //Yellow light!

    public AbsenceReport(String theReportName, int numOfAbsences) { //This entire constructor is a yellow light!
        listOfAbsences = new Student[numOfAbsences];
    }

    public void addAbsencesFromRoster(Student[] classRoster) { //Green light! Muahahaha!


    }

    public void displayAbsences() { //Red light! ...just kidding, it's green, son!

    }
}
