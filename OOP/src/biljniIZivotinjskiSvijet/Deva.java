package biljniIZivotinjskiSvijet;

public class Deva extends Sisavac {

	private int velicina;
	private String boja;

	public Deva() {
		// TODO Auto-generated constructor stub
	}

	public Deva(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis, boolean zubi, String hranjenjePodmlatka, int velicina, String boja) {
		super(pokretljivost, razmnozavanje, probavniSustav, pokretljivost2, imaKraljeznicu, okolis, zubi,
				hranjenjePodmlatka);
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
