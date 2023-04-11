package tareaCoches;

public class SegundaMano extends Coche {
	private double kilometraje;
	private String antiguoPropietario;
	public SegundaMano(String matricula, String marca, String color, double kilometraje, String antiguoPropietario) {
		super(matricula, marca, color);
		this.kilometraje = kilometraje;
		this.antiguoPropietario = antiguoPropietario;
	}
	public double getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	public String getAntiguoPropietario() {
		return antiguoPropietario;
	}
	public void setAntiguoPropietario(String antiguoPropietario) {
		this.antiguoPropietario = antiguoPropietario;
	}
	public String toString() {
		return super.toString() + " y tiene " + kilometraje + " km" + ". El utimo dueño fue: " + antiguoPropietario;
	}
}
