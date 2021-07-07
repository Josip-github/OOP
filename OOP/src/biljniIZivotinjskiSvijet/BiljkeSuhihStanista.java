package biljniIZivotinjskiSvijet;

public class BiljkeSuhihStanista extends Biljka {

	private String okolis;
	private boolean imaLisce;

	public BiljkeSuhihStanista() {
		// TODO Auto-generated constructor stub
	}

	public BiljkeSuhihStanista(boolean rast, boolean razmnozavanje, boolean probavniSustav, String boja,
			String okolis, boolean imaLisce) {
		super(rast, razmnozavanje, probavniSustav, boja);
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
