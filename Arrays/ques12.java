/*
Q-12: If an array arr contains n elements, then check if the given array is a palindrome or not .
 */
package Arrays;
import java.util.Scanner;
public class ques12 {
    public static boolean isPalindrome(int[] array){ // method to check whether an array is palindrome or not
        int i = 0, j = array.length - 1;
        while (i <= j) {
            if(array[i++] != array[j--]){
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
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        if(isPalindrome(array)){
            System.out.println("Palindrome!!");
        }
        else{
            System.out.println("Not a palindrome!!");
        }
    }
}
