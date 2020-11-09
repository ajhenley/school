package com.byaj;

import java.util.ArrayList;

public class Course {
    private String name;
    private String crn;
    private int credits;
    private ArrayList<Student> students = new ArrayList<Student>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void enroll(Student student)
    {
        this.students.add(student);
    }

    public String toString ()
    {
        String output = "";
        output += "Name   : " + this.name;
        output += "\nCRN    : " + this.crn;
        output += "\nCredits: " + this.credits;
        output += "\n------------------------------";
        for (int i = 0; i < students.size(); i++) {
            output += "\n" + students.get(i).toString();
        }
        return output;
    }

}
