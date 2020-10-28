package com.company;

public class Main {

    /*
    Welcome to Schmaint Andrus School, where we prepare the next generation of horror! At Schmaint Andrus,
    you'll find tons of scary things - from zombies to vampires to even tests that were never posted on MySA but
    you still have to take! How...ghastly!

    Nothing is scarier than missing class though, trust me, I'm a disembodied voice in your head so you know I'm legit.
    That's why today, you'll be repairing and completing the code provided here.

    The idea is simple:
        •All classes have a ClassRoster that holds the name of the class, and also the students found within it
        •When the ClassRoster object is finalized, we scan it to see who is absent and we generate a new AbsenceReport
        object from the data within the ClassRoster. Nothing says scary like bureaucracy!

        To let you better test your code, there is a .jpg attached to this that will present you with 4 students. Those
        4 students will be your guinea pigs for testing your code. Notice the 4 student objects. Notice there are 4 students in the image.
        I'm sure you can work it out.

        Next, you'll see next to nearly every line or method the following:
        •Red light - Do not modify this code at all!
        •Yellow Light - Maybe you need to change something - maybe not!
        •Green Light - Oh yeah, you'll be changing some code alright to get it to work.
     */


    public static void main(String[] args) {
        Student student1 = null; //Green light!
        Student student2 = null; //Green light!
        Student student3 = null; //Green light!
        Student student4 = null; //Green light!


        ClassRoster classList = new ClassRoster("Period B",4); //Yellow Light
        classList.addToRoster(student1); //Red light!
        classList.addToRoster(student2); //Red light
        classList.addToRoster(student3); //Red light
        classList.addToRoster(student4); //Red light

        classList.displayRoster(); //Red light!

        AbsenceReport report = new AbsenceReport(); //Green light!
        report.addAbsencesFromRoster(classList.getClassRoster()); //Red light!
        report.displayAbsences(); //Red light!
    }
}
