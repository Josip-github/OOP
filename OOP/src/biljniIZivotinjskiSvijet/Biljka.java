package biljniIZivotinjskiSvijet;

public class Biljka extends ZiviOrganizam {

	private boolean probavniSustav;
	private String boja;

	public Biljka() {
		// TODO Auto-generated constructor stub
	}

	public Biljka(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, String boja) {
		super(pokretljivost, razmnozavanje);
		this.probavniSustav = probavniSustav;
		this.boja = boja;
	}

	public boolean isProbavniSustav() {
		return probavniSustav;
	}

	public void setProbavniSustav(boolean probavniSustav) {
		this.probavniSustav = probavniSustav;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

}
