// 6. Print all the static, instance variables in main method

public class StaticInstanceVar {
    static int a = 7, b= 31;
    int c = 10, d = 20;
    public static void main(String[] args) {
        StaticInstanceVar obj = new StaticInstanceVar();
        System.out.println("Static variable a: " + a);
        System.out.println("Static variable b: " + b);
        System.out.println("Instance variable c: " + obj.c);
        System.out.println("Instance variable d: " + obj.d);
    }
}
