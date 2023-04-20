package javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarDemo extends Frame {
    public MenuBarDemo(){
        MenuBar mb=new MenuBar();
        Menu mfile=new Menu("File");
        MenuItem miexit=new MenuItem("Exit");
        mfile.add(new MenuItem("Open"));
        mfile.add(new MenuItem("Save"));
        mfile.add(miexit);
        miexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mb.add(mfile);
        mb.add(new Menu("Edit"));
        setMenuBar(mb);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
