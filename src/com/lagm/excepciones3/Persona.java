package com.lagm.excepciones3;

public class Persona {
	private int edad;
	
	public void ponEdad(int edad) throws EdadFueraDeRango {
		if (edad < 0 || edad > 130) {
			throw new EdadFueraDeRango("Demasiado joven o demasiado viejo");
		}
		
		this.edad = edad;
	}

	public String toString() {
		return "Persona [edad=" + edad + "]";
	}
	
	
}
