package Practise;
import java.util.*;
public class Calculator {
	public static void main(String []args){
		int a,b,c,choice;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		choice=sc.nextInt();

		switch(choice){
		case 1:c=a+b;
		System.out.println("Additionis"+" "+c);
		break;
		case 2:c=a-b;
		System.out.println("Substraction"+" "+c);
		break;
		case 3:c=a*b;
		System.out.println("Multiplication"+" "+c);
		break;
		case 4:c=a/b;
		System.out.println("Division"+" "+c);
		break;
		default:
		System.out.println("Invalid choice");
		}
		}
		} 