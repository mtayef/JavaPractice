package listPrac;

import java.util.*;

public class Convertion {

	public static void main(String[] args) {
		String stuff[] = {"babies","pillow","blanket","rain","day"};
		LinkedList <String> theList = new LinkedList<String>(Arrays.asList(stuff));
		
		theList.add("cover");
		theList.addFirst("blis");
		
		//convert back to array
		stuff = theList.toArray(new String[theList.size()]);
		
		for (String x : stuff)
			System.out.printf("%s ", x);
	}

}
