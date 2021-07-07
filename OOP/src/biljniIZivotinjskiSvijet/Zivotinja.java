package biljniIZivotinjskiSvijet;

public class Zivotinja extends ZiviOrganizam {

	private boolean probavniSustav;
	private boolean pokretljivost;

	public Zivotinja() {
		// TODO Auto-generated constructor stub
	}

	public Zivotinja(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2) {
		super(pokretljivost, razmnozavanje);
		this.probavniSustav = probavniSustav;
		pokretljivost = pokretljivost2;
	}

	public boolean isProbavniSustav() {
		return probavniSustav;
	}

	public void setProbavniSustav(boolean probavniSustav) {
		this.probavniSustav = probavniSustav;
	}

	public boolean isPokretljivost() {
		return pokretljivost;
	}

	public void setPokretljivost(boolean pokretljivost) {
		this.pokretljivost = pokretljivost;
	}

}
