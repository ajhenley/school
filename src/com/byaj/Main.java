package com.byaj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Instructor instructor = new Instructor("Alton Henley");

        Course course = new Course();
        course.setName("Java");
        course.setCrn("99999");
        course.setCredits(3);
        Student student = new Student();
        student.setName("Elijah");
        student.setId("0100000");
        course.enroll(student);
        student = new Student();
        student.setName("Jada");
        student.setId("0100001");
        course.enroll(student);
        student = new Student();
        student.setName("Zakiyah");
        student.setId("0100002");
        student = new Student();
        student.setName("Mohammed");
        student.setId("0100003");
        course.enroll(student);
        course.enroll(student);
        instructor.assign(course);

        course = new Course();
        course.setName("INtro to Security");
        course.setCrn("99998");
        course.setCredits(3);
        instructor.assign(course);

        System.out.println(instructor.toString());
    }
}
