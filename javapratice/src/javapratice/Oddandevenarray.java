package javapratice;

public class Oddandevenarray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9};
for(int i=0; i<a.length; i++) {
	
	if (a[i]%2 == 0) {      //use % never use / for division
		System.out.println("Even number "+a[i]);
}
	if(a[i]%2 != 0) {
		System.out.println("Odd number "+a[i]);
}
}
}
}

