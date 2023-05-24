package org.generation.test;

public class ExcepcionesConceptos {

	public static void main(String[] args) {
		/*
		 * Una excepcion es una situacion no esperada
		 * durante la ejecucion de un programa.
		 * 
		 * Existe dos tipos de excpciones.
		 * 
		 * A) Checked Exceptions: Son execpeciones que se heredan 
		 * de la clase Exceptions. Se tiene que declarar la excepcion
		 * en la firma del metodo o bien majer la excepcion con el 
		 * bloque try-catch.
		 * 
		 * B) Unchecked Exeptions: Son escepciones que se heredan de la clase
		 * RuntimeException. No se esta obligado a procesarlas.
		 * Es opcional el uso de try y catch o declara en la firma del metodo.
		 * 
		 * Las excpecones de Error son arrojadas por a JVM, son errores de los 
		 * que no se puede recuperar.
		 * 
		 * Manejo de excepcione con el bloque try-catch
		 * 
		 * try{
		 * 
		 * }catch(expecion e){
		 * 
		 * }
		 * 
		 * try: bloque que contendra sentenciass que pudieran generar una excepcion
		 * catch: se ejecutará si ocurre una excepcion en try
		 * finally: se ejecutara despues de try o catch
		 * 
		 * EL stacktrace de una excepcion es el conjunto de mensaje desde el 
		 * origen de la excepcion hasta la ultima clase que recibe la excepcion.
		 * 
		 * */
		// Arithmetic exception
				System.out.println("Inicio del programa");
				double division;
				int[] myArray = {4,5};
						
				try {					
					division= 5/2;
					myArray[5] = 10;
					readFile();
				} catch (FileNotFoundException e) {		
					e.printStackTrace();
				} catch (ArithmeticException e) {
					e.printStackTrace();
//				} catch (ArrayIndexOutOfBoundsException e) {
//					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
						
				System.out.println("Fin del programa");
							
			}
			
			static void readFile() throws FileNotFoundException {
				File file = new File("myfile.txt");
				Scanner myReader = new Scanner( file  );
			}
			
			
			

		}