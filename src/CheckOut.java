import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double totalCost = 0.0;
        boolean moreItems = true;

        while (moreItems) {
            // Get price of item from user using getRangedDouble method
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);

            // Add the price to the total cost
            totalCost += price;

            // Ask user if they want to add more items using getYNConfirm
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items? (y/n)");
        }

        // Display the total cost to 2 decimal places using printf
        System.out.printf("Total cost of all items: $%.2f\n", totalCost);

        in.close();  // Close the scanner
    }
}
