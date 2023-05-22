package org.generation;
import java.util.Scanner;

public class CajeroAutomatico {
	public static void main(String[] args) {
	/*
	 * Fecha de entrega lunes 22 de mayo, 22h.
	 * Entregas: archivo .java
	 * Impresion de pantalla: menú, ultimo movimiento antes de salir
	 * 
	 * 
	 * Hacer un menu de un cajero automatico
	 * 
	 * condiciones iniciales: $10,000
	 * 
	 * opciones
	 * 	1) Retirar dinero
	 * 		-Mostrar cantidad disponible a retirar
	 * 		-No se puede retirar mas de $6,000
	 * 		-Solo retirar multiplos de $50 , $100
	 * 		-Preguntar si desea donar }4200 para los Gatetes
	 * 	2) Hacer depositos
	 * 		Mostrar un menu con las opciones:
	 * 		1>Cuenta de cheques
	 * 			-Sumar al saldo disponible
	 * 			-Solo multiplos de $50
	 * 		2>Deposito a tarjeta de credito
	 * 			-Restar al saldo disponible
	 * 			-Se puede incluir decimal (2decimal)
	 * 	3) Estado de cuenta
	 * 		-Mostrar saldo disponible
	 * 	4) Quejas
	 * 		-"No disponible por el momento"
	 * 	5) Ver ultimo moviemiento
	 * 		-El ultimo movimiento ( deposito o retiro)
	 * 		-YYYY/MM/DD hh:mm retiro de $500
	 * 		-YYYY/MM/DD hh:mm deposito a TC de $300.12
	 * 	9) Salir del cajero
	 * 		-Se despide y se sale del sistema.
	 * 
	 * nota:
	 * 		-Si se pulsa una opcon invalida 
	 * 			"opcion invalida y nosnpide que volvamos a intentar"
	 * 			Se despide y se sale del sistema.
	 * 		-en caso de que se puló una opcion invalida y luego 
	 * 			se pulsa una opcion valida, esto no deberia contar 
	 * 			como parte de las opciones consecutivas
	 * 
	 * 
	 * */
		int dinero = 10000;
		Scanner sc = new Scanner(System.in );
		String opcion;
		boolean salir=false;
		do {
		System.out.printf( "%nElija una de las siguientes opciones%n 1) Retirar dinero%n 2) Hacer depositos%n 3) Estado de cuenta%n 4) Quejas5) Ver ultimo moviemiento%n 5) Ver ultimo moviemiento%n 9) Salir del cajero");
		opcion= sc.nextLine();
		 
		switch (opcion) {
			case "3": {
				System.out.printf("Usted tiene: $ %d ", dinero);
				break;
			}
			case "9":{
				salir=true;
			}
			
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(salir == false);
		System.out.println("Salimos del cajero");
	}
	
}
