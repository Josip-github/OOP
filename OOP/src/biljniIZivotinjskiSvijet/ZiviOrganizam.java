package biljniIZivotinjskiSvijet;

public class ZiviOrganizam {

	private boolean rast;
	private boolean razmnozavanje;

	public ZiviOrganizam() {
		// TODO Auto-generated constructor stub
	}

	public ZiviOrganizam(boolean pokretljivost, boolean razmnozavanje) {
		super();
		this.rast = pokretljivost;
		this.razmnozavanje = razmnozavanje;
	}

	public boolean isRast() {
		return rast;
	}

	public void setRast(boolean rast) {
		this.rast = rast;
	}

	public boolean isRazmnozavanje() {
		return razmnozavanje;
	}

	public void setRazmnozavanje(boolean razmnozavanje) {
		this.razmnozavanje = razmnozavanje;
	}

}
