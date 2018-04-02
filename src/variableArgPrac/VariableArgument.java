package variableArgPrac;
public class VariableArgument
{
    public static void main(String[] args) {
        System.out.println(average(12,13,14,15,16));
    }

    public static int average(int...number)
    {
        int total = 0;

        for (int x:number)
            total+=x;

        return total/number.length;
    }
}
