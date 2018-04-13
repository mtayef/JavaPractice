package problemSolving;

public class PrimeNumber {

	public static void main(String[] args) {

		//int no = 6;
		int count = 0;

		for (int j = 2; j <= 100; j++) {
			for (int i = 1; i <= j; i++) {
				double result = (double) j / i;

				if (result == Math.ceil(result)) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(j+" is prime number");
			} 
			
			count = 0;
		}
		
	}

}
