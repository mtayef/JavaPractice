package interviews;

public class ReverseInt {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev = 0;
		
		while (num !=0) 
		{
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		System.out.println("Reverse number is: "+rev);
		
		int num2=12345;
		StringBuffer s2 =new StringBuffer(String.valueOf(num2)).reverse();
		System.out.println(s2);
	}
}
