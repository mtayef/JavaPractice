package problems;
public class CalculateCircle {

    /*User will give you length of each side/no of sides
    1 side = Take that as side of a square or radius of a circle
    2 side = Length and width of rectangle
    3 side = sides of triangle
    Any other sides = invalid input
    Find the smallest, largest and average area.
    */

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            Square sq = new Square();
            sq.side = i;
            System.out.println(sq.calculateArea());
        }
    }
}

class Square{
    double side;

    double calculateArea()
    {
        return side * side;
    }
}
