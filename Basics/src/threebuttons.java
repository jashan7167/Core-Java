
import java.awt.*;
public class threebuttons {
    threebuttons()
    {
        Frame f = new Frame();
        Button b1 = new Button("OK");
        Button b2 = new Button("Submit");
        Button b3 = new Button("Cancel");

        b1.setBounds(50,100,50,50);
        b2.setBounds(50,150,50,50);
        b3.setBounds(50,200,50,50);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setTitle("Practice");
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new threebuttons();
    }

}
