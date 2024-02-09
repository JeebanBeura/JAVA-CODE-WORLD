/*
Q-3: Given two numbers a and b, write a method to print all odd numbers between them.
*/
package Methods;

import java.util.Scanner;
public class ques3 {
    public static void printOddNumIBetween(int a,int b){
        System.out.print("Odd numbers between " + a + " and " + b + " are : ");
        for (int i = a; i < b; i++) {
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number :- ");
        int a = sc.nextInt();

        System.out.println("Enter The Sec Number :- ");
        int b = sc.nextInt();

        printOddNumIBetween(a, b);
    }
}
