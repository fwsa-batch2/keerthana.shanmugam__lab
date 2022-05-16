package javaadvance;

import java.io.IOException;

public class TestThrows {
    // checked exception
    public static void fileFind() throws IOException {
        throw new IOException("File Not Found");
    }

    public static void main(String[] args) {
        try {
            fileFind();
            System.out.println("Testing Throws Block");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
