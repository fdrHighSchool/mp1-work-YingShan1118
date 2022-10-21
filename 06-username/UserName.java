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
    System.out.print("How long would you like the password to be?: ");
    int length = s.nextInt();

    System.out.println("Username: " + firstName.replaceAll("\\s","") + getInitial(lastName) + favoriteNumber);
    
    if (role.equals("student")){
        System.out.println("Email: " + firstName.replaceAll("\\s","").toLowerCase() + getInitial(lastName).toLowerCase() + favoriteNumber + "@nycstudents.net");
    }//End if statement
    else{
        System.out.println("Email: " + getInitial(firstName).toLowerCase() + lastName.replaceAll("\\s","").toLowerCase() + favoriteNumber + "@schools.nyc.gov");
    }//End else statement
    
    System.out.println("Password: " + generatePassword(length));
    
    s.close();
  } //End main method
  /*
   * Purpose: send back a random String of numbers, upper/lower case letter
   * Input: length of password (int)
   * Return: s String of password (String)
   */
    public static String generatePassword(int length){
      String password = "";
      for (int i = 0; i < length; i++){
          //65 - 90 Capital Letter
          //97 - 122 Lower Case
          int randomNumber = (int)(Math.random() * (122 - 48 +1) + 48);
          char c = (char)randomNumber;
          password += c;
      }
      return password;
    }//End generatePassword method
    
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