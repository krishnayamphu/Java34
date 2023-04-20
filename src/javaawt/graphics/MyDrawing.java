package javaawt.graphics;

import javaawt.MyDialog;

import java.awt.*;

public class MyDrawing extends Frame {
    public MyDrawing(){
        setSize(400,400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        int[] x={100,150,125,75,50};
        int[] y={50,100,150,150,100};
        g.fillPolygon(x,y,5);
    }

    public static void main(String[] args) {
        new MyDrawing();
    }
}
