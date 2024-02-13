public class App {
    public static void main(String[] args) throws Exception {
        // String[] numbers = {"one", "two", "three"};
        // System.out.println(numbers[2]);

        // String[] groceries = {"egs", "milk", "bread", "cheese", "butter"};
        // groceries[2] = "strawberries";
        // System.out.println(groceries[2]);


        // //Accessing each individual element
        // int[] myArray = new int[5];
        // myArray[0] = 1;
        // myArray[1] = 4;     
        // myArray[2] = 9;
        // myArray[3] = 16;
        // myArray[4] = 25;

        // //Another way to use the collection initializer 
        // int[] myArrayNew = {1,4,9,16,25};

        // final String [] BRANDS = {"Adidas", "IKEA", "Puma", "Sony", "Nokia"};
        // for(int x = 2; x < BRANDS.length; x++){
	    //     System.out.print(BRANDS[x] + " ");


        String [][] RESTAURANTS = {
            {"Portillos", "Giordanos", "Grand Lux Cafe"},
            {"Five Guys","Lou Malnati's", "The Purple Pig" },
            {"Shake Shack", "Beggars Pizza", "Big Bowl" }
          };
          System.out.println(RESTAURANTS[2][0+1]); 
          RESTAURANTS[2][0+1] = "Connie's Pizza";
          System.out.println(RESTAURANTS[2][0+1]);            
}
    }

