package tareaCoches;

public class MainTareaCoches {
	
	public static void main (String [] args) {
		Km0 c0 = new Km0("23458LMK", "Kia", "Rojo", 570);
		CocheNuevo cN = new CocheNuevo("73458MMK", "Renault", "Rojo");
		SegundaMano sM = new SegundaMano("95421GBB", "BMW", "Azul", 120000, "OscarMartín");
		System.out.println("Tenemos tres coches en oferta: ");
		System.out.println(c0.toString());
		System.out.println(cN.toString());
		System.out.println(sM.toString());
	}
}
