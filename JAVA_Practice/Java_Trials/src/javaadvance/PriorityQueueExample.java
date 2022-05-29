package javaadvance;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // create priority queue
        PriorityQueue<Integer> obj = new PriorityQueue<Integer>();
        // creating using add method
        obj.add(101);
        obj.add(102);
        System.out.println(obj);
        // creating using offer method
        obj.offer(100);
        System.out.println(obj);
        //remove using poll
        System.out.println("object: " + obj.poll());
        System.out.println("object: " + obj.poll());
    }
}
