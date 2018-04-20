package problemSolving;

import java.util.*;

public class DecToBinary2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuffer buf = new StringBuffer();

		System.out.print("Enter number: ");
		int no = scan.nextInt();

		while (no != 0) {
			int digit = no % 2;
			buf.append(digit);
			no /= 2;
		}
		System.out.println("binary is: " + buf.reverse());
		scan.close();
	}

}
