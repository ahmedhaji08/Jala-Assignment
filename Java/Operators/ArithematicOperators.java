// ArithematicOperators.java
// 1. Write a function for arithmetic operators(+,-,*,/)

public class ArithematicOperators {
    static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    static void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    static void div(int a, int b) {
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        int a = 31, b = 7;
        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
    }
}
