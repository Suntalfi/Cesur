package tareaCoches;

public abstract class Coche extends Producto {
	private String matricula;
	private final int ruedas = 4; //atributo final ya que todos los coches tendrán 4 ruedas
	private String marca; 
	private String color; 
	public Coche(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}
	//Metodos getter y setter
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRuedas() {
		return ruedas;
	}
	//To String personalizado 
	public String toString() {
		return "El coche con matricula "+ matricula + " de la marca " + marca + " es de color: " + color ;
	}
}
