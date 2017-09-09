package assignment4;

public class SieveofErastosthenes {

	public static void printMyPrimeNumbers(int max) {

		int i = 0;
		int num = 0;

		// Initializing with an empty String
		String myPrimeNumbers = "";
		{

			for (i = 1; i <= max; i++) {
				int counter = 0;
				for (num = i; num >= 1; num--) {
					if (i % num == 0) {
						counter = counter + 1;
					}
				}
				if (counter == 2) {
					// Appending the prime number to the String
					myPrimeNumbers = myPrimeNumbers + i + " ";
				}
			}
			System.out.println("Prime numbers from 1 to " + max + " are :");
			System.out.println(myPrimeNumbers);
		}

	}
}
