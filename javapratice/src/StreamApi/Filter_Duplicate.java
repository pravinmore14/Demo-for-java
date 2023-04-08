package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter_Duplicate {

	public static void main(String[] args) {
		
		
		List<Integer> Original= Arrays.asList(1,2,3,4,1,2,3);
	 System.out.println(" Original Elements are: "+""+ Original);
	// we used Set here bcoz we want to print value once bcoz it will not store duplicates	
Set<Integer> duplicate =Original .stream().filter(n -> Original.stream() .filter(n1 -> n1 == n).count() > 1)
	
				   .collect(Collectors.toSet());

		System.out.println("Duplicate Elements are: "+""+duplicate);
	}
}
