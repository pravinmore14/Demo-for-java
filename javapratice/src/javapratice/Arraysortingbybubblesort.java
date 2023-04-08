package javapratice;

import java.util.Arrays;

public class Arraysortingbybubblesort {

	public static void main(String[] args) {
		
		int a[]= {5,4,7,8,1,2};
		int tempt =0;                // no need to declair tempt variable here but it must be in if conditional statements
		int length = a.length;
		
for (int i=0; i<length-1; i++) {     // no of passes = no of digit-1 i.e length -1 or we can directly use i<length but its not logical
			for (int j=0; j<length-1; j++) {
			if (a[j] > a[j+1]) {

			int temp =a[j];	
			a[j]=a[j+1];	
			a[j+1] =temp; 
		}
			
		}
	}
System.out.print("array after sorting" +Arrays.toString(a));	
	}
	}

