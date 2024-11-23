import java.util.Scanner;


public class IT24103971Lab5Q3 {
    //Constants
    static final int roomPerDay = 48000;
    static final int maxDay = 31;
    static final int minDay = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date of reservation: ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date of reservation: ");
        int endDate = scanner.nextInt();
        
        if(startDate && endDate <1 || startDate && endDate >31) {
        System.out.println("Invalid");
        return;
        }
        if(startDate>endDate) {
        System.out.println("Invalid");
        return;
        }
        
        //Calculate the total amount
        int totalAmount = daysReserved*roomPerDay;
        
        System.out.println("Enter the total amount before discount");
        //Calculate the no of days reserved
        int daysReserved = endDate-startDate;
        System.out.println("Enter the no of days stayed: ");
        int discountRate = 0;
        if (daysReserved=<3) {
        discountRate = "no discount";
        }
        else if (daysReserved>=3 && <=4) {
        discountRate = 10; 
        }
        else (daysReserved>=5) {
        discountRate = 20;
        }
        //Calculate dicount
        int dicount = (discountRate/100)*totalAmount;
        //Calculate final amt after dicount
        int finalAmount = totalAmount-discount;
        System.out.println("total amount to be paid"+finalAmount);
    }
}
        
      
