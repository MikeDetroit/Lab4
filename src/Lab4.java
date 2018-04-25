
//Michael DeCoopman, Java, 4/25/2018, Lab 4

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		// declared variables
		int i;
		int num;
		String cont;

		Scanner scan = new Scanner(System.in);

		cont = "y";
		// while loop to start process
		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please enter an integer: ");

			// Print blank lines, print f formatting of table, enter integer
			
			num = scan.nextInt();
			scan.nextLine();
			System.out.printf("%-8s %-10s %-10s %n", "Number", "Squared", "Cubed");

			System.out.printf("%-8s %-10s %-10s", "======", "=======", "=====");

			// for loop to start at 1 and increment to number entered
			
			for (i = 1; i <= num; ++i) {

				// calculations for squaring and cubing
				
				int squared = (int) Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);
				System.out.println();
				System.out.printf("%-8d %-10d %-10d", i, squared, cubed);

			}
			System.out.println();
			System.out.println();
			System.out.println("Do you want to continue? (y/n): ");

			cont = scan.nextLine();
		}
		scan.close();

	}

}
