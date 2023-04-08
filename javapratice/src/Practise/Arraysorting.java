package Practise;

import java.util.Arrays;

public class Arraysorting {
 
	public static void main(String[] args) {
	int arr[]= {6,5,4,3,2};
	//int tempt =0;
int length =arr.length;
for(int i=0; i<length-1; i++) {
	for(int j=0; j<length-1; j++) {
		int tempt =arr[j];
		
		
		if(arr[i]<arr[i+1]){
			tempt =arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=tempt;
		}
	}
	System.out.println(arr[i]);
	}

//System.out.println("array sorting "+arr);
//System.out.print("array after sorting" + Arrays.toString(arr));

}
}