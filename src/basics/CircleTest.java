package basics;

import java.io.*;

public class CircleTest {

	public static void main(String[] args) {
		//area of circle
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		try {
			System.out.print("Enter circle radius: ");
			String input = br.readLine();
			double radius = Double.parseDouble(input);
			final double pi =3.14;
			double area = pi*radius*radius;
			System.out.println("Area of circle is: "+area);
		} catch (Exception e) {
			System.err.println("ERROR: Unable to input "+e.getMessage());
		}
		
		//sphere area
		try {
			System.out.print("Enter sphere radius: ");
			String input = br.readLine();
			double radius = Double.parseDouble(input);
			final double pi =3.14;
			double sphere = 4*pi*radius*radius;
			System.out.println("Area of sphere is: "+sphere);
		} catch (Exception e) {
			System.err.println("ERROR: Unable to input "+e.getMessage());
		}

		//sphere volume
		try {
			System.out.print("Enter volume radius: ");
			String input = br.readLine();
			double radius = Double.parseDouble(input);
			final double pi =3.14;
			double spvol = 4/3*pi*radius*radius*radius;
			System.out.println("Volume of sphere is: "+spvol);
		} catch (Exception e) {
			System.err.println("ERROR: Unable to input "+e.getMessage());
		}
		
	}

}
