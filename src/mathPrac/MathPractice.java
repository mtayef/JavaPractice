package mathPrac;
import java.util.Scanner;

public class MathPractice 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		double fnum,snum,answer,avg;
		fnum= scan.nextDouble();
		snum=scan.nextDouble();
		answer=fnum+snum;
		avg= answer/2;
		System.out.println("First number: "+fnum);
		System.out.println("Second number: "+snum);
		System.out.println("Answer is: "+answer);
		System.out.println("Average is "+avg);
	}
}
