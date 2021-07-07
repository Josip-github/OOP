package biljniIZivotinjskiSvijet;

public class Beskraljeznjak extends Zivotinja {

	private boolean imaKraljeznicu;
	private String okolis;

	public Beskraljeznjak() {
		// TODO Auto-generated constructor stub
	}

	public Beskraljeznjak(boolean rast, boolean razmnozavanje, boolean probavniSustav, boolean pokretljivost2,
			boolean imaKraljeznicu, String okolis) {
		super(rast, razmnozavanje, probavniSustav, pokretljivost2);
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
