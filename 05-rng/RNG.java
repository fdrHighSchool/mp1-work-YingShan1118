
/**
 * Write a description of class Rng here.
 *
 * Ying Shan Li
 * 10/4/22
 */

import java.util.Scanner;

public class Rng {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("What would you like the minimum number to be?: ");
    int minimum = s.nextInt(); 
    
    System.out.print("What would you like the maximum number to be?: ");
    int maximum = s.nextInt(); 
    
    System.out.print("How many times would you like to guess?: ");
    Integer chance = s.nextInt();
    
    Integer randomNumber = (int)((Math.random() * (maximum - minimum + 1) + minimum));
    System.out.println(randomNumber);
    System.out.println("I am thinking of a number between " + minimum + " and " + maximum);
    System.out.println("(including both). Can you guess what it is?");
    
    Integer guessNumber = 0;
    
    for (int i = 1; i <= chance; i++){
        //System.out.println(i);
        System.out.print("Type a number: ");
        guessNumber = s.nextInt();
        System.out.println("Your guess is: " + guessNumber);
        if(guessNumber.equals(randomNumber)){
            System.out.println("\u001B[5m" + "\u001B[1m" + "\u001B[31m" + "You guessed the correct number!" + "\u001B[0m");
            i = 0;
        }//End if statement
        else if (guessNumber > randomNumber){
            System.out.println("The number is " + "\u001B[4m" + "less than" + "\u001B[m" + " " + guessNumber + "\u001B[0m");
            chanceLeft(chance,i);
        }//End else if statement
        else{
            System.out.println("The number is " + "\u001B[4m" + "greater than" + "\u001B[0m" + " " + guessNumber + "\u001B[0m");
            chanceLeft(chance,i);
        }//End else statement
    }//End of for loop
    if (!guessNumber.equals(randomNumber)){
       System.out.println("The number I was thinking of is: " + "\u001B[33m" + randomNumber + "\u001B[0m");
       System.out.println("You were off by: " + "\u001B[32m" + Math.abs((randomNumber - guessNumber)) + "\u001B[0m"); 
    }
    s.close(); 
}//End of main method

public static void chanceLeft(int chance, int times){
    System.out.println("You still have " + (chance - times) + " chance(s) left");
}
}//End of rng class