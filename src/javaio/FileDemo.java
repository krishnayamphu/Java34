package javaio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("music");
        file.mkdir();

        File file1=new File("person.txt");
        try {
            file1.createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
