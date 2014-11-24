package q4;

import java.util.ArrayList;

import q3.Student;

/**
 * <p>The Course class creates a course that uses the Student class. Students
 * can be added to the course using the addStudent method. The Course
 * class holds up to 5 students. This class can also calculate the total
 * average of the students in the course using the average method and
 * also print all the students in the course using the roll method.<p>
 * @author Sam Salvail
 * @version 1.0
 *
 */
public class Course {
    
    /**
     * Integer numStudents is used to keep track of the number of students
     * in a course.
     */
    private int numStudents;
    
    /**
     * Integer 'five' to refrain from magic numbers.
     */
    private final int five = 5;
    
    /**
     * String courseName is used to store the entered course name such as
     * 'physics'.
     */
    private String courseName;
    
    /**
     * AttayList that stores Student objects when they are added to the 
     * course using the addStudent method.
     */
    private ArrayList<Student> students = new ArrayList<Student>();
    
    /**
     * Constructor for the Course class. This takes a parameter 'name' used
     * to set the name of the course and also sets the number of students
     * to 0.
     * @param name The name of the course.
     */
    public Course(String name) {
        courseName = name;
        numStudents = 0;
    }
    
    /**
     * The method addStudent is used to add a Student object to the course.
     * It also increments the numStudents variable and throws an exception
     * if a sixth student is added.
     * @param student The student object that is being added to the course.
     */
    public void addStudent(Student student) {
        numStudents++;
        if (numStudents <= five) {
            students.add(student);
        } else {
            throw new IllegalArgumentException("There can only be 5 "
                    + "students in a course");
        }
    }
    
    /**
     * The average method is used to calculate the average of all the students
     * in a course.
     * @return average Returns computed average of all students
     */
    public double average() {
        double totalAverages = 0;
        for (Student student : students) { 
            totalAverages += student.average(); 
        }
        double average = totalAverages / numStudents; 
        return average; 
        
    }
    
    /**
     * The roll method is used to print out all of the students in a course.
     */
    public void roll() {
        System.out.println("The students in - " + courseName + "");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
