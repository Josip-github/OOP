package biljniIZivotinjskiSvijet;

public class Mahovina extends BiljkeVlaznihStanista {

	private int velicina;
	private String oblik;

	public Mahovina() {
		// TODO Auto-generated constructor stub
	}

	public Mahovina(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, String boja, String okolis,
			boolean imaLisce, int velicina, String oblik) {
		super(pokretljivost, razmnozavanje, probavniSustav, boja, okolis, imaLisce);
		this.velicina = velicina;
		this.oblik = oblik;
	}

	public int getVelicina() {
		return velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	public String getOblik() {
		return oblik;
	}

	public void setOblik(String oblik) {
		this.oblik = oblik;
	}
}
