package q3;

/**
 * <p>Represents a college student. This class has been edited so each 
 * student has three test scores related to them. This class also
 * calculates the average score out of three tests.<p>
 * @author Lewis
 * @author Loftus
 * @author Sam Salvail
 * @version 1
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** First test score of this student. */
    private int test1;
    
    /** Second test score of this student. */
    private int test2;
    
    /** Third test score of this student. */
    private int test3;
    
    /** Average test score of this student. */
    private int average;
    
    /** Used to prevent magic numbers. */
    private final int three = 3;

    /**
    * Constructor: Sets up this student with the specified values.
    * @param first The first name of the student
    * @param last The last name of the student
    * @param home The home address of the student
    * @param school The school address of the student
    * @param test1 The first test score
    * @param test2 The second test score
    * @param test3 The third test score
    */
    public Student(String first, String last, Address home, Address school, 
                    int test1, int test2, int test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
    
    /**
     * Constructor2: This constructor only takes the three test scores as a 
     * parameter.
    */
    public Student() {
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    /**
     * The setTestScore method takes the test number and the test score as
     * a parameter and sets the score of the specified test.
     * @param testNumber Which test number to set.
     * @param score The score of the specified test.
     */
    public void setTestScore(int testNumber, int score) {
        switch(testNumber) {
        case(1):    
            test1 = score;
            break;
        case(2):    
            test2 = score;
            break;
        case(three):    
            test3 = score;
            break;
        default:
            break;
        }
    }
        
    /**
     * The getTestScore method takes the test number and returns the
     * specified test score.
     * @param testNumber The test number that you want the score of.
     * @return testNumber Returns score of specified test number
     */
    public int getTestScore(int testNumber) {
        if (testNumber == 1) {
            return test1;
        } else if (testNumber == 2) {
            return test2;
        } else if (testNumber == three) {
            return test3;
        } else {
            return testNumber;
        }
    }
    
    /**
     * The average method returns the average of all three test scores.
     * @return average Returns the average of the three tests
     */
    public int average() {
        average = (test1 + test2 + test3) / three;
        return average;
    }

    /**
    * Returns a string description of this Student object.
    * @return formatted name and addresses of student
    */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test 1 Score:\n" + test1 + "\n";
        result += "Test 2 Score:\n" + test2 + "\n";
        result += "Test 3 Score:\n" + test3 + "\n";
        result += "Average test score:\n" + average;

        return result;
    }
}
