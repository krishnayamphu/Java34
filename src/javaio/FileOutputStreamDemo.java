package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream stream=new FileOutputStream("data.txt");
            stream.write(97);
            stream.flush();
            stream.close();
            System.out.println("data write successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
