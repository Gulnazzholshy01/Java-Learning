
import java.util.Random;
import java.util.Scanner;
public class randomguess
{
	public static void main(String[] args) {
		
	//DECLARATIONS
	final int MIN = 0; //Declaring and intializing minimum value [SEQUENCE]
        final int MAX = 10;//Declaring and initializing maximum value [SEQUENCE]
        Random rand = new Random(); //Declaring and instantiating Random Object [SEQUENCE]
        int randomNum = rand.nextInt(MAX-MIN) + MIN; //Getting value between 0 and 10 [SEQUENCE]
        final String TO_HIGH = "To High!", TO_LOW = "To Low", CORRECT_GUESS = "YOU GUESSED CORRECTLY";
        int count = 0; //Declaring and intializing variable that will keep track or attempts [SEQUENCE]
        int userGuess;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Welcome, to the guess number game.");
        
        
        //Looping structure to determine if number is correctly GUESSED
        do{
            System.out.print("Enter a number: ");
            userGuess = Integer.parseInt(scn.nextLine());
            //Looping structure that will enforce a number between 0 and 10. Defensive Programming  
            while(userGuess < MIN || userGuess > MAX){
                System.out.println("Invalid number entry, please enter a number between 0 and 10 ");
                System.out.print("Please enter new number: ");
                 userGuess = Integer.parseInt(scn.nextLine());
    
            }
            
            //Increment count to keep track of the number of guesses
            count++;
            
            //SELECTION STRUTURE to determine if guess is to low, to high or the correct number.
            if(userGuess > randomNum){
                System.out.println(TO_HIGH);
            }else if(userGuess < randomNum){
                System.out.println(TO_LOW);
            }
            
            //OUTPUT [SEQUENCE]
            System.out.println("The random number is: " + randomNum);
            System.out.println("Your guess: " + userGuess);
            System.out.println("Number of guesses: " + count);
            System.out.println(" ");

            
        }while(userGuess !=  randomNum);
        
        System.out.println("");
        System.out.println("*************************************");
        System.out.println(CORRECT_GUESS);
        System.out.println("The random number is: " + randomNum);
        System.out.println("Your guess: " + userGuess);
        System.out.println("It took you " + count + " guesses");
        System.out.println("Thanks for playing the Random Guess number game"); //Closing message [SEQUENCE] 
	}
}