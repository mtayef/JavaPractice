package problemSolving;

import java.util.*;

public class PerfectSquare {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {
			int no = i;
			double root = Math.sqrt(no);
			if (root == Math.ceil(root)) {
				System.out.println(no+" is Pefect Square");
			}
		}
		scan.close();
	}

}
