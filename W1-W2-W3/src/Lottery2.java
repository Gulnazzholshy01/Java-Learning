// A Java program to demonstrate random number generation
// using java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class Lottery2 {
	public static void main(String[] args) {
        
        //DECLARTION
        int randGuessOne, randGuessTwo, randGuessThree, userGuessOne, userGuessTwo, userGuessThree;
        final int MAX_RANGE = 9, ONE_MATCH_AWARD = 10, TWO_MATCH_AWARD = 100, THREE_MATCH_AWARD = 1000, THREE_MATCH_IN_ORDER = 1000000;
        int userAward = 0; 
        boolean firstNumberGuess = false, secondNumberGuess = false, thirdNumberGuess = false;

        // create instance of Random class
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);

        //Generate the three random numbers
        randGuessOne = rand.nextInt(MAX_RANGE);
        randGuessTwo = rand.nextInt(MAX_RANGE);    
        randGuessThree = rand.nextInt(MAX_RANGE);

        //Generate User Guess
        System.out.println("Guess the first number?");
        userGuessOne = Integer.parseInt(scn.nextLine());
  
        System.out.println("Guess the second number?");
        userGuessTwo = Integer.parseInt(scn.nextLine());

        System.out.println("Guess the third number?");
        userGuessThree = Integer.parseInt(scn.nextLine());
        
        //Selection structure to determine if user number matches any of the three randon numbers.
        if(userGuessOne == randGuessOne || userGuessOne == randGuessTwo || userGuessOne == randGuessThree) {
            firstNumberGuess = true; 
        }
        if(userGuessTwo == randGuessOne || userGuessTwo == randGuessTwo || userGuessTwo == randGuessThree) {
            secondNumberGuess = true; 
        }
        if(userGuessThree == randGuessOne || userGuessThree == randGuessTwo || userGuessThree == randGuessThree) {
            thirdNumberGuess = true; 
        }
        
        
        
        //Determine if one guessed number matches random number
        if(firstNumberGuess == true || secondNumberGuess == true || thirdNumberGuess == true){
            userAward = ONE_MATCH_AWARD;
        }
        //Determine if two guessed number matches random numbers
        if((firstNumberGuess == true && secondNumberGuess == true) || (firstNumberGuess == true && thirdNumberGuess == true) || (thirdNumberGuess == true && secondNumberGuess == true)){
            userAward = TWO_MATCH_AWARD;
        }
        //Determine if three guessed number matches random numbers
        if(firstNumberGuess == true && secondNumberGuess == true && thirdNumberGuess == true){
            userAward = THREE_MATCH_AWARD;
        }
        //Determine if three guessed number matches random numbers in order
        if(userGuessOne == randGuessOne && userGuessTwo == randGuessTwo && userGuessThree == randGuessThree){
            userAward = THREE_MATCH_IN_ORDER;
        }

        System.out.println("The three generated ramdom numbers are: \t" + randGuessOne + " " + randGuessTwo + " " + randGuessThree);
        System.out.println("Your entered numbers are:\t " + userGuessOne + " " + userGuessTwo + " " + userGuessThree);

        //Output Award amount
        if(userAward == 0) {
            System.out.println("Sorry, you did not guess any of the numbers right");
        }else {
            System.out.println("Your Award amount is: \t " + userAward);
        }
        }
    } 

 

