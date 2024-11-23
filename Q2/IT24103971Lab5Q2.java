import java.util.Scanner;

public class IT24103971Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of new members introduced ");
        int newMembers = scanner.nextInt();
        if(newMembers <0) {
        System.out.println("No prize");
        }
        else {
         String prize;
         switch (newMembers) {
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrealla";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling chair";
                break;
            default:
                prize = "Headphone";
                break;
        }
        System.out.println("prize: "+prize);
        }
    } 
}