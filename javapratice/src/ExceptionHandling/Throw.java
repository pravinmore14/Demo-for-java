package ExceptionHandling;

public class Throw {
	public static void main(String[] args) {
		int num=1;
		for(num=1; num <9; num++) {
			try {
				if(num==5)
					throw new ArithmeticException("ArthimeticException");
				else if(num<2)
					throw new RuntimeException("RuntimeException");	
				
				else if(num<8)
					throw new NullPointerException(" NullPointerException");	
				System.out.println("caugth "); 
			}catch(Exception e) {
				System.out.println("caugth an Exception:");    //
				System.out.println(e.getMessage());
			}
}
}
}
