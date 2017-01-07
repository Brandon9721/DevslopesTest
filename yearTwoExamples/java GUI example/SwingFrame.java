import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class SwingFrame extends JFrame
{
    public SwingFrame()
    {
        super("First Swing Frame");
        buildGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
    }


    public void buildGUI()
    {
        Container c = getContentPane();

        JPanel p = new JPanel();
        JLabel title = new JLabel("Hello Swing");

        p.setBorder(new TitledBorder(new EtchedBorder(), "Border Label"));
        p.add(title);
        c.add(p);

    }



    public static void main(String[] args)
    {
        SwingFrame sf = new SwingFrame();
       
    }
}
