package EstructuraDeControlIf;

import java.util.Scanner;

public class Ejercicio {
	private static Scanner scanner2;
	private static Scanner scanner3;

	/*
	 * Pedir 3 números al usuario y mostrar un mensaje con el
	 * número mayor
	 * */
	public static void main(String[] args) {
		
		System.out.println("Introduce numero 1");
		try (Scanner scanner = new Scanner(System.in)) {
			float numero1= scanner.nextFloat(); 
			System.out.println("Introduce numero 2");
			scanner2 = new Scanner(System.in);
			float numero2= scanner2.nextFloat();
			System.out.println("Introduce numero 3");
			scanner3 = new Scanner(System.in);
			float numero3= scanner3.nextFloat();
			if(numero1>numero2 && numero1>numero3) {
				System.out.println("El numero 1 es el MAYORSITO");
			}
			else if(numero2>numero1&&numero2>numero3) {
				System.out.println("El numero 2 es el GRANDESITO");
			} else if(numero3>numero1&&numero3>numero2) {
				System.out.println("El numero 3 es el BICHOOO");
			}
		}
		
	}
	
}
