import javax.swing.*;
import java.awt.event.*;
public class Notepad implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem copy,cut,paste,selectAll;
    JTextArea ta;

    Notepad()
    {
        f = new JFrame();
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectALL");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(selectAll);
        ta = new JTextArea();
        ta.setBounds(5,5,360,320);
        f.setJMenuBar(mb);
        f.add(ta);
        mb.add(edit);
        mb.add(file);
        mb.add(help);
        f.setLayout(null);
        f.setSize(400,400);
        f.setTitle("Java Swing Notepad");
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==cut)
        {
            ta.cut();
        }

        if(e.getSource()==copy)
        {
            ta.copy();
        }

        if(e.getSource()==paste)
        {
            ta.paste();
        }

        if(e.getSource()==selectAll)
        {
            ta.selectAll();
        }
    }

    public static void main(String[] args) {

        new Notepad();
    }
}
