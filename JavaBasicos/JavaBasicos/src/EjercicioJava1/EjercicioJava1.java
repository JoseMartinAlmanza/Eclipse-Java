package EjercicioJava1;

import java.util.Scanner;

public class EjercicioJava1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero: ");
		int numeroRegistrado = sc.nextInt();
		sc.close();
		String resultado = (numeroRegistrado%2 ==0) ? "Es par": "Es impar";
		System.out.println(resultado);
	}
}
