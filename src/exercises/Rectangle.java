

package exercises;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//scanner is like a helper class
        System.out.println("Enter length of rectangle: ");
        int length = input.nextInt();//reads input as an integer
        System.out.println("Enter width of rectangle: ");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of your rectangle is " + area);

    }
}
