import java.util.HashSet;
import java.util.Set;

public class HashsetClass {
    public static void setSample(HashSet<Integer> hs){


        System.out.println(hs);
        System.out.println("after removed:"+ hs.remove(100));
        System.out.println(hs);

        for (int num : hs){
            if (num%7==0){
                System.out.println(num+" ");
            }
        }

    }
}
