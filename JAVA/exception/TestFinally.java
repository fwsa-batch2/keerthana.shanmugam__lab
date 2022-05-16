public class TestFinally {
    public static void main(String[] args) {
        try{
            int num = 100/10;
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println("catch not executed");
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}
