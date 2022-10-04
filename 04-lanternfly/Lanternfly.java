
/**
 * Write a description of class Lanternfly here.
 *
 * Ying Shan Li
 * 9/29/22
 */

import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\u001B[33m" + "The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants." + "\u001B[0m");
        
        System.out.print("\u001B[36m" + "How many did you squash this summer?: " + "\u001B[0m");
        int num = input.nextInt();
        
        if (num < 5) {
            System.out.println("\u001B[1m" + "\u001B[31m" + "You can do better than that!" + "\u001B[0m");
        } //End if statement
        else if (num < 10){
            System.out.println("\u001B[32m" + "Thanks for doing your part!" + "\u001B[0m");
        } //End else if statement
        else {
            System.out.println("\u001B[5m" + "\u001B[34m" + "You are super!" + "\u001B[0m");
        }//End of else statement
    } //End main method
} //End class