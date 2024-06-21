package org.generation;

public class romboide implements FiguraGeometrica{

	private String Nombre;
	private double base;
	private double altura;
	public String getNombre() {
		return Nombre;
	}
	
	
	
	public romboide(String nombre, double base, double altura) {
		super();
		Nombre = nombre;
		this.base = base;
		this.altura = altura;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "romboide [Nombre=" + Nombre + ", base=" + base + ", altura=" + altura + "]";
	}
	@Override
	public double calcularArea() {
		return base*altura;
	}
	@Override
	public double calcularPerimetro() {
		return base+base+altura+altura;
	}
	
	
}
