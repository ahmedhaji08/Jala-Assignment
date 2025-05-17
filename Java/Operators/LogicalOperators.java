// 5. Programs on Logical AND,OR operator and Logical NOT operator

public class LogicalOperators {
    public static void main(String[] args) {

    int a = 10, b = 20, c = 30;
    // Logical AND Operator
    System.out.println("Logical AND: " + ((a > b) && (a>c)) +","+ ((a < b) && (a<c)) + "," + ((a > b) && (a<c)));
    // Logical OR Operator
    System.out.println("Logical OR: " + ((a > b) || (a>c)) +","+ ((a < b) || (a<c)) + "," + ((a > b) || (a<c)));
    // Logical NOT Operator
    System.out.println("Logical NOT: " + (!(a > b)) + "," + (!(a < b)) + "," + (!(a > c)));
     

    
    }
}
 