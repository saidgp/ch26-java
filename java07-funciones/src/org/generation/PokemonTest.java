package org.generation;
 
public class PokemonTest {

	public static void main(String[] args) {
		System.out.println("Los pokemones son: " + Pokemon.nacimiento );
		
		//Sacnner sc = new Scaner(System.in);

		Pokemon pikachu = new Pokemon("Pikachu",41,6 );
		Pokemon vamoACalmarno = new Pokemon("Squirtle", 51, 9);
		
		pikachu.nombre = "Pikachu";
		vamoACalmarno.nombre="Squirtle";
		
		System.out.println(pikachu.nombre + " mide: " +pikachu.alturaCm+ " cm y pesa: " + pikachu.pesoKg + " kg" );
		System.out.println(vamoACalmarno.nombre);
		
		
	}

}
