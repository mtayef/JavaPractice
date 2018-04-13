package problemSolving;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int no = scan.nextInt();
		
		int prod = 1;
		
		for(int i = 1; i<=no; i++) 
		{
			prod *=i;
		}
		System.out.println("The factorial of number is: "+prod);
		
		scan.close();
	}
}
