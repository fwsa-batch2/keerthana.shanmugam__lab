import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++ ){
            String in = scan.next();
            int out = scan.nextInt();

        System.out.printf("%-15s %03d %n", in , out);
    }
    
  scan.close(); 
  }
}

