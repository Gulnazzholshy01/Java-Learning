import java.util.Scanner;
public class dep {
    public static void main(String[] args) {
        int dep;
        int[] counts = {0,0,0,0,0,0};
        int QUIT = 999;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dependents for employee or " + QUIT + " to quit");
        dep = Integer.parseInt(input.nextLine());

        while(dep != QUIT) {
            counts[dep] = counts[dep]+1;
            System.out.println("Enter dependents for employee or " + QUIT + " to quit");
            dep = Integer.parseInt(input.nextLine());           
        }

        System.out.println("Dependents count");
        dep = 0;

        while(dep < counts.length){
            System.out.println(counts[dep] + " employees have " + dep + " dependents");
            dep+=1;
        }

        System.out.println("Program has ended");

    }
}
