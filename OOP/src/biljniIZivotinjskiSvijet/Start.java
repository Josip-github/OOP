package biljniIZivotinjskiSvijet;

public class Start {
	
	public Start() {
		
		Deva deva = new Deva(true, true, true, true, true, "kopno", true, "mlijekom", 2, "sme�a");
		System.out.println(deva);
	}
	
	public static void main(String[] args) {
		
		new Start();
	}

}
