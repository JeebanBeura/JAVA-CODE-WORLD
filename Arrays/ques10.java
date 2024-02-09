/*
Q-10: Given an array of integers, change the value of all odd indexed elements to its second multiple and
increment all even indexed values by 10.
 */
package Arrays;
import java.util.Scanner;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                array[i] += 10;
            }
            else {
                array[i] *= 2;
            }
        }

        System.out.print("After updating values : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
