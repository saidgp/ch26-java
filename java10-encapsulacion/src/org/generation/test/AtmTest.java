package org.generation.test;

import com.citibanamex.Atm;

public class AtmTest {

	public static void main(String[] args) {
		System.out.println("Counter Atm: "+ Atm.getCounterAtm());

		Atm cajeroA = new Atm(10_000.00);
		Atm cajeroB = new Atm();
		Atm cajeroC = new Atm();
		Atm cajeroD = new Atm("88000");
		try{
		cajeroA.deposit(4000);
		System.out.println(cajeroA.displayInfo());
		
		cajeroA.withdraw(3000);
		System.out.println(cajeroA.displayInfo());
		
		cajeroA.withdraw(9000);
		System.out.println(cajeroA.displayInfo());
		
		cajeroA.withdraw(8000);
		System.out.println(cajeroA.displayInfo());

		System.out.println( cajeroA.getLog()  );
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println("Carjero: " +  cajeroA.serialNumber + " Tiene $" + cajeroA.balance );
//		System.out.println("Carjero: " +  cajeroB.serialNumber + " Tiene $" + cajeroB.balance );
//		System.out.println("Carjero: " +  cajeroC.serialNumber + " Tiene $" + cajeroC.balance );
//		System.out.println("Carjero: " +  cajeroD.serialNumber + " Tiene $" + cajeroD.balance );

	}
}
