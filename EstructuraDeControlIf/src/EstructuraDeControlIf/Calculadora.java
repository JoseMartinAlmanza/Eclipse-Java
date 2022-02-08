package EstructuraDeControlIf;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
	/*
	 *   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) División
		   * 4) Multiplicación
		   * 
		   * y despues imprimir el resultado
	 */
		System.out.println("Dame numero 1: ");
		Scanner scanner1= new Scanner(System.in);
		float numero1= scanner1.nextFloat();
		System.out.println("Dame numero 2: ");
		Scanner scanner2= new Scanner(System.in);
		float numero2= scanner2.nextFloat();
		System.out.println("¿Que deseas hacer? (suma, resta, multiplicacion, division)");
		Scanner scanner3= new Scanner(System.in);
		String operacion= scanner3.nextLine();
		
		
		switch(operacion) {
		case "suma":
		float suma = numero1+numero2;
			System.out.println("El resultado de sumar "+numero1+" y "+numero2+ " es: " +suma);
		
		break;
		case "resta":
			float resta = numero1-numero2;
			System.out.println("El resultado de restar "+numero1+" y "+numero2+ " es: " +resta);
			
		break;
		case "multiplicacion":
			float multiplicacion = numero1*numero2;
			System.out.println("El resultado de multiplicar "+numero1+" y "+numero2+ " es: " +multiplicacion);
			
		break;
		case "division":
			float division = numero1/numero2;
			System.out.println("El resultado de dividir "+numero1+" y "+numero2+ " es: " +division);
			
		break;
		default:
			System.out.println("Todo es sin acentos y en minúsculas");
		break;
		}
}
}
