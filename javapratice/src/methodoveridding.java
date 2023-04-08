class Bank{
	public void rateofinterest(){
		System.out.println("Bank interest" + 8); //implimentation details
}
}

class SBI extends Bank{
public void rateofinterest(){

}
}

class HDFC extends Bank{
public void rateofinterest(){
	System.out.println("HDFC interest" + 7.5);
}
}




public class methodoveridding {

	public static void main(String[] args) {
	Bank b1=new Bank();
	b1.rateofinterest();
	
	SBI s1=new SBI();
	s1.rateofinterest();

	HDFC h1=new HDFC();
	h1.rateofinterest();
	
	//Bank b2 =new SBI();    //we can give referance of child to parent, but in child we can't give referance of parent.
	//s1.rateofinterest();  // i.e Parent class are capable of holding your child class reference.
	}

}
