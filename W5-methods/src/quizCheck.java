// public class quizCheck
// {
// 	public static void main(String[] args) {
// 		System.out.println(f1(2, 4));
// 	}
	
// 	public static int f1(int x, int n){
// 		if(n == 0){
// 			return 0;
// 		}else{
// 			return x + f1(x, n-1);
// 		}
// 	}
// }

import java.util.Scanner;
public class quizCheck
{
	public static void main(String[] args) {
		String name;
		Scanner input = new Scanner(System.in);
		System.out.print(getName(input));
	}

	public static String getName(Scanner scn){
		String name; //Local variable

		System.out.print("Enter Name: ");
		name = scn.nextLine();
		System.out.print("First Name: ");
		return name;
	}
}

// public class quizCheck
// {
// 	public static void main(String[] args) {
// 		int total = calcNumbers(2, 3); 
// 		System.out.print("Total: " + total );
		
// 	}
// 	public static int calcNumbers(int num1, int num2){ 
// 		int sum = num1 + num2;
// 		return sum;
		
// 	}
// 	public static int calcNumbers(int aNumber){ 
// 		return aNumber + 2;
// 	}

// }