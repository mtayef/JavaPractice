package loops_ifPrac;
public class WhilePrac {

    public static void main(String[] args) {

        int i =0;
        int count=0;
        while (i<100)
        {
            i++;
            if (i%3==0)
            {
                System.out.println(i);
                count++;
            }
            if (count==6)
            {
                break;
            }
        }

        System.out.println("count is: "+count);
    }
}
