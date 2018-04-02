package potPie;

public class PotPie
{
    private String firstName;
    private String lastName;
    private static int members = 0;

    public PotPie(String fn,String ln)
    {
        firstName = fn;
        lastName = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club: %d\n", firstName, lastName, members);
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public static int getMembers()
    {
        return members;
    }

    //refered for 42 & 43 videos to practice toString & composition practice
    // controlled from PotPiePractice class main method 
    /*private int month;
    private int day;
    private int year;

    public PotPie(int m, int d, int y)
    {
        month = m;
        day = d;
        year =y;

        System.out.printf("The constructor for this is %s\n",this);
    }

    public String toString()
    {
        return String.format("%d/%d/%d",month,day,year);
    }*/
}
