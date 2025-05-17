// 2. Write a method for increment and decrement operators(++, --)

public class IncandDec {
    static void inc(int a) {
        System.out.println("Increment: " + (++a));
    }

    static void dec(int a) {
        System.out.println("Decrement: " + (--a));
    }

    public static void main(String[] args) {
        int a = 7;
        inc(a);
        dec(a);
    }
    
}
