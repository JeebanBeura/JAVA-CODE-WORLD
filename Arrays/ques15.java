/*
Q-15: Count the number of triplets whose sum is equal to the given value x.
 */
package Arrays;
import java.util.Scanner;
public class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter x : ");
        int x = sc.nextInt();

        int countTriplets = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if(array[i] + array[j] + array[k] == x){
                        countTriplets++;
                    }
                }
            }
        }

        System.out.println("The number of triplets with sum " + x + " is : " + countTriplets);
    }
}
