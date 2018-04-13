package problemSolving;

import java.io.*;

public class BonusCalculator {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter employee salary: ");
		
		try {
			String input = br.readLine();
			System.out.print("Enter bonus % ");
			String input2  = br.readLine();
			double salary = Double.parseDouble(input);
			double bonus = Double.parseDouble(input2);
			double total = salary + bonus / 100 * salary;
			System.out.printf("Salary with bonus is: %.2f", total);
			
		} catch (Exception e) {
			System.err.println("ERROR: Unable to input "+e.getMessage());
		}
		
	}

}
