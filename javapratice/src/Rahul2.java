import java.util.Scanner;

public class Rahul2 {

	int addition(int a,int b) {
int c=	a+b;
return c;
	}
	
	
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Eneter number");
int a=sc.nextInt();
int b=sc.nextInt();
Rahul2 s =new  Rahul2 ();
int result=s.addition(a, b);
System.out.println(result);
	}

}
