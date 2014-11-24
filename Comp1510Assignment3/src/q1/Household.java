package q1;

import java.text.NumberFormat;

/**
 * <p>The Household class is used to store the data from a household.
 * It stores the id, income, and size of a specific household which is
 * used in Survey.java.</p>
 *
 * @author Sam Salvail
 * @version 1.0
 */
public class Household {
    
    /**
     * NumberFormat numForm formats the incomes of households.
     */
    private NumberFormat numForm = NumberFormat.getCurrencyInstance();
    /**
     * Integer id is used to store the id of a specific household.
     */
    private int id;
    /**
     * Integer income is used to store the income of a specific household.
     */
    private int income;
    /**
     * Integer size is used to store how many people are in a household.
     */
    private int size;
    
    /**
     * Constructor for the Household class. Sets the id, income, and size of
     * a household.
     * @param id The id of a specific household.
     * @param income The income of a specific household.
     * @param size The size of a specific household.
     */
    public Household(int id, int income, int size) {
        this.id = id;
        this.income = income;
        this.size = size;
    }
    
    /**
     * The getter for id.
     * @return id The id of a household
     */
    public int getId() {
        return id;
    }
    
    /**
     * The getter for income.
     * @return income The income of a household
     */
    public int getIncome() {
        return income;
    }
    
    /**
     * The getter for size.
     * @return size The size of a household
     */
    public int getSize() {
        return size;
    }
    
    /**
     * The toString method for the class. Returns id, income, and
     * size separated by tabs.
     * @return String 
     */
    public String toString() {
        return "" + id + "\t\t" + numForm.format(income) + "\t\t" + size + "";
    }
};
