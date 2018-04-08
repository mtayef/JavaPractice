package conversion;

import java.io.*;

public class TimeFromDistance {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter distance in km: ");
		double distance = Double.parseDouble(br.readLine());
		System.out.print("Enter speed in km/hr: ");
		double speed = Double.parseDouble(br.readLine());
		
		distance = distance * 1000;
		speed = speed*1000/3600;
		double time = distance/speed; //In seconds
		
		int hour = (int)time/3600;
		int minutes = (int)(time - hour*3600)/60;
		//int seconds = (int)time-hour*3600-minutes*60;
		int seconds = (int)time%60;
		System.out.printf("The time is: %02d:%02d:%02d PM", hour,minutes,seconds);
		//String.format("%02d:%02d:%02d", hour, minute, seconds);
	}

}
