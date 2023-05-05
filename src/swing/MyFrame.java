package swing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        add(new JTextField(30));
        add(new JButton("Click"));
        setLayout(new FlowLayout());
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
