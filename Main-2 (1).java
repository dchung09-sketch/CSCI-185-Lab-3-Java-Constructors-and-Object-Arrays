/*
//Name: Daniel Chung
//ID: 1331774
//Course: CSCI 185 Programming 2
//Section: M03
//Lab 3
 */

import DanielLabClasses.Course;// Inheriting the methods from the course class
import DanielLabClasses.Person;// Intelling the information from the person files
import DanielLabClasses.Student;// inheriting the information fro the class files

public class Main {// start of the main methods
    public static void main(String[] args) {// start of the arguments
        Person person = new Person("Neutron", "Jimmy", 20);// setting parameters of the first and last name plus age
        System.out.println(person.toString());  // print statement
        Course course1 = new Course("Programming 2", "CSCI 185", 3);// setting the class, course number, and creidts
        System.out.println(course1.toString()); // print statement
        Student student = new Student();// setting the variable
        System.out.println(student.toString());// print statement
        Course[] courses = { new Course("Electrical", "EENG 212", 4) };// setting the class, course number and credits
        Student customStudent = new Student("Neutron", "Jimmy", 20, "Electrical Engineering", "133174", courses);// setting all the information together
        System.out.println(customStudent.toString()); // printing statement
    }
}

