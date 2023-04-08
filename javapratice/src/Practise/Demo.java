package Practise;

public class Demo {

	public static void main(String[]args){
		String str="!@#$%^&*HelloJava";
		str=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("String after removing special symbol is "+" "+str);
		
		}
		} 
