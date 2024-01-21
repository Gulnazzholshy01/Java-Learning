import java.util.Random;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
        
        // create instance of Random class
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);       
        int rand_int3 = rand.nextInt(10);   

        // create a scanner object
        Scanner scnr = new Scanner(System.in);       

        System.out.println("Guess the first number?");
        int guess1 = scnr.nextInt();
  
        System.out.println("Guess the second number?");
        int guess2 = scnr.nextInt();

        System.out.println("Guess the third number?");
        int guess3 = scnr.nextInt();
  
        System.out.println("First random number  = " + rand_int1);
        System.out.println("Second random number 2 = " + rand_int2); 
        System.out.println("Third random number 3 = " + rand_int3);    

        if (rand_int1 == guess1) {
            if (rand_int2 == guess2) {
                if (rand_int3 == guess3) {
                    System.out.println("Amazing, 3 matches, you won 1000000$! Congtatulations!!!");  
                }else {
                    System.out.println("Perfect, 2 matches, you won 1000$! Congtatulations!!");                 
                }
            }else {
                System.out.println("Cool, 1 match, you won 10$! Congtatulations!");  
            }
        }else {
            System.out.println("Unfortunately, you did not guess, try again ...");             
        }

    }
}  

