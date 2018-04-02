package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class JFramePrac
{
    public static void main(String[] args) {
        GuiStuff gui = new GuiStuff();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(275,180);
        gui.setVisible(true);
    }
}
class GuiStuff extends JFrame{
    private JLabel item1;

    public GuiStuff()
    {
        super("The Title bar");
        setLayout(new FlowLayout());
        item1 = new JLabel("This is the sentence");
        item1.setToolTipText("This is going to show up on hover");
        add(item1);
    }
}
