/*
Q-11:. Find the unique number in a given Array where all the elements are being repeated twice with one value
being unique.
 */
package Arrays;
import java.util.Scanner;
public class ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int uniqueElement = 0;

        for (int i : array) {
            uniqueElement = uniqueElement ^ i; // a XOR 0 = a and a XOR a = 0
        }

        System.out.println("Unique element in the array is : " + uniqueElement);
    }
}
