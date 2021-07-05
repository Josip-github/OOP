package osoba;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

public class Start {

	Random random = new Random();
	Osoba[] osobe;
	
	public Start() {
		
		osobe = new Osoba[3];
		ucitajOsobe();
		ispisiOsobe();
	}

	private void ispisiOsobe() {

		for (Osoba osoba : osobe) {
			System.out.println(osoba.getIme());
			System.out.println(osoba.getNacionalnost());
			System.out.println(osoba.getEmail());
			System.out.println(osoba.getId());
			System.out.println();
		}
	}

	private void ucitajOsobe() {

		Osoba osoba;
		
		for(int i = 0; i < osobe.length; i++) {
			
			osoba = new Osoba();
			osoba.setIme(JOptionPane.showInputDialog("Unesite ime osobe"));
			osoba.setEmail(osoba.getIme().toLowerCase() + "firma@gmail.com");
			osoba.setNacionalnost(
					JOptionPane.showInputDialog("Unesite nacionalnost osobe"));
			osoba.setId(random.nextInt());
			
			osobe[i] = osoba;
		}
	}
	
	public static void main(String[] args) {
		
		new Start();
	}
}
