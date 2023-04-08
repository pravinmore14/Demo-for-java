class Vehicle{
	public void fuelused() {
	System.out.println("electiric cell");
	}
}
	class Truck extends Vehicle{
		public void fuelused() {
			System.out.println("big lithium battery");
}
}
	class bike extends Vehicle{
public void fuelused(){	
	System.out.println("medium lithium battery");
}
}
	
public class pmethodoveridding {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
          v1.fuelused();
          
          Truck t1=new Truck();
          t1.fuelused();
          
          bike b1= new bike();
          b1.fuelused();
          
          Vehicle v2= new bike();
          v2.fuelused();
	}

}
