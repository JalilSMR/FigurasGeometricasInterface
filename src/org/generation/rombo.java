package org.generation;

public class rombo implements FiguraGeometrica{
	
	private String Nombre;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	public rombo(String nombre, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		Nombre = nombre;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	@Override
	public String toString() {
		return "rombo [Nombre=" + Nombre + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}
	@Override
	public double calcularArea() {
		return diagonalMayor*diagonalMenor/2;
	}
	@Override
	public double calcularPerimetro() {
		return lado+lado+lado+lado;
	}
	
	
}
