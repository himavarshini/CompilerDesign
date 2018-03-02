import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.StringTokenizer;
public class recognizer{
	public static void main(String args[]) throws IOException
	{
		File f = new File("/home/AMRITAVIDYA/u4cse15167/samp.c");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str = br.readLine();		
		while(str != null)
		{
 			StringTokenizer s = new StringTokenizer(str);
			while(s.hasMoreTokens())
			{
				String tok = s.nextToken();
				if(tok.equals("int")||tok.equals("main")|| tok.equals("if")|||| tok.equals("else")|| tok.equals("for")|| tok.equals("while")|| tok.equals("do")|| tok.equals("goto")|| tok.equals("continue"))
				{
					System.out.println("keyword");
				}
			}
			str=br.readLine();
		}		
	}
}
