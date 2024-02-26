import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        

  
        //Declaring Array for Cars
        Car[] cars = new Car[2];

        Scanner scanner = new Scanner(System.in);

        //Loop to populate each Car
        for(int i = 0; i < cars.length; i++){
            System.out.println(" ");     
            System.out.println("Enter the details of Car " + (i+1)+ ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();      
            System.out.print("Price: "); 
            double price = Double.parseDouble(scanner.nextLine());    
            System.out.println(" ");      
            
            //Instantiate each car 
            cars[i] = new Car(name, model, price);
        }

        for(int i = 0; i < cars.length; i++){

            System.out.println(" ");     
            System.out.println("Name " + cars[i].getName());
            System.out.println("Model " + cars[i].getModel()); 
            System.out.println("Price $" + cars[i].getPrice());   
            System.out.println("Discounted Price $" + cars[i].discountPrice());
            System.out.println(" ");                             
        }


 
    }


}
