import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        // Test getDouble
        double score = SafeInput.getDouble(in, "Enter your score");
        System.out.println("You entered: " + score);

        // Test getYNConfirm
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You confirmed: " + confirm);

        // Test getRegExString
        String email = SafeInput.getRegExString(in, "Enter your email", "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$");
        System.out.println("You entered a valid email: " + email);


        in.close();
    }

}
