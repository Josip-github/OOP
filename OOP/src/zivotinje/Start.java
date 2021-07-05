package zivotinje;

import javax.swing.JOptionPane;

public class Start {

	Zivotinja[] zivotinje;

	public Start() {

		zivotinje = new Zivotinja[4];
		ucitajZivotinje();
		ispisiZivotinje();
	
	}

	private void ispisiZivotinje() {

		for (Zivotinja zivotinja : zivotinje) {
			System.out.println(zivotinja.getIme());
			System.out.println(zivotinja.getKretanje());
			System.out.println(zivotinja.getTezina());
			System.out.println(zivotinja.getVelicina());
			System.out.println();
		}
	}

	private void ucitajZivotinje() {

		Zivotinja zivotinja;
		
		for(int i = 0; i < zivotinje.length; i++) {
			
			zivotinja = new Zivotinja();
			zivotinja.setIme(JOptionPane.showInputDialog("Unesite naziv životinje"));
			zivotinja.setTezina(
					Integer.parseInt(
							JOptionPane.showInputDialog("Unesite težinu životinje u kg")));
			zivotinja.setKretanje(JOptionPane.showInputDialog("Kako se životinja kreæe"));
			zivotinja.setVelicina(
					Double.parseDouble(
							JOptionPane.showInputDialog("Koliko je životinja velika?")));
			
			zivotinje[i] = zivotinja;
	}
}
	public static void main(String[] args) {
		
		new Start();
	}
}
