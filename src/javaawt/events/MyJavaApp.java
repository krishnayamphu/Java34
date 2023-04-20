package javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJavaApp extends Frame {
    private TextField txtbox;
    private Label lbltext;
    private Button btn1,btn2;
    public MyJavaApp(){
    txtbox=new TextField(20);
    lbltext=new Label();
    btn1=new Button("Set Text");
    btn2=new Button("Clear Text");

    add(txtbox);
    add(lbltext);
    add(btn1);
    add(btn2);
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lbltext.setText(txtbox.getText());
        }
    });
    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lbltext.setText("");
            txtbox.setText("");
        }
    });
    setLayout(new FlowLayout());
    setSize(200,200);
    setVisible(true);
    }

    public static void main(String[] args) {
        new MyJavaApp();
    }
}
