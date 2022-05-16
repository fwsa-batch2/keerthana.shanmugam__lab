public class Wrap {
    public static void main(String[] args) {
        // autoboxing
        int test = 85;
        Integer num1 = Integer.valueOf(test);
        Integer num2 = test;

        System.out.println("Testing Primitive to Object : " + num1);
        System.out.println("Testing Primitive to Object : " + num2);

        // unboxing
        Integer demo = 44;
        int objA = demo.intValue();
        int objB = num2;

        System.out.println("Testing Object to Primitive : " + objA);
        System.out.println("Testing Object to Primitive : " + objB);
    }
}
