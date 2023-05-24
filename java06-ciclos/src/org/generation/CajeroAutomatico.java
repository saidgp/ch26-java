package org.generation;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		double dinero = Math.round(10000*100d)/100d;
		Scanner sc = new Scanner(System.in );
		String opcion;
		double subopcion;
		int salir;
		double deposito;
		int exit= 0;
		
		StringBuilder strBuilder = new StringBuilder();
		StringBuilder strBuilderDeposit = new StringBuilder();
		
		do {
		System.out.printf( "%nElija una de las siguientes opciones%n 1) Retirar dinero%n 2) Hacer depositos%n 3) Estado de cuenta%n 4) Quejas\n 5) Ver ultimo moviemiento%n 9) Salir del cajero%n");
		
		opcion=sc.nextLine();
		salir=0;
		
		switch (opcion) {
			case "1": {
				exit= 0;
				int caseUno = 0;
				while(caseUno != 1) {
				System.out.printf("--------------------------------------------\n");
				System.out.printf("¿Cuanto dinero desea retirar? \n");
				System.out.printf("Usted tiene: $%.2f pesos disponibles\n",dinero);
				System.out.printf("El limite maximo de retiro es: $6,000.00\n");
				System.out.printf("Solo contamos con billetes de $50.00\n");
				System.out.printf("--------------------------------------------\n");
				subopcion=sc.nextInt();
				
				if (subopcion%50 == 0 && subopcion<= 6000 && subopcion <= dinero ) {
					dinero=dinero-subopcion;
					System.out.printf("--------------------------------------\n");
					System.out.printf("Usted ha retirado $%.2f pesos\n", subopcion);
					System.out.printf("Su nuevo saldo es  $%.2f pesos\n", dinero);
					System.out.printf("--------------------------------------\n");
					
					Date date = new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
				
					strBuilder.delete(0,strBuilder.length());
					strBuilder.append("La fecha de su ultimo retiro es: ");
					strBuilder.append(dateFormat.format(date));
					strBuilder.append(" por un total de $ ");
					strBuilder.append(subopcion);
					
					System.out.printf("-------------------------------------------\n");
					System.out.printf("¿Desea donar $200 para los gatetes?\n");
					System.out.printf("Preione 1 para donar\n");
					System.out.printf("-------------------------------------------\n");
					subopcion=sc.nextInt();
					if(subopcion== 1) {
						dinero=dinero-200;
					System.out.printf("-------------------------------------------\n");
					System.out.printf("Los gatetes le dan las gracias\n");
					System.out.printf("-------------------------------------------\n");	
					}else {
						System.out.printf("-------------------------------------------\n");
						System.out.printf("Los gatetes recordaran esto\n");
						System.out.printf("-------------------------------------------\n");	
					}
					caseUno = 1;
					
				}else {
					System.out.printf("--------------------------------------\n");
					System.out.printf("Lo sentimos debe digitar con numeros\n");
					System.out.printf("La cantidad menor a $6,000.00\n");
					System.out.printf("Recuerde que solo contamos con billetes de $50.00\n");
					System.out.printf("--------------------------------------\n");
				}

				}
				
				break;
			}
			case "2":{
				exit= 0;
			int caseUno = 0;
			while(caseUno != 1) {
				System.out.printf("--------------------------------------------\n");
				System.out.printf("¿A que cuenta desea depositar? \n");
				System.out.printf("1) Cuenta de cheques\n");
				System.out.printf("2) Deposito a tarjeta de credito\n");
				System.out.printf("--------------------------------------------\n");
				subopcion=sc.nextInt();
				if(subopcion==1){
					System.out.printf("--------------------------------------------\n");
					System.out.printf("¿Cuanto dinero desea depositar \n");
					System.out.printf("Usted tiene: $%.2f pesos disponibles\n", dinero);
					System.out.printf("Solo puede depositar multiplos de $50.00\n");
					System.out.printf("--------------------------------------------\n");
					subopcion=sc.nextInt();
					
					if(subopcion%50 == 0 && subopcion>=50 ) {
					dinero=dinero+subopcion;
						System.out.printf("--------------------------------------\n");
						System.out.printf("Usted ha depositado $%.2f pesos\n", subopcion);
						System.out.printf("Su nuevo saldo es  $%.2f pesos\n", dinero);
						System.out.printf("--------------------------------------\n");
						Date dateDeposit = new Date();
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
					
						strBuilderDeposit.delete(0,strBuilderDeposit.length());
						strBuilderDeposit.append("La fecha de su ultimo deposito a su cuenta de cheques es: ");
						strBuilderDeposit.append(dateFormat.format(dateDeposit));
						strBuilderDeposit.append(" por un total de $ ");
						strBuilderDeposit.append(subopcion);
						caseUno = 1;
						}else {
	  					    System.out.printf("----------------------------------------\n");
							System.out.printf("Porfavor elija una cantidad valida\n");
							System.out.printf("----------------------------------------\n");	
						}
				}else if (subopcion==2) {
					System.out.printf("--------------------------------------------\n");
					System.out.printf("¿Cuanto dinero desea depositar \n");
					System.out.printf("Usted tiene: $%.2f pesos disponibles\n", dinero);
					System.out.printf("Puede depositar cantidades hasta con centavos\n");
					System.out.printf("--------------------------------------------\n");
					deposito=sc.nextFloat();
					if (deposito<=dinero) {
						dinero=dinero-deposito;
						System.out.printf("--------------------------------------\n");
						System.out.printf("Usted ha depositado $%.2f pesos\n", deposito);
						System.out.printf("Su nuevo saldo es  $%.2f pesos\n", dinero);
						System.out.printf("--------------------------------------\n");
						
						Date dateDeposit = new Date();
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
						deposito=Math.round(deposito*1000);
						strBuilderDeposit.delete(0,strBuilderDeposit.length());
						strBuilderDeposit.append("La fecha de su ultimo deposito a su tarjeta de credito es: ");
						strBuilderDeposit.append(dateFormat.format(dateDeposit));
						strBuilderDeposit.append(" por un total de $ ");
						strBuilderDeposit.append(deposito/1000);
						caseUno = 1;
						}else {
							System.out.printf("----------------------------------------\n");
							System.out.printf("Porfavor elija una cantidad valida\n");
							System.out.printf("----------------------------------------\n");	
						}
					
				}
			}
			break;
			}
			
			case "3": {
				exit= 0;
				System.out.printf("--------------------------------------\n");
				System.out.printf("Usted tiene: $%.2f pesos disponibles\n", dinero);
				System.out.printf("--------------------------------------\n");
				break;
			}
			case "4":{
				exit= 0;
				System.out.printf("----------------------------------------\n");
				System.out.printf("Pronto tendremos esta opcion habilitada\n");
				System.out.printf("----------------------------------------\n");
				break;
			}
			case "5":{
				exit= 0;
				System.out.printf("------------------------------------------------------------------------------------------------------------\n");
				System.out.println(strBuilder.toString());
				System.out.println(strBuilderDeposit.toString());
				System.out.printf("------------------------------------------------------------------------------------------------------------\n");
				break;
			}
			
			case "9":{
			
				salir=1;
				System.out.println(salir);
				break;
			}
			
			default:

				exit++;
				if(exit==3) {
					salir=1;
				}else {
					System.out.printf("-----------------------------------------------\n");
					System.out.printf("Oppcion no valida, por favor elija otra opcion\n");
					System.out.printf("-----------------------------------------------\n");
				}
				break;
			}
		}while(salir == 0);
		System.out.printf("------------------------------------------------------\n");
		System.out.printf("Muchas gracias por usar nuestro cajero, vuela pronto\n");
		System.out.printf("------------------------------------------------------\n");
	}

}
