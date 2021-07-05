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
			zivotinja.setIme(JOptionPane.showInputDialog("Unesite naziv �ivotinje"));
			zivotinja.setTezina(
					Integer.parseInt(
							JOptionPane.showInputDialog("Unesite te�inu �ivotinje u kg")));
			zivotinja.setKretanje(JOptionPane.showInputDialog("Kako se �ivotinja kre�e"));
			zivotinja.setVelicina(
					Double.parseDouble(
							JOptionPane.showInputDialog("Koliko je �ivotinja velika?")));
			
			zivotinje[i] = zivotinja;
	}
}
	public static void main(String[] args) {
		
		new Start();
	}
}
