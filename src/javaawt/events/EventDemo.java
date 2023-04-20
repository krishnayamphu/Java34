package javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Frame implements ActionListener {
    private Button btn,btn2;
    public EventDemo(){
        btn=new Button("click");
        btn.addActionListener(this);
        btn2=new Button("Hello");
        btn2.addActionListener(this);

        add(btn);
        add(btn2);
        setLayout(new FlowLayout());
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("it is working");
            System.exit(0);
        }
        if(e.getSource()==btn2){
            System.out.println("Hello World");
        }
    }
}
