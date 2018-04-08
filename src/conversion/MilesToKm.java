package conversion;

import java.io.*;

public class MilesToKm {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter distance in miles: ");
			String input = br.readLine();
			double miles = Double.parseDouble(input);
			double km = 1.609*miles;		
			System.out.printf("Distance in kilometers is: %.2f ", km);
		} catch (Exception e) {
			System.err.println("ERROR: Unable to input "+e.getMessage());
		}
	}

}
