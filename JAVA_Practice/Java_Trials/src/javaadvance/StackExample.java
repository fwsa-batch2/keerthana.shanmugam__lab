package javaadvance;

import java.util.Stack;
// collections
public class StackExample {
    public static void main(String[] args) {
        Stack<String> numbers = new Stack<String>();
        // elements adding
        numbers.push("one");
        numbers.push("two");
        numbers.push("three");
        numbers.push("four");// last in first out

        System.out.println(numbers);
        // element removing
        numbers.pop();
        System.out.println(numbers);

        numbers.pop();
        System.out.println(numbers);
    }
}
