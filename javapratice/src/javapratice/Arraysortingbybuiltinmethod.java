package javapratice;

import java.util.Arrays;

public class Arraysortingbybuiltinmethod {

	public static void main(String[] args) {
		
		int a[]= new int [] {44,22,33,22,11};
Arrays.sort(a);

System.out.println("soting array");
for(int i=0; i<a.length; i++) {

	System.out.print(a[i]+ " ");
}
}
}
