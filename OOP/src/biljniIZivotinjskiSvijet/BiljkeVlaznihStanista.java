package biljniIZivotinjskiSvijet;

public class BiljkeVlaznihStanista extends Biljka {

	private String okolis;
	private boolean imaLisce;

	public BiljkeVlaznihStanista() {
		// TODO Auto-generated constructor stub
	}

	public BiljkeVlaznihStanista(boolean pokretljivost, boolean razmnozavanje, boolean probavniSustav, String boja,
			String okolis, boolean imaLisce) {
		super(pokretljivost, razmnozavanje, probavniSustav, boja);
		this.okolis = okolis;
		this.imaLisce = imaLisce;
	}

	public String getOkolis() {
		return okolis;
	}

	public void setOkolis(String okolis) {
		this.okolis = okolis;
	}

	public boolean isImaLisce() {
		return imaLisce;
	}

	public void setImaLisce(boolean imaLisce) {
		this.imaLisce = imaLisce;
	}

}
