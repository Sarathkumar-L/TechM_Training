import java.util.Scanner;

public class ErrorHandling {
    public static void computeInverse() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a numeric value: ");
            double userValue = input.nextDouble();
            double inverse = 1 / userValue;
            System.out.println("Inverse: " + inverse);
        } catch (ArithmeticException e) {
            System.out.println("Warning: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Invalid entry! Please provide a numeric input.");
        } finally {
            input.close();
        }
    }

    public static void main(String[] args) {
        computeInverse();
    }
}
