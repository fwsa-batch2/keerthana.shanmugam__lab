package javaadvance;
import java.util.ArrayList;
// collections
public class arrayList {
    public static void main(String[] args) {
       ArrayList<Integer> obj = new ArrayList<Integer>();
       // adding elements
            obj.add(1);
            obj.add(2);
            obj.add(3);
            obj.add(4);
            obj.add(5);
        System.out.println(obj);

        // removing element
            obj.remove(2);
        System.out.println(obj);   
    }
}
