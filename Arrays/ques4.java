/*
Q-4: WAP to find the duplicate elements from the given array of elements.
 */
package Arrays;
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements : ");  // take input of array elements
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.err.print("The duplicate elements are : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    System.out.print(array[i] + " "); // print the duplicate elements
                    break;
                }
            }
        }

    }

    public static class ques9 {
    }
}
