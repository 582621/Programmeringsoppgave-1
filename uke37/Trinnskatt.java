package uke37;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		int lønn = Integer.parseInt(showInputDialog("Skriv inn lønn: "));
			
		if (lønn <= 180800) {
			int skatt1 = 0;
			System.out.println("Skatt: " + skatt1);
		}
		
		else if (lønn > 180800 && lønn <= 254500) {
			double tall = (lønn * 1.9 / 100);
			int skatt2 = (int)tall;
			System.out.println("Skatt: " + skatt2);
		}
		
		else if (lønn > 254500 && lønn <= 639750) {
			double tall = lønn * 4.2 / 100;
			int skatt3 = (int)tall;
			System.out.println("Skatt: " + skatt3);
		}
		
		else if (lønn > 639750 && lønn < 999550) {
			double tall = lønn * 13.2 / 100;
			int skatt4 = (int)tall;
			System.out.println("Skatt: " + skatt4);
		}
		
		else if (lønn > 999550) {
			double tall = lønn * 16.2 / 100;
			int skatt5 = (int)tall;
			System.out.println("Skatt: " + skatt5);
		}		
	}

}
