package biljniIZivotinjskiSvijet;

public class Biljka extends ZiviOrganizam {

	private int velicina;
	private String boja;

	public Biljka() {
		// TODO Auto-generated constructor stub
	}

	public Biljka(boolean pokretljivost, boolean razmnozavanje, int velicina, String boja) {
		super(pokretljivost, razmnozavanje);
		this.velicina = velicina;
		this.boja = boja;
	}

	public int getVelicina() {
		return velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

}
