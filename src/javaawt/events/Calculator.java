package javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame {
    private double n1,n2;
    private TextField txtbox1,txtbox2,txtbox3;
    private Button btnp,btns,btnd,btnm,btnc;
    public Calculator(){
        txtbox1=new TextField(20);
        txtbox2=new TextField(20);
        txtbox3=new TextField(20);
        btnp=new Button(" + ");
        btns=new Button(" - ");
        btnd=new Button(" / ");
        btnm=new Button(" x ");
        btnc=new Button(" c ");

        add(new Label("N1")); add(txtbox1);
        add(new Label("N2")); add(txtbox2);
        add(new Label("N3")); add(txtbox3);

        add(btnp); add(btns); add(btnd); add(btnm); add(btnc);

        btnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtbox1.getText());
                n2=Double.parseDouble(txtbox2.getText());
                txtbox3.setText(String.valueOf(n1+n2));
            }
        });
        btns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtbox1.getText());
                n2=Double.parseDouble(txtbox2.getText());
                txtbox3.setText(String.valueOf(n1-n2));
            }
        });
        btnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtbox1.getText());
                n2=Double.parseDouble(txtbox2.getText());
                txtbox3.setText(String.valueOf(n1/n2));
            }
        });

        btnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtbox1.getText());
                n2=Double.parseDouble(txtbox2.getText());
                txtbox3.setText(String.valueOf(n1*n2));
            }
        });
        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox1.setText("");
                txtbox2.setText("");
                txtbox3.setText("");
            }
        });

        setLayout(new FlowLayout());
        setSize(240,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
