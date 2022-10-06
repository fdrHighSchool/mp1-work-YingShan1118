
/**
 * Write a description of class RNG here.
 *
 * Ying Shan Li
 * 10/4/22
 */

import java.util.Scanner;
import java.util.Random;

public class RNG {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    
    System.out.println("What mode would you like to play on? \nEasy \nMedium \nHard");
    String mode = in.nextLine(); 
    if(mode.toLowerCase().equals("easy")){
        System.out.println(mode);
    }
    else if(mode.toLowerCase().equals("medium")){
        System.out.println(mode);
    }
    else{
        System.out.println(mode);
    }
    
    System.out.println("I am thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    System.out.print("Type a number: ");
    int guessNumber = in.nextInt();
    System.out.println("Your guess is: " + guessNumber);
    System.out.println("The number I was thinking of is: " + number);
    System.out.println("You were off by: " + (number - guessNumber));
  }
}