package biljniIZivotinjskiSvijet;

public class Mahovina extends BiljkeVlaznihStanista {

	private int velicina;
	private String oblik;

	public Mahovina() {
		// TODO Auto-generated constructor stub
	}

	public Mahovina(boolean rast, boolean razmnozavanje, boolean probavniSustav, String boja, String okolis,
			boolean imaLisce, int velicina, String oblik) {
		super(rast, razmnozavanje, probavniSustav, boja, okolis, imaLisce);
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mahovina - ima probavni sustav: " + super.isProbavniSustav() 
		+ ", velièina u m: " + this.velicina + ", oblik: " + this.oblik;
	}
}
