package interviews;

import java.util.Scanner;

//This is reverse Palindram function
public class Palindram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(reverseWord(s));
		scan.close();
	/*	int len = s.length();
		String rev= "";
		
		for(int i = len-1; i>=0; i--) 
		{
			rev += s.charAt(i);
		}
		
		System.out.println("Reverse String is: "+rev);*/
	}
	
	public static String reverseWord(String s){

	    char[] arr = s.toCharArray();

	    for(int i=0,j=arr.length-1;i<=j;i++,j--){
	        char tmp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = tmp;
	    }
	    return String.valueOf(arr);

	}
}
