package biljniIZivotinjskiSvijet;

public class Clankonozac extends Beskraljeznjak {

	private boolean presvlacenje;
	private String gradja;

	public Clankonozac() {
		// TODO Auto-generated constructor stub
	}

	public Clankonozac(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis, boolean presvlacenje, String gradja) {
		super(pokretljivost, razmnozavanje, probavniSustav, pokretljivost2, imaKraljeznicu, okolis);
		this.presvlacenje = presvlacenje;
		this.gradja = gradja;
	}

	public boolean isPresvlacenje() {
		return presvlacenje;
	}

	public void setPresvlacenje(boolean presvlacenje) {
		this.presvlacenje = presvlacenje;
	}

	public String getGradja() {
		return gradja;
	}

	public void setGradja(String gradja) {
		this.gradja = gradja;
	}

}
