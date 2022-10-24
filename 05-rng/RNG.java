
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
    System.out.println("");
    
    Integer guessNumber = 0;
    
    for (int i = 1; i <= chance; i++){
        //System.out.println(i);
        System.out.print("Type a number: ");
        guessNumber = s.nextInt();
        System.out.println("Your guess is: " + guessNumber);
        if(guessNumber.equals(randomNumber)){
            System.out.println("\u001B[5;31m" + "You guessed the correct number!" + "\u001B[0m");
            System.out.println("\u001B[31m" + "It took you " + "\u001B[1;4m" + i + "\u001B[0;31m" + " time(s) to guess the correct number!" + "\u001B[0m");
            i = chance;
        }//End if statement
        else if (guessNumber > randomNumber){
            System.out.println("The number is " + "\u001B[4m" + "less than" + "\u001B[0m" + " " + guessNumber);
            chanceLeft(chance,i);
        }//End else if statement
        else{
            System.out.println("The number is " + "\u001B[4m" + "greater than" + "\u001B[0m" + " " + guessNumber);
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
    System.out.println("You have " + "\u001B[1m" + (chance - times) + "\u001B[0m" + " chance(s) left");
    System.out.println("");
}
}//End of rng class