package problemSolving;

import java.util.*;

//import java.io.*;

public class BinToDec {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter binary number only: ");
		/*int no = 0b1110;
		System.out.println(no);*/
		//int no = Integer.parseInt(br.readLine(),2);
		int no = scan.nextInt(2);
		System.out.println("Number is: "+no);
		scan.close();
	}

}
