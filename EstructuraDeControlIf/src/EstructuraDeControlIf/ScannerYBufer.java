package EstructuraDeControlIf;

import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int numero1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		sc.close();
		System.out.println("Tu nombre es: "+ nombre + ". Tu n�mero es: "+numero1);
	}
}
