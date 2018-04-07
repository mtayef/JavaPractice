package basics;

import java.io.*;

public class FerenheitToCelcius {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter temperature in ferenheight: ");
		try {
			String input = br.readLine();
			double ferenheit = Double.parseDouble(input);
			double celsius = (ferenheit - 32) * 5/9;
			if (celsius == 0) {
				int cel = (int)celsius;
				System.out.println("The temparature in celsius is: "+cel);
			}else {
			System.out.printf("The temparature in celsius is: %.2f", celsius);
			}
			} catch (Exception e) {
			System.err.println("ERROR: Unable to input");
		}
	}

}
