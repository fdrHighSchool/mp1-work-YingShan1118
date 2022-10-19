
/**
 * Write a description of class Rocket here.
 *
 * @author Michael Arocho and Ying Shan Li
 * @version (a version number or a date)
 */
public class Rocket 
{ 
 public static void main(String[]args) {
    triangle();
    square();
    System.out.println("|United|" + "\n" + "|States|");
    square();
    triangle();
 }//End of method main
 public static void triangle() {
    System.out.println("   /\\ ");
    System.out.println("  /  \\");
    System.out.println(" /    \\");
   } 
 public static void square() {
     System.out.println("+------+");
     System.out.println("|      |");
     System.out.println("|      |");
     System.out.println("+------+");
    }
 }
