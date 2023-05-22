package org.generation;

public class Variables {
  public static void main(String arg[]) { 
	  /* Reglas para el nombre de las variables:
	   * - Se distingue entre mayusculas y minusculas
	   * -la longitud del nombre es ilimitada
	   * la variable puede comenzar con;
	   *   >una letra variableUno
	   *   >signo de dolas $variableDos
	   *   >caracter de subrayado _variableTres
	   */   
	 // int $myVar // es valido, pero no se recomienda
	  //int _myVar // es valido, pero no se recomienda
	  // int #myVar // no es valido
	  //int myVarEspañol // es valio, pero se recomiendan las valiables en ingles
	  // int 5comentatios // no es valido 
	  //int sinC0m3nt4r10s // e valido
	  
	  /*
	   * En Java tendremod los siguientes tipos de variables.
	   * Variables de instancia (Non static fields): atributos de los objets.
	   * Variables de clase (Static Fields): atributos de la clase.
	   * Variables locales (local variables): variables dentro de las funciones(metodos)
	   * Parametros (parameters): Entrada de las funciones
	   * */
	  
	  /**
	   * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	   * Tipos de datos en Java
	   * - Objetos
	   * - Datos primitivos
	   * - 8 datos primitivos
	   *  >byte
	   *  >short
	   *  >int
	   *  >long
	   *  >float
	   *  >double
	   *  >boolean
	   *  >char
	   * 
	   * */
	  
	
	  
	  // el tipo byte de de 8 bits almacena datos numericos enteros.
	  // Obtener el valor maximo y minimo del ripo byte, usando su
	  // wrapper (clase envolvente) Byte.
	  // 2^8=256
	  byte myVarByte= 12;
	  System.out.println("byte: " + myVarByte);
	  System.out.println("Byte, Max value: " + Byte.MAX_VALUE);
	  System.out.println("Byte, Min value: " + Byte.MIN_VALUE);
	
	  // El tipo short es de 16 bits, almacena datos numericos enteros.
	  // 2^16=65,536
	  short myVarShort = 500;
	  System.out.println("short: " + myVarShort);
	  System.out.println("Short, Max value: " + Short.MAX_VALUE);
	  System.out.println("Short, Min value: " + Short.MIN_VALUE);
	  
	  // EL tipo int es de 32 bits, almacena datos numericos enteros.
	  //2^32=4,294`967,296
	  int myVarInt = 1000000;
	  System.out.println("int: " + myVarInt);
	  
	  // el wrapper para int => Integer
	  System.out.println("Integert, Max value: " + Integer.MAX_VALUE);
	  System.out.println("Integert, Min value: " + Integer.MIN_VALUE);
	  
	  // El tipo long es de 64 bits, almacena datos numericos enteros
	  // 2^64
	  // Para indicar una literal numericas de tipo long, hay que indicar
	  // la literal con la letra l o L
	  long myVarLong = 12345678900L;
	  System.out.println("long: " + myVarLong);
	  System.out.println("Long, Max value: " + Long.MAX_VALUE);
	  System.out.println("Long, Min value: " + Long.MIN_VALUE);
	  
	  //-----------------------------------------------------------------
	  // El tipo float es de 32 bits, almacna datos numericos de punto flotante (real).
	  // Para indicar una literal numerica de tipo Float ahayq ue poner la F al final.
	  float myVarFloat = 1500.6523F;
	  System.out.println("long: " + myVarFloat);
	  System.out.println("Float, Max value: " + Float.MAX_VALUE);
	  System.out.println("Float, Min value: " + Float.MIN_VALUE);
	  
	  // Las literales numericas enteras son de tipo int
	  // Las de tipo float son double
	  // El tipo double es de 64 bits, almacena de punto flotante
	  double myVarDouble = 1500.6523;
	  System.out.println("double: " + myVarDouble);
	  System.out.println("Float, Max value: " + Double.MAX_VALUE);
	  System.out.println("Float, Min value: " + Double.MIN_VALUE);
	  
	  //-----------------------------------------------------------------------------------------
	  // El tipo boolean solo almacena true o false
	  boolean myVarBoolean = true;
	  
	  // EL tipo char solo almacena un caracter, se debe definir la literal
	  // entre apostrofes ej 'a'. Solo almacena caracteres de la tamba unicode (16bits)
	  // por lo que puede lmacenar del 0 al 65,535.
	  char losPandillerosDeLaTarde = 'I';
	  System.out.println("char: " + losPandillerosDeLaTarde);
	  
	  // Podems definir un char por su codigo Unicode o sus valores numericos
	  char letraL = '\u004c'; //L
	  System.out.println("La letra: "+ letraL);
	  char letraS =83;
	  System.out.println("La letra: " + letraS);
	  
	  //----------------------------------------------------------------------------------------
	  // Formas de representar un numero
	  // Representacion decimal 
	  System.out.println("Representacion decimal: " + 260);
	  System.out.println("Representacion hexadecimal: " + 0x1a);
	  System.out.println("Representacion binaria: " + 0b11010);
	  
	  // Para las literales numericas se puede usar el guin bajo _para separar numeros
	  // Pero no se puede poner al _inicio ni al final_ de la litral
	  // Tampoco se debe escribir junto a un punto decimal ._
	  // Ni junto a F o L
	  int numerosSeparados = 12_345;
	  System.out.println(numerosSeparados);
	  
	  
	  //-------------------------------------------------------------------------------------------
	  // Conversion de tipo de datos
	  //upcasting
	  byte coquita600ml= 60;
	  short coquita2000ml = coquita600ml;
	  System.out.println("coquita? " + coquita2000ml);
	  //downcasting+
	  short pozoleGrande1L = 259;
	  byte pozoleBurbuja = (byte) pozoleGrande1L;
	  System.out.println("Pozole arreglado: " + pozoleBurbuja);
	  
	  //-------------------------------------------------------------------------------------------
	  // Objetos de tipo String
	  // Se define entre comillas dobles.
	  // Si deseas imprimir comillas dobles en el mensaje, se una el caracter escape \
	  // tipos de escapes \b (backspace), \t (tab), \n (line feed), 
	  // \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash).

	  String myVarString = "Holi \"Crayoli\"";
	  System.out.println("Mensaje string: " + myVarString);
	  
	  // Convertir de string a numeros
	  byte edadMascota = Byte.parseByte("10");
	  System.out.println(edadMascota);
	  double edadPlaneta = Double.parseDouble("456.8956");
	  System.out.println(edadMascota +" , " + edadPlaneta);
	  
	  // Convertir numeros a string 
	  String edadString = String.valueOf(456); 
	  System.out.println("El numeor de digitos en edadString =" + edadString.length());
	  // Obteniendo el primer caracter de un String.
	  System.out.println("El primer caracter de "+ edadString + " es: " +edadString.charAt(0));
	  
	  //-------------------------------------------------------------------------------------------------------
	  // Operadores numericos.
	  int opA = 20;
	  int opB = 10;
	  int opC = 11;
	  int suma = opA + opB;
	  int resta = opA - opB;
	  int multiplica = (int)(opA * opB*1.2);
	  double multi = opA * opB * 1.2;
	  double div =opB*1.0/opC;
	  double residuo = opC%3.2;
	  
	  System.out.println(suma);
	  System.out.println(resta);
	  System.out.println(multi);
	  System.out.println(multiplica);
	  System.out.println(0.01+0.03);
	  System.out.println(div);
	  System.out.println(residuo);
	  
	  int valorInicial = 10;
	  System.out.println("Preincremento " + ++valorInicial);
	  System.out.println("Postincremento " + valorInicial++);
	  System.out.println("Valor final " + valorInicial );
	  valorInicial = 33;
	  System.out.println("Preincremento " + --valorInicial);
	  System.out.println("Postincremento " + valorInicial--);
	  System.out.println("Valor final " + valorInicial);
	  
	  // Operaciones con valores enteros 
	  byte edadGato = 10;
	  short dobleDeEdad = (short)(edadGato * 2);
	  System.out.println(dobleDeEdad);
	  
	  //Operadores comparativos 
	  // El Resultado es boolano 
	  // <, <=, >=, == !=
	  int numEmpleados = 1000;
	  System.out.println("Empleados > 100 " + (numEmpleados >1000));
	  System.out.println("Empleados >= 100 " + (numEmpleados >= 1000));
	  System.out.println("Empleados == 100 " + (numEmpleados == 1000));
	  System.out.println("Empleados != 100 " + (numEmpleados !=1000));
	  
	  // Operadores logicos
	  // && (AND) retorna true si ambos operadores son true
	  // || (ROR) retorna true si cualquera de los operadors es true
	  // !  (NOT) invierte el resultado booleano 
	  
	  System.out.println("Empleados > 0 && empleados < 200 "+
	               (numEmpleados > 0 && numEmpleados<2000));
	 // System.out.println("Empleados > 0 && empleados < 200 "+
		//	  (2000>numEmpleados>0));
	  
	  boolean a =true;	  
	  boolean b =false;	  
	  boolean c =true;
	  
	  System.out.println( (a && b )|| (a && c));
	  System.out.println( (a || b || c && a));
	  System.out.println( !(a || b )&& (a || c));
	  System.out.println( a || b && c || a && b);
	  
	  //----------------------------------------------------------------------------------
	 // int dividePorCero = 45/0; 
	 // System.out.println(dividePorCero);
	  
	  
	  
  }
}