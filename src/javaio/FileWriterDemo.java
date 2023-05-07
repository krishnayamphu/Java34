package javaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("doc.txt");
            writer.write('b');
            writer.flush();
            writer.close();
            System.out.println("file write successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
