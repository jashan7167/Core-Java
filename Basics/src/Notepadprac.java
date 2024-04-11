import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepadprac {
    JMenuItem cut,copy,paste;
    JMenu file,edit,help;
    JMenuBar mb;
    JTextArea ta;
    Notepadprac()
    {
        JFrame f = new JFrame();
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        file = new JMenu("file");
        edit = new JMenu("edit");
        help = new JMenu("help");
        ta = new JTextArea();
        ta.setBounds(5,5,400,400);
        mb = new JMenuBar();
        mb.add(file); mb.add(edit); mb.add(help);
        file.add(cut);
        file.add(copy);
        file.add(paste);
        f.add(ta);
        f.setJMenuBar(mb);
        cut.addActionListener((ActionListener) this);
        copy.addActionListener((ActionListener) this);
        paste.addActionListener((ActionListener) this);

        f.setTitle("Notepad");
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public void ActionPerformed(ActionEvent e )
    {
        if(e.getSource()=="cut")
        {
            ta.cut();
        }
        if(e.getSource()=="copy")
        {
            ta.copy();
        }
        if(e.getSource()=="paste")
        {
            ta.paste();
        }
    }


    public static void main(String[] args) {
        new Notepadprac();
    }

}
