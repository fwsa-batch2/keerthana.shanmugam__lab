package javaadvance;

public class SbufferTest {
    public static void main(String[] args) {
        StringBuffer obj1 = new StringBuffer("Heman");
        System.out.println(obj1);
            // string appending
        obj1.append("bad");
        System.out.println(obj1);
           // string inserting
        obj1.insert(5, "was");
        System.out.println(obj1);
           // string replace
        obj1.replace(8,11, "good");
        System.out.println(obj1);
           // string delete
        obj1.delete(5,8);
        System.out.println(obj1);
           // string reverse
        System.out.println(obj1.reverse());
           // string length
        System.out.println(obj1.length());
          // string reverse
        System.out.println(obj1.reverse());
          // substring
        System.out.println(obj1.substring(2,5));
    }
}

// string buffer and builder are same but the difference is string buffer is sychronized and string builder is non-synchronized.