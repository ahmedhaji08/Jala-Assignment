// 7. Print the smaller and larger number

import java.util.Scanner;
public class LargerSmallerNum {
    public static void main(String[] args) {
        int a, b;
        Scanner num = new Scanner(System.in); 
        System.out.println("Enter the value of a: "); 
        a = num.nextInt();  
        System.out.println("Enter the value of b: "); 
        b = num.nextInt(); 
        int min = (a < b) ? a : b; // Ternary operator to find minimum
        int max = (a > b) ? a : b; // Ternary operator to find maximum
        System.out.println("Minimum: " + min); // Print minimum
        System.out.println("Maximum: " + max); // Print maximum 
        // Using if-else statement to find minimum
        if (a > b) {
            System.out.println("Larger Number: " + a);
        } else {
            System.out.println("smaller Number: " + a);
        }
        if(b > a) {
            System.out.println("Larger Number: " + b);
        } else {
            System.out.println("smaller Number: " + b);
        }
        num.close(); 
    }
}