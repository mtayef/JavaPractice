package interviews;

import java.util.*;
import java.util.Map.Entry;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"Java","JavaScript","Ruby","C","Python","Java"};
		
		//1. compare each element - worst solution - O(n*n) 
		for(int i = 0; i<names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) 
				{
					System.out.println("<========= Each Comparison =========>");
					System.out.println("duplicate element: "+names[i]);
				}
			}
		}
		
		System.out.println("<========= HashSet =========>");
		//2. Using HashSet: JavaCollection: it stores unique values: - O(n)
		
		Set<String> store = new HashSet<String>();
		
		for (String name : names) {
			if(store.add(name) == false) {
				System.out.println("duplicate element: "+name);
			}
		}
		
		System.out.println("<========= HashMap =========>");
		
		//using HashMap
		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		
		for (String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		
		for (Entry<String,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element "+entry.getKey());
			}
		}
	}

}
