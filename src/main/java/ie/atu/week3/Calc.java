package ie.atu.week3;
import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
        // methods //
        System.out.println("Please enter the base number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the exponent: ");
        int b = sc.nextInt();
        System.out.println("Please enter an operation: ");
        String op = sc.next();
        switch(op)
        {
            case "exponent": exponent(a,b); break;
            default: System.out.println("Invalid operation"); break;

        }

    }
    public static void exponent(int a, int b)
    {
        double sum = Math.pow(a,b);
        System.out.println("The sum is: " + sum);
    }
}
