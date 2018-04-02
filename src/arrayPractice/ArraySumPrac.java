package arrayPractice;
public class ArraySumPrac
{
    public static void main(String[] args) {

        int [] sam = {25,35,45,55,65};
        int sum = 0;
        for (int counter = 0; counter < sam.length; counter++)
        {
            sum += sam[counter];
        }
        System.out.println(sum);
    }
}
