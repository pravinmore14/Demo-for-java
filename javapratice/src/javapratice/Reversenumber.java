package javapratice;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter a number");
	int num = sc.nextInt()	;
	int rev =0;
	//Using algorithm 
	
	while(num!=0) {             //whatever number enter by us they come to here
		
 rev =rev*10  + num%10; //0+1234/10 =4  rev value become 4 here previously it was 0 , 4 will go into rev =rev*10 +num%10; 40+3=43 .conti
		 num=num/10;      // it will cut numbers 1234, 123, 12, 1, 0
	}		                      //reverse number will store in rev variable
		 System.out.println("Reverse number are " +rev);		 
}
	}