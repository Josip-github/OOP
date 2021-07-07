package biljniIZivotinjskiSvijet;

public class Sisavac extends Kraljeznjak {

	private boolean zubi;
	private String hranjenjePodmlatka;

	public Sisavac() {
		// TODO Auto-generated constructor stub
	}

	public Sisavac(boolean rast, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis, boolean zubi, String hranjenjePodmlatka) {
		super(rast, razmnozavanje, probavniSustav, pokretljivost2, imaKraljeznicu, okolis);
		this.zubi = zubi;
		this.hranjenjePodmlatka = hranjenjePodmlatka;
	}

	public boolean isZubi() {
		return zubi;
	}

	public void setZubi(boolean zubi) {
		this.zubi = zubi;
	}

	public String getHranjenjePodmlatka() {
		return hranjenjePodmlatka;
	}

	public void setHranjenjePodmlatka(String hranjenjePodmlatka) {
		this.hranjenjePodmlatka = hranjenjePodmlatka;
	}

}
