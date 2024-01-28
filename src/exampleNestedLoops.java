public class exampleNestedLoops {
    public static void main(String[] args) throws Exception {
        String days [] = {"Mon.", "Tue", "Wed.", "Thur", "Fri"};
        String meals [] = {"Breakfast", "Lunch", "Dinner"};
        String breakfastItems [] = {"OJ","Toast", "Banana"};
        String lunchItems [] = {"Juice","Pizza", "Pear"};
        String dinnerItems [] = {"Hi-C","Ribs", "Apple"};
        
        int firstIterator = 0, secondIterator = 0, thirdIterator = 0;

        while(firstIterator < 5){
            System.out.println(days[firstIterator]);
            secondIterator = 0;
            while(secondIterator < 3){
                System.out.println("   " + meals[secondIterator]);
                thirdIterator = 0;
                while(thirdIterator < 3){
                    if(secondIterator == 0){
                        System.out.println("       " + breakfastItems[thirdIterator]);
                    }else if(secondIterator == 1){
                        System.out.println("       " + lunchItems[thirdIterator]);
                    }else{
                        System.out.println("       " + dinnerItems[thirdIterator]);
                    }
                    thirdIterator++;
                    
                }//End of inner most loop
                secondIterator++;
            }//end of second inner loop
            firstIterator++;
        }//End of first loop
        
        System.out.println("Weekly Menu has been outputted");
        System.out.println("Weekly Menu \n");
    }
}
