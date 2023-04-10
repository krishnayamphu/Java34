package javaawt;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(){
        setSize(250,300);
        setTitle("My Frame Example");
        setLayout(new FlowLayout());
        add(new Label("Name"));
        add(new TextField("Enter name",20));
        add(new Button("Button"));
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
