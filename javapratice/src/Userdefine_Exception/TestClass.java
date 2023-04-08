package Userdefine_Exception;
import Userdefine_Exception.Age;
import java.util.Scanner;

public class TestClass {
	private static int age;
	static void validate() throws Age{
	
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your age");
	age=sc.nextInt();
	if(age<18)
	throw new Age("Invalid age,you are not eligible for vote");
	else
		System.out.println("Welcome to vote");	
	}
	
	public static void main(String []args) {
		try {
			validate();
		}catch(Exception e) {
			System.out.println("Caught an exception:\n");		
		}
		}
}
