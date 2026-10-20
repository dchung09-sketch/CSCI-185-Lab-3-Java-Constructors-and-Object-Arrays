/*
//Name: Daniel Chung
//ID: 1331774
//Course: CSCI 185 Programming 2
//Section: M03
//Lab 3
 */

package DanielLabClasses;// package name

public class Student extends Person {// connecting the class with the previous class
    String studentMajor;// setting the variables
    Course[] courses;
    String studentID;
    public Student() {
        super();  // gets informaton from the last class
        this.studentMajor = "Electrical Engineering";// setting major variable
        this.studentID = "133174";// setting age variable
        this.courses = new Course[]{// array of courses
                new Course("Programming 2", "CSCI 185", 3) // setting the course, course number and credits
        };
    }
    public Student(String officialLastName, String officialFirstName, int officialAge,
                   String studentMajor, String studentID, Course[] courses) {// string of arrays
        super(officialLastName, officialFirstName, officialAge);
        this.studentMajor = studentMajor;// setting the major
        this.studentID = studentID;// setting the id
        this.courses = courses;// setting the courses
    }
    public String getStudentMajor() {// getting the major
        return studentMajor;// returing the major
    }
    public void setStudentMajor(String studentMajor) {// setting the major
        this.studentMajor = studentMajor; // return statement
    }
    public String getStudentID() {// getting id id number
        return studentID;// returing statement
    }
    public void setStudentID(String studentID) {// setting the student id
        this.studentID = studentID;// returning statement
    }
    public Course[] getCourses() {// getting the course number
        return courses;// returing statement
    }
    public void setCourses(Course[] courses) {// setting the course number
        this.courses = courses;// returing statement
    }

    @Override
    public String toString() {// overide codew with the tostring method
        String result = "Student ID: " + studentID + "\nMajor: " + studentMajor + "\nCourses:\n";// setting the parameters
        for (Course c : courses) {// for statement setting the increment of course allignments
            result += c.toString() + "\n";
        }
        return result;// returning the end result
    }
}
