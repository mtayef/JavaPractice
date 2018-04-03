package listPrac;

import java.util.*;

public class Fan {

	public static void main(String[] args) {
		
		String food[] = {"rice", "beef", "pizza","spagetti","tea"};
		List<String> l1 = Arrays.asList(food);
		
		ArrayList <String> l2 = new ArrayList<String>();
		l2.add("youtube");
		l2.add("google");
		l2.add("digg");
		
		for (String x : l2)
			System.out.printf("%s ", x);
		
		Collections.addAll(l2, food);
		
		System.out.println();
		for (String x : l2)
			System.out.printf("%s ", x);
		
		System.out.println();
		
		System.out.println(Collections.frequency(l2, "digg"));
		
		boolean tof = Collections.disjoint(l1, l2);
		System.out.println(tof);
		
		if (tof)
			System.out.println("they dont have anything common");
		else
			System.out.println("they have something common");
	}

}
