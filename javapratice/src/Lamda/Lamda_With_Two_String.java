package Lamda;
//@FunctionalInterface
interface Two_string{
public void booking(String source,String destination);
}

public class Lamda_With_Two_String {
	public static void main(String[] args) {

		Two_string t =(source,destination) ->System.out.println("booking is done from"+" "+source+" "+"to"+" "+source);
t.booking("pune", "mumbai");
	}
//if we want return something then add data type in method instead of void and t.booking inside the sopln.
}
