/*  ReadFile.java
	Brandon Byrne (20115464)
	June 7, 2016 	*/
	
import java.io.*;
	
public class ReadFile
{
	public static void main(String args[])
	throws IOException
	{
		if(args.length == 0)
		System.out.println("usage: java ReadFile filename");
		
		else
		{
			File f = new File(args[0]);
			readFile(f);
		}
	}
	
	public static void readFile(File f)
	throws IOException
	{
		FileReader in = new FileReader(f);
		int size = (int) f.length();
		char data[] = new char[size];
		in.read(data);
		in.close();
		
		String s = new String(data);
		System.out.print(s);
	}
}