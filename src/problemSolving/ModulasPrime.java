package problemSolving;

public class ModulasPrime {

	public static void main(String[] args) {
		
		for (int j = 2; j<=100; j++) {
			int no = j;
			int count = 0;
			for (int i = 1; i<=no; i++) {
				if (no%i==0) {
					count++;
				}
			}
			
			if (count ==2) {
				System.out.println(no+" is prime");
			}
			
			count = 0;
		}
	}

}
