//Michael DeCoopman, Java, 4/25/2018, Lab 4

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		int i;
		int num;
		String cont;

		Scanner scan = new Scanner(System.in);

		cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please enter an integer: ");

			num = scan.nextInt();
			scan.nextLine();
			System.out.printf("%-8s %-10s %-10s", "Number", "Squared", "Cubed");
			System.out.println();
			System.out.printf("%-8s %-10s %-10s", "======", "=======", "=====");

			for (i = 1; i <= num; ++i) {

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
