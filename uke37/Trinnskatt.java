package uke37;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		int l�nn = Integer.parseInt(showInputDialog("Skriv inn l�nn: "));
			
		if (l�nn <= 180800) {
			int skatt1 = 0;
			System.out.println("Skatt: " + skatt1);
		}
		
		else if (l�nn > 180800 && l�nn <= 254500) {
			double tall = (l�nn * 1.9 / 100);
			int skatt2 = (int)tall;
			System.out.println("Skatt: " + skatt2);
		}
		
		else if (l�nn > 254500 && l�nn <= 639750) {
			double tall = l�nn * 4.2 / 100;
			int skatt3 = (int)tall;
			System.out.println("Skatt: " + skatt3);
		}
		
		else if (l�nn > 639750 && l�nn < 999550) {
			double tall = l�nn * 13.2 / 100;
			int skatt4 = (int)tall;
			System.out.println("Skatt: " + skatt4);
		}
		
		else if (l�nn > 999550) {
			double tall = l�nn * 16.2 / 100;
			int skatt5 = (int)tall;
			System.out.println("Skatt: " + skatt5);
		}		
	}

}
