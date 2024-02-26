
import java.util.*; 
public class Main

{
	public static void main(String[] args) {
	
        //Declaring TWO-DIMENTIONAL ARRAY for CandyNames and CandyPrices
        String[][] candyNames = new String[2][2];
        double [][] candyPrices = new double[2][2];

        //Creating an ArrayList
		ArrayList<Candy> candyList = new ArrayList<>();

        //Instantiating a Scanner object
        Scanner scanner = new Scanner(System.in);

        //Loop to populate each Car
        for(int i = 0; i < candyNames.length; i++){ //Iterate through ROW
            for(int x = 0; x < candyNames[i].length; x++){ //Iterate through COLUMN
                System.out.println(" ");  
                System.out.println("Enter the Name of Candy " + "Row "+ (i+1)+ ", " + "Column "+ (x+1) + ":");  
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.println("Enter the Price of Candy " + "Row "+ (i+1)+ ", "+ "Column "+ (x+1) + ":");  
                System.out.print("Price: ");
                double price = Double.parseDouble(scanner.nextLine()); 


                // Populate the arrays
                candyNames[i][x] = name;
                candyPrices[i][x] = price;


                // Create a Candy object and add it to the ArrayList
                Candy aCandy = new Candy(name, price);
                candyList.add(aCandy);
            }

        }

        removeCandy(candyNames,candyList);
        scanner.close();     
	}



    public static void removeCandy(String[][] candyNames, ArrayList<Candy> candyList){
        Scanner scn = new Scanner(System.in);


        // Output the list of candies
        System.out.println("List of Candies:");
        for (int i = 0; i < candyList.size(); i++) {
            System.out.println((i + 1) + ". " + candyList.get(i).getName());
        }
            
        System.out.println("Select a candy Name to remove: " );   
        String candyToRemove   = scn.nextLine();

        //Decrement through the list and find the object with value from User Input
		for(var i = candyList.size() -1; i >= 0; i--)
		{
			if (candyList.get(i).getName().equals(candyToRemove))
			{
				candyList.remove(i);    
			}     
		}

		//Output the list using lambda Expression
		candyList.forEach(x -> System.out.println(x));
        System.out.println("Total Number of Candies: "+ candyList.size());
        
    }
}