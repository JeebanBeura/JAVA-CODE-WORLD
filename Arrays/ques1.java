/*
Q-1: Calculate the product of all the elements in the given array.
*/
package Arrays;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];
        int product = 1;

        System.out.print("Enter array elements : ");  // take input of array elements
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i : array) { // find product of all the elements of the array
            product *= i;
        }

        System.out.println("Product of all elements of the array is : " + product);
    }
}
