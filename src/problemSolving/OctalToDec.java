package problemSolving;

import java.util.*;
//import java.io.*;


public class OctalToDec {
	public static void main(String args[]) throws Exception {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter only octal number: ");
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int no = Integer.parseInt(br.readLine(),8);
		int no = scan.nextInt(8);
		System.out.println(no);
		scan.close();
	}
}
