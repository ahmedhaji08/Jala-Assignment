// 8. Write a program to find Armstrong number or not

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;

        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, 3);
            originalNum /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        sc.close();
    }
    
}
