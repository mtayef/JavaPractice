package arrayPractice;
public class ArrayTablePrac
{
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int [] button = {23,45,32,51,5};
        for (int couter = 0; couter < button.length; couter++)
        {
            System.out.println(couter + "\t \t" +button[couter]);
        }
    }
}
