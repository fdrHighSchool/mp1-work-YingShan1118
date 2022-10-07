
/**
 * Write a description of class RNG here.
 *
 * Ying Shan Li
 * 10/4/22
 */

import java.util.Scanner;

public class RNG {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int maximum;
    System.out.println("What mode would you like to play on? \nEasy \nMedium \nHard");
    String mode = in.nextLine(); 
    if(mode.toLowerCase().equals("easy")){
        maximum = 10;
    }//End if statement
    else if(mode.toLowerCase().equals("medium")){
        maximum = 50;
    }//End else if statement
    else{
        maximum = 100;
    }//End else statement 
    
    int randomNumber = (int)((Math.random() + 1) * maximum);
    System.out.println("I am thinking of a number between 1 and " + maximum);
    System.out.println("(including both). Can you guess what it is?");
    System.out.print("Type a number: ");
    int guessNumber = in.nextInt();
    System.out.println("Your guess is: " + guessNumber);
    System.out.println("The number I was thinking of is: " + randomNumber);
    System.out.println("You were off by: " + (randomNumber - guessNumber));
  }
}