package q2;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>The Guess class prompts a user to guess an integer between 1 and 100.
 * If the user guesses too high or too low they are informed and can guess
 * again or enter '0' to quit. If the user guesses correctly the number of
 * guessed they took to guess correctly is displayed and they are asked to
 * play again. If they enter '0' to quit they are just asked if they want
 * to play again. If 'yes' is selected the program runs again and if 'no'
 * is selected the program ends.</p>
 *
 * @author Sam Salvail
 * @version 1.0
 */
public class Guess {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        //Number the user tries to guess 
        int numToGuess;       
        //The user's guess 
        int guess;             
        //How many guesses the user uses
        int count;        
        //Phrase to continue playing
        String phrase = "yes";
        //Final integers to prevent from magic numbers
        final int max = 100;
        final int min = 1;
        
        //Scanner object
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random();  
        
        //Do-while loop that contains main game
        //Keeps running if user enters 'yes'
        do {
            //randomly generate the  number to guess 
            numToGuess = generator.nextInt(max) + min;
                
            //initialize counts
            count = 1;
                
            //print message asking user to enter a guess 
            System.out.println("Guess a number between 1-100 or enter "
                    + "0 to quit: ");
                
            //read in guess 
            guess = scan.nextInt();
    
            //keep going as long as the guess is wrong  
            while (guess != numToGuess && guess != 0) { 
                if (guess > numToGuess && guess <= max) {
                    System.out.println("Sorry! Your guess is too high. "
                            + "Guess again: ");
                    guess = scan.nextInt();
                } else if (guess < numToGuess && guess >= 0) {
                    System.out.println("Sorry! Your guess is too low. "
                            + "Guess again: ");
                    guess = scan.nextInt();
                } else {
                    throw new IllegalArgumentException("Your guess must be "
                            + "between 1-100.");
                }
                count++;
            } 
            
            //If user guesses right
            if (guess == numToGuess) {
                //print message saying guess is right 
                System.out.println("You win! \nIt took you "
                        + "" + count + ((count == 1) ? " try." : " tries."
                        + "\nWould you like to play again? (yes/no)"));
                scan.nextLine();
                phrase = scan.nextLine();
            //If user quits
            } else {
                System.out.println("Would you like to play again? (yes/no)");
                scan.nextLine();
                phrase = scan.nextLine();
            }
                
        } while(phrase.equals("yes"));
        
        // quits game if no is entered
        if (phrase.equals("no")) {
            System.out.println("Thanks for playing!");
        } else {
            throw new IllegalArgumentException("You must enter 'yes' or 'no'");
        }
        //closes Scanner object        
        scan.close();
    }

};
