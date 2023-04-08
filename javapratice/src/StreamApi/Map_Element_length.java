package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Element_length {

	public static void main(String[] args) {
		List <String> vehicles=Arrays.asList("bus","car","bicycle");
		
	//	List <String> names=
		/*	
		 //without map();
		for(String name:vehicles) {
			System.out.println(name+" "+" length is" +" "+name.length());
		}
*/
		// Using Map();
		 vehicles.stream().map(vname ->vname.length()).forEach(System.out::println);
		//here by using map() we are calculating length
	}

}
