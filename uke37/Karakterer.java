package uke37;

import static javax.swing.JOptionPane.*;

public class Karakterer {
	public static void main(String[] args) {
		
		for (int st = 0; st < 10; st++) {
			
		int k = Integer.parseInt(showInputDialog("Poengsum: "));
		
		if (k <= 100 && k >= 90) {
			System.out.println("Karakter: A");
		}
		else if (k <= 89 && k >= 80) {
			System.out.println("Karakter: B");
		}
		else if (k <= 79 && k >= 60) {
			System.out.println("Karakter: C");
		}
		else if (k <= 59 && k >= 50) {
			System.out.println("Karakter: D");
		}
		else if (k <= 49 && k >= 40) {
			System.out.println("Karakter: E");
		}
		else if (k <= 39 && k >= 0) {
			System.out.println("Karakter: F");
		}
		else if (k < 0 || k > 100) {
			System.out.println("\nUgyldig poengsum. \nPrøv igjen.\n");
			st--;
		}
		}
	}
}
