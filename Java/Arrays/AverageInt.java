// 2. Write a function to calculate the average value of an array of integers

public class AverageInt {
    static void average(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int avg = (int)sum / arr.length;
        System.out.println("The average of the array is: " + avg);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        average(arr);
    }

}
