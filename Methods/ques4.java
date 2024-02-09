/*
Q-4: Write a method to count the number of digits in a number and then print the square of this number.
*/
package Methods;

import java.util.Scanner;
public class ques4 {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to print the square of a number
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int digitCount = countDigits(num);
        System.out.println("Number of digits in " + num + ": " + digitCount);
        printSquare(num);
    }
}
