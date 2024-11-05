public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-15s%-15s%n", "Celsius", "Fahrenheit");

        // Print the Celsius to Fahrenheit table for values from -100 to 100
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius); // Convert Celsius to Fahrenheit
            System.out.printf("%-15d%-15.2f%n", celsius, fahrenheit); // Print each row
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
