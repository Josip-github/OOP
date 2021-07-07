package biljniIZivotinjskiSvijet;

public class Kraljeznjak extends Zivotinja {

	private boolean imaKraljeznicu;
	private String okolis;

	public Kraljeznjak() {
		// TODO Auto-generated constructor stub
	}

	public Kraljeznjak(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis) {
		super(pokretljivost, razmnozavanje, probavniSustav, pokretljivost2);
		this.imaKraljeznicu = imaKraljeznicu;
		this.okolis = okolis;
	}

	public boolean isImaKraljeznicu() {
		return imaKraljeznicu;
	}

	public void setImaKraljeznicu(boolean imaKraljeznicu) {
		this.imaKraljeznicu = imaKraljeznicu;
	}

	public String getOkolis() {
		return okolis;
	}

	public void setOkolis(String okolis) {
		this.okolis = okolis;
	}

}
