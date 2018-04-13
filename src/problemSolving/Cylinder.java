package problemSolving;

import java.io.*;

public class Cylinder {

	public static void main(String[] args) throws Exception {
		
		final double pi = 3.14;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the radius: ");
		
		String input = br.readLine();
		
		System.out.print("Enter the height: ");
		
		String input2 = br.readLine();
		
		double radius = Double.parseDouble(input);
		
		double height = Double.parseDouble(input2);
		
		//area of a cylinder
		double area = 2*pi*radius*(radius+height);
		
		//volume of a cylinder
		
		double volume = pi*radius*radius*height;
		
		System.out.printf("The area of cylinder is: %.2f\n",area);
		
		System.out.printf("The volume of cylinder is: %.2f ",volume);
	}

}
