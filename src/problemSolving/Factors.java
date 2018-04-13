package problemSolving;

import java.io.*;

public class Factors {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int no = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=no; i++) {
			double result = (double)no/i; // i is the number of factor
			//System.out.println(result+"\t"+Math.ceil(result));
			if(result == Math.ceil(result)) {
				System.out.println(i+" is a factor");
			}
		}
	}

}
