/*
Q-17: Find the first non-repeating element in the array .
 */
package Arrays;
import java.util.Scanner;
public class ques17 {
     public static int findRepeating(int[] array){
        boolean isRepeated;

        for (int i = 0; i < array.length; i++) {
            isRepeated = false;
            for (int j = i + 1; j < array.length; j++) { // Check whether an element appears twice in the array.
                if(array[i] == array[j]){
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated) return array[i]; // If element doesn't appear more than once, that is our answer.
        }

        return -1;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        
        int array[] = new int[size];
        
        System.out.print("Enter array elements : ");  
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int repeatingElement = findRepeating(array);
        System.out.println("First non-repeating element in the array is : " + repeatingElement);
    }
}
