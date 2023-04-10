package javaawt;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(400,300);
        f.setLayout(new FlowLayout());
        f.add(new Button("Button"));
        f.setVisible(true);
    }
}
