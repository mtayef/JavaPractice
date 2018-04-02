package interviews;

public class MinMaxArray {

    public static void main(String[] args) {
        int[] numbers = {34,24,32,45,99,103};

        System.out.println(minimum(numbers));
        System.out.println(maximum(numbers));
    }

    private static int minimum(int [] numbers) {
        int minimum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]<minimum)
                {
                    minimum=numbers[i];
                }
            }

        return minimum;
    }

    private static int maximum(int [] numbers) {
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]>maximum)
                {
                    maximum=numbers[i];
                }
            }

        return maximum;
    }
}

