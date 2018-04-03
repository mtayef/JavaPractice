package listPrac;

import java.util.*;

public class HashSetPrac {

	public static void main(String[] args) {
		
		String [] things = {"pie","pizza","apple","rice","cup","pizza", "apple"};
		List <String> l = Arrays.asList(things);
		
		System.out.printf("%s\n ", l);
		
		Set <String> set = new HashSet<String>(l);
		System.out.printf("%s ", set);
		
	}

}
