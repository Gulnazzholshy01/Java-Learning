import java.util.Scanner;

public class fishmethod {
    
    //Linear search problem
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String[] food = {"nuts", "fish", "lentils", "whole grains", "beans", "olive oil", "eggs", "yogurt"};
        getItems(food);
        selectItem(food, scn);
        
    }

    public static void getItems(String[] food){
        int x  = 0;
        while(x < food.length){
            System.out.println(" Enter " + x + " for " + food[x]);
            x++; //Incrementing variable x           
        }
    }
    

    public static void selectItem(String[] food, Scanner scn) {
        int userInput;

        System.out.println("Enter the number of item to pick up?");
        userInput = Integer.parseInt(scn.nextLine());
        System.out.println("Your selected item: " + food[userInput]);
    }
    
}