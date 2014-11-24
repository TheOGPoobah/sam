package q1;

import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


/**
 * <p>The Survey class uses the Household program to collect and store
 * survey results. First, the data is scanned in from a text file 'survey.txt'.
 * Next, the data is added to an ArrayList of Household. A table is printed
 * with all the data. Finally calculations are conducted to determine the
 * average income and the percentage of households that are below the LICO.</p>
 *
 * @author Sam Salvail
 * @version 1.0
 */
public class Survey {
    
    /**
     * NumberFormat fmt1 used to format percent of households below LICO.
     */
    private static NumberFormat percForm = NumberFormat.getPercentInstance();
    /**
     * NumberFormat fmt2 used to format the income.
     */
    private static NumberFormat numForm = NumberFormat.getCurrencyInstance();
    /**
     * Integer index is used to reference the index of the array.
     */
    private static int index;
    /**
     * Integer totalIncome is used to store the total sum of all incomes.
     */
    private static int totalIncome;
    
    /**
     * Integer LEVEL1 is the LICO for 1 household member.
     */
    private static final int LEVEL1 = 22229;
    /**
     * Integer LEVEL2 is the LICO for 2 household members.
     */
    private static final int LEVEL2 = 27674;
    /**
     * Integer LEVEL3 is the LICO for 3 household members.
     */
    private static final int LEVEL3 = 34022;
    /**
     * Integer LEVEL4 is the LICO for 4 household members.
     */
    private static final int LEVEL4 = 41307;
    /**
     * Integer LEVEL5 is the LICO for 5 household members.
     */
    private static final int LEVEL5 = 46850;
    /**
     * Integer LEVEL6 is the LICO for 6 household members.
     */
    private static final int LEVEL6 = 52838;
    /**
     * Integer LEVEL7 is the LICO for 7 household members.
     */
    private static final int LEVEL7 = 58827;
    /**
     * Integer additional is the LICO for any additional household members.
     */
    private static final int ADDITIONAL = 5989;
    
    /**
     * Integer three prevents from magic numbers.
     */
    private static final int THREE = 3;
    /**
     * Integer four prevents from magic numbers.
     */
    private static final int FOUR = 4;
    /**
     * Integer five prevents from magic numbers.
     */
    private static final int FIVE = 5;
    /**
     * Integer six prevents from magic numbers.
     */
    private static final int SIX = 6;
    /**
     * Integer seven prevents from magic numbers.
     */
    private static final int SEVEN = 7;
    
    /**
     * Integer belowLICO is used to store the number of households that are 
     * below the LICO.
     */
    private static int belowLICO;
    /**
     * Integer percentageBelowLICO is used to store the percentage of 
     * households below the LICO.
     */
    private static double percentageBelowLICO;
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     * @throws IOException fixes file scanner
     */
    public static void main(String[] args) throws IOException {
        
        // Scanner to scan in data from 'survey.txt'
        Scanner fileScan = new Scanner(new File("./src/survey.txt"));
        
        // ArrayList of Household to store data
        ArrayList<Household> households = new ArrayList<Household>();
        
        // Prints table header
        System.out.println("ID Number\tAnnual Income\tHousehold Members");
        
        // Loop to add data to the array and print table
        while (fileScan.hasNext()) {
            households.add(new Household(fileScan.nextInt(),
                fileScan.nextInt(), fileScan.nextInt()));
            
            System.out.println(households.get(index));
            totalIncome += households.get(index).getIncome();
            index++;
        }
        
        // Prints the number of households and the average income
        System.out.println("Number of households: "
                + "" + households.size() + "");
        
        System.out.println("-----------------------------------------------"
            + "\nAverage income: "
            + "" + numForm.format(totalIncome / households.size()) + ""
            + "\n-----------------------------------------------");
        
        // For loop that contains a switch statement to determine how many
        // households are below the LICO
        for (int i = 0; i < households.size(); i++) {
            switch(households.get(i).getSize()) {
            case(1):
                if (households.get(i).getIncome() < LEVEL1) {
                    belowLICO++;
                }
                break;
            case(2):
                if (households.get(i).getIncome() < LEVEL2) {
                    belowLICO++;
                }
                break;
            case(THREE):
                if (households.get(i).getIncome() < LEVEL3) {
                    belowLICO++;
                }
                break;
            case(FOUR):
                if (households.get(i).getIncome() < LEVEL4) {
                    belowLICO++;
                }
                break;
            case(FIVE):
                if (households.get(i).getIncome() < LEVEL5) {
                    belowLICO++;
                }
                break;
            case(SIX):
                if (households.get(i).getIncome() < LEVEL6) {
                    belowLICO++;
                }
                break;
            case(SEVEN):
                if (households.get(i).getIncome() < LEVEL7) {
                    belowLICO++;
                }
                break;
            default:
                if (households.get(i).getIncome() < ADDITIONAL
                    * households.size() - SEVEN) {
                    belowLICO++;
                }
            }
        }
        
        // Calculation to find the percentage of houses below the LICO
        percentageBelowLICO = ((double) belowLICO / households.size());
        
        System.out.println("Percentage of households below the low "
                + "income level: " + percForm.format(percentageBelowLICO) + "");
        
        fileScan.close();
    }

}
