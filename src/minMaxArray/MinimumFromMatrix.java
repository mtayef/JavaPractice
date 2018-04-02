package minMaxArray;

public class MinimumFromMatrix {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// abc[4][3]
		int abc[][] = { { 2, 4, 5 }, { 3, 4 }, { 1, 2, 9 }, { -1, 2, 9 } };
		// System.out.println(abc.length);
		// System.out.println(abc[1].length);

		// for (int row = 0; row < abc.length; row++) {
		// for (int col = 0; col < abc[row].length; col++) {
		// System.out.print(abc[row][col] + "\t");
		// }
		// System.out.println();
		// }
		
		//System.out.println(Math.max(2,4));
		
		int min = abc[0][0];
		for (int row = 0; row < abc.length; row++)
		{
			for (int col = 0; col < abc[row].length; col++) {
				System.out.print(abc[row][col] + "\t");
			}
		}
//		System.out.println(min);

	}

}
