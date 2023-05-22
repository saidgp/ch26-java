package control;

public interface DatosInmutables {
	
	public static void main(String[] args) {
		//Datos inmutables = No se pueden modificar,
		int nCuentaBancaria = 678;
		nCuentaBancaria=999;
		
		String nombre = "Said";
		String participante = "Sofi";
		nombre = "Alexis";
		participante = new String("Said");
		
		// El operados == nos compara la referencia en los objetos
		// Para comparar  el contenido en los String se debe usar:
		// El metodo equals()
		
		
		//if(participante == "Said") {
		if (participante.equals("Said")) {
			System.out.println("Los nombres concuerdan");
		}
		else
			System.out.println("Los nombres no coinciden");
	}

}
