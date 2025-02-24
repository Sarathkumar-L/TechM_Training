import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {

        int[][] matrixA = { {10, 20}, {30, 40} };
        int[][] matrixB = { {10, 20}, {30, 40} };
        int[][] matrixC = { {50, 60}, {70, 80} };

        System.out.println("Using deepEquals() for comparison:");
        System.out.println("matrixA vs matrixB: " + Arrays.deepEquals(matrixA, matrixB));
        System.out.println("matrixB vs matrixC: " + Arrays.deepEquals(matrixB, matrixC));

        System.out.println("\nUsing equals() for comparison:");
        System.out.println("matrixA vs matrixB: " + Arrays.equals(matrixA, matrixB));
        System.out.println("matrixB vs matrixC: " + Arrays.equals(matrixB, matrixC));
    }

}
