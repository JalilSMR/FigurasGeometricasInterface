package org.generation;

public class Main {

	public static void main(String[] args) {
		triangulo bermudas = new triangulo("Bermudas", 20, 10, 15);
		triangulo a = new triangulo("Triangulote", 250, 175, 145);
		imprimirCalculo(bermudas);
		imprimirCalculo(a);
		
		Cuadrado cuadrado = new Cuadrado("Cuadrado", 20);
		imprimirCalculo(cuadrado);
		
		rectangulo Rectangulo = new rectangulo("rectangulo", 15, 8);
		imprimirCalculo(Rectangulo);
		
		rombo Rombo = new rombo ("rombo", 3, 4, 6);
		imprimirCalculo(Rombo);
		
		romboide Romboide = new romboide ("romboide", 26, 34);
		imprimirCalculo(Romboide);
		
		trapecio Trapecio = new trapecio ("trapecio", 23, 43, 2, 6, 7, 8, 5);
		imprimirCalculo(Trapecio);
	}
	
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t.toString());
		System.out.println("+===================================");
		System.out.println("|El área de ["+t.getNombre()
				+ "] es : " + t.calcularArea());
		System.out.println("|El perímetro de ["+t.getNombre()
				+ "] es : " + t.calcularPerimetro());
		System.out.println("+===================================");
		}
	
	}