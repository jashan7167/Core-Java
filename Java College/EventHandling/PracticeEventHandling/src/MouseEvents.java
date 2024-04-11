

import java.awt.*;
import java.awt.event.*;


public class MouseEvents extends Frame {
    String msg = " ";
    int mouseX = 0;
    int mouseY = 0;
    Label status = new Label();
    MouseEvents()
    {
        setTitle("Mouse Events");
        setSize(400,400);

        setVisible(true);
        add(status,BorderLayout.SOUTH);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                msg="Mouse Clicked";
                repaint();
            }
            public void mousePressed(MouseEvent e)
            {
                mouseX = e.getX();
                mouseY = e.getY();
                msg="Mouse Pressed";
                repaint();
            }
        });

       //using adapter and inner we simplified the event handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,mouseX,mouseY);
    }
//    public void mouseClicked(MouseEvent e)
//    {
//        msg="Mouse Clicked";
//        repaint();
//
//    }
//    public void mouseEntered(MouseEvent e)
//    {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        msg = "Mouse Entered";
//        repaint();
//    }
//
//    public void mouseExited(MouseEvent e)
//    {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        msg = "Mouse Exited";
//        repaint();
//    }
//
//    public void mousePressed(MouseEvent e)
//    {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        msg = "Mouse Pressed";
//        repaint();
//    }
//    public void mouseReleased(MouseEvent e)
//    {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        msg = "Mouse Released";
//        repaint();
//    }
//    public void mouseDragged(MouseEvent e)
//    {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        msg = "*";
//        status.setText("Dragging mouse at" + mouseX + "," + mouseY);
//    }
//    public void mouseMoved(MouseEvent e)
//    {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        status.setText("Moving mouse at" + mouseX + "," + mouseY);
//        repaint();
//    }

    public static void main(String[] args) {
        MouseEvents obj = new MouseEvents();
    }
}

