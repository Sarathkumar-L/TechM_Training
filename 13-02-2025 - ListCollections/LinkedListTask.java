import java.util.LinkedList;
import java.util.List;

public class Linklist {
    public static void linklist() {


        List<Integer> list1 = new LinkedList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(101);
        list1.add(230);
        list1.add(607);
        list1.add(821);
        list1.add(565);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: " + list1.size());
        //Adding one element
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);
        list1.remove(2);//Removing element by its index
        list1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}
