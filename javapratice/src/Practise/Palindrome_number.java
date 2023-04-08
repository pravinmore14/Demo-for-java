package Practise;



public class Palindrome_number {

	public static void main(String[] args) {	
		int arr[]={1,2,3,4,6,8,9};
		int length=arr.length;

		for(int i=0; i<length; i++) {
		if(arr[i]%2==0){                    //use
			System.out.println("even numbers in array  "+arr[i]);
			System.out.println(" ");
		}else{	
			System.out.println("Odd numbers in array  "+arr[i]);
			System.out.println(" ");
			}
		}	
}
}