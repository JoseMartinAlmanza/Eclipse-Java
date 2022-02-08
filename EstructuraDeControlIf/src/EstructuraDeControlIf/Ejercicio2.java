package EstructuraDeControlIf;

import java.util.Scanner;

public class Ejercicio2 {
	//Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido
	public static void main(String[] args) {
		System.out.println("Introduce tu primer angulo papi");
		    Scanner scanner1 = new Scanner(System.in);
			float numero1= scanner1.nextFloat(); 
			System.out.println("Introduce tu segundo angulo bb");
			Scanner scanner2 = new Scanner(System.in);
			float numero2= scanner2.nextFloat();
			System.out.println("Introduce tu tercer angulo muñecote");
			Scanner scanner3 = new Scanner(System.in);
			float numero3= scanner3.nextFloat();
			float total = numero1+numero2+numero3;
			if(total==180) {
				System.out.println("Tu Triangulo es valido, HERMANAZO");
			}
			else {
				System.out.println("Te faltan angulos, bro");
			}
	}
}
