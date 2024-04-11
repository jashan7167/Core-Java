package HandlingEvents;

import java.awt.*;
import java.awt.event.*;
public class OuterClass extends Frame{
    TextField tf;
    OuterClass()
    {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(100,120,180,30);
        Outer o = new Outer(this);
        //register listener
        b.addActionListener(o); //passing the instance of the outerclass
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
        new WithinClass();
    }
}
class Outer implements ActionListener
{
    OuterClass obj;
    Outer(OuterClass obj)
    {
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e)
    {
        obj.tf.setText("Welcome");
    }
}
