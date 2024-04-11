package HandlingEvents;

import java.awt.*;
import java.awt.event.*;
public class WithinClass extends Frame implements ActionListener{
    TextField tf;
    WithinClass()
    {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(100,120,180,30);
        //register listener
        b.addActionListener(this);
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
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Hi this is my first event handling program");
    }
    public static void main(String[] args)
    {
        new WithinClass();
    }
}
