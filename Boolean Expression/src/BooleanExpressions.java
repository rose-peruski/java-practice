import java.util.Scanner;

/**
 * Created by Rose on 4/15/15.
 */
public class BooleanExpressions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean a, b, c, d, e, f;
        double x, y;

        System.out.print("Give me two numbers. First: ");
        x = keyboard.nextDouble();
        System.out.print( "Second: ");
        y = keyboard.nextDouble();


        a = (x < y);
        b = (x <= y);
        c = (x == y);
        d = (x != y);
        e = (x > y);
        f = (x>= y);

        System.out.println(x + " is less than " + y + ": " + a);
        System.out.println(x + " is less than or Equal to " + y + ": " + b);
        System.out.println(x + " is equal to " + y + ": " + c);
        System.out.println(x + " is not eual to " + y + ": " + d);
        System.out.println(x + " is Greater than " + y + ": " + e);
        System.out.println(x + " is Greater than or equal to " + y + ": " + f );
        System.out.println();

        System.out.println( !(x < y) + " " + (x>=y));

        d = (x != y);
        e = (x > y);
        f = (x>= y);

        System.out.println(x + " is less than " + y + ": " + a);
        System.out.println(x + " is less than or Equal to " + y + ": " + b);
        System.out.println(x + " is equal to " + y + ": " + c);
        System.out.println(x + " is not eual to " + y + ": " + d);
        System.out.println(x + " is Greater than " + y + ": " + e);
        System.out.println(x + " is Greater than or equal to " + y + ": " + f );
        System.out.println();

        System.out.println( !(x < y) + " " + (x>=y));

    }

}
