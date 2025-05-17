// 4. Write a program to find the two numbers equal or not.

import java.util.Scanner;

public class EqualNotEqual {

    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = num.nextInt();
            System.out.println("Enter second number: ");
            int b = num.nextInt();
            if (a == b) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }
    }
}