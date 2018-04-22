package problemSolving;

import java.io.*;

public class Diamond {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number: ");
		int size = Integer.parseInt(br.readLine());
		
		int odd= 1;
		int spaces = size/2;
		for(int i = 1;i<=size;i++) {
			for(int j = spaces;j>=1;j--) {
				System.out.print(" ");
			}
			
			for(int j =1;j<=odd;j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i<spaces+1) {				
				odd +=2;
				spaces -=1;
			}else {
				odd -=2;
				spaces +=1;
			}
		}
	}

}
