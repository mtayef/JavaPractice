package problemSolving;

import java.util.*;

public class DecToOctalComplicated {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuffer buf= new StringBuffer();
		System.out.print("Enter the number: ");
		int no = scan.nextInt();
		
		while(no !=0) {
			int digit = no % 8;
			buf.append(digit);
			no /=8;
		}
		System.out.println("Octal is: "+buf.reverse());
		scan.close();
	}

}
