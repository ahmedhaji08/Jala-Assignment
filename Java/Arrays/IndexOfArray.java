// 3. Write a program to find the index of an array element

import java.util.Scanner;
public class IndexOfArray {
    static int indexOf(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find its index: ");
        int x = sc.nextInt();
        int index = indexOf(arr, x);
        if(index != -1){
            System.out.println("The index of " + x + " is: " + index);
        } else {
            System.out.println(x + " is not found in the array.");
        }
        sc.close();
    }
    
}
