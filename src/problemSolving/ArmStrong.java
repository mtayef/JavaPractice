package problemSolving;

public class ArmStrong {
	public static void main(String args[]) throws Exception{
		
		for (int i = 0; i<=1000; i++) {
			int temp = i;
			String t = temp+"";
			int length = t.length();
			int sum = 0;
			
			while (temp !=0) {
				int digit = temp % 10;
				sum += (int)Math.pow(digit, length);
				temp /=10;
			}
			
			if (sum==i) {
				System.out.println(i+" is Armstrong");
			}
		}
	}

}
