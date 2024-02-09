/*
Q-9: Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
 */
package Arrays;
import java.util.Scanner;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                evenSum += array[i];
            }
            else{
                oddSum += array[i];
            }
        }

        System.out.println("EvenSum - OddSum = " + (evenSum - oddSum));
    }
}
