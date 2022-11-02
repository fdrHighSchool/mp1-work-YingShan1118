import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String point1, point2;
    
    do{
      System.out.print("Please enter a point in the form (x, y): ");
      // write a statement to store the input
      point1 = s.nextLine();
      // check if the user input the point correctly
      // if yes, continue code
      // if no, get the input again
      if (checkInput(point1) == false){
        System.out.println("Invalid entry!");
      }
    } while(checkInput(point1) == false);

    do{
    System.out.print("Please enter a second point: ");
    // write a statement to store the input
    point2 = s.nextLine();
     
    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again 
      if (checkInput(point1) == false){
        System.out.println("Invalid entry!");
      }
    } while(checkInput(point2) == false);

    int x1 = getX(point1);    
    int y1 = getY(point1);
    int x2 = getX(point2);
    int y2 = getY(point2);
    
    System.out.println(point1 + " lies in " + quadrent(x1, y1));
    System.out.println(point2 + " lies in " + quadrent(x2, y2));
    System.out.println("The distance between these two points is " + euclideanDistance(x1, y1, x2, y2));
    System.out.println("The absolute value of the distance between two points is " + taxicabDistance(x1, y1, x2, y2));

    s.close();
  } //End main method

   /*
   * N: checkInput
   * P: determine whether or not the input followed correct format
   * I: String user typed in
   * R: is the point in the correct format (boolean)
   */
  public static boolean checkInput(String point){
    boolean status = true;
    if (point.indexOf("(") != 0){
      status = false ;
    }//End of 1st if statement
    
    if (point.indexOf(", ") == -1){
      status = false;
    }//End of 2nd if statement

    if(point.indexOf(")") != (point.length() - 1)){
      status = false;
    }//End of 3rd if statement
    
    return status;
  }//End of checkInput method


  /*
   * N: getX
   * P: get the x-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: x-coordinate (int)
   */
  public static int getX(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(", ");

    // grab substring from after parentesis up to comma
    String x = point.substring(1, commaPos);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(x);
  } // end getX method

  /*
   * N: getY
   * P: get the y-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: y-coordinate (int)
   */
  public static int getY(String point){
    // determine where the comma is located
    int spaceIndex = point.indexOf(" ");

    // grab substring from after comma up to parentesis
    String y = point.substring((spaceIndex + 1), point.length() - 1);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(y);
  }

  /*
   * N: quadrant
   * P: determine which quadrant the point lies in
   * I: x and y (int)
   * R: quadrent the point is in (String)
   */
  public static String quadrent(int x, int y){
    String quadrent = "";
    if (x > 0 && y > 0){
      quadrent = "quadrent I";
    }//End of 1st if statment
    if (x > 0 && y < 0){
      quadrent = "quadrent IV";
    }//End of 2nd if statment
    if (x < 0 && y > 0){
      quadrent = "quadrent II";
    }//End of 3rd if statment
    if (x < 0 && y < 0){
      quadrent = "quadrent III";
    }//End of 4th if statment 
    return quadrent;
  }//End of quadrent method

  /*
   * N: euclideanDistance
   * P: calculate the distance between two points
        sqrt((x2 - x1)^2 + (y2 - y1)^2)
   * I: x1, x2, y1, and y2 (int)
   * R: the distance between two points (int)
   */
  public static double euclideanDistance (int x1, int y1, int x2, int y2){
  double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
  return distance; 
  }//End of euclideanDistance method


  /*
   * N: taxicabDistance
   * P: calculate the distance between two points
        abs(x2 - x1) + abs(y2 - y1)
   * I: x and y (int)
   * R: the absolute value of the distance between two points (int)
   */
  public static double taxicabDistance (int x1, int y1, int x2, int y2){
    double distance = (Math.abs(x2 - x1)) + (Math.abs(y2 - y1));
    return distance; 
  }


} // end class
