package loops_ifPrac;
public class IfElsePractice
{
    public static void main(String[] args) {

        IfElsePractice prac = new IfElsePractice();
        System.out.println(prac.aIsBigger(5,3));

    }

    public boolean aIsBigger(int a, int b) {
        if (a > b && (a - b) >= 2) {
            return true;
        }

        return false;
    }
}
