package q3;

/**
 * <p>The TestStudent class is a driver class to test the methods
 * in Student.java. Two Student objects are created, one with each
 * constructor. Then, the test score is set for the second Student
 * object. Finally, the first Student object is printed using the
 * toString method and the second Student object is printed using
 * the getTestScore method.</p>
 *
 * @author Sam Salvail
 * @version 1.0
 */
public class TestStudent {
    
    /**
     * First test score of student 1.
     */
    private static final int TEST_SCORE_1 = 20;
    /**
     * Second test score of student 1.
     */
    private static final int TEST_SCORE_2 = 23;
    /**
     * Third test score of student 1.
     */
    private static final int TEST_SCORE_3 = 25;
    
    /**
     * First test score of student 2.
     */
    private static final int TEST_SCORE_11 = 15;
    /**
     * Second test score of student 2.
     */
    private static final int TEST_SCORE_22 = 17;
    /**
     * Third test score of student 2.
     */
    private static final int TEST_SCORE_33 = 20;
    
    /**
     * Integer '3' to prevent from magic numbers.
     */
    private static final int THREE = 3;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // Creates home and school addresses that all students use
        Address homeAddress = new Address("Home Street", "Awesometown", 
                "California", "1234");
        Address schoolAddress = new Address("School Street", "Awesometown", 
                "California", "1337");
        
        // Creates two student objects
        Student student1 = new Student("John", "Doe", homeAddress, 
                schoolAddress, TEST_SCORE_1, TEST_SCORE_2, TEST_SCORE_3);
        
        Student student2 = new Student();
        
        student2.setTestScore(1, TEST_SCORE_11);
        student2.setTestScore(2, TEST_SCORE_22);
        student2.setTestScore(THREE, TEST_SCORE_33);
        
        // calculate average of student 1
        student1.average();
        
        // Print student1 object using toString() method
        System.out.println(student1.toString());
        
        // Print student2 object test scores
        System.out.println();
        System.out.println("Student2 test scores:");
        System.out.println(student2.getTestScore(1));
        System.out.println(student2.getTestScore(2));
        System.out.println(student2.getTestScore(THREE));
        System.out.println("Student2 average:");
        System.out.println(student2.average());
    }

};
