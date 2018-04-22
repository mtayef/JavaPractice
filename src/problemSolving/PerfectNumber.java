package problemSolving;

public class PerfectNumber {

	public static void main(String[] args) {
		
		for (int j = 1; j<=1000; j++) {
			int sum = 0;
			int no = j;
			for (int i = 1; i<=no; i++) {
				double res = (double)no/i;
				
				if(res==Math.ceil(res)) {
					sum +=res;
				}
			}
			
			sum -= no;
			
			if (sum == no) {
				System.out.println(no+" is perfect");
			}
		}
		
	}

}
