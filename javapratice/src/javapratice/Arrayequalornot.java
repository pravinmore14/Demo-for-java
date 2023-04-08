package javapratice;

import java.util.Arrays;

public class Arrayequalornot {

	public static void main(String[] args) {

int a1[]= {10,20,30,40,50};
int a2[]= {10,20,30,40,50};
boolean status=Arrays.equals(a1, a2);    // its method to check whether two arrays are equal or not.
if(status==true){
	System.out.println("Arrays are same");
	}
else{
	System.out.println("Arrays are not same");
}
}
}