/*
 * Property of Mitchell Jonker
 */

public class ArbiterTester {

	public static void main(String[] args) {
		
		// Integer Test
		String invalidInt = "NotAnInteger";
		String validInt = "2350";
		System.out.println("\nAttempting with Invalid Integer:");
		System.out.println(StringArbiter.toInteger(invalidInt));
		
		System.out.println("\nAttempting with Valid Integer:");
		System.out.println(StringArbiter.toInteger(validInt));
		
		// Double Test
		String invalidDouble = "NotADouble";
		String validDouble = "4.20";
		System.out.println("\nAttempting with Invalid Double:");
		System.out.println(StringArbiter.toDouble(invalidDouble));
		
		System.out.println("\nAttempting with Valid Double:");
		System.out.println(StringArbiter.toDouble(validDouble));
		
		
		// Char Test
		String invalidChar = "NotAChar";
		String validChar = "c";
		System.out.println("\nAttempting with Invalid Char:");
		System.out.println(StringArbiter.toChar(invalidChar));
		
		System.out.println("\nAttempting with Valid Char:");
		System.out.println(StringArbiter.toChar(validChar));
	}
}
