package javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameEvent extends Frame {
    private Button btn;

    public FrameEvent() {
        btn = new Button("Click Me");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Welcome");
            }
        });
        add(btn);
        setLayout(new FlowLayout());
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameEvent();
    }
}
