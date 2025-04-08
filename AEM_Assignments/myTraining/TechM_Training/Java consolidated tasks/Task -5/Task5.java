
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrimeNumberSummation extends Thread {
    private final int lowerBound, upperBound;
    private long primeTotal = 0;

    public PrimeNumberSummation(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public void run() {
        for (int num = lowerBound; num <= upperBound; num++) {
            if (checkPrime(num)) {
                primeTotal += num;
            }
        }
    }

    public long getPrimeTotal() {
        return primeTotal;
    }

    private boolean checkPrime(int number) {
        if (number < 2) return false;
        for (int factor = 2; factor * factor <= number; factor++) {
            if (number % factor == 0) return false;
        }
        return true;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Provide the upper range: ");
        int upperRange = inputScanner.nextInt();

        int threadCount = 4; 
        List<PrimeNumberSummation> threadList = new ArrayList<>();
        int segmentSize = upperRange / threadCount;

        for (int index = 0; index < threadCount; index++) {
            int lowerBound = index * segmentSize + 1;
            int upperBound = (index == threadCount - 1) ? upperRange : (index + 1) * segmentSize;

            PrimeNumberSummation threadInstance = new PrimeNumberSummation(lowerBound, upperBound);
            threadList.add(threadInstance);
            threadInstance.start();
        }

        long overallSum = 0;
        for (PrimeNumberSummation threadInstance : threadList) {
            try {
                threadInstance.join();
                overallSum += threadInstance.getPrimeTotal();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Total sum of prime numbers up to " + upperRange + " is: " + overallSum);
        inputScanner.close();
    }
}
