package interviews;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "This rain have started selenium";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf("s"));//1 st occurance of s
		
		System.out.println(str.indexOf("s", str.indexOf("s")+1)); //2nd occurance of s
	}

}
