package assignment4;

import java.util.Scanner;

public class Assignment4 {

	private static int max;

	public static void main(String[] args) {

		{
			// Creating a Scanner instance to enable keyboard
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			// Getting argument from the user
			System.out.println("Enter maximum integer to be checked:");
			max = sc.nextInt();
		}

		try {
			SieveofErastosthenes.printMyPrimeNumbers(max1);
		} catch (Exception e) {
			System.out.println("Parsing Error!");
		}
	}

}
