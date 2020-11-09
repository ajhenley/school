package com.byaj;

import java.util.ArrayList;

public class Instructor {
    private String name;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Instructor(String name) {
        this.name = name;
    }

    public Instructor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void assign(Course newcourse)
    {
        this.courses.add(newcourse);
    }

    public String toString()
    {
        String output = "";
        output += "Instructor Name: " + this.name;
        for (Course c : courses) {
            output += "\n" + c.toString();
            output += "\n\n";
        }
        return output;
    }
}
