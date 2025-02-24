
import java.util.Arrays;

class ParallelMatrixMultiplier extends Thread {
    private final int[][] firstMatrix;
    private final int[][] secondMatrix;
    private final int[][] outputMatrix;
    private final int rowIndex;

    public ParallelMatrixMultiplier(int[][] firstMatrix, int[][] secondMatrix, int[][] outputMatrix, int rowIndex) {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
        this.outputMatrix = outputMatrix;
        this.rowIndex = rowIndex;
    }

    @Override
    public void run() {
        int colCountB = secondMatrix[0].length;
        int colCountA = firstMatrix[0].length;

        for (int j = 0; j < colCountB; j++) {
            outputMatrix[rowIndex][j] = 0;
            for (int k = 0; k < colCountA; k++) {
                outputMatrix[rowIndex][j] += firstMatrix[rowIndex][k] * secondMatrix[k][j];
            }
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        int[][] firstMatrix = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

        int[][] secondMatrix = {
                {7, 5, 3},
                {6, 4, 2},
                {5, 3, 1}
        };

        int rowCountA = firstMatrix.length;
        int colCountB = secondMatrix[0].length;
        int[][] outputMatrix = new int[rowCountA][colCountB];

        Thread[] computationThreads = new Thread[rowCountA];
        for (int i = 0; i < rowCountA; i++) {
            computationThreads[i] = new ParallelMatrixMultiplier(firstMatrix, secondMatrix, outputMatrix, i);
            computationThreads[i].start();
        }

        for (int i = 0; i < rowCountA; i++) {
            try {
                computationThreads[i].join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Computed Matrix:");
        for (int[] row : outputMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
