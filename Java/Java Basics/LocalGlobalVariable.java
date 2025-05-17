// 5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables

public class LocalGlobalVariable {
    int a = 10; // 
    void localglobalvariable(){
        int a = 20; // Local variable
        System.out.println("Local variable: " + a); // Prints local variable
    }
    public static void main(String[] args) {
        LocalGlobalVariable obj = new LocalGlobalVariable();
        System.out.println("Instance variable: " + obj.a); // Prints instance variable of class
        obj.localglobalvariable(); // Calls the method to print local variable
    }
}
