package javaawt.graphics;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame {
    public MouseEventDemo(){
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
               Graphics g=getGraphics();
                System.out.println(e.getX()+" "+e.getY());
               g.fillOval(e.getX(),e.getY(),5,5);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        setSize(400,400);
        setTitle("AWT Graphics");
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
