package javaawt.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyGridLayout extends Frame {
    public MyGridLayout(){
        GridLayout layout=new GridLayout(3,2);
        setLayout(layout);
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyGridLayout();
    }
}
