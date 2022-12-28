package com.lagm.interfaces;

interface Nombrable {
	public static final boolean CIERTO = true;
	public void mostrarnombre();
}


public class Elemento implements Nombrable {

	String nombre;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarnombre() {
		System.out.println("El nombre es: " + nombre);
		if (CIERTO) {
			System.out.printf("Contante %b de la interfaz\n", CIERTO);
		}
	}

}
