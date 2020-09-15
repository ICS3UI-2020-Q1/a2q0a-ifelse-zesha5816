import java.util.Scanner;
/**
 *  This program will let the user know if they are old enough to vote
 * @author Mr. Lamont
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // store how old you must be to get your license
    final int LICENSE_AGE = 16;

    // store how old you must be to vote
    final int VOTING_AGE = 18;

    // get the user's age and store it for later
    System.out.println("Please enter your age:");
    int age = input.nextInt();

    // check to see if they are old enough to get a license or vote
    if (age >= VOTING_AGE) {
      System.out.println("You are old enough to drive and vote!");
    } else if (age >= LICENSE_AGE) {
      System.out.println("You can get your driver's license!");
    } else {
      System.out.println("Sorry, you are not allowed to drive or vote.");
    }

  }
}