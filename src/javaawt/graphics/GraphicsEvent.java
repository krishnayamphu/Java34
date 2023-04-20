package javaawt.graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsEvent extends Frame {
    private Button btn;
    private Panel p;
    public GraphicsEvent(){
        btn=new Button("Draw");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g=p.getGraphics();
                g.drawString("Aptech", 10,20);
                g.fillOval(50,50,100,100);
            }
        });
        p=new Panel();
        p.setBackground(Color.CYAN);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new BorderLayout());
        add(btn,BorderLayout.NORTH);
        add(p,BorderLayout.CENTER);
        setSize(400,400);
        setTitle("AWT Graphics");
        setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsEvent();
    }
}
