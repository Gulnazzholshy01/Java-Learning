public class fishmethod {
    
    //Linear search problem
    public static void main(String[] args) {
        
        String[] food = {"nuts", "fish", "lentils", "whole grains", "beans", "olive oil", "eggs", "yogurt"};
        getItems(food);

    }

    public static void getItems(String[] food){
        int x = 0;
        while(x < food.length){
            System.out.println(food[x]);
            x++;
        }
    }
}
