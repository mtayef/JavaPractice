package listPrac;

import java.util.*;

public class CollectionSortPrac {

	public static void main(String[] args) {
		
		String sample[]= {"river","blueberries","forest","apples","sky"};
		List <String> l1 = Arrays.asList(sample);
		
		Collections.sort(l1);
		System.out.printf("%s\n", l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s\n", l1);	
	}

}
