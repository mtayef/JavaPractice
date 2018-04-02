package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class EventHandlerPractice {

    public static void main(String[] args) {
        Cool cool = new Cool();
        cool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cool.setSize(350,100);
        cool.setVisible(true);
    }
}
class Cool extends JFrame
{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public Cool()
    {
        super("Title");
        setLayout(new FlowLayout());
        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("Enter text here");
        add(item2);

        item3 = new JTextField("Uneditable",20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        TheHandler handler = new TheHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TheHandler implements ActionListener {

        public void actionPerformed(ActionEvent event)
        {
            String str = "";
            if (event.getSource()==item1)
                str = String.format("field 1: %s",event.getActionCommand());
            else if (event.getSource()==item2)
                str = String.format("field 2: %s",event.getActionCommand());
            else if (event.getSource()==item3)
                str = String.format("field 3: %s",event.getActionCommand());
            else if (event.getSource()== passwordField)
                str = String.format("Password field: %s",event.getActionCommand());

            JOptionPane.showMessageDialog(null,str);
        }
    }
}