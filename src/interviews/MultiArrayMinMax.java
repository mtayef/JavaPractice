package interviews;

public class MultiArrayMinMax {

	public static void main(String[] args) {
		
		 int[][] numbers={
	                {24,33,53},
	                {1,13,19,7,32},
	                {21,15},
	                {17,18,92,27},
	                {15,11,2},
	                {6},
	                {102,3,69,95,22,46,51},
	                {-1,9,-10}
	        };
		 
		 System.out.println("Minimum is: "+minimum(numbers)+" and Maximum is: "+maximum(numbers));

	}
	
	private static int minimum(int[][] numbers) 
	{	
		int minimum = numbers[0][0];
		
		for(int r = 0; r<numbers.length; r++) {
			for(int c = 0; c<numbers[r].length; c++) 
			{
				if (numbers[r][c]< minimum) 
				{
					minimum = numbers[r][c];
				}
			}
		}
		return minimum;
	}
	
	private static int maximum(int[][] numbers) 
	{	
		int maximum = numbers[0][0];
		
		for(int r = 0; r<numbers.length; r++) {
			for(int c = 0; c<numbers[r].length; c++) 
			{
				if (numbers[r][c] > maximum) 
				{
					maximum = numbers[r][c];
				}
			}
		}
		return maximum;
	}
}
