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
		int[] count = new int[stor];
		int[] quantity = new int[stor];
		for (int s=0; s<numCust; s++) {
			fname[s] = scan.next();
			lname[s] = scan.next();
			int numBought = scan.nextInt();
			int[] numCount = new int[numBought];
			String[] foodNames = new String[numBought];
			for (int m=0; m<numBought; m++) {
				numCount[m] = scan.nextInt();
				foodNames[m] = scan.next();
				for (int t=0; t<stor; t++) {
					quantity[t] += amount(items[t], numCount[m], foodNames[m]);
				}
			}
			for (int f=0; f<items.length; f++) {
				count[f] += isBought(items[f], foodNames);
			}
			
		}
		for (int g=0; g<items.length; g++) {
			if (count[g] == 0) {
				System.out.println("No customers bought " + items[g]);
			} else {
				System.out.println(count[g] + " customers bought " + quantity[g] + " " + items[g]);
			}
		}
	}

	private static int isBought(String items, String[] foodNames) {
		for (int i=0; i<foodNames.length; i++) {
			if (items.equals(foodNames[i])) {
				return 1;
			}
		}
		return 0;
	}

	private static int amount(String items, int numCount, String foodNames) {
		int total = 0;
		if (items.contentEquals(foodNames)){
			total = total + numCount;
		}
		return total;
	}
}
