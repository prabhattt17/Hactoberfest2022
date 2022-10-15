import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {

    static int factorial(int number) {
        if (number==0 || number==1) {
            return 1;
        }

         int val= factorial(number-1)*number;
         return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println("Factorial = "+factorial(in.nextInt())); 
        in.close();
    }
}
