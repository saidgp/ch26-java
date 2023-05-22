package org.generation;
import java.util.Date;


public class OperacionesMath {
	
	void sumaEaterosSinRetorno(int a, int b){
		Date date = new Date();
		System.out.printf("%tT %d + %d = %d %n", date, a, b, a+b);
	};
	
	int sumaEnteros(int a, int b) {
		return a + b;
	};
	
	double sumaFloat(double a, double b) {
		return a+b;
	};
	
	// Sobregarga de metodos (overload)
	// Funciones con el mismo nombre pero con diferentes parametros
	
	int suma(int a, int b) {
		return a + b;
	}
	
	int suma(short a, short b) {
		return a + b;
	}
	
	
	double suma (double unitA, double unitB) {
		return unitA + unitB;
	}
	
	double suma (double unitA, double unitB, boolean redondear) {
		if(redondear)
			return Math.round(unitA + unitB);
		return unitA + unitB;
	}
	
	//sobrecarga un metoo que realiza la raiz cuadrada de 
	//un valor, Un metodo retprna como int, otro netodo retorna
	//como double

	int raiz (int a ) {
		return (int)(Math.round(Math.sqrt(a)));
	}
	
	double raiz (double a ) {
		return  Math.sqrt(a);
	}
	// Metodos estaticos (Static Method)
	/*
	 * Los metodos estaticos estan asosiados a la clase en lifar de la 
	 * instancia.
	 * Se pueden invocar sin tener que instanciar un objeto.
	 * */
	
	static double valorPi() {
		return Math.PI;
	}
}
