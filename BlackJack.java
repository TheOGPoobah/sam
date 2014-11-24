package p1;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        
        // Variables
        int numCards;
        boolean valid;
        char value;
        int totalValue = 0;
        
        // Scanner object that takes user input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user for how many cards they have
        // Also checks if input is valid
        do{
            System.out.println("Enter the number of cards you have (2-5) ");
            numCards = scan.nextInt();
            
            if(numCards < 6 && numCards > 1){
                valid = true;
            }
            else{
                valid = false;
                System.out.println("Must be between 2 and 5. Please re-enter: ");
            }
        }while(valid == false);
        
        // Loop to accept user entered values
        // Continues looping for how many cards the user entered
        for(int i = 0; i < numCards; i++){
            System.out.println("Please enter a card value: ");
            value = scan.next().charAt(0);
            
            // switch statement to determine which char was entered
            switch(value){
            case '2':   totalValue += 2;
                        break;
            case '3':   totalValue += 3;
                        break;
            case '4':   totalValue += 4;
                        break;
            case '5':   totalValue += 5;
                        break;
            case '6':   totalValue += 6;
                        break;
            case '7':   totalValue += 7;
                        break;
            case '8':   totalValue += 8;
                        break;
            case '9':   totalValue += 9;
                        break;
            case 't': 
            case 'T':   totalValue += 10;
                        break;
            case 'j':   
            case 'J':   totalValue += 10;
                        break;
            case 'q':   
            case 'Q':   totalValue += 10;
                        break;
            case 'k':
            case 'K':   totalValue += 10;
                        break;
            case 'a':
            case 'A':   if(totalValue + 11 > 21){
                            totalValue += 1;
                        }
                        else{
                            totalValue += 11;
                        }
            }
        }
        
        // Determine if total value is bust or not
        if(totalValue > 21){
            System.out.println("BUST");
        }
        else{
            System.out.println("You got: " + totalValue + "");
        }
    }
}


