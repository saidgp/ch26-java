package org.generation;

public class Pokemon {
	// Atributos de clase (non-static fields)
	String nombre; 
	int alturaCm;
	double pesoKg;
	
	
	// Atributos de instancia (static fields)
	static String nacimiento = "Oviparos";
	
	// Metodos constructores
	// Debe tener el mismo nombre de mi Clase
	// Los metodos constructores no tienen retorno
	Pokemon(String nombrePokemon, int alturaCmPk, double pesoKgPk){
		System.out.println("has creado un pokemon llamado " + nombrePokemon);
		nombre=nombrePokemon;
		alturaCm=alturaCmPk;
		pesoKg=pesoKgPk;
	}
	
	// Metodos de instancia
	
	//Metodos de clase
}
