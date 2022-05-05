class Overriding{
    public static void keerthi(){
        System.out.println("practice static override method");
    }
}

class Override extends Overriding {
    public static void keerthi() {
        System.out.println("practice ststic method");
    }
    public static void main(String[] args) {
        Overriding.keerthi();
        Override.keerthi();
    }
}
