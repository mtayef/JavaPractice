package listPrac;
import javax.swing.*;
import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter the numbers");
        System.out.println(input);
        String[] inputs = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        for (String item:inputs) {
            int value = Integer.parseInt(item);
            sum += sum + value;
            list.add(value);
        }

        int minimum = minimum(list);
        int maximum = maximum(list);
        JOptionPane.showMessageDialog(null,"Minimum = "+minimum+ " Maximum = "+maximum+ " Average = "+(double)sum/list.size()+ " Total "+sum);

    }

    public static int minimum(ArrayList<Integer> list)
    {

        int minimum = list.get(0);

        for (int i = 1; i <list.size(); i++)
        {
            if (list.get(i)<minimum)
            {
                minimum=list.get(i);
            }
        }

        return minimum;
    }
    public static int maximum(ArrayList<Integer> list) {

        int maximum = list.get(0);

        for (int i = 1; i <list.size(); i++)
        {
            if (list.get(i)>maximum)
            {
                maximum=list.get(i);
            }
        }

        return maximum;
    }
}

