package a1;

import java.util.Scanner;

public class A1Adept {

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
			total[s] = calculateTotal(items, prices, numCount, foodNames);
		}
		int smallest = smallSpender(total);
		int biggest = bigSpender(total);
		double average = calculateAverage(total);
		System.out.println("Biggest: " + fname[biggest] + " " + lname[biggest] + " (" + String.format("%.2f", (total[biggest])) + ")");
		System.out.println("Smallest: " + fname[smallest] + " " + lname[smallest] + " (" + String.format("%.2f", (total[smallest])) + ")");
		System.out.println("Average: " + String.format("%.2f", average));

		
	}

	private static double calculateAverage(double[] total) {
		double average = 0;
		double sum = 0;
		for (int i=0; i<total.length; i++) {
			double num = total[i];
			sum += num;
			if (i == total.length - 1) {
				average = sum / (total.length);
			}
		}
		return average;
	}

	private static int bigSpender(double[] total) {
		double high = total[0];
		int num = 0;
		for (int i = 0; i<total.length; i++) {
			if (total[i] > high) {
				num = i;
				high = total[i];
			}
		}
		return num;
	}

	private static int smallSpender(double[] total) {
		double small = total[0];
		int num = 0;
		for (int i = 0; i<total.length; i++) {
			if (total[i] < small) {
				num = i;
				small = total[i];
			}
		}
		return num;
	}

	private static double calculateTotal(String[] items, double[] prices, int[] numCount, String[] foodNames) {
		double total = 0;
		for (int i=0; i < numCount.length; i++) {
			for (int s=0; s<items.length; s++) {
				if (foodNames[i].equals(items[s])) {
					double num = prices[s] * numCount[i];
					total += num;
				}
			}
		}
		return total;
	}
}