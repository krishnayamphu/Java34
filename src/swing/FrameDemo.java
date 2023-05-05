package swing;

import javaawt.events.FrameEvent;

import javax.swing.*;

public class FrameDemo extends JFrame {
    private JTextField tfname;
    private JButton btnok;
    public FrameDemo(){
        tfname=new JTextField();
        tfname.setBounds(20,20,200,30);
        add(tfname);
        btnok=new JButton("Click");
        btnok.setBounds(240,20,100,30);
        add(btnok);
        setLayout(null);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameDemo();
    }
}
