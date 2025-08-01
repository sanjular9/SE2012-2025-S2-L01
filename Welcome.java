import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.print("Enter your First Name: ");
        String firstName = input.nextLine();

        // Prompt the user to enter their last name
        System.out.print("Enter your Last Name: ");
        String lastName = input.nextLine();

        // Display the welcome message
        System.out.println("Welcome to the Second Year " + firstName + " " + lastName);

        // Close the Scanner to prevent resource leaks
        input.close();
    }
}