import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    //Create Scanner object
    Scanner s = new Scanner(System.in);

    //Get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter you favorite number: ");
    String favoriteNumber = s.nextLine();
    System.out.print("Are you a teacher or student?: ");
    String role = s.nextLine().toLowerCase();

    System.out.println("Username: " + firstName + ", "+ getInitial(lastName) + favoriteNumber);
    
    if (role.equals("student")){
        System.out.println("Email: " + firstName.replaceAll("\\s","").toLowerCase() + getInitial(lastName).toLowerCase() + favoriteNumber + "@nycstudents.net");
    }//End if statement
    else{
        System.out.println("Email: " + getInitial(firstName).toLowerCase() + lastName.replaceAll("\\s","").toLowerCase() + favoriteNumber + "@schools.nyc.gov");
    }//End else statement
    
    s.close();
  } //End main method

  /*
   * Name: getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } //End initialize method

} //End UserName class