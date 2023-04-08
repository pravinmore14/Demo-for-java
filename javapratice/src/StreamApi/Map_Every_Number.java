package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Every_Number {
	public static void main(String[] args) {
		List<Integer> numberlist =Arrays.asList(2,3,4,5);
		List <Integer> multipliedlist = new ArrayList<Integer>();
		//without stream API
		/*
		for(int n:numberlist) {
			System.out.println(n*3);
		}
		*/
		//with stram Api
		
multipliedlist =numberlist.stream().map(n->n*3).collect(Collectors.toList());
//we can do it by following ways
//numberlist.stream().map(n->n*3).forEach(System.out::println);
//numberlist.stream().map(n->n*3).forEach(num->System.out.println(num);
System.out.println(multipliedlist);
		}
}
