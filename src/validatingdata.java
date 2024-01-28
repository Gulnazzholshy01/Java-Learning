import java.util.Scanner;

public class validatingdata {
    public static void main(String[] args) throws Exception {

        //DECLARATIONS 
        int favNum;
        int count = 0;
        final int EXIT = -1; //SENTINEL value
        Scanner scn = new Scanner(System.in);

        System.out.println("This program allow you enter up to 10 numbers");
        System.out.print ("Enter a number or a -1 to exit program: ");
        favNum = Integer.parseInt(scn.nextLine());


        //Validating Data
        while(favNum <= 0 || favNum >= 100){
            System.out.println("Invalid Number, please enter a number between 1 and 99 ");
            System.out.print("Enter a number or a -1 to exit program: ");
            favNum = Integer.parseInt(scn.nextLine());
        }

        while(favNum != EXIT && count<10){ //Variable tested or expression 
            System.out.println(favNum);
            System.out.println("Enter a number or a -1 to exit program.");
            favNum = Integer.parseInt(scn.nextLine());  
            count++; 
            
            while(favNum <= 0 || favNum >= 100){
                System.out.println("Invalid Number, please enter a number between 1 and 99 ");
                System.out.print("Enter a number or a -1 to exit program: ");
                favNum = Integer.parseInt(scn.nextLine());
            }
        }
        System.out.println("Exellent program!");

    }
}
