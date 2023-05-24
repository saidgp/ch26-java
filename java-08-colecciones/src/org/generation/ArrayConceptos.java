package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 * Los arreglos se definen con corchetes []
		 * Los corchetes pueden ir antes o despues de la varible
		 * ej. int[] myArray;
		 * 	   inst myArray[];
		 * Para los arreglos se debe asignar la cantidad de elemtos que contendra
		 * Una vez definido el arreglo no puede cambiar de tamaño
		 * */
		
		// Definimos un arreglo de 4 elementos tipo int.
		int[] codigoColores = new int[4];// instanciando un obejro de tipo array de 4 eleementos
		
		String nombreColores[] = new String[4];
		
		// Para agregar elementos a un arreglo, se unduca dentro del corchete el indice
		// El primer elemento es el indice 0 
		nombreColores[0]= "Azul";
		codigoColores[0]= 0x00_00_FF;
		nombreColores[1]= "Amarillo";
		codigoColores[1]= 0xFF_FF_00;
		nombreColores[2]= "Negro";
		codigoColores[2]= 0x00_00_00;
		nombreColores[3]= "Naranja";
		codigoColores[3]= 0xFF_80_00;
		
		
		for (int i = 0; i < nombreColores.length; i++) {
			//System.out.println(nombreColores[i]);
			//System.out.println(codigoColores[i]);
			String texto = String
					.format("El color %s tiene el codigo RGB 0x%06X" , 
							nombreColores[i], codigoColores[i]);
			System.out.println(texto);
		}
		
		// Iterar elementod de un arreglo 
		// Usando for each loop
		for(String nombreColor : nombreColores) {
			System.out.println("El color " + nombreColor);
		}
		
		//Inicializar un arreglo al asignarlo a la variable.
		String[] frutas= {"Uva", "Fresa", "Pera"};
		
		// Arreglo 2d
		
		String[][] people = new String [3][5];
	

	}

}
