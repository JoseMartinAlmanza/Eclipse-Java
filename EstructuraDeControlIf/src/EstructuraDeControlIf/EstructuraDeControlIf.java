package EstructuraDeControlIf;

import java.util.Scanner;

public class EstructuraDeControlIf {
	//Estructuras de control de flujo 
	// Nos sirve para la toma de decisiones
	
	//Estructuras de control de flujo nos sirven para cambiar el flujo
	// de nuestro programa
	// evaluando una condición y a partir de la evaluación
	// se realiza una acción u otra.
	/*
	 * 
	 * if(condicion){
	 * codigo}
	 * else{
	 * codigo}
	 * 
	 * 
	 */
	public static void main(String[] args) {
	System.out.println("mensaje konichiwa");
	System.out.println("Introduce tu edad");
	Scanner scanner = new Scanner(System.in);
	int edad = scanner.nextInt();
	if(edad>=18) {
		System.out.println("Eres mayor de edad");
	}
	else {
		System.out.println("Eres menor de edad, no puedes votar carnalito");
	}
	}
}
