package com.lagm.interfaces;

public class PruebaInterfaz {

	public static void main(String[] args) {
		Elemento elemento;
		Nombrable interfaz;
		
		elemento = new Elemento("Balta");
		elemento.mostrarnombre();
		
		interfaz = elemento;
		interfaz.mostrarnombre();
	}
	
}
