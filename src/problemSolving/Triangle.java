package problemSolving;

import java.io.*;

public class Triangle {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("Enter number: ");
    	int no = Integer.parseInt(br.readLine());
    	
    	/*for (int i = 1; i<=no;i++) {
            for (int j = 1; j <=no; j++) {
            	if (j<=i)
            	System.out.print("*");
            }
            System.out.println();
    	}*/
    	/*for (int i = 1; i<=no;i++) {
    		for (int j = 1; j <=no; j++) {
    			if (j>=i)
    				System.out.print("*");
    		}
    		System.out.println();
    	}*/
    	/*for (int i = 1; i<=no;i++) {
            for (int j = no; j >=1; j--) {
            	if (j>i)
            	System.out.print(" ");
            	else
            	System.out.print("*");
            }
            System.out.println();
    	}*/
    	for (int i = 1; i<=no;i++) {
            for (int j = 1; j <=no; j++) {
            	if (j<i)
            	System.out.print(" ");
            	else
            	System.out.print("*");
            }
            System.out.println();
    	}
    	
	}

}
