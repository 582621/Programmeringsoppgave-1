package uke37;

import static javax.swing.JOptionPane.*;

public class Fakultet {

	public static void main(String[] args) {

		int n = Integer.parseInt(showInputDialog("Gi tall: "));
		if (n < 0) {
			System.out.println("Skriv inn et tall over 0.\n ");
			n = Integer.parseInt(showInputDialog("Gi tall: "));
		}
		long tall = 1;
		
		while (n > 1) {
			
			tall = tall * n;
			n--;
		
		}
		
		System.out.println(tall);
	}

}
