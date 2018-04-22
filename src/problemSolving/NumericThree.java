package problemSolving;

import java.io.*;

public class NumericThree {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no: ");
		int no = Integer.parseInt(br.readLine());
		
		int odd = 1;
		int spaces = no-1;
		
		for (int i = 1; i<=no; i++) {
			int k = 0;
			for(int j = 1; j<=spaces; j++) {
				
				System.out.print(" ");
			}
			for (int j = 1; j<=odd;j++) {
				if (j<=i) {
					k +=1;
				}
				else {
					k -=1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd +=2;
			spaces -=1;
		}
			
			

	}

}
