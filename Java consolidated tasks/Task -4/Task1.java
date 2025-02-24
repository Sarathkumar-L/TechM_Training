public class Task1 {
    public static void main(String[] args) {
        try {
            int x = 3 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is undefined in mathematics!");
        }
    }
}
