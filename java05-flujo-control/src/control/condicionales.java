package control;
import java.util.Scanner;

public class condicionales {
	
	public static void main(String[] args) {
		
		/*
		 * JAva 05
		 * Sintaxis de la conicional if
		 * Sa la condicional es verdadera, se ejecuta la instruccion if
		 * 
		 * if( Condicional ) sentencias;
		 * 
		 * if( Condiciona ){
		 * 	Sentencias ;
		 * };
		 * 
		 * if( Condicional ) 
		 * 	Sentencia;
		 * else
		 * 	Sentencia si condional es fala
		 * -------------------------------------------------------------------------------------------------------
		 * 
		 * if ( Condicional ) 
		 * 	Sentencia;
		 * else if( nueva condicional )
		 * 	Sentencia;
		 * .
		 * .
		 * .
		 * 
		 * elsei if (n condicional)
		 * 	sentencia	
		 * else
		 * 	sentencial
		 * */
		
		boolean condicion = false;
		  if(condicion)
			  System.out.println("La condicion es verdadera");
		  else
			  System.out.println("La conicion es falsa");
		  
		  int edad = 19;
		  
		  if(edad >= 18)
			  System.out.println("La perona es mayor de edad ");
		  else
			  System.out.println("La perona es menor de edad ");
		  
//-------------------------------------------------------------------------------------
		  /*
			  * De una variable tipo int, evaluar si está
			  * en el rango de 1 a 10, si es así desplegar en consola
			  * "La selección está en el rango"
			  * En caso contrario "La selección está fuera de rango"
			  */
		  int num = 1;
		  if (num>=1 && num <=10) {
			  System.out.println("La selección está en rango");
		}
		  else {
			System.out.println("La selección está fuera de rango");
		}
		  
//------------------------------------------------------------------------------------------------------
		  /*
		   * Operador ternario.
		   * 
		   * Sintaxis:
		   *  expresion ? respuesta si es true: si es false
		   * */
		  String verdadero = "La selección está en rango";
	        String falso = "La selección está fuera de rango";
	        System.out.println((num <= 10 && num >= 1 )? verdadero : falso);
	        
	      String texto= (num>=1 && num<=10)? "si":"no";
	      System.out.println(texto);
//------------------------------------------------------------------------------------------------------------
//---------------------Clase Scanner--------------------------------------------------------------------------
	      Scanner myScan;
	      myScan = new Scanner(System.in );
//	      System.out.print("Escribe tu nombre => ");  
//	      String myName = myScan.next(); //leer hasta /n
//	      System.out.println("Tu nombre es " + myName);
//	      
//	      String myLastName = myScan.nextLine(); //leer hasta /n
//	      System.out.println("Tu apellido es " + myLastName);
//	      //myScan.nextLine();// limpiamos el buffer
//	      
	      System.out.println("Escribe tu edad en => ");
	      
	      if( myScan.hasNextInt()) {
	    	  int age= myScan.nextInt();
	    	  
	      };
	      String ageTxt = myScan.nextLine(); //leer hasta /n
	      int age =Integer.parseInt(ageTxt);
	      System.out.println("Tu edad es " + age);
//	      
	      
	      
	}
	

}
