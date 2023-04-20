package javaawt.layout;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    public BorderLayoutDemo(){
        BorderLayout layout=new BorderLayout();
        setLayout(layout);
        add(new Button("North"),BorderLayout.NORTH);
        add(new Button("South"),BorderLayout.SOUTH);
        add(new Button("East"),BorderLayout.EAST);
        add(new Button("West"),BorderLayout.WEST);
        add(new Button("Center"),BorderLayout.CENTER);

        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
