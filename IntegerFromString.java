/*
 * Property of Mitchell Jonker 
 */

import java.util.Scanner;
public class IntegerFromString {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int testInt = 0;
		
		System.out.println("Enter String");
		
		Boolean test = keyboard.hasNextInt();
		String input = keyboard.nextLine();
		
		// Print Values
		/*System.out.println(test);
		System.out.println(input);
		*/
		
		if(test == true) {
			System.out.println(input+" is an integer");
			testInt = Integer.parseInt(input);
		}
		if(test == false) {
			System.out.println(input+" is not an integer");
		}
	}
}
