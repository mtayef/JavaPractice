package genericStuff;

import java.util.*;

public class GenericMethPrac {

	public static void main(String[] args) {
		
		//generic methods is way to eliminate overloaded method
		
		Integer [] iray = {1,2,3,4};
		Character [] cray = {'t','a','y','f'};
		
		printMe(iray);
		printMe(cray);		
	}
	
	//generic method
	public static <T> void printMe(T[] b) {
		for (T x : b )
			System.out.printf("%s ", x);
		System.out.println();
	}
}
