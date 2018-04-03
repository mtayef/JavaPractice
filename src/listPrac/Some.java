package listPrac;

import java.util.*;

public class Some {

	public static void main(String[] args) {
		
		//create an array and convert to list
		
		Character[] real= {'p','a','w','n'};
		List<Character> l = Arrays.asList(real);
		System.out.println("List is: ");
		outPut(l);
		
		// reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse: ");
		outPut(l);
		
		//create new array and lsit
		Character [] newReal = new Character[4];
		List<Character> listCopy = Arrays.asList(newReal);
		
		//copy contents for listcopy from list
		Collections.copy(listCopy, l);
		System.out.println("Copy of the list: ");
		outPut(listCopy);
		
		//fill collection with crap 
		Collections.fill(l, 'X');
		System.out.println("After filling list: ");
		outPut(l);
	}
	
	//output method
	private static void outPut(List<Character> theList) {
		for(Character things : theList)
			System.out.printf("%s ", things);
		
		System.out.println ();
	}
}
