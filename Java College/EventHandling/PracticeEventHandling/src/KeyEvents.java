import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyEvents extends JPanel {
    private String msg = " ";

    private int X = 10;

    private int Y = 10;

    KeyEvents()
    {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               msg ="Pressed Key" + " " + e.getKeyChar();
               repaint();
            }
            public void keyPressed(KeyEvent ke)
            {
                int keyCode = ke.getKeyCode();
                String msg = "";

                if(keyCode == KeyEvent.VK_UP)
                {
                    msg = "Up arrow key pressed";
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    msg = "Left arrow key pressed";
                }
                else if (keyCode == KeyEvent.VK_RIGHT) {
                    msg = "Right arrow key pressed";
                }
                else if (keyCode == KeyEvent.VK_DOWN) {
                    msg = "Down arrow key pressed";
                }
                else if (keyCode == KeyEvent.VK_SPACE) {
                    msg = "Space key pressed";
                }
                else
                {
                    msg = "Key Pressed" + ke.getKeyChar();
                }
                showStatus(msg);
            }
            public void keyReleased(KeyEvent ke)
            {
                showStatus("Key Up");
            }
        });
    }

    public void paintComponent(Graphics g)
    {
        g.clearRect(0,0,getWidth(),getHeight());
        g.drawString(msg,X,Y);
    }
    public void showStatus(String newmsg)
    {
        this.msg = newmsg;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Events");
        KeyEvents k  = new KeyEvents();
        frame.add(k);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
