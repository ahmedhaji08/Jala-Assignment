// 10. Write a function to find the duplicate values of an array

import java.util.Scanner;
public class DuplicateElement {
    static void findDuplicates(int arr[]) {
        boolean[] seen = new boolean[100]; // Assuming the elements are in the range 0-99
        System.out.println("Duplicate elements are: ");
        for (int i = 0; i < arr.length; i++) {
            if (seen[arr[i]]) {
                System.out.print(arr[i] + " ");
            } else {
                seen[arr[i]] = true;
            }
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
        findDuplicates(arr);
        sc.close();
    }
}
