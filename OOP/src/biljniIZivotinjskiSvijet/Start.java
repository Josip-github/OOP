package biljniIZivotinjskiSvijet;

public class Start {
	
	public Start() {
		
		Deva deva = new Deva(true, true, true, true, true, "kopno", true, "mlijekom", 2, "smeða");
		System.out.println(deva);
		
		System.out.println();
		
		Kaktus kaktus = new Kaktus(true, true, false, "zelena", "pustinja", true, 1, "u obliku srca");
		System.out.println(kaktus);
		
		System.out.println();
		
		Rak rak = new Rak(true, true, false, true, false, "more i kopno", true, "glava, prsa i zadak", 0.25, "crvena");
		System.out.println(rak);
		
		System.out.println();
		
		Mahovina mahovina = new Mahovina(true, true, false, "zelena", "vlažna podruèja", true, 1, "nepravilan");
		System.out.println(mahovina);
	}
	
	public static void main(String[] args) {
		
		new Start();
	}

}
