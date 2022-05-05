package com.Oops.Polymorphism;

public class Override {
    public static void keerthi() {
        System.out.println("Parent Class");
    }
}
class child extends Override {
    public static void keerthi() {
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        Override.keerthi();
        child.keerthi();
    }
}
