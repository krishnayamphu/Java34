package multithreading;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class DigitalClock extends JFrame implements Runnable{
    private JTextField txtbox;
    public DigitalClock(){
        initComponents();
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new DigitalClock());
        thread.start();
    }

    private void initComponents() {
        txtbox=new JTextField(10);
        txtbox.setFont(new Font("Arial",Font.BOLD,20));
        add(txtbox);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void run() {
        while(true) {
            LocalDateTime dateTime = LocalDateTime.now();
            int h=dateTime.getHour();
            String status="am";
            if(h>12){
                h=h-12;
                status="pm";
            }

            int m=dateTime.getMinute();
            int s=dateTime.getSecond();
            String data=String.valueOf(h)+" : "+String.valueOf(m)+" : "+String.valueOf(s)+" "+status;
            txtbox.setText(data);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
