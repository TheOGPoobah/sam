package q4;

import q3.Address;
import q3.Student;

/**
 * <p>The TestCourse class is the driver program for the Course class.
 * It tests the Course class by creating a course object and adding
 * 5 students to the course. This is done by using the addStudent
 * method. Then, the average of all students is displayed using the
 * average method. Finally, all of the students in the course are
 * printed out using the roll method.</p>
 *
 * @author Sam Salvail
 * @version 1.0
 */
public class TestCourse {
    
    /**
     * First test score of student 1.
     */
    private static final int TEST_SCORE_1 = 23;
    /**
     * Second test score of student 1.
     */
    private static final int TEST_SCORE_2 = 25;
    /**
     * Third test score of student 1.
     */
    private static final int TEST_SCORE_3 = 27;
    
    /**
     * First test score of student 2.
     */
    private static final int TEST_SCORE_11 = 12;
    /**
     * Second test score of student 2.
     */
    private static final int TEST_SCORE_22 = 22;
    /**
     * Third test score of student 2.
     */
    private static final int TEST_SCORE_33 = 27;
    
    /**
     * First test score of student 3.
     */
    private static final int TEST_SCORE_111 = 20;
    /**
     * Second test score of student 3.
     */
    private static final int TEST_SCORE_222 = 29;
    /**
     * Third test score of student 3.
     */
    private static final int TEST_SCORE_333 = 23;
    
    /**
     * First test score of student 4.
     */
    private static final int TEST_SCORE_1111 = 12;
    /**
     * Second test score of student 4.
     */
    private static final int TEST_SCORE_2222 = 15;
    /**
     * Third test score of student 4.
     */
    private static final int TEST_SCORE_3333 = 24;
    
    /**
     * First test score of student 5.
     */
    private static final int TEST_SCORE_11111 = 24;
    /**
     * Second test score of student 5.
     */
    private static final int TEST_SCORE_22222 = 25;
    /**
     * Third test score of student 5.
     */
    private static final int TEST_SCORE_33333 = 29;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // Course object named 'physics'
        Course course1 = new Course("physics");
        
        // Home and school addresses created that all students use.
        // (I guess they live in a dorm or something...)
        Address homeAddress = new Address("Home Street", "Awesometown", 
                "California", "1234");
        Address schoolAddress = new Address("School Street", "Awesometown", 
                "California", "1337");
        
        // Students 1-5 created that all have varying test scores.
        Student student1 = new Student("John", "Doe", homeAddress, 
                schoolAddress, TEST_SCORE_1, TEST_SCORE_2, TEST_SCORE_3);
        
        Student student2 = new Student("Ricky", "Bobby", homeAddress, 
                schoolAddress, TEST_SCORE_11, TEST_SCORE_22, TEST_SCORE_33);
        
        Student student3 = new Student("Jackie", "Chan", homeAddress, 
                schoolAddress, TEST_SCORE_111, TEST_SCORE_222, TEST_SCORE_333);
        
        Student student4 = new Student("Mike", "Holmes", homeAddress, 
                schoolAddress, TEST_SCORE_1111, 
                TEST_SCORE_2222, TEST_SCORE_3333);
        
        Student student5 = new Student("Jim", "Bob", homeAddress, 
                schoolAddress, TEST_SCORE_11111, 
                TEST_SCORE_22222, TEST_SCORE_33333);
        
        // Adds the five students to the course.
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
        course1.addStudent(student5);
        
        // Prints out the overall average of all students.
        System.out.println("The overall average of course 1 is: "
                + "" + course1.average() + "");
        
        // Prints out all the students in the course.
        course1.roll();
        
    }

};
