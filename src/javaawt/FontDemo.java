package javaawt;

import java.awt.*;

public class FontDemo extends Frame {
    public FontDemo(){
        Label lbl=new Label("Hello World");
        lbl.setFont(new Font("arial",Font.BOLD,20));
        lbl.setForeground(new Color(255,0,0));
        add(lbl);
        setLayout(new FlowLayout());
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FontDemo();
    }
}
