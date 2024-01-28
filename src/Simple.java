import java.util.Scanner;

public class Simple {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //DECLARATIONS 
        int favNum;
        int count = 0;
        final int EXIT = -1; //SENTINEL value
        Scanner scn = new Scanner(System.in);

        System.out.println("This program allow you enter up to 10 numbers");
        System.out.println("Enter a number or a -1 to exit program.");
        favNum = Integer.parseInt(scn.nextLine());

        while(favNum != EXIT && count<10){ //Variable tested or expression 
            System.out.println(favNum);
            System.out.println("Enter a number or a -1 to exit program.");
            favNum = Integer.parseInt(scn.nextLine());  
            count++; 
        }
        System.out.println("Exellent program!");

    }
}
