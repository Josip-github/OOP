package biljniIZivotinjskiSvijet;

public class Kaktus extends BiljkeSuhihStanista {

	private int velicina;
	private String oblik;

	public Kaktus() {
		// TODO Auto-generated constructor stub
	}

	public Kaktus(boolean rast, boolean razmnozavanje, boolean probavniSustav, String boja, String okolis,
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
		return  "Kaktus - Velièina u m: " + this.getVelicina() + "; oblik: " + this.getOblik()
		+ ";\nima lišæe: " + super.isImaLisce() + ", okoliš: " + super.getOkolis()
		+ ";\nboja: " + super.getBoja() + ", ima probavni sustav: " +  super.isProbavniSustav()
		+ ";\nraste: " + super.isRast() + ", razmnožava se: " +  super.isRazmnozavanje();
	}
}
