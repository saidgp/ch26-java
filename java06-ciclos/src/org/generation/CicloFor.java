package org.generation;

import java.util.Iterator;

public class CicloFor {
	public static void main(String[] args) {
		/*
		 * Sintaxis:
		 * 
		 * for(espresion_inicial ; expresion  ; expresion_final)
		 * instruccion;
		 * 
		 * for(espresion_inicial ; expresion  ; expresion_final){
		 * instrucciones}
		 * 
		 * 
		 * 
		 * */
		// imprimir 5veces hola
	
		for(int i=1; i <= 5; i++ ) {
			System.out.println("Hola " + i);
		}
		
		/*
		 * imprimit la tabla de multiplicar del 1 a 3 hasta *10
		 * 
		 * */
			
		
		int k = 1;
		for(int j=1;j<=3;j++){
			System.out.println("---------------------------------------");
			for(k=1;k <= 10; k++) {
				int r = k*j;
				//System.out.println(j+ " * " + k + " = " + r);
				System.out.printf("tabla en decimal      %02d * %02d = %02d %n",j,k,j*k );
				System.out.printf("tabla en hexxadecimal %02d * %02d = 0x%03x %n",j,k,j*k );
			}
		}
		System.out.println("--------------------------------------");
		outerLoop:
		for(int i = 0 ; i<5;i++) {
			for(int j = 0; j<5;j++) {
				System.out.println(i +" "+ j);
				if( i==2 && j==2) {
					System.out.println("--------------------------------------");
					break outerLoop;}
				
			}
		}
			
		for(int i= 1; i<=20; i++) {
			
			if(i%2==0) 
				continue;
			System.out.println(i);
			
		}
		
		
		
		 
		
	}
}
