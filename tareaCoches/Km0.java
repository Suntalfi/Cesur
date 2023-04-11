package tareaCoches;

public class Km0 extends Coche {
	private double kilometraje;
	public Km0 (String matricula, String marca, String color, double kilometros) {
		super(matricula, marca, color);
		this.kilometraje = kilometros;
	}
	//Getter & setter
	public double getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	//toString personalizado 
	public String toString() {
		return super.toString() + " y tiene " + kilometraje + " km";
	}
}
