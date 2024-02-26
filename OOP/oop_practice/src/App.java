import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, Renter!");
        // Renter renterOne = new Renter(); //Instantiation. We create a new instance of a Renter

        // Renter renterTwo = new Renter("May 3rd", "Naperville", "Illinois");

        // renterOne.setName("Gulnaz"); 
        // renterOne.setCity("Chicago");
        // renterOne.setPreferredRegion("Naperville");
        // renterOne.setEmail("renter1@mail.ru");
        // renterOne.setMoveInDate("August 17");
        // renterOne.setPreferredNumBaths(2);
        // renterOne.setPreferredNumBedrooms(2);  

        // renterOne.outputNameEmail();
        // System.out.println("Renter's Name: " + renterOne.getName() + " Preferred Bed Count: " + renterOne.getPreferredNumBedrooms());

        // System.out.println(renterOne);
        // System.out.println(renterTwo);


        // Declare and create an array to hold two Customer instances
        Customer[] customers = new Customer[2];
        Scanner scanner = new Scanner(System.in);


        // Loop to populate each Customer instance
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Enter details for Customer " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Weight in Kilos: ");
            double weightKilos = scanner.nextDouble();
            scanner.nextLine(); 

            // Create Customer instance and store it in the array
            customers[i] = new Customer(name, email, weightKilos);
        }

        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Weight in Kilos: " + customer.getWeightKilos());
            System.out.println("Weight in Pounds: " + customer.convertWeighttoPounds());
            System.out.println();
        }

        // Close the scanner
        scanner.close();


    }
}

