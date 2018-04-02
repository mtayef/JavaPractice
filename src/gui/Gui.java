package gui;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class Gui
{
    public static void main(String[] args) {

        MultiplePrac g = new MultiplePrac();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(500,200);
        g.setVisible(true);
    }
}
class PracGui extends JFrame
{
    private JButton reg;
    private JButton custom;

    public PracGui()
    {
        super("Title");
        setLayout(new FlowLayout());

        reg = new JButton("Reg button");
        add(reg);

        Icon b = new ImageIcon(getClass().getResource("sam.png"));
        Icon x = new ImageIcon(getClass().getResource("enhancement.png"));
        custom = new JButton("Custom",b);
        custom.setRolloverIcon(x);
        add(custom);


        HandlerClass handle = new HandlerClass();
        reg.addActionListener(handle);
        custom.addActionListener(handle);
    }

    private class HandlerClass implements ActionListener {
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
        }
    }
}
class GuiPrac2 extends JFrame
{
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public GuiPrac2()
    {
        super("Title");
        setLayout(new FlowLayout());

        tf = new JTextField("This is sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 20));
        add(tf);

        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);

        HandlerClass handle = new HandlerClass();
        boldbox.addItemListener(handle);
        italicbox.addItemListener(handle);

    }

    private class HandlerClass implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            Font font = null;

            if (boldbox.isSelected()&& italicbox.isSelected())
                font = new Font("Serif",Font.BOLD + Font.ITALIC,20);
            else if (boldbox.isSelected())
                font = new Font("Serif",Font.BOLD, 20);
            else if (italicbox.isSelected())
                font = new Font("Serif",Font.ITALIC, 20);
            else
                font = new Font("Serif",Font.PLAIN, 20);

            tf.setFont(font);
        }
    }
}
class FontPrac extends JFrame
{
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public FontPrac()
    {
        super("Title");
        setLayout(new FlowLayout());

        tf = new JTextField("Cool learning", 20);
        add(tf);

        pb = new JRadioButton("plain",true);
        bb = new JRadioButton("bold",false);
        ib = new JRadioButton("italic",false);
        bib = new JRadioButton("bold and italic",false);
        add(pb); add(bb); add(ib); add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif",Font.PLAIN,20);
        bf = new Font("Serif",Font.BOLD,20);
        itf = new Font("Serif",Font.ITALIC,20);
        bif = new Font("Serif",Font.BOLD + Font.ITALIC,20);
        tf.setFont(pf);

        //wait for event to happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
    }

    private class HandlerClass implements ItemListener {

        private Font font;

        //The font object get variable font
        public HandlerClass(Font f) {
            font = f;
        }

        //sets the font to the font object that was passed in
        public void itemStateChanged(ItemEvent event)
        {
            tf.setFont(font);
        }

    }
}

class PracticeJCombobox extends JFrame
{
    private JComboBox box;
    private JLabel picture;

    private static String [] filename = {"sam.png", "enhancement.png"};
    private Icon [] pics = {new ImageIcon(getClass().getResource(filename[0])),
            new ImageIcon(getClass().getResource(filename[1]))};

    public PracticeJCombobox()
    {
        super("Title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange()==ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }
        );

        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }
}

class PracticeJList extends JFrame
{
    private JList list;
    private static String [] colorNames = {"black","blue","green","red"};
    private static Color [] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED};

    public PracticeJList(){
        super("Title");
        setLayout(new FlowLayout());

        list = new JList(colorNames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
                }
        );
    }
}
class MultiplePrac extends JFrame
{
    private JList leftList;
    private JList rightList;
    private JButton moveButton;
    private static String [] food = {"Chicken", "beef", "pizza","cheesecake","Rice"};

    public MultiplePrac()
    {
        super("Title");
        setLayout(new FlowLayout());

        leftList = new JList(food);
        leftList.setVisibleRowCount(3);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));

        moveButton = new JButton("Move -->");
        moveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rightList.setListData(leftList.getSelectedValues());
            }
        });

        add(moveButton);

        rightList = new JList();
        rightList.setVisibleRowCount(3);
        rightList.setFixedCellHeight(15);
        rightList.setFixedCellWidth(100);
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        add(new JScrollPane(rightList));

    }

}