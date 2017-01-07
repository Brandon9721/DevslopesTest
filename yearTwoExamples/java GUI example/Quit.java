import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Quit extends JFrame
{
    public Quit()
    {
        super("Quit");
        buildGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        pack();
        setVisible(true);
    }
    
    public void buildGUI()
    {
        Container c = getContentPane();
        JLabel l = new JLabel("Hello Quit");
        JButton q = new JButton("Quit");
        QuitListener ql = new QuitListener();
        q.addActionListener(ql);
        c.setLayout(new FlowLayout());
        c.add(l);
        c.add(q);
    }
    
    private class QuitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
 
    }
    
    
    
    public static void main(String[] args)
    {
        Quit q = new Quit();
    }
}
