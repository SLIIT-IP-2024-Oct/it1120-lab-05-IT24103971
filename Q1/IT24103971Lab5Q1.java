import java.util.Scanner;

public class IT24103971Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        double numA = scanner.nextDouble();
        System.out.print("Enter the 2nd integer: ");
        double numB = scanner.nextDouble();
        System.out.print("Enter the 3rd integer: ");
        double numC = scanner.nextDouble();
        
        double largest;
        if(numA>numB && numA>numC) {
        largest = numA;
        }
        else if(numB>numA && numB>numC) {
        largest = numB;
        }
        else {
        largest = numC;
        }
        
        double smallest;
        if(numA<numB && numA<numC) {
        smallest = numA;
        }
        else if(numB<numA && numB<numC) {
        smallest = numB;
        }
        else {
        smallest = numC;
        }
        System.out.println("The largest number: "+largest);
        System.out.println("The smallest number: "+smallest);
    }
}