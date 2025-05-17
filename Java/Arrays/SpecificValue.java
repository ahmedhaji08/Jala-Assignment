// 4. Write a function to test if array contains a specific value

 import java.util.Scanner;
public class SpecificValue {
    static boolean contains(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to check: ");
        int x = sc.nextInt();
        if(contains(arr, x)){
            System.out.println("The array contains " + x);
        } else {
            System.out.println("The array does not contain " + x);
        }
        sc.close();
    }
    
}
