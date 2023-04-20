package javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDialog extends Frame {
    private Button btn;
    private Dialog dialog;
    public MyDialog(){
        dialog=new Dialog(this,"Dialog",true);
        dialog.setSize(200,200);
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialog.setVisible(false);
            }
        });
        btn=new Button("launch dialog");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });
        add(btn);
        setSize(200,200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyDialog();
    }
}
