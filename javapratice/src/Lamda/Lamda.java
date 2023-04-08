package Lamda;
@FunctionalInterface

interface Cab{
	public void booking();
}

public class Lamda {

	public static void main(String[] args) {
		Cab c =()-> System.out.println("Welcome your booking is done");
		c.booking();
	}
}
