import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.text.DecimalFormat;


class CConverter extends JFrame
{
	
	public CConverter()
	{
		super("Cobalt Converter");
		buildGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	
	public void buildGUI()
	{
		
		JLabel amount = new JLabel("Amount of Cobalt");
		JTextField amountInput = new JTextField(7);
		
		JLabel years = new JLabel("Number of Years");
		JTextField yearsInput = new JTextField(7);
		
		JButton compute = new JButton("Compute");
		JButton quit = new JButton("Quit");
		
		JLabel result = new JLabel("Amount Left: ");
		
		Container ct = getContentPane();
		ct.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(8,8,8,8);
		
		c.gridx = 0;		c.gridy = 0;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(amount, c);
		
		c.gridx = 1;		c.gridy = 0;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(amountInput, c);
		
		c.gridx = 0;		c.gridy = 1;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(years, c);
		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;		c.gridy = 1;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(yearsInput, c);

		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;		c.gridy = 2;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(compute, c);

		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;		c.gridy = 2;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(quit, c);

		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;		c.gridy = 3;
		c.gridwidth = 3;	c.gridheight = 1;
		ct.add(result, c);

		
		
		QuitListener ql = new QuitListener();
		quit.addActionListener(ql);
		
		AddListener addl = new AddListener(amountInput , yearsInput, result);
		compute.addActionListener(addl);
		yearsInput.addActionListener(addl);
	}
	
	
	
	
	
	class AddListener implements ActionListener
	{
		private JTextField in;
		private JTextField in2;
		private JLabel out;
		
		AddListener(JTextField in, JTextField in2, JLabel out)
		{
			this.in = in;
			this.in2 = in2;
			this.out = out;
		}
		
		
		public void actionPerformed(ActionEvent e)
		{
			double amtCobalt = (double) Double.parseDouble(in.getText());
			double numberYears = (double) Double.parseDouble(in2.getText());
			
			// initial amount * (1 - percent decrease) ^ time
			double result = amtCobalt * Math.pow((1 - 0.12), numberYears);
			
			DecimalFormat df =
			new DecimalFormat("#0.00000000");
			
			out.setText("Amount Left: " + df.format(result));
		}
	}
	
	class QuitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	
	
	public static void main(String[] args)
	{
		CConverter cobaltConverter = new CConverter();
	}
}
