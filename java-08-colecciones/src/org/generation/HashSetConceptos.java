package org.generation;

import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
	/*
	 * Una coleccion de tipo SET es una coleccion NO ORDENADA
	 * No se permite elemento duplicados
	 * Cualquier elemento duplicado no se insertara en la coleccion
	 * 
	 * Sintaxis:
	 *   HashSet<Objeto> varName;
	 * 
	 * */
		
	//Definimos una coleccion HashSet
	  HashSet<String> paises = new HashSet<>();
	  
	  //Agrar valores ocn add()
	  paises.add("México");
	  paises.add("Alemania");
	  paises.add("Genovia");
	  paises.add("Vlatava");
	  paises.add("Wakanda");
	  paises.add("Wakanda");
	  
	  System.out.println(paises);
	  
	  //Desplegando el tamaño de la coleccion, size()
	  System.out.println("Elementos: " + paises.size());
	  
	  //Verificando si existe un elmento contains()
	  System.out.println("Existe USA: " + paises.contains("USA"));
	  System.out.println("Existe Alemania: " + paises.contains("Alemania"));
	  
	  // Removemos un elemento remove()
	  System.out.println("Eliminamos: "+ paises.remove("Mexico"));
	  System.out.println(paises);
	  
	  // Iteramos la coleccion 
	  // for each loop
	  for(String pais: paises)System.out.println(pais);
	  
	  // Con lambda ->
	  paises.forEach(pais ->System.out.println("->" + pais));
	  
	  
	}

}
