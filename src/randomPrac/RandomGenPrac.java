package randomPrac;
import java.util.Random;

public class RandomGenPrac
{
    public static void main(String[] args) {
        Random dice = new Random();
        int number;

        for (int couter = 1; couter <=10 ; couter++)
        {
            number = 1 + dice.nextInt(6);
            System.out.println(number +"  ");
        }
    }
}
