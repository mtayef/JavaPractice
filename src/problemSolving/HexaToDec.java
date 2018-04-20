package problemSolving;

import java.util.*;

public class HexaToDec {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Hexa numbers only: ");
		int no = scan.nextInt(16);
		System.out.println("Hexa number is: "+no);
		scan.close();
	}

}
