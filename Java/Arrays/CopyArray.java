// 6. Write a function to copy an array to another array

import java.util.Scanner;
public class CopyArray {
   static void copy(int arr1[], int arr2[]) {
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        copy(arr1, arr2);
        System.out.println("The copied array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr2[i] + " ");
        }
        sc.close();
   } 
}
