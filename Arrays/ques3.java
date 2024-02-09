/*
Q-3: Find the minimum value out of all elements in the array.
*/
package Arrays;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");  // take input of array elements
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < smallest){ // update value of smallest if array[i] is smaller than current smallest
                smallest = array[i];
            }
        }

        System.out.println("Smallest element in the array is " + smallest);
    }
}
