package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		logic(scan);
	}
	public static void logic(Scanner scan) {
		int num_customers = 0;
		num_customers = scan.nextInt();
		for (int i = 0; i<num_customers; i++) {
			String fname = scan.next();
			String lname = scan.next();
			int items = scan.nextInt();
			double total = 0;
			double roundOff = 0;
			for (int s = 0; s<items; s++) {
				int quan = scan.nextInt();
				double price = scan.nextDouble();
				total += price * quan; 
				roundOff = Math.round(total*100)/100;
				
			}
			System.out.println(fname.charAt(0) + ". "+ lname + ": " + roundOff);
		}
	}
}
