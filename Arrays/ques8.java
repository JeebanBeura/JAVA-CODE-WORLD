/*
Q-8: Check if the given array is sorted or not
 */
package Arrays;
import java.util.Scanner;
public class ques8 {
    public static boolean isSorted(int[] array){ // method to check whether array is sorted or not
        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[i - 1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < array.length; i++) { // take array input
            array[i] = sc.nextInt();
        }

        if(isSorted(array)){ // print not sorted if array is not sorted
            System.out.println("Sorted!!");
        }
        else {
            System.out.println(" not Sorted!!");
        }
    }
}
