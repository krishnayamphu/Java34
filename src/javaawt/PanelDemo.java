package javaawt;

import java.awt.*;

public class PanelDemo extends Frame {
    private Panel p1,p2;
    public PanelDemo(){
        p1=new Panel();
        p2=new Panel();

        p1.add(new TextField(20));
        p1.setBackground(Color.CYAN);

        p2.add(new Button("Button"));
        p2.add(new Button("Click"));
        p2.setBackground(Color.PINK);
        p2.setLayout(new FlowLayout());

        add(p1);
        add(p2);
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PanelDemo();
    }
}
