import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    static String usernameInput;
    static String passwordInput;
    static String createOrLoginInput;

    static Boolean validLogin;

    static ArrayList<String> savedAccountNames = new ArrayList<>();
    static ArrayList<String> savedAccountPasswords = new ArrayList<>();

    public static void main(String[] args) {

        while (true) { //All code wrapped in a while statement to allow repeating
            while (true) {
                System.out.println("Would you like to (create account) or (login)?");
                createOrLoginInput = scanner.nextLine();
                if (createOrLoginInput.equalsIgnoreCase("Create Account") || createOrLoginInput.equalsIgnoreCase("Create") || createOrLoginInput.equalsIgnoreCase("Login")) {
                    break;
                } else {
                    System.out.println("Invalid Input, retry");
                }
            } //This is where the program takes in the Create or Login values

            // Start of Create account Portion
            if (createOrLoginInput.equalsIgnoreCase("Create Account") || createOrLoginInput.equalsIgnoreCase("Create")) {
                while (true) {
                    System.out.println("Enter Username:");
                    usernameInput = scanner.nextLine();
                    // Check if username is already taken
                    if (savedAccountNames.contains(usernameInput)) {
                        
                    } else {
                        savedAccountNames.add(usernameInput);
                        break;
                    }
                }
                System.out.println("Enter Password:");
                passwordInput = scanner.nextLine();
                savedAccountPasswords.add(passwordInput);

                System.out.println(savedAccountNames);
                System.out.println(savedAccountPasswords);
            } // Create account portion

            if (createOrLoginInput.equalsIgnoreCase("login")) {
                System.out.println("Enter Username:");
                usernameInput = scanner.nextLine();

                System.out.println("Enter Password:");
                passwordInput = scanner.nextLine();

                // Check for valid login
                int index = savedAccountNames.indexOf(usernameInput);
                validLogin = (index != -1 && savedAccountPasswords.get(index).equals(passwordInput));

                if (validLogin) {
                    System.out.println("welcome, " + usernameInput);
                    break;
                } else {
                    System.out.println("sorry account does not match records");
                }
            }


        } // Login Portion


    } // All code wrapped
}
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%Test Code%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        String createOrLoginChecker; {

            if (createOrLoginInput.equalsIgnoreCase("Create Account")) {
                while (true) {
                    System.out.println("Enter Username:");
                    usernameInput = scanner.nextLine();
                    if (usernameInput.equals(String.valueOf(savedAccounts))) {
                        System.out.println("Username Already Taken");
                    } else {
                        savedAccounts.add(usernameInput);
                        break;
                    }
                }
            }
            return;
        }
   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 */