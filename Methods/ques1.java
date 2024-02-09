/*
Q-1: Write a method to print squares of the first n natural numbers, taking n as an argument to the method.
*/

package Methods;
import java.util.Scanner;
public class ques1 {
    public static void squaresOfNumber(int n) { // method to print squares of first n natural numbers
        if (n <= 0) { // we only need to print squares of first n natural numbers
            System.out.println("Please provide a positive integer.");
            return;
        }

        System.out.println("Squares of the first " + n + " natural numbers : ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Square of " + i + " is: " + (i * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        squaresOfNumber(n);
    }
}
