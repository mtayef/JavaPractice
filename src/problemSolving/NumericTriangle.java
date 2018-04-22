package problemSolving;

import java.io.*;

public class NumericTriangle {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number: ");
		int no = Integer.parseInt(br.readLine());
		int spaces = no-1;
		
		for (int i = 1; i<=no; i++) {	
			for (int j = spaces;j>=1;j--) {
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			spaces -=1;
		}
	}

}
