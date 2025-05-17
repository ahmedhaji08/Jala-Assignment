// 16. Write a function to get the difference of largest and smallest value

import java.util.Scanner;
public class DiffLargeAndSmall {
    static int diffLargeAndSmall(int arr[]) {
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return largest - smallest;
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
        System.out.println("The difference of largest and smallest value is: " + diffLargeAndSmall(arr));
        sc.close();
    }
}
