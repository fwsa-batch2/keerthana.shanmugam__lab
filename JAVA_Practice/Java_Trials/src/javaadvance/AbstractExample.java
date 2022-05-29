package javaadvance;

abstract class vehicles {
    abstract void colours();
    abstract void type();
    abstract void Price();
}

class bike extends vehicles {
    void colours(){
        System.out.println("Purple");
    }
    void type(){
        System.out.println("Two-wheeler");
    }
    void Price(){
        System.out.println("50000");
    }

    void quality(){
        System.out.println("Good");
    }
}

class car extends vehicles {
    void colours(){
        System.out.println("Red");
    }
    void type(){
        System.out.println("Four-wheeler");
    }
    void Price(){
        System.out.println("400000");
    }
}

class AbstractExample{
    public static void main(String[] args) {
        bike twob = new bike();
        twob.Price();
        twob.quality();
        car fourc = new car();
        fourc.Price();
    }
}