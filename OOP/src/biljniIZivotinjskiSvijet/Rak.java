package biljniIZivotinjskiSvijet;

public class Rak extends Clankonozac {

	private double velicina;
	private String boja;

	public Rak() {
		// TODO Auto-generated constructor stub
	}

	public Rak(boolean rast, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis, boolean presvlacenje, String gradja, double velicina, String boja) {
		super(rast, razmnozavanje, probavniSustav, pokretljivost2, imaKraljeznicu, okolis, presvlacenje,
				gradja);
		this.velicina = velicina;
		this.boja = boja;
	}

	public double getVelicina() {
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rak - presvlaèi se: " + super.isPresvlacenje() + ", velièina u m: " 
				+ this.velicina + ", boja: " + this.boja;
	}

}
