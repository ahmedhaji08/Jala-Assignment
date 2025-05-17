// 4. Write a program to print the odd and even numbers.

import java.util.Scanner;
public class EvenAndOddNum {
    static void evenNum(int n){
        System.out.println("Even numbers from 0 to " + n + " are:");
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    static void oddNum(int n){
        System.out.println("Odd numbers from 1 to " + n + " are:");
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); 
        System.out.println("Enter the value of n: "); 
        int n = num.nextInt(); 
        evenNum(n); 
        oddNum(n); 
        num.close(); 
    }
}
