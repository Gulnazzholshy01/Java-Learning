import java.util.Scanner;


public class methodOverloading {
    public static void main(String[] args){
        //Declarations
        Scanner input = new Scanner(System.in);
        double balance, cost;
        final double FIXED_ITEM_COST = 6.99, DISCOUNT_OVER_TWENTY = .10;
        int numberOfShirts;

        System.out.println("Please, enter the number of shirts you would like fry cleaned");
        numberOfShirts = Integer.parseInt(input.nextLine());

        //Calculating cost
        cost = numberOfShirts * FIXED_ITEM_COST;

        //Determing which bill to count 
        if(cost <= 20.00){
            printBill(cost);
        }else{
            printBill(cost, DISCOUNT_OVER_TWENTY);
        }

    }

    public static void printBill(double bal){
        System.out.println("Thank you for your order!");
        System.out.println("Please, remit: " + bal);
    }

    public static void printBill(double bal, double discountRate){
        //Declaring Variable
        double newBal;
        newBal = bal - (bal * discountRate);
        System.out.println("Thank you for your order!");
        System.out.println("Please, remit: " + newBal);
    }    
}
