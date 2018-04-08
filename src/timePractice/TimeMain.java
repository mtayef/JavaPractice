package timePractice;
public class TimeMain {
    public static void main(String[] args) {
        TimeConstructor con = new TimeConstructor();
        TimeConstructor con2 = new TimeConstructor(16);
        TimeConstructor con3 = new TimeConstructor(20,5);
        TimeConstructor con4 = new TimeConstructor(23,5,6);

        System.out.printf("%s\n",con.toMillitary());
        System.out.printf("%s\n",con2.toMillitary());
        System.out.printf("%s\n",con3.toMillitary());
        System.out.printf("%s\n",con4.toMillitary());

        System.out.printf("%s\n",con.normalTime());
        System.out.printf("%s\n",con2.normalTime());
        System.out.printf("%s\n",con3.normalTime());
        System.out.printf("%s\n",con4.normalTime());
    }
}
class TimeConstructor
{
    private int hour;
    private int minute;
    private int second;

    public TimeConstructor()
    {
        this(0,0,0);
    }
    public TimeConstructor(int h)
    {
        this(h,0,0);
    }
    public TimeConstructor(int h, int m)
    {
        this(h,m,0);
    }
    public TimeConstructor(int h, int m, int s)
    {
        setTime(h,m,s);
    }

    public void setHour(int h) {
        hour = ((h>=0 && h<24) ? h:0);
    }

    public void setTime(int h, int m, int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setMinute(int m) {
        minute = ((m>=0 && m<60) ? m:0 );
    }

    public void setSecond(int s) {
        second = ((s>=0 && s<60) ? s:0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toMillitary(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }
    public String normalTime()
    {
        return String.format("%d:%02d:%02d %s",((hour==0 || hour==12)?12:hour%12),minute,second,(hour<12?"AM":"PM"));
    }
}