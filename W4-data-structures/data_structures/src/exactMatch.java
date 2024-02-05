public class exactMatch {
    
    //Linear search problem
    public static void main(String[] args) {
        
        String[] candyBars = {"Snickers", "Twix", "Almond joy", "100 Grand"};
        double[] candyBarsPrices = {1.00, 1.25, 0.95, 2.00} ;
        int item = 0;
        boolean isFound = false; //Flag found
        int x  = 0;
        
        while(x < candyBars.length){
            //Decision structure 
            if(candyBars[x].equals("Almond joy")){
                isFound = true;
                item = x;
                x = candyBars.length;


            }
            x++; //Incrementing variable x
        }

        //Decision
        if(isFound) {
            System.out.println("Item in array");
            System.out.println("The item is  " + candyBars[item] + " for the price of $" + candyBarsPrices[item]);           
        }else{
            System.out.println("Item in NOT array");
        }

    }
}
