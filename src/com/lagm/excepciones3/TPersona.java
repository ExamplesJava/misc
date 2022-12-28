package com.lagm.excepciones3;

public class TPersona {
	public static void main(String[] args) {
		try {
			Persona persona = new Persona();
			persona.ponEdad(10);
			System.out.printf("Persona generada: %s\n", persona.toString());
		} catch (EdadFueraDeRango e) {
			System.out.println("Se produjo la excepcion");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
