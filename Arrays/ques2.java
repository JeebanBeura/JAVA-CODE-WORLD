/*
Q-2: Find the second largest element in the given Array in one pass.
*/

package Arrays;
import java.util.Scanner;
public class ques2 {
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

        for (int i = 0; i < array.length; i++) {
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }
            if(array[i] > secondLargest && array[i] != largest){
                secondLargest = array[i];
            }
        }
        System.out.println("Second largest element in the array is:- "+smx);
    }
}
