package javaadvance;

public class IOExample {
    public static void main(String[] args) throws IOException {
        File obj = new File("C:\\Users\\Keerthana Shanmugam\\Documents\\GitHub\\keerthana.shanmugam__lab\\JAVA_Practice\\Java_Trials\\src\\javaadvance\\keerthi.txt");
        if(obj.createNewFile()){
            System.out.println("Created new file");
        }
        else{
            System.out.println("File not created");
        }
    }
}
