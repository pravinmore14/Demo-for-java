package Practise;
import java.io.*;

public class BufferReader {
	public static void main (String []args)throws Exception{
		
		InputStreamReader r =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(r);
		System.out.println("Enter name");
		String name =br.readLine();
		System.out.println("WelCome"+" "+name);
		}
		}
