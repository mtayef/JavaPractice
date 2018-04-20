package problemSolving;

import java.util.*;

public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int no = scan.nextInt();
		StringBuffer b = new StringBuffer(no+"");
		System.out.println(b.reverse());
	}

}
