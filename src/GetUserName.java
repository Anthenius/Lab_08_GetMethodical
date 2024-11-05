import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        // Get non-zero length strings using SafeInput
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

        System.out.println("\nYour full name is: " + firstName + " " + lastName);
        in.close();
    }
}
