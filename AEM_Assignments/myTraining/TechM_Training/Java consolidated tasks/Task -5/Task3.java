
import java.util.Arrays;

class ParallelMergeSorter {
    private int[] dataSet;

    public ParallelMergeSorter(int[] dataSet) {
        this.dataSet = dataSet;
    }

    public void executeSorting() {
        if (dataSet.length > 1) {
            int midPoint = dataSet.length / 2;

            int[] leftSegment = Arrays.copyOfRange(dataSet, 0, midPoint);
            int[] rightSegment = Arrays.copyOfRange(dataSet, midPoint, dataSet.length);

            Thread leftWorker = new Thread(() -> new ParallelMergeSorter(leftSegment).executeSorting());
            Thread rightWorker = new Thread(() -> new ParallelMergeSorter(rightSegment).executeSorting());

            leftWorker.start();
            rightWorker.start();

            try {
                leftWorker.join();  
                rightWorker.join(); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            mergeSegments(leftSegment, rightSegment);
        }
    }

    private void mergeSegments(int[] leftSegment, int[] rightSegment) {
        int i = 0, j = 0, k = 0;

        while (i < leftSegment.length && j < rightSegment.length) {
            if (leftSegment[i] <= rightSegment[j]) {
                dataSet[k++] = leftSegment[i++];
            } else {
                dataSet[k++] = rightSegment[j++];
            }
        }

        while (i < leftSegment.length) {
            dataSet[k++] = leftSegment[i++];
        }

        while (j < rightSegment.length) {
            dataSet[k++] = rightSegment[j++];
        }
    }

    public int[] getSortedData() {
        return dataSet;
    }
}

public class Task3 {
    public static void main(String[] args) {
        int[] values = {15, 48, 3, 92, 31, 67, 5, 74, 21, 50};

        System.out.println("Unsorted Array: " + Arrays.toString(values));

        ParallelMergeSorter sorter = new ParallelMergeSorter(values);
        sorter.executeSorting();

        System.out.println("Sorted Array: " + Arrays.toString(sorter.getSortedData()));
    }
}
