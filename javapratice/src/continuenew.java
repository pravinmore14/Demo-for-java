
public class continuenew {

	public static void main(String []args){
	
	int arr[]={50,10,30,20,40};
	int tempt=arr[0];
	System.out.println("Arrays before sorting");   
	for(int i=0; i<=arr.length-1; i++){
	System.out.println(arr[i]);
	}
	System.out.println("Arrays after sorting");
	for(int i=0; i<=arr.length-1; i++){
	for(int j=i+1; j<=arr.length-1; j++){
	                if(arr[i]>arr[j]){
	                 tempt=arr[i];
	                arr[i]=arr[j];
	                arr[j]=tempt;
	}}
	System.out.println(arr[i]);
	}

	}}