package com.lagm.excepciones1;

import java.io.IOException;

public class PruebaExcepciones {
	
	public static char leer() throws IOException {
		return (char)System.in.read();
	}
	
	public static void main(String[] args) {
		try {
			char caracter = leer();
			System.out.println("Caracter: " + caracter);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de entrada de datos");
		}
	}
}
