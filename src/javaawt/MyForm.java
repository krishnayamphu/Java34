package javaawt;

import java.awt.*;

public class MyForm extends Frame {
    private Checkbox cbBasic,cbWeb,cbMale,cbFemale;
    private CheckboxGroup cbGender=new CheckboxGroup();
    private Choice country=new Choice();
    private TextArea ta;
    public MyForm(){
        cbBasic=new Checkbox("Basic", false);
        cbWeb=new Checkbox("Web",false);
        add(new Label("Course"));
        add(cbBasic);add(cbWeb);

        cbMale=new Checkbox("Male",cbGender,false);
        cbFemale=new Checkbox("Female",cbGender,false);
        add(new Label("Gender"));
        add(cbMale); add(cbFemale);

        country.addItem("Nepal");
        country.addItem("India");
        country.addItem("China");
        country.addItem("Japan");
        add(new Label("Country"));
        add(country);

        ta=new TextArea(5,20);
        add(new Label("Rmarks"));
        add(ta);

        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);


    }

    public static void main(String[] args) {
        new MyForm();
    }
}
