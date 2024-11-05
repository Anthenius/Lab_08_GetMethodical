import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test 1: Get SSN using regex pattern
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: xxx-xx-xxxx)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered a valid SSN: " + ssn);

        // Test 2: Get UC Student M number using regex pattern
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: M#####)", "^(M|m)\\d{5}$");
        System.out.println("You entered a valid M number: " + mNumber);

        // Test 3: Get menu choice using regex pattern
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (Open, Save, View, Quit)", "^[OoSsVvQq]$");
        System.out.println("You selected a valid menu choice: " + menuChoice);

        in.close();
    }
}
