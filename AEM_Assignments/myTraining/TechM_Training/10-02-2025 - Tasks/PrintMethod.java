public class Java_practice_task2 {

    public static void main(String[] args) {
        printClass();
        printlnClass();
        errorClass();
    }

    public static void printClass(){
        System.out.print("hi! ");
        System.out.print("Java training - monday");
    }
    public static void printlnClass(){
        System.out.println("Feb - 10 - 2025");
        System.out.println("Assessment -1(Monday)");
    }
    public static void errorClass(){
        System.err.println("Sample error message!");
        System.err.println("another sample :)");
    }
}
