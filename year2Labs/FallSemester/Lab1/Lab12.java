// CP1340 Lab 1 Arrays and Strings (Part 2)
// Brandon Byrne (20115464)	Sept 16, 2016
// *UPDATED Oct. 4th, 2016
import java.io.*;
import java.util.*;

public class Lab12
{
	public static void main(String[] args) throws IOException
	{
		File assemblyCode = new File("Assembly.asm");	// store text file into new File
		String s = readFile(assemblyCode);		// calls readFile and stores contents as String
		tokenize(s);	// calls tokenize and makes tokens of each element in String
		
		
		
		
	}
	
	public static String readFile(File assemblyCode) throws IOException 
	{	
     	FileReader in = new FileReader(assemblyCode);
     	int size = (int) assemblyCode.length();
     	char[] data = new char[size];
     	in.read(data);
     	in.close();
     	return new String(data);
     }
     
     public static void tokenize(String s) 
     {
     	StringTokenizer st = new StringTokenizer(s);
          int i = 1;
     	
     	while(st.hasMoreTokens())
          {
          	String token = st.nextToken();
          	//System.out.println(i + " " + token);
            
          	if(isPseudoOpCode(token))
			{
		  		System.out.println(token + " is a Pseudo OpCode\n");
			}
            	
            	else if(isOpCode(token))
            	{
            		System.out.println(token + " is an OpCode\n");		
           	}
           	
           	else if(isOperand(token))
           	{	
           		System.out.println(token + " is an Operand\n");
           	}
           	
           	else if(isLabel(token))
           	{	
           		System.out.println(token + " is a Label\n");
           	}
           	
           	else if(isNumber(token))
           	{	
           		System.out.println(token + " is a Number\n");
           	}
           	
           
/*--------------------------------------------------------------------------------------
NEW: Added conditional operation to check if an illegal element was in the assembly code	
---------------------------------------------------------------------------------------*/         
           	else if(!isPseudoOpCode(token) && !isOpCode(token) && !isOperand(token) && !isLabel(token) && !isNumber(token))
           		{
           			System.out.println("\nERROR: " + token + " is an illegal element and the program cannot compile\n");
           			break;
           		}
           	
          	
               i++;
            
            
            
     	}
     }
    
	public static boolean isPseudoOpCode(String s)
	{	
		boolean answer = false;
		switch(s)
		{
			case ".begin" : answer = true; break;
			case ".data" : answer = true; break;
			case ".end" : answer = true; break;
			default : answer = false;
		}
		
		return answer;
	}
	
	public static boolean isOpCode(String s)
	{
		boolean answer = false;
		switch(s)
		{
			case "LOAD" : answer = true; break;
			case "STORE" : answer = true; break;
			case "CLEAR" : answer = true; break;
			case "ADD" : answer = true; break;
			case "INCREMENT" : answer = true; break;
			case "SUBTRACT" : answer = true; break;
			case "DECREMENT" : answer = true; break;
			case "COMPARE" : answer = true; break;
			case "JUMP" : answer = true; break;
			case "JUMPGT" : answer = true; break;
			case "JUMPEQ" : answer = true; break;
			case "JUMPLT" : answer = true; break;
			case "JUMPNEQ" : answer = true; break;
			case "IN" : answer = true; break;
			case "OUT" : answer = true; break;
			case "HALT" : answer = true; break;
			default : answer = false;
		}
		
		return answer;
	}
    
    	public static boolean isOperand(String s)
    	{
    		boolean answer = false;
    		char c;
    		int size = s.length();
     	for(int i = 0; i < size; i++)
     	{
     		c = s.charAt(i);
			
			if(isLetter(c) && !isOpCode(s))
    			
    				answer = true;
    			
    			else
    			{	
    				answer = false;
    				break;
    			}
    		}
    		return answer;
    		
    	}
    	
    	
    	public static boolean isLabel(String s)
    	{
    		boolean answer = false;
    		char lastValue = s.charAt(s.length() - 1);
    		String operand = s.substring(0, s.length() - 1);
    		
    		if(isOperand(operand) && lastValue == ':')
    		{
    			answer = true; 
    		}
    		
    		return answer;
    	}
    	
    		
	public static boolean isLetter(char c)
	{
		if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')	
			return true;
		
		else
			return false;
		
	}

	
	public static boolean isNumber(String s)
	{
		boolean answer = true;
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(!isDigit(c))
				answer = false;
		}
		return answer;
	}
	
	public static boolean isDigit(char c)
	{
		if(c >= '0' && c <= '9')
			return true;
		else
			return false;
	
	}
	
}	
    
    
    
    
    
    
    
    
    
    
    
    
    
