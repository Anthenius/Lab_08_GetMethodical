import java.util.Scanner;

public class SafeInput {

    // Method to get a non-empty string from the user
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String input = "";
        while (true) {
            System.out.print(prompt + ": ");
            input = pipe.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be blank. Please try again.");
        }
    }

    // Method to get a positive integer from the user
    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                if (value > 0) {
                    pipe.nextLine();
                    return value;
                } else {
                    System.out.println("Must be a positive integer. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.nextLine();
            }
        }
    }

    // Method to get a valid double from the user
    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0.0;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            } else {
                System.out.println("Invalid input. Please enter a valid decimal number.");
                pipe.nextLine();
            }
        }
    }

    // Method to get a ranged double from the user
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value = 0.0;
        while (true) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                if (value >= low && value <= high) {
                    pipe.nextLine();
                    return value;
                } else {
                    System.out.println("Input must be between " + low + " and " + high + ". Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid decimal number.");
                pipe.nextLine();
            }
        }
    }

    // Add any additional methods here, making sure to properly close each one

    // End of SafeInput class
// Method to get a yes or no confirmation from the user
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input = "";
        while (true) {
            System.out.print(prompt + " (Y/N): ");
            input = pipe.nextLine().trim(); // Read and trim input
            if (input.equalsIgnoreCase("Y")) {
                return true; // Return true for yes
            } else if (input.equalsIgnoreCase("N")) {
                return false; // Return false for no
            } else {
                System.out.println("Invalid input. Please enter Y for Yes or N for No.");
            }
        }
    }

    // Method to get a string that matches a given regex pattern
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input = "";
        while (true) {
            System.out.print(prompt + ": ");
            input = pipe.nextLine().trim(); // Read and trim input
            if (input.matches(regEx)) { // Check if input matches the regex pattern
                return input; // Return the valid input
            } else {
                System.out.println("Input does not match the required pattern. Please try again.");
            }
        }
    }


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0;
        while (true) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) { // Check if the input is a valid integer
                value = pipe.nextInt();
                pipe.nextLine(); // Clear the buffer (important for clearing the newline)

                if (value >= low && value <= high) { // Check if the input is within the valid range
                    return value; // If valid, return the value
                } else {
                    System.out.println("Input must be between " + low + " and " + high + ". Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.nextLine(); // Clear the invalid input from the buffer
            }
        }
    }
    public static void prettyHeader(String msg) {
        int totalWidth = 60; // Total width for the header
        int msgWidth = msg.length(); // Length of the message
        int availableSpace = totalWidth - 6; // 3 stars on each side
        int padding = (availableSpace - msgWidth) / 2; // Calculate padding for centering

        // Print the top border (60 asterisks)
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line

        // Print the middle row: 3 stars, padding spaces, message, padding spaces, 3 stars
        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < (availableSpace - msgWidth - padding); i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom border (60 asterisks)
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line
    }

}