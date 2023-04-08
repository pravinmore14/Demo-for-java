import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class list_Short_method {

	public static void main(String[] args) {
	
		List<Integer> list= Arrays.asList(12,15,20,25,30);
		List <Integer> evenNumbers =new ArrayList<Integer>();
		evenNumbers=list.stream().filter(n-> n%2 == 0).collect(Collectors.toList());
		
		/*for(int n:list) {
			if(n%2==0)
				evenNumbers.add(n);
			*/
		System.out.println("even numbers are:"+" "+evenNumbers);
		}
	
	}