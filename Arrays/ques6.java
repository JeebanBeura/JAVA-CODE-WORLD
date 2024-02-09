/*
Q-6: Count the number of elements strictly greater than x.
 */
package Arrays;
import java.util.Scanner;
public class ques6 {
    public static int countGreaterThan(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");  // take input of array elements
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter x : ");
        int x = sc.nextInt();

        int count = countGreaterThan(array, x);
        System.out.println("Number of elements greater than " + x + ": " + count);
    }
}
