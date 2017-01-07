// CP1340 Lab 1 Arrays and Strings (Part 2)
// Brandon Byrne (20115464)	Sept 16, 2016
import java.io.*;
import java.util.*;

public class Lab12
{
	public static void main(String[] args) throws IOException
	{
		File assemblyCode = new File("Assembly.asm");
		String s = readFile(assemblyCode);
		tokenize(s);
		System.out.println(s);
		// isPseudoOpCode(s);
	}
	
	