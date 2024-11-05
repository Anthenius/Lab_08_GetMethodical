import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for favorite integer
        int favInt = SafeInput.getInt(in, "Enter your favorite integer");

        // Prompt for favorite double
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        // Display the results
        System.out.println("Your favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);

        in.close();
    }
}
