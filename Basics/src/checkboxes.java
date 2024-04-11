import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class checkboxes {
    checkboxes()
    {
        Frame f = new Frame();
        Label l1 = new Label("Select known language");
        Checkbox b1 = new Checkbox("Hindi");
        Checkbox b2 = new Checkbox("English");
        Checkbox b3 = new Checkbox("Punjabi");
        l1.setBounds(50,50,400,50);
        f.add(l1);
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
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new checkboxes();
    }
    
}
