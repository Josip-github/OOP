package biljniIZivotinjskiSvijet;

public class Deva extends Sisavac {

	private int velicina;
	private String boja;

	public Deva() {
		// TODO Auto-generated constructor stub
	}

	public Deva(boolean rast, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis, boolean zubi, String hranjenjePodmlatka, int velicina, String boja) {
		super(rast, razmnozavanje, probavniSustav, pokretljivost2, imaKraljeznicu, okolis, zubi,
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Deva - Velièina u m: " + this.getVelicina() + "; boja: " + this.getBoja()
		+ ";\nhrani podmladak " + super.getHranjenjePodmlatka() + "; ima zube: " + super.isZubi()
		+ ";\nokoliš: " + super.getOkolis() + ", ima kralježnicu: " + super.isImaKraljeznicu()
		+ ";\nima probavni sustav: " + super.isProbavniSustav() + ", kreæe se: " + super.isPokretljivost()
		+ ";\nraste: " + super.isRast() + ", razmnožava se: " + super.isRazmnozavanje();
	}

}
