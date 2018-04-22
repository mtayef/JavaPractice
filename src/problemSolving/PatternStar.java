package problemSolving;

import java.io.*;

public class PatternStar
{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("Enter number: ");
    	int no = Integer.parseInt(br.readLine());
    	
     /*   for (int i = 1; i<=no;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }*/
        
        for (int i = 1; i<=no;i++) {
            for (int j = 1; j <=no; j++) {
            	if (i==1 || i==no || j==1 || j==no) {
                System.out.print("*");
            	} else {
            		System.out.print(" ");
            	}
            }
            System.out.println();
        }
    }
}
