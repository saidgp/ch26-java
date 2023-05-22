package org.generation;

public class OperacionesTest {

	public static void main(String[] args) {
		System.out.println("Java 07 Funciones");
		
		OperacionesMath operaciones = new OperacionesMath();
		
		operaciones.sumaEaterosSinRetorno(45,15);
		int r = operaciones.sumaEnteros(9, 10);
		
		System.out.println(r);
		System.out.println(operaciones.sumaEnteros(4, 5));
		
		System.out.println(operaciones.sumaFloat(4.5, 5.5));
		System.out.println(operaciones.sumaFloat(4.0, 5.05));
		
		System.out.println(operaciones.suma(3,3));
		System.out.println(operaciones.suma(2.14, 1.16));
		System.out.println(operaciones.suma(2.14, 1.1, true));
		
		System.out.println(operaciones.raiz(17.8));
		System.out.println(operaciones.raiz(22));
	
		System.out.println(OperacionesMath.valorPi());
		
	}

}
