# Java Inheritance, Constructors, and Arrays of Objects

## Overview
This project was developed for CSCI 185 – Programming II, Lab 3. It models people, students, and courses to demonstrate Java inheritance and relationships between objects.

The `Student` class extends `Person`, adding a student ID, major, and an array of `Course` objects. #

## Key Concepts
- Inheritance using `extends`
- Constructor chaining using `super()`
- Default and parameterized constructors
- Copy constructors in the `Course` class
- Getters and setters
- Private fields in the `Course` class
- Method overriding with `toString()`
- Arrays of objects
- Enhanced `for` loops
- Organizing classes into packages

## Files
| File | Purpose |
| --- | --- |
| `Person.java` | Stores a person's first name, last name, and age. |
| `Student.java` | Extends `Person` with a student ID, major, and courses. |
| `Course.java` | Stores a course name, course number, and credit value. |
| `Main.java` | Creates example objects and prints their information. |

## Program Behavior
The main program:
1. Creates and displays a `Person`.
2. Creates and displays a `Course`.
3. Creates a student using the default constructor.
4. Creates a student with a custom course array.
5. Displays each student's ID, major, and courses.

## File Setup
Rename the uploaded files before compiling:
- `Student-1.java` → `Student.java`
- `Main-2 (1).java` → `Main.java`

Place `Person.java`, `Student.java`, and `Course.java` inside a folder named `DanielLabClasses`. Keep `Main.java` in the parent folder.

## How to Run
Install a Java Development Kit (JDK), then open a terminal in the folder containing `Main.java`.

Compile:
```bash
javac Main.java DanielLabClasses/Person.java DanielLabClasses/Student.java DanielLabClasses/Course.java
```

Run:
```bash
java Main
```

## Implementation Notes
- The program uses predefined examples and does not require user input.
- `Student.toString()` displays student details and courses but does not include the inherited name and age.
- `Course` provides a copy constructor, although the main program does not demonstrate it.
- `Student` stores and returns the course array directly, so the array is shared rather than defensively copied.

## Author
Daniel Chung  
CSCI 185 – Programming II, Section M03  
Lab 3
