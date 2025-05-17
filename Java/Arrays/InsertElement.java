// 7. Write a function to insert an element at a specific position in the array

import java.util.*;
public class InsertElement {
    static int[] insertElement(int arr[], int x, int pos){
        int newArr[] = new int[arr.length + 1];
        for(int i=0; i<pos; i++){
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for(int i=pos; i<arr.length; i++){
            newArr[i+1] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        int x = sc.nextInt();
        System.out.print("Enter the position to insert the element: ");
        int pos = sc.nextInt();
        if(pos < 0 || pos > arr.length){
            System.out.println("Invalid position");
            sc.close();
            return;
        }
        int newArr[] = insertElement(arr, x, pos);
        System.out.println("The new array after inserting " + x + " at position " + pos + " is: ");
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
        sc.close();
    }
}
