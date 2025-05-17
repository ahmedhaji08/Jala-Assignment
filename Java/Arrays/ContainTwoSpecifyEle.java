// 17. Write a method to verify if the array contains two specified elements(12,23)

import java.util.Scanner;
public class ContainTwoSpecifyEle {
    static boolean containsTwoElements(int arr[], int ele1, int ele2) {
        boolean foundEle1 = false;
        boolean foundEle2 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele1) {
                foundEle1 = true;
            }
            if (arr[i] == ele2) {
                foundEle2 = true;
            }
        }

        return foundEle1 && foundEle2;
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
        int ele1 = 12;
        int ele2 = 23;
        if (containsTwoElements(arr, ele1, ele2)) {
            System.out.println("The array contains both " + ele1 + " and " + ele2);
        } else {
            System.out.println("The array does not contain both " + ele1 + " and " + ele2);
        }
        sc.close();
    }
}
