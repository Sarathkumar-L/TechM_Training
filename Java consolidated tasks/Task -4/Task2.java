public class Task2 {

    public static void checkEven(int x) throws Exception {
        if (x % 2 != 0) {
            throw new Exception("This is an odd number!");
        }
        System.out.println(x + " is an even number!");
    }

    public static void main(String[] args) {
        try {
            checkEven(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            checkEven(8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
