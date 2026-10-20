/*
//Name: Daniel Chung
//ID: 1331774
//Course: CSCI 185 Programming 2
//Section: M03
//Lab 3
 */

package DanielLabClasses;// package class

public class Course {
    private String jimmycoursenumber;// setting private holder for variable course number
    private String jimmyclass;// private holder for the class
    private int coursecredits;// private holder for the credits

    public Course() {
        this.jimmyclass = "Programming 2";// setting the class to programming 2
        this.jimmycoursenumber = "CSCI 185";// setting the class to scci 185
        this.coursecredits = 3;// stting the credits to 3
    }

    public Course(String jimmyclass, String jimmycoursenumber, int coursecredits) {//setting the array of increments
        this.jimmyclass = jimmyclass;// setting the variable for jimmyclass
        this.jimmycoursenumber = jimmycoursenumber;// variable for coursenumbers
        this.coursecredits = coursecredits;// setting the variavle for coursecredits
    }

    public Course(Course other) {// establishingt the course arrays
        this.jimmyclass = other.jimmyclass;// identifying the other classes
        this.jimmycoursenumber = other.jimmycoursenumber;// identfyng the other course numbers
        this.coursecredits = other.coursecredits;// identifying the other course credits
    }
    public String getJimmyclass() {// getter statement for the class
        return jimmyclass;// returning statement
    }

    public void setJimmyclass(String jimmyclass) {// setter statement for jimmyclass
        this.jimmyclass = jimmyclass;// returing statement
    }

    public String getJimmycoursenumber() {// getter statement for jimmycourse
        return jimmycoursenumber;// returing statement for jimmycourse
    }

    public void setJimmycoursenumber(String jimmycoursenumber) {// setter statement for jimmycoursenumber
        this.jimmycoursenumber = jimmycoursenumber;// returing statement
    }

    public int getCoursecredits() {// getter for the course credits
        return coursecredits;// returning statement
    }

    public void setCoursecredits(int coursecredits) {// setter statement for the credit amount
        this.coursecredits = coursecredits;// returing statement
    }

    @Override
    public String toString() {// tstring method with override shortcut
        return "Course: " + jimmyclass + " | Code: " + jimmycoursenumber + " | Credits: " + coursecredits;// setting the parameters for the main method
    }
}
