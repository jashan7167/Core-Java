import java.awt.*;


class AWTExample{


    //constructor to initialise
    AWTExample()
    {
        Frame f = new Frame();

        Label l = new Label("Employee Id");

        Button b = new Button("Submit");

        TextField t = new TextField();

        l.setBounds(20,80,80,30);
        f.setBounds(20,100,80,30);
        t.setBounds(100,85,80,30);


        f.add(b);
        f.add(l);
        f.add(t);


        f.setSize(400,300);

        f.setTitle("Employee Info");
        f.setLayout(null);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        AWTExample obj = new AWTExample();
    }

}
