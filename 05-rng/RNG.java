
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
    
    System.out.println("What would you like the minimum number to be?");
    int minimum = in.nextInt(); 
    
    System.out.println("What would you like the minimum number to be?");
    int maximum = in.nextInt(); 
    
    int randomNumber = (int)((Math.random() * (maximum - minimum + 1) + minimum));
    System.out.println("I am thinking of a number between " + minimum + " and " + maximum);
    System.out.println("(including both). Can you guess what it is?");
    System.out.print("Type a number: ");
    int guessNumber = in.nextInt();
    System.out.println("Your guess is: " + guessNumber);
    System.out.println("The number I was thinking of is: " + randomNumber);
    System.out.println("You were off by: " + (randomNumber - guessNumber));
  }
}