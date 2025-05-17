// 12. Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;
public class MaleAndFemale {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M or F: ");
        char gender = sc.next().charAt(0);
        switch(gender){
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
