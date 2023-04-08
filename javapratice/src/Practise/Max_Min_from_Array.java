package Practise;

public class Max_Min_from_Array {
	public static void main(String []args) {
		 int arr[] = {21,98,13,9,34};
		 int length=arr.length;
		 
		 int max=arr[0];/// we assume max at arr[0];
		 for(int i=1;i<length-1; i++){
		 if(arr[i]>max){
		 max=arr[i];
		
		 }
		 }
		 System.out.println(max);
		}
		}
