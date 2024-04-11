import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends JPanel {
    private String msg = "";
    private int X = 10;
    private int Y = 20;

    public KeyEvents() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                int keyCode = ke.getKeyCode();
                String message = "";

                if (keyCode == KeyEvent.VK_UP) {
                    message = "Up arrow key pressed";
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    message = "Down arrow key pressed";
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    message = "Left arrow key pressed";
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    message = "Right arrow key pressed";
                } else if (keyCode == KeyEvent.VK_SPACE) {
                    message = "Space key pressed";
                } else {
                    message = "Key pressed: " + ke.getKeyChar();
                }

                showStatus(message);
            }

            public void keyReleased(KeyEvent ke) {
                showStatus("Key Up");
            }

            public void keyTyped(KeyEvent ke) {
                msg += " " + ke.getKeyChar();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0, 0, getWidth(), getHeight()); // Clear the panel
        g.drawString(msg, X, Y);
    }

    public void showStatus(String newmsg) {
        this.msg = newmsg;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Events");
        KeyEvents keyEvents = new KeyEvents();
        frame.add(keyEvents);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
