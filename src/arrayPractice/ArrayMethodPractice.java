package arrayPractice;
public class ArrayMethodPractice
{
    public static void main(String[] args) {
        int [] number={3,4,5,6,7};
        change(number);

        for (int y:number) {
            System.out.println(y);
        }
    }
    
    public static void change(int [] x){
        for (int counter = 0; counter <x.length ; counter++) {
            x[counter]+=5;
        }
    }
}
