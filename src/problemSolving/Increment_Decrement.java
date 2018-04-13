package problemSolving;
public class Increment_Decrement {

    public static void main(String args[])
    {
        int a = 13;
        int b = 9;

        int c = a++ * --b + b-- - --a;


        System.out.println(c);
    }
}
