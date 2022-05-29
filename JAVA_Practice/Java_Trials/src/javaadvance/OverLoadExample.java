package javaadvance;

public class OverLoadExample {
    public static void main(String[] args) {
        Loading over = new Loading();
        over.sum(100, 10);
        System.out.println(over.sum(15, 25, 35));
        System.out.println(over.sum(20.34, 84.2));
    }
}
class Loading{
    void sum(int x, int y){
        System.out.println(x+y);
    }

    int sum(int x, int y, int z){
        return x+y+z;
    }

    double sum(double x, double y){
        return x+y;
    }
}
