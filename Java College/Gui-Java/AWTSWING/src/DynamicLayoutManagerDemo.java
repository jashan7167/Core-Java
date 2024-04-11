import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicLayoutManagerDemo extends JFrame {
    private JPanel mainPanel;
    private JButton button1, button2, button3;
    private JTextField textField1, textField2;

    public DynamicLayoutManagerDemo() {
        setTitle("Dynamic Layout Manager Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);

        createButtons();
        createTextFields();
        createLayoutComboBox();

        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createButtons() {
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
    }

    private void createTextFields() {
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        mainPanel.add(textField1);
        mainPanel.add(textField2);
    }

    private void createLayoutComboBox() {
        String[] layoutOptions = {"FlowLayout", "BorderLayout", "GridLayout"};
        JComboBox<String> layoutComboBox = new JComboBox<>(layoutOptions);

        layoutComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedLayout = (String) layoutComboBox.getSelectedItem();
                setLayout(selectedLayout);
            }
        });

        add(layoutComboBox, BorderLayout.NORTH);
    }

    private void setLayout(String layoutType) {
        switch (layoutType) {
            case "FlowLayout":
                mainPanel.setLayout(new FlowLayout());
                break;
            case "BorderLayout":
                mainPanel.setLayout(new BorderLayout());
                break;
            case "GridLayout":
                mainPanel.setLayout(new GridLayout(2, 2));
                break;
        }

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DynamicLayoutManagerDemo();
            }
        });
    }
}
