package javaawt.graphics;

import java.awt.*;

public class GraphicsDemo extends Frame {
    public GraphicsDemo(){
        setSize(400,400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.fillRect(50,50,100,100);
        g.setColor(Color.red);
        g.drawOval(50, 160, 100,100);
        g.setColor(Color.green);
        g.drawArc(150,160, 100,100,0, 190);
        g.setFont(new Font("Arial",Font.BOLD,28));
        g.drawString("Aptech",50,320);
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
