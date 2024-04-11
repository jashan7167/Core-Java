package HandlingEvents;

import java.awt.*;
import java.awt.event.*;
public class InnerClass extends Frame {
    TextField tf;
    InnerClass()
    {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(100,120,180,30);
        //register listener
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Wohoo Done");
            }
        });
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args)
    {
        new InnerClass();
    }
}
