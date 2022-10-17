
/**
 * Write a description of class rng here.
 *
 * Ying Shan Li
 * 10/4/22
 */

import java.util.Scanner;

public class rng {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("What would you like the minimum number to be?: ");
    int minimum = in.nextInt(); 
    
    System.out.print("What would you like the minimum number to be?: ");
    int maximum = in.nextInt(); 
    
    System.out.print("How many times would you like to guess?: ");
    Integer chance = in.nextInt();
    
    Integer randomNumber = (int)((Math.random() * (maximum - minimum + 1) + minimum));
    System.out.println("I am thinking of a number between " + minimum + " and " + maximum);
    System.out.println("(including both). Can you guess what it is?");
    
    Integer guessNumber;
    
    if (chance <= 0){
        System.out.print("Please enter a number that is greater than 0: ");
        chance = in.nextInt();
    }//End first if statement 
    else{
        while (!chance.equals(0)){
            System.out.print("Type a number: ");
            guessNumber = in.nextInt();cc
            System.out.println("Your guess is: " + guessNumber);
            if(guessNumber.equals(randomNumber)){
                System.out.println("You guessed the correct number!");
            }//End second if statement
            else if (guessNumber > randomNumber){
                System.out.println("The number is less than " + guessNumber);
            }//End else if statement
            else{
                System.out.println("The number is less than " + guessNumber);
            }//End second else statement
            //System.out.println("
            chance -= 1;
        }//End of while statment
    }//End of first else statement
    System.out.println("The number I was thinking of is: " + randomNumber);
    //System.out.println("You were off by: " + (randomNumber - guessNumber));
  }//End of main method
}//End of rng class