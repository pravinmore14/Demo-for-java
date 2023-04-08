import java.util.Scanner;

public class Table_Of_Number {
	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter number");
       num=sc.nextInt();
    for(int i=1; i<=10; i++) {
    	   System.out.println(num*i);
       }
	}
}

	