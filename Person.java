/*
//Name: Daniel Chung
//ID: 1331774
//Course: CSCI 185 Programming 2
//Section: M03
//Lab 3
 */

package DanielLabClasses;// package file name
public class Person {// class file name
    String officiallastname;// variable name for last name
    String officialfirstname;// variable name for first name
    int officialage;// integer for the age


    public Person() {
        officiallastname = "Neutron";// name constructor
        officialfirstname = "Jimmy";// first name constructor
        officialage = 20;//age constructor
    }

    public Person(String officiallastname, String officialfirstname, int officialage) {// setting the instance variable
        this.officiallastname = officiallastname;// setting the variable name
        this.officialfirstname = officialfirstname;  // setting the variable name
        this.officialage = officialage;// setting the variable age
    }

    public String getOfficiallastname() {// getter method for last name
        return officiallastname;// returning
    }

    public void setOfficiallastname(String officiallastname) {// setter method for last name
        this.officiallastname = officiallastname;// returning
    }

    public String getOfficialfirstname() {// getter method for the first name
        return officialfirstname;// returning statement
    }

    public void setOfficialfirstname(String officialfirstname) {// setting the first name
        this.officialfirstname = officialfirstname;// returning statement
    }

    public int getOfficialage() {// getting the age
        return officialage;//returning the age
    }

    public void setOfficialage(int officialage) {// setting the age
        this.officialage = officialage;// returing age
    }

    public String toString() {// tostring method with overide
        return officialfirstname + " " + officiallastname + ", Age: " + officialage;// returning variables
    }
}
