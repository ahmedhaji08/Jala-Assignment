// 3. Print static variables in Instance methods

public class PrintStaticInIns {
    static int a =31;
    void instancMethod(){
        System.out.println("Static variable: " + a);
    }
    public static void main(String[] args) {
        PrintStaticInIns obj = new PrintStaticInIns();
        obj.instancMethod();
    }
}
