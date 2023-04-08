
public class methodeoverloading {
	//public void addition(int a ,int b) {
	//int  sum =a+b;
	//System.out.println("addition of int " + sum  );
	//}
	public void addition(int a, long b) {
	long c =a+b;
	System.out.println("addition of long " +  c  );
	}
	
	public void addition(int a, int b) {
	int c =a+b;
	System.out.println("addition of long " +  c  );
	}
	
	
	public void addition(int a ,int b,int c) {
	  int d  =a+b+c;
		System.out.println("addition of int addition " +d );
	}

	public static void main(String[] args) {
		methodeoverloading m1=new methodeoverloading();
		m1.addition(10,20);

	}

}
