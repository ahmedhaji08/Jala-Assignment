// 10. Write a program to palindrome or not.

import java.util.Scanner;
public class PalindormeOrNot {
    public static void main(String[] args) {
        int num, reversedNum = 0, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        int originalNum = num;
        
        while (originalNum != 0) {
            remainder = originalNum % 10;
            reversedNum = reversedNum * 10 + remainder;
            originalNum /= 10;
        }
        
        if (num == reversedNum) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
        sc.close();
        
    }
    
}
