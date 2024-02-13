import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        //Call or Invoke a welcomeMessage method
        welcomeMessage();
        int guessedNumber = getGuess(scn);
        System.out.println("You entered "+ guessedNumber);
        System.out.println("The program is ending");
    }

    //Defining a  method 
    public static void welcomeMessage() {
        System.out.println("Welcome Class!");     
    }

    //Defining a method
    public static int getGuess(Scanner scn) {
        //Local variable
        int guessedNumber; 
        System.out.print( "Guess how many methods were usewd to create this program? ");
        guessedNumber = Integer.parseInt(scn.nextLine());
        return guessedNumber;
    }
}
