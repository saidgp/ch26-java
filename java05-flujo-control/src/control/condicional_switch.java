package control;

import java.util.Scanner;

public interface condicional_switch {

	
	public static void main(String [] args) {
		/* Condicional switch
		 * Sitanxis
		 * 
		 * swith( expresion ){
		 * case valor1: expresion;
		 * 				break;
		 * case valor2: expresion;
		 * 				break;
		 * default:     expresion;
		 * 				break;
		 * }
		 * 
		 * La expresion a evaluar deve se un tipo enrero, string o enum.
		 * la condicional Switch usa el metdodo equals para comparar los String.
		 * */
		
//-----------------------------------------------------------------------------------------------------------
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12
		 *    salida->  Naciste en diciembre.
		 * 
		 */
		
		 Scanner myScan;
	     myScan = new Scanner(System.in);
	      
	     System.out.println("Escribe el numero de tu mes de nacimiento => ");
	     String month= myScan.nextLine();
	     String mes;
	    
		    
	    switch (month) {
		case "1": {
			mes = " Enero";
			break;
		}
		case "2": {
			mes= " Febrero";
			break;
		}
		case "3": {
			mes = " Marzo";
			break;
		}
		case "4": {
			mes = " Abril";
			break;
		}
		case "5": {
			mes = " Mayo";
			break;
		}
		case "6": {
			mes = " Junio";
			break;
		}
		case "7": {
			mes =  " Julio";
			break;
		}
		case "8": {
			mes= " Agosto";
			break;
		}
		case "9": {
			mes=  " Septiembre";
			break;
		}
		case "10": {
			mes = " Octubre";
			break;
		}
		case "11": {
			mes = " Noviembre";
			break;
		}
		case "12": {
			mes =  " Diciembre";
			break;
		}
		default:
			mes =  "pera ese no es un mes";
			break;
		}
	       System.out.println("El mes en el que naciste es" + mes);
	       
	    // La estación correspondiente al mes de nacimiento.
	    			// ej: La estación es invierno.
	    			// 12, 1, 2 : invierno
	    			// 3, 4, 5 : primavera
	    			// 6, 7, 8 : verano
	    			// 9, 10, 11 : otoño

	    String station;
	    switch (mes) {
	    case "Dicembe","Enero", "Febrero": {
				station = " Invierno";
		break;
			}
	    case "Marzo","Abril", "Mayo": {
	    	station = " Primavera";
	    	break;
	    }
	    case "Juni","Julio", "Agosto": {
	    	station = " Verano";
	    	break;
	    }
	    case "Septiembre","Octbre", "Noviembre": {
	    	station = " Otoño";
	    	break;
	    }
	    default:
			station =  "tonces me estas mintiendo ";
			break;
		}
	       System.out.println("Segun tu mes de nacimiento naciste en" + station);
	       
	       
	       
	   
	}
}

	