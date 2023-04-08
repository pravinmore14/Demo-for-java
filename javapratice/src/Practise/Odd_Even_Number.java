package Practise;

import java.util.Scanner;

public class Odd_Even_Number {

	public static void main(String []args){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num>=0) {
		              if(num%2==0){
		             System.out.println("Number is Even");
		             break;
		              }
		              else {
		   System.out.println("Number is Odd");
		   break;
		              }
		}
		 System.out.println("out of while loop");
		}
		}
