package interviews;

public class Junk_Remove {

	public static void main(String[] args) {
		
		String s = "&**&(*(&* 0123456789 Selenium *(*&&^&%%(";		
		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s.trim());
	}

}
