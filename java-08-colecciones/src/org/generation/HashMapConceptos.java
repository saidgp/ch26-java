package org.generation;

import java.util.HashMap;

public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una coleccion Map, es una relacion clave(key): valor(value)
		 * que forma una tabla de datos.
		 * */
		// Definimis una coleccion HashMap
		// < key, value >
		
		HashMap<Integer, String> students = new HashMap<>();
		
		// Agregamos valors a la coleccion, put()

		students.put(12341, "Said");
		students.put(22342, "Siri");
		students.put(12343, "Sofi");
		students.put(92344, "Santi");
		System.out.println(students);
		
		students.put(92344, "Saulo");
		students.put(11111, "Saulo");
		
		System.out.println(students);
		
		// Mostramos un elemento en particular, usando .get(key)
		System.out.println("Ejemplo de seleccion: " + students.get(22342));
		
		// Removiendo un elemento, removekey)
		System.out.println("Removiendo: "+ students.remove(11111));
		System.out.println(students);
		
		// Iterar la coleccion con sus keys
		for(int matricula: students.keySet()) {
			System.out.println(students.get(matricula));
		}
		
		//Iterar la coleccion con sus values
		for(String student : students.values()) {
			System.out.println("Estudiante: " + student);
		}
		
		// Iterar con funcion lamda
		students.forEach((key, value)-> System.out.println(key+" -> "+value));
		
		
		
		
		}
		
		
		
		
	}


