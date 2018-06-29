package problemSolving;

import java.io.*;

public class NumericDiamond {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number: ");
		int no = Integer.parseInt(br.readLine());
		
		int columns = 1;
		int start = 0;
		int spaces = no/2;
		for(int i = 1; i<=no;i++) {
			if (i<spaces+1) {
				start = i;
			} else {
				start = no+1-i;
			}
			for(int j = 1; j<=spaces;j++) {
				System.out.print(" ");
			}
			if(i<no/2+1) {				
				spaces -=1;
			} else {
				spaces +=1;
			}
			for(int j = 1; j<=columns;j++) {	
				int middle = columns/2+1;
				System.out.print(start);
				if (j<middle) {					
					start--;
				} else {
					start++;
				}
		}
			System.out.println();
			if(i<no/2+1) {				
				columns +=2;
			} else {
				columns -=2;
				
			}
		}
	}

}
