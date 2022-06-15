import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);

            int un = scan.nextInt();
            int in = scan.nextInt();

            int hi = un/in;
            System.out.println(hi);
            scan.close();
        }
        catch(Exception e){
            System.out.println("error occur");
        }
    }
}
