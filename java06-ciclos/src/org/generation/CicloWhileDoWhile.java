package org.generation;
import java.util.Scanner;

public class CicloWhileDoWhile {

	public static void main(String[] args) {	
		/** ciclo while
		 *Mientras la condicion sea verdadera el ciclocontinua 
		 * Sintaxis:
		 * 
		 * while( condicion ) instruccion;
		 * 
		 * while( condicion ) {
		 * instrucciomes
		 * }
		 */
			
	    Scanner sc = new Scanner(System.in );
		boolean active = true;
		boolean deactive = false;
		
		while(active) {
			System.out.println("Bienvenido Said");
			System.out.println("¿Quieres seguir activo? =>");
			char response = sc.nextLine().toLowerCase().charAt(0);
			if(response != 's' )active = false;
		}
		System.out.println("Gracias por su visita");
	
		
		
		do {
		  System.out.println("Bienvenido Said");
		  System.out.println("¿Quieres seguir activo? =>");
		  char response = sc.nextLine().toLowerCase().charAt(0);
		  if(response == 's' )active = true;
		  else active= false;
		}while(active);
		
		System.out.println("Gracias por su visita");
		
		
		sc.close();
		}
	
	}


