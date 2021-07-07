package biljniIZivotinjskiSvijet;

public class Zivotinja extends ZiviOrganizam {

	private int velicina;
	private boolean pokretljivost;

	public Zivotinja() {
		// TODO Auto-generated constructor stub
	}

	public Zivotinja(boolean pokretljivost, boolean razmnozavanje, int velicina, boolean pokretljivost2) {
		super(pokretljivost, razmnozavanje);
		this.velicina = velicina;
		pokretljivost = pokretljivost2;
	}

	public int getVelicina() {
		return velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	public boolean isPokretljivost() {
		return pokretljivost;
	}

	public void setPokretljivost(boolean pokretljivost) {
		this.pokretljivost = pokretljivost;
	}

}
