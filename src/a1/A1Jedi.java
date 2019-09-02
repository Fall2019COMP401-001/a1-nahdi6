package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int stor = scan.nextInt();
		String[] items = new String[stor];
		double[] prices = new double[stor];
		
		for (int i=0; i<stor; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		int numCust = 0;
		numCust = scan.nextInt();
		String[] fname = new String[numCust];
		String[] lname = new String[numCust];
		double[] total = new double[numCust];
		int g = 0;
		int d = 0;
		for (int s=0; s<numCust; s++) {
			fname[s] = scan.next();
			lname[s] = scan.next();
			int numBought = scan.nextInt();
			int[] numCount = new int[numBought];
			String[] foodNames = new String[numBought];
			for (int m=0; m<numBought; m++) {
				numCount[m] = scan.nextInt();
				foodNames[m] = scan.next();
			}
			int[] finish = new int[0];
			for (int f=0; f<numBought; f++) {
				while (g<items.length) {
					if (items[g] == foodNames[f]) {
						finish[d] = finish[g] + numCount[f]; 
						d++;
					} else {
						g++;
					}
				}
			
			}
			
			for (int h=0; h<items.length; h++) {
				System.out.println("0 customers bought " + finish[h] + items[h]);
			}
			
		}
		
	}
}
