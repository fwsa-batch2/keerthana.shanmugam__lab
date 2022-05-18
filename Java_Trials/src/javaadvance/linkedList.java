package javaadvance;
import java.util.LinkedList;
//collectionsss
public class linkedList {
    public static void main(String[] args) {
        // created linked list
        LinkedList<String> food = new LinkedList<String>();

        // add elements inside linked list
        food.add("Idly");
        food.add("rice");
        food.add("dosa");
        food.add("upma");
        System.out.println("Linked List = " + food);
    }
}
