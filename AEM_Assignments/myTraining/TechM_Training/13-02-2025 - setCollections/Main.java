import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashsetClass h = new HashsetClass();

        HashSet<Integer> set1= new HashSet<>();
        set1.add(69);
        set1.add(96);
        set1.add(10);
        set1.add(79);
        set1.add(99);
        set1.add(7);
        set1.add(40);
        set1.add(100);

//        HashsetClass.setSample(set1);
        new Thread(){
            public void run(){
                h.setSample(set1);
            }
        }.start();
    }
}
