// 5. Write a function to remove a specific element from an array

import java.util.Scanner;
public class RemoveSpecificElement {
    static int[] removeElement(int arr[], int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        int newArr[] = new int[arr.length - count];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != x){
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 53};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to remove: ");
        int x = sc.nextInt();
        int newArr[] = removeElement(arr, x);
        System.out.println("The new array after removing " + x + " is: ");
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
        sc.close();
    }
}
