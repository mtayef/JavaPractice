package arrayPractice;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        /*int[] numbers = {34,24,32,45,99,103};
        int[] series = Arrays.copyOf(numbers,numbers.length);

        series[0]=56;
        System.out.println(series[0]);
        System.out.println(numbers[0]);*/

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

        int minimum = minimum(numbers);
        int maximum = maximum(numbers);

        System.out.println(minimum);
        System.out.println(maximum);
    }

    private static int minimum(int[][] numbers) {
        int minimum = numbers[0][0];

        for (int r = 0; r <numbers.length ; r++) {
            for (int i = 0; i < numbers[r].length; i++) {
                if (numbers[r][i]<minimum)
                {
                    minimum=numbers[r][i];
                }
            }
        }

        return minimum;
    }

    private static int maximum(int[][] numbers) {
        int maximum = numbers[0][0];

        for (int r = 0; r <numbers.length ; r++) {
            for (int i = 0; i < numbers[r].length; i++) {
                if (numbers[r][i]>maximum)
                {
                    maximum=numbers[r][i];
                }
            }
        }

        return maximum;
    }
}

