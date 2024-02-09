/*
Q-5: WAP to find the smallest missing positive element in the sorted Array. (take the array as input)
 */
package Arrays;
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        
        int array[] = new int[size];
        
        System.out.print("Enter array elements : ");  
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int temp;
        
        for (int i = 0; i < array.length; i++) {
            while(1 <= array[i] && array[i] <= size && array[i] != array[array[i] - 1]){
                temp = array[i];
                array[i] = array[temp - 1];
                array[temp - 1] = temp;
            }
             
        }

        for (int i = 0; i < size; i++) {
            if (array[i] != i + 1){ 
                System.out.print("Missing integer is : " + (i + 1));
                break;
            }
        }
    }
}
