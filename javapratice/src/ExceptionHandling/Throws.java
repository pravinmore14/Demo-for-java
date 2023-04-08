package ExceptionHandling;

import java.io.IOException;

public class Throws {
 void display() throws IOException{
	 System.out.println("hello java");
	 throw new IOException();
 }
	public static void main(String[] args) {
		Throws obj =new Throws();
		try {
			obj.display();
		}
catch(IOException e) {
	 System.out.println("caugth exception \n:"+e);
	 
}
	}

}
