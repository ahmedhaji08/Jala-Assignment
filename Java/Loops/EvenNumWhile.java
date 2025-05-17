// 6. Write a program to print even number between 10 and 100 using while
public class EvenNumWhile {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Even numbers between 10 and 100 are:");
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2; // Increment by 2 to get the next even number
        }
    }
}
