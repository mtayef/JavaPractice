package potPie;

public class PotPiePractice
{
    public static void main(String[] args) {

        PotPie p = new PotPie("First","Primary");
        //PotPie p2 = new PotPie("Second","Secondary");
        //PotPie p3 = new PotPie("Third","Third");

        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(PotPie.getMembers());

        //43 tutorial below which is used for composition practice
        /*PotPie pot = new PotPie(3,5,10);
        AnotherPotPie another = new AnotherPotPie("Test",pot);
        System.out.println(another);*/
    }
}
class AnotherPotPie
{
    private String name;
    private PotPie birthday;

    public AnotherPotPie(String theName, PotPie bDay)
    {
        name = theName;
        birthday = bDay;
    }

    public String toString()
    {
        return String.format("My name is %s, my birthday is %s",name, birthday);
    }
}
