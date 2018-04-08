package conversion;

import java.io.*;

public class DistanceInMeters {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter distance in meters: ");
		double meters = Double.parseDouble(br.readLine());
		//1 meter = 39.3701 inches
		double inches = meters*39.3701;
		
		//1 mile = 63360 inches
		int miles = (int)inches/63360;
		//1 foot = inches/12
		int feet = (int)(inches-miles*63360)/12;
		//int inch = (int)inches - miles*63360-feet*12;
		
		int inch = (int)inches%12;
		System.out.printf("Total distance travelled: %d miles %d feet %d inches", miles,feet,inch);
	}

}
