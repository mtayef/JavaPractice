package enumPractice;
import java.util.EnumSet;

public class FollowingEnumPractice
{
    public static void main(String[] args) {
        for (EnumPractice e: EnumPractice.values())
            System.out.printf("%s\t%s\t%s\n",e,e.getDesc(),e.getYear());

        System.out.println("\nAnd now for the range of constants!!!\n");

        for (EnumPractice sneeze:EnumSet.range(EnumPractice.marry,EnumPractice.weather))
            System.out.printf("%s\t%s\t%s\n",sneeze,sneeze.getDesc(),sneeze.getYear());
    }
}
enum EnumPractice
{
    chips("Well","25"),
    major("Light","60"),
    marry("Happy","31"),
    today("Sunny","20"),
    ground("Snow","16"),
    weather("Cold","-1");

    private final String desc;
    private final String year;

    EnumPractice(String description, String birthday)
    {
        desc = description;
        year = birthday;
    }

    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }
}

