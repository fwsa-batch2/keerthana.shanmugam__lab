package javaadvance;

interface students{
    int num = 70;
    void perform();
}

class school implements students{
    public void perform() {
        System.out.println("Performance is good");
    }
}

public class InterFace {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        school teach = new school();
        teach.perform();
        System.out.println(students.num);
    }
}
