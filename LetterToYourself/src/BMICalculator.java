/**
 * Created by Rose on 4/9/15.
 */
import java.util.Scanner;

public class BMICalculator
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double ft, in, h, lb, bmi;

        System.out.print("Your height in feet: ");
        ft = keyboard.nextDouble();
        ft = ft * 12;

        System.out.print("Your height in inches: ");
        in = keyboard.nextDouble();

        h = (ft + in) * .025;

        System.out.print( "Your weight in lbs: ");
        lb = keyboard.nextDouble();
        lb *= .45;

        bmi = lb / (h*h);

        System.out.println("Your BMI is " + bmi);
    }

}
