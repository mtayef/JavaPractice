package problemSolving;

import java.util.*;

public class PowWOMath {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int b, e;
		
		System.out.print("Enter base: ");
		b = scan.nextInt();
		
		System.out.print("Enter exponent: ");
		e=scan.nextInt();
		
		int t = 1;
		
		for(int i = 1; i<=e; i++) {
			t = t * b;
		}
		System.out.println("The exponent is: "+t);
		scan.close();
	}

}
