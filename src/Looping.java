public class Looping {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //DECLARATIONS 
        int x;
        int y = 10;

        //INITIALIZE x
        x=0; //Initialize Control Variable
        while(x<=y){ //Variable tested or expression 
            System.out.println(x);
            x++; // x= x+1; x+=1; //Alter the value of control variable 
        }

        

        //FOR loop
        for(x=1; x<=y; x++) {
            System.out.println(x);
        }
    }
}
