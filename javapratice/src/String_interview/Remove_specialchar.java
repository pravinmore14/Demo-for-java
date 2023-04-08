package String_interview;

public class Remove_specialchar {

	public static void main(String[] args) {
		String str="!@#$%^&*Java123";
	str=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println("STring after remove special char is"+" "+str);
	
	String str2="   Kshitij   ";
	System.out.println("string before trim"+" "+str2);
	
	//to remove right and left spaces in string but it can't remove spaces in between string
	System.out.println("string After trim"+" "+str2.trim()); 
	
	//to remove spaces in between spaces i.e at center in string
	String str3="PRAVIN  MORE";
	System.out.println("Before removing center space"+" "+str3);
	str3=str3.replaceAll("\\s","");
	System.out.println("after removing center space"+" "+str3);
	}
}
