package javaadvance;

public class OverRide {
    public static void keerthi() {
        System.out.println("Parent Class");
    }
}
class child extends OverRide {
    public static void keerthi() {
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        OverRide.keerthi();
        child.keerthi();
    }
}
