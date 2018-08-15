/* This program is to learn how to do Exceptional handling by dividing two numbers and getting an Exceptional Error.
 * Also using do while loop to stop the iteration again and again.
 * Author: Reeta
 * Date: 8/14/18
 */

import java.util.Scanner;

public class Exceptionalhandling {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do{
		try{
			System.out.println("Enter first number : ");
			int num1 = input.nextInt();
			System.out.println("Enter second number : ");
			int num2 = input.nextInt();
		    int sum = num1/num2;
		    System.out.println(sum);
		    x=2;
		}
		catch(Exception e){
			System.out.println("You can't do that");
		}
		}while (x ==1);
		
	    
	}
}
