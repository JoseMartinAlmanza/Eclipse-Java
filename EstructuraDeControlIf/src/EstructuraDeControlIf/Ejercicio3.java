package EstructuraDeControlIf;

import java.util.Scanner;

public class Ejercicio3 {
/*
 * // solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la copra es de 10000 o más 30%

 * */
	public static void main(String[] args) {
		System.out.println("Introduce el total de tu compra: \n");
	    Scanner scanner = new Scanner(System.in);
	    float cuenta= scanner.nextFloat(); 
	    if(cuenta<1000) {
	    System.out.println("No aplica descuento y tu total es: "+cuenta);
	    }else if(cuenta>1000 && cuenta<5000) {
	    	float total = (float) (cuenta*.90);
	    	System.out.println("Ok, aquí si aplica descuento carnalito, tu monto es: "+total);
	    	
	    }
	}
}
