package com.lagm.excepciones2;

public class Alumno {
	public Alumno(String nombre, String apellidos) throws Exception {
		if (nombre == null || apellidos == null) {
			throw new Exception("Argumentos no válidos");
		}
	}
	
	public static void main(String[] args) {
		try {
			Alumno alumno = new Alumno(null, "Guisado");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
