import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        Square length = new Square();
        System.out.print("Enter a floating point number for the side of a square:  ");
        length.setSideLength( cin.nextDouble());
        System.out.println("The length of the side of the square is: " + length.getSideLength());
    }
}
