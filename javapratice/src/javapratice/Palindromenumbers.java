package javapratice;

import java.util.Scanner;

public class Palindromenumbers {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);        // its class provide by java which allow to enter system input in console
		System.out.println("Enter number");
		             
		int num= sc.nextInt();                     // it will accept numbers from user and store in num variable and its method.
		int rev=0;                                   //its will store reverse number
      int org_num=num;                        //it will store origional number which entered by user and into org_num &use to compaire with rev number
      
      while(num!=0) {
    	rev=rev*10 + num%10;     //read logic from nootebook ,this logic will reverse number which enter use % in line 17 not /.
    	num=num/10;  
	}
if(org_num==rev) {
	System.out.println("palindrome number " +org_num);
}
else {
	System.out.println("Not palindrome number " +org_num); 
}
}
}