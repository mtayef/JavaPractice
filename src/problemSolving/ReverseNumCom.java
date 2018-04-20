package problemSolving;

import java.util.*;

public class ReverseNumCom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int no = scan.nextInt();
		
		int temp = no;
		int sum = 0;
		
		while(temp !=0) {
			int digit = temp % 10;
			System.out.print(digit); 
			sum += digit;
			temp /=10;
		}
		System.out.println("\nSum of the numbers: "+sum);
	}

}
