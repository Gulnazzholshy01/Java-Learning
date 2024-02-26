import java.util.Random;
import java.util.Scanner;


public class guessinggame {

    public static void main(String[] args){

        final int MIN = 0;
        final int MAX = 10;

        Random rand = new Random();
        int randomNum = rand.nextInt(MAX-MIN) + MIN;
        final String TO_HIGH = "To High!", TO_LOW = "To low!", CORRECT_GUESS = "YOU GUESSED CORRECT!!!";
        int count = 0;
        int userGuess;

        Scanner scn = new Scanner(System.in);

        System.out.print("Welcome to the GUESSING GAME! To start, please enter a number between 0 and 10. ");
        userGuess = Integer.parseInt(scn.nextLine());        
        
        while(userGuess < MIN || userGuess > MAX ){
            System.out.print("You entered incorrect value, please enter a number between 0 and 10. ");
            userGuess = Integer.parseInt(scn.nextLine());
        }

        //Looping structure to determine if number is correctly GUESSED!
        while(userGuess != randomNum){

            //Increment count to keep track of the number of guesses
            count++;

            //Selection structure to determine if guess is low, high ot the correct number 
            if(userGuess > randomNum){
                System.out.println(TO_HIGH);     
            }else if(userGuess < randomNum){
                System.out.println(TO_LOW);  
            }
        
        
            // System.out.println(" Your guess is: " + userGuess);
            System.out.println("Number of guesses: " + count);

            //Selection structure 
            if(userGuess != randomNum) {

                System.out.print("Please enter a new number! ");
                userGuess = Integer.parseInt(scn.nextLine());      

                while(userGuess < MIN || userGuess > MAX ){
                    System.out.print("You entered incorrect value, please enter a number between 0 and 10. ");
                    userGuess = Integer.parseInt(scn.nextLine());
                }

            }

                
            //Output Sequence
        }

        System.out.println(CORRECT_GUESS);
        System.out.println("It took " + count + " guesses!");
        System.out.println("Thank you for playing the game!");
    }  
}
