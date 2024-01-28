import java.util.Scanner;

public class activity5 {
	public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int start = 0;
        int count;



        Scanner scn = new Scanner(System.in);
        System.out.print("How many iterations do you want to output?  ");
        count = Integer.parseInt(scn.nextLine());

        while( start < count){
            System.out.println(n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            start++;
        }
	}
}