package EstructuraDeControlIf;

import java.util.Scanner;

public class EstructuraDeControlSwitch {
	public static void main(String[] args) {
		//Estructuras de control nos sirve para controlar el flujo de comportamiento
		// de un programa. Para la toma de decisiones 
		/*
		 * switch(condicion_a_evaluar){
		 * case "valor":
		 * codigo a ejecutar 
		 * break
		 * ...
		 * case "n":
		 * codigo a ejecutar
		 * break
		 * default:
		 * codigo a ejecutar
		 */
		// Solicitar al usuario un día de la semana y mostrar un mensaje
		System.out.println("Escribe en minúsculas tu día de la semana, sin acentos");
		Scanner scanner1= new Scanner(System.in);
		String diaDelaSemana= scanner1.nextLine();
		
		switch(diaDelaSemana) {
		case "lunes":
			System.out.println("En efecto, es lunes");
		
		break;
		case "martes":
			System.out.println("Es martesito carnal");
		break;
		case "miercoles":
			System.out.println("Es miércoles");
		break;
		case "jueves":
			System.out.println("Es juebebes");
		break;
		case "viernes":
			System.out.println("Es viernes, AL FIN ES VIEEERNES");
		break;
		case "sabado":
			System.out.println("Sabaduki, que pronto se va el fin de");
		break;
		case "domingo":
			System.out.println("Domingo de estar acostado");
		break;
		default:
			System.out.println("Todo es sin acentos y en minúsculas");
		break;
		}
	
	}
}
