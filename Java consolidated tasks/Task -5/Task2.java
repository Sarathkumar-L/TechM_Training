class EvenThread extends Thread {
    public void run() {
        System.out.println("Displaying Even Numbers:");
        for (int num = 2; num <= 20; num += 2) {
            System.out.println("Thread-One: " + num);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Displaying Odd Numbers:");
        for (int num = 1; num <= 20; num += 2) {
            System.out.println("Thread-Two: " + num);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        EvenThread threadA = new EvenThread();
        OddThread threadB = new OddThread();

        threadA.start();
        threadB.start();
    }
}
