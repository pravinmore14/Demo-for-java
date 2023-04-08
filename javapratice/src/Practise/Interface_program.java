package Practise;
interface Bank{   //parent class

	 public static final int rateofinterest=10; // by default variables in interface are public static final
	public abstract void rateofinterest();      // all methods are abstract in interface
}
	class Sbi implements  Bank{
		public void rateofinterest() {		
           System.out.println("rate of interest of sbi is 8");
		}
	}
		class icici implements  Bank{ 
			public void rateofinterest() {		
	           System.out.println("rate of interest of icici is 7");
			}	
		}
			class Interface_program{     //our interface class (inteface taken i.e main inerface class)
	public static void main(String[]args) {
		 Sbi si =new Sbi();
		 si.rateofinterest();
		 
		 icici ic =new  icici();
		 ic.rateofinterest();
			}
	}
	