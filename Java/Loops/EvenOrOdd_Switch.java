// 11. Program to check whether a number is EVEN or ODD using switch statement

import java.util.Scanner;
public class EvenOrOdd_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number.");
                break;
            case 1:
                System.out.println(num + " is an odd number.");
                break;
            default:
                System.out.println("Invalid input.");
        }
        
        sc.close();
    }
}
