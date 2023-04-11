package tareaCoches;

public class CocheNuevo extends Coche {
	public CocheNuevo(String matricula, String marca, String color) {
		super(matricula, marca, color);	
	}
	public String toString() {
		return super.toString(); // solo se aporta el metodo de la clase padre al no tener atributos.
	}
}
