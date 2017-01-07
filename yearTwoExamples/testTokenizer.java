// Brandon Byrne 20115464   sept 12, 2016
import java.io.*;
import java.util.*;

class testTokenizer
{
	public static void main(String[] args) throws IOException
	{
		if(args.length == 0)
		{
			System.out.println("Usage: Java testTokenizer filename");
			System.exit(0);
		}
		else
		{
			String source = readFile(args[0]);
			System.out.println(source);
		
			parse(source);
		}
	}
	
	public static String readFile(String filename) throws IOException
	{
		File f = new File(filename);
		int size = (int) f.length();
		char[] data = new char[size];
		
		FileReader fr = new FileReader(f);
		fr.read(data);
		fr.close();
		
		return new String(data);
	}
	
	public static void parse(String source)
	{
		StringTokenizer st = new StringTokenizer(source);
		int i = 1;
		
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(i + " " + token);
			if(isPseusoOpCode(token))
			{
				System.out.println("Pseudo OpCode");
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
	
}
