package ExceptionHandling;

public class MultipltCatch {

	public static void main(String[] args) {
		try {
           int arr[]=new int[6];
            arr[1] =20/1;
            System.out.println("iam in try block");

		
}
        catch(ArrayIndexOutOfBoundsException e){
		// System.out.println("Accessing array outside limit");
		 System.out.println(e.toString());   //e.toString (); method will print exception 
}	
		catch(ArithmeticException ae){
		     System.out.println("number can not divide by zero"); 
}
		catch(Exception e){
			 System.out.println(e.getMessage());		
}		
}
}
