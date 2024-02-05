public class fish {
    
    //Linear search problem
    public static void main(String[] args) {
        
        String[] candyBars = {"nuts", "fish", "lentils", "whole grains", "beans", "olive oil", "eggs", "yogurt"};
        boolean isFound = false; //Flag found
        int x  = 0;
        
        while(x < candyBars.length){
            //Decision structure 
            if(candyBars[x].equalsIgnoreCase("fish")){
                isFound = true;
            }
            x++; //Incrementing variable x
        }

        //Decision
        if(isFound) {
            System.out.println("Fish Found");
        }else{
            System.out.println("Fish NOT Found");
        }

    }
}
