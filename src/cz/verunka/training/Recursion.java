package cz.verunka.training;

/**
 * Created by Veronika on 15.06.2016.
 */
public class Recursion {

    public int triangularNumber(int number) {

        if (number == 1) {
            System.out.println("return 1");
            return 1;
        } else {
            int result = number + triangularNumber(number - 1);
            System.out.println("return " + result + " + " + (number+1));
            return result;
        }
    }

    public int factorial(int number) {

        if (number == 1) {
            System.out.println("fact of " + number + " is: 1");
            return 1;
        } else {
            int result = number*(factorial(number-1));
            System.out.println("fact of " + number + " is " + result);
            return result;
        }
    }

    public void drawSquares(int howMany) {

        for (int i=0; i<howMany; i++) {
            System.out.print("--- ");
        }
        System.out.println();

        System.out.print("");
        for (int i=0; i<howMany; i++) {
            System.out.print("|" + howMany + "| ");
        }
        System.out.println();

        for (int i=0; i<howMany; i++) {
            System.out.print("--- ");
        }
        System.out.println();
    }

    public void calcSquares(int number) {

        for (int i=1; i<=number; i++) {
            for (int j=1; j<i; j++) {

            }
            drawSquares(i);
        }
    }
}
