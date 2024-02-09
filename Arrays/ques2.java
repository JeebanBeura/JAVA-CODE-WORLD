/*
Q-2: Find the second largest element in the given Array in one pass.
*/

package Arrays;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yhe size of the arrays:- ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the element of the arrays:- ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
            // max = Math.max(max,arr[i])
        }

        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max != arr[i]){
                if(smx<arr[i]){
                    smx = arr[i];
                }
            }
        }
        System.out.println("Second largest element in the array is:- "+smx);
    }
}
