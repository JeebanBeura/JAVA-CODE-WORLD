/*
Q-7: WAP to find the largest three elements in the array.
 */
package Arrays;
import java.util.Scanner;
public class ques7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thridLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                thridLargest = secondLargest;
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest) {
                thridLargest = secondLargest;
                secondLargest = array[i];
            } else if (array[i] > thridLargest) {
                thridLargest = array[i];
            }
        }

        System.out.println("Largest three elements in the array are: " + largest + " " + secondLargest + " " + thridLargest);
    }
}
