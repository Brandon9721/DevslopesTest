import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


class Javapad extends JFrame
{
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem n, open, save, exit;
	
	
	public Javapad()
	{
		super("Javapad"); // Name at top of window
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(640,480)); // sets deault size
		buildGUI(); // calls buildGUI wayyyy below to put items into window
		pack(); // pack it all (Actually got no idea what this does)
		setVisible(true); // make it visible
	}
    
    
    
	
	class MenuListener implements ActionListener // actionlistener will detect actions
	{
		private JFileChooser fc;
		private JTextArea area;
        private String line;
        // creates private variables to be used below
       
        
		public MenuListener(JTextArea area) // instantiates menulistener
		{
			fc = new JFileChooser();
			this.area  = area;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == n)  // if 'New' is clicked, run this code
			{
                area.setText(null); // empty text area
			}
			
			else if(e.getSource() == open) // if 'Open' is clicked, run this code
			{
                
                int returnVal = fc.showOpenDialog(Javapad.this);
                BufferedReader br = null;
                
				if(returnVal == JFileChooser.APPROVE_OPTION) // if a file is chosen, run code
				{
                    // try to read selected file
                    try
                    {
                        area.setText(null); // sets text to blank first
                        File file = fc.getSelectedFile(); // grab selected file
                        
                        br = new BufferedReader(new FileReader(file)); // read file, place into buffer
                       
                    }
                    // catch any errors
                    catch(FileNotFoundException e2)
                    {
                        e2.printStackTrace();
                    }
                    
                    // if no errors code is executed, then try to run below code
                    try
                    {
                        line = br.readLine(); // try to place first line in bufferReader on first line
                    }
                    catch(IOException e2) // catch any errors
                    {
                        e2.printStackTrace();
                    }
                    
                    // if no errors after placing first line, enter loop
                    while(line != null) // while line is not empty
                    {
                        area.append(line + "\n"); // since first line is complete, append new line
                                                   // to move to next line
                        try
                        {
                            line = br.readLine(); // try to place next line into javapad
                        }
                        catch(IOException e2)
                        {
                            e2.printStackTrace(); // print any errors
                        }
                        
                        // will continue to loop until it reaches final line then the next line is empty
                        // so line != null is false and loop ends
                    }
                }
            }
            
            else if(e.getSource() == save) // if menu option "Save" is clicked, exucute this
            {
                JFileChooser saveFile = new JFileChooser(); // opens file chooser
                int option = saveFile.showSaveDialog(save); // filechoosers bottom right box will be the
                                                            // save box since its showSaveDialog and not
                                                            // showOpenDialog
                
                
                if (option == JFileChooser.APPROVE_OPTION) // if save is pressed and its approved, execute
                {
                    // try this code
                    try
                    {
                        // create new bufferWriter
                        BufferedWriter BW = new BufferedWriter(new FileWriter(saveFile.getSelectedFile().getPath()));
                        
                        BW.write(this.area.getText()); // write file contents into BW and the .write
                                                        // writes and saves the file to path
                        
                        BW.close(); // close BW
                        
                    }
                    catch (Exception error) // catch errors
                    {
                        System.out.println(error.getMessage());
                    }
                    
                }
                
            }
        
            
            
            
            else if(e.getSource() == exit) // closes javapad if exit is pressed
            {
               System.exit(0);
            }
            
        }
    }


	private void buildGUI()
	{
		Container container = this.getContentPane(); // creates a container
		
		menuBar = new JMenuBar(); // instantiates a new menu bar
		container.add(menuBar, BorderLayout.NORTH); // adds the menu to the north border
		
		fileMenu = new JMenu("File"); // names the menu 'fileMenu' and the visible string says File
		menuBar.add(fileMenu); // add it to menubar
		
		n = new JMenuItem("New"); // menu item called 'n' and visible name is New
		fileMenu.add(n); // adds 'n' to the fileMenu
		fileMenu.addSeparator(); // adds a seperator into the menu
		
		open = new JMenuItem("Open"); // creates new JMenuItem 'open' with visible string Open
		fileMenu.add(open); // adds it to fileMenu
		fileMenu.addSeparator(); // add another seperator
		
		save = new JMenuItem("Save"); // creates JMenuItem 'save' with visible string Save
		fileMenu.add(save); // adds it to fileMenu
		fileMenu.addSeparator(); // add another seperator
		
		exit = new JMenuItem("Exit"); // creates JMenuItem exit with visible string Exit
		fileMenu.add(exit); //adds to fileMenu, no more seperators, bottom of menu
		
		JTextArea edit = new JTextArea(30,20); // creates JTextArea named edit, user types stuff here
		edit.setFont(new Font("Menlo", Font.PLAIN, 14)); // set font type and size
		
		JScrollPane sp = new JScrollPane(edit);  // instantiates scrollpane and attaches it to textarea edit
		sp.setPreferredSize(new Dimension(450, 100)); // set default size of scrollable area
                                                      // if text goes below this point the scrollable
                                                      // area will get larger
		container.add(sp, BorderLayout.CENTER); // adds scrollpane which includes textarea to the container
                                                // into center position
		
		MenuListener ml = new MenuListener(edit); // instantiates new menulistener, class above buildGUI class
		n.addActionListener(ml);
		open.addActionListener(ml);
		save.addActionListener(ml);
		exit.addActionListener(ml);
        // adds menulisteners to each menu element
		
	}
	
	public static void main(String[] args)
	{
		Javapad jp = new Javapad();
	}
}

class Lab52
{
    public static void main(String[] args)
    {
        Javapad p = new Javapad(); // creates javapad
    }
}
