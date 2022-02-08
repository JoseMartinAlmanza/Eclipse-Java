package Ciclos;

public class Contador {
/*
 * Crea una clase llamada contador

Escribe un ciclo que haga que un contador vaya de 15 a 90, contando de 3 en 3.

 */
	public static void main(String[] args) {
		int ciclo = 15;
		while(ciclo <=90) {
			System.out.println("Ciclo = " + ciclo);
			ciclo=ciclo+3;
		}
		for(int i=15; i<=90; i=i+3) {
			System.out.println("i = "+i);
		}
		int control= 15;
		do {
			
			System.out.println("Control = " +control);
			control=control+3;
		} while(control <=90);  
	}
}
