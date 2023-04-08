package Lamda;
@FunctionalInterface
interface Booking{
	 String  bookingCab(String Source,String Destination);
	
}

public class Lamdafor_Returntype {
	public static void main(String[] args) {
		Booking b=(Source,Destination)->{
			System.out.println("cab is booking is done"+" "+"from "+" " +Source+"To"+" " +Destination); 
			return(" Price:Rs 5000");
			};	
// here we have stored booking
		System.out.println(b.bookingCab("Hydrabad", "Pune")); //b is refrenace variable(b is not object for object new keyword used )  of booking
	}	
}