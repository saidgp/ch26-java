package org.generation;

import java.util.ArrayList;

public class Arraylist_Conceptos {

	public static void main(String[] args) {
		/*
		 * Una coleccion list es una coleccion ORDENADA, en la que
		 * se permiten elementos duplicados
		 * 
		 * Se basa en un array redimensionable que crece su tamaño.
		 * segun crece la coleccion de elementos
		 * 
		 * 
		 * Esta coleccion es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis: 
		 * ArrayList<object> varName:
		 * */
		
		//Definir una coleccion de datos numericos.
		int edad = 17;
		Integer age = 17;
		
		
		
		ArrayList<Integer> calificaciones;
		
		//Definir una coleccion de Strings
		
		ArrayList<String> nombreLibros ;
		nombreLibros = new ArrayList<>();
		
		// Agregar datos al ArrayList con el metodo add()
		// El primer elemento es el indice 0 
		nombreLibros.add("Tokio Blues");
		nombreLibros.add("Danza de dragones");
		nombreLibros.add("IQ84");
		nombreLibros.add("Soy el numero 4");
		nombreLibros.add("Harry Potter");
		//Se permiten elementos duplicados
		nombreLibros.add("Soy el numero 4");
		
		
		// Obtener el tamaño de la coleccion, size()
		int sizeArrayList = nombreLibros.size();
		System.out.println(" Numero de elementos: " +  sizeArrayList);
		System.out.println(nombreLibros);
		
		// Mostrar un elemento en particular
		// Indicamos el numero de indice, usando el metodo get()
		System.out.println("Obtenemos un solo libro: " + nombreLibros.get(3));
		
		// Removemos un solo elemento en particular
		// Indicamos el indice, usanto el metodo remove()
		System.out.println("Elemento removido: "+ nombreLibros.remove(2));
		System.out.println(nombreLibros);
		
		System.out.println("Tenemos Harry potter? "+ nombreLibros.contains("Harry Potter"));
		
		//Iteramos coleccion arrayList
		// for loop
		
		for(int i = 0; i<nombreLibros.size(); i++) {
			System.out.println("Libro: "+ nombreLibros.get(i));
		}
		// for each loop
		for (String a: nombreLibros) {
			System.out.println("Otro metodo  " + a);
		}
		// for each de la coleccion
		nombreLibros.forEach(libro -> System.out.println(libro));
		
		// Si se una el metodo  .set en un indice existente lo reemplaza
		
		nombreLibros.set(4,"Clear code");
			System.out.println(nombreLibros);
			
			// Se pasa la referecnia, es necesario usar el metodo 
			// clone() para que sean colecciones independientes
			
			ArrayList<String> books = nombreLibros;
		
		
		
		
	}

}
