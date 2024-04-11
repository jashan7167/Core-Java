
import java.awt.*;
import java.awt.event.*;
class Eventhandling extends Frame implements MouseListener,MouseMotionListener{


    String msg = "";
    //coordinates of mouse
    int mouseX = 0;
    int mouseY = 0;
    Label status = new Label();
    Eventhandling()
    {
        setTitle("Mouse Events");
        setSize(400,400);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
        add(status, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,mouseX,mouseY);
    }

    public void mouseClicked(MouseEvent me)
    {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse exited";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg="Down";
        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        status.setText("Dragging mouse at " + mouseX + "," + mouseY );

    }
    public void mouseMoved(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        status.setText("Moving mouse at " + mouseX + "," + mouseY);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eventhandling obj = new Eventhandling();

    }

}
