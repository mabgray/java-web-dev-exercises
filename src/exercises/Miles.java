package exercises;
import java.util.Scanner;
public class Miles {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of miles: ");
        int miles = input.nextInt();
        System.out.println("Enter the amount of gallons of gas: ");
        int gallonsOfGas = input.nextInt();
        int milesPerGallon = gallonsOfGas / miles;
        System.out.println("You are getting " + milesPerGallon + " miles per gallon");

    }
}
