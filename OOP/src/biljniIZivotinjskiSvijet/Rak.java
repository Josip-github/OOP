package biljniIZivotinjskiSvijet;

public class Rak extends Clankonozac {

	private int velicina;
	private String boja;

	public Rak() {
		// TODO Auto-generated constructor stub
	}

	public Rak(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis, boolean presvlacenje, String gradja, int velicina, String boja) {
		super(pokretljivost, razmnozavanje, probavniSustav, pokretljivost2, imaKraljeznicu, okolis, presvlacenje,
				gradja);
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
