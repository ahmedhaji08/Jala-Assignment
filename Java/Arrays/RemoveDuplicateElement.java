// 12. Write a method to remove duplicate elements from an array

import java.util.Scanner;
public class RemoveDuplicateElement {
    static void removeDuplicates(int arr[]) {
        int n = arr.length;
        boolean[] seen = new boolean[100]; // Assuming the elements are in the range 0-99
        int j = 0; // Index for the new array
        for (int i = 0; i < n; i++) {
            if (!seen[arr[i]]) {
                seen[arr[i]] = true;
                arr[j++] = arr[i];
            }
        }
        // Resize the array to remove duplicates
        int[] newArr = new int[j];
        for (int i = 0; i < j; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicates(arr);
        sc.close();
    }
}
