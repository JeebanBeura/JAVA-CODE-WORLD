/*
Q-2: Write a method that takes the radius of a circle as an argument and returns its area.package Methods;
*/
package Methods;
import java.util.Scanner;
public class ques2 {
    public static double calculateArea(double radius) {
        // Area of a circle formula: A = π * r^2
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle : ");
        double radius = sc.nextInt();

        double area = calculateArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}