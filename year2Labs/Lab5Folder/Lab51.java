// Brandon Byrne Lab 51
// Cobalt Converter

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.text.DecimalFormat;

class CConverter extends JFrame
{
	
	public CConverter()
	{
		super("Cobalt Converter"); // name at top of program window
		buildGUI(); // calls buildGUI method that will build the user interface
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true); // this is true so that when it runs the interface is visible on screen
	}
	
	
	public void buildGUI()
	{
		
       
        
		JLabel amount = new JLabel("Amount of Cobalt");  // label that just prints "amount of cobalt"
		JTextField amountInput = new JTextField(10);
		
		JLabel years = new JLabel("Number of Years");
		JTextField yearsInput = new JTextField(10);
        //JTextField(int) sets length of field (number of columns)
		
		JButton compute = new JButton("Compute");
		JButton quit = new JButton("Quit");
        // creates 2 buttons with a string compute and quit
		
		JLabel result = new JLabel("Amount Left: ");
        // Label stating amount left:
		
		Container ct = getContentPane(); // set up container for the window
		ct.setLayout(new GridBagLayout()); // gridbag layout does something with giving everything constraints/sizes and sets them to position you wish. top left of window is (0,0)
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.BOTH;
		
        // sets spacing for margins (top, left, bottom, right) 
        c.insets = new Insets(8,8,8,8);


        
        
      		c.gridx = 0;		c.gridy = 0;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(amount, c);  // sets location and dimensions, then adds JLabel amount created above and sets
                            // the container dimensions. (amount will be at (0,0) and it's dimensions are 1X1
		
		c.gridx = 1;		c.gridy = 0;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(amountInput, c); // this adds JTextField amountInput to (1,0) so top right of window near
                                // amount text
		
		c.gridx = 0;		c.gridy = 1;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(years, c); // this adds JLabel 'years' to (0,1) so left of window and down 1 slot
                          // It will be located under amount of cobalt
		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;		c.gridy = 1;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(yearsInput, c); // adds JTextField to (1,1) so its on the right and down 1 slot just beneath
                                // amount inputs textfield

		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;		c.gridy = 2;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(compute, c); // adds the JButton 'compute' to (0,2) - on left and down 2 slots

		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;		c.gridy = 2;
		c.gridwidth = 1;	c.gridheight = 1;
		ct.add(quit, c); // adds JButton 'quit' to (1,2) - on right and 2 slots down - so to right of compute

		
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;		c.gridy = 3;
		c.gridwidth = 3;	c.gridheight = 1;
		ct.add(result, c); // finally add JLabel 'result' (0,3) so its postioned on left and 3 slots down
                            // *** also notice its dimensions are 3 wide and 1 high so it can take up a lot
                            // of space if needed when using larger numbers
        // can mess around with some sizes/positions if you want to see whats going on
		
        
        
		
		QuitListener ql = new QuitListener(); // instantiates QuitListener class made below
		quit.addActionListener(ql); // adds an actionlistener to JButton quit, in this case it adds ql
                                    // which is the quitListener
		AddListener addl = new AddListener(amountInput , yearsInput, result);
        // instantiates another listener and named it addl (addListener), class created below
        // it sends some parameters - amount input text, years input text and the result field for
        // editing it to have the final result
		
        compute.addActionListener(addl); // attaches the action listener to the JButton compute
		yearsInput.addActionListener(addl);
	}
	
	
	
	
	
	class AddListener implements ActionListener // AddListener is name I gave the class,
                                                // ActionListener is the thing that listens to actions, has methods like addActionListener used above
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
            // parses text from JTextField inputs 'in' and 'in2' and converts to double
			
			// (initial amount) * (1 - percent decrease) ^ time   <---- formula for exponential decay (Half-life)
            // Cobalt 60 decays 12% each year
            double result = amtCobalt * Math.pow((1 - 0.12), numberYears); // Math.pow(base, exponent)  <- Math.pow(12%, years)
            
			
			DecimalFormat df = new DecimalFormat("#0.00000000"); // setting format so result will have max of 8 decimal places, same as sirs example on website
			
			out.setText("Amount Left: " + df.format(result)); // set the output text for result
		}
	}
	
    
    
    
    
	class QuitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
            // when QuitListener detects(listens for) an action like a button press, it runs System.exit(0)
            // which ends the program
		}
	}
	
	
	
	public static void main(String[] args)
	{
		CConverter cobaltConverter = new CConverter();
	}
}

class Lab51
{
    public static void main(String[] args)
    {
        CConverter cobaltConverter = new CConverter();  //instantiates and runs program
    }
}
