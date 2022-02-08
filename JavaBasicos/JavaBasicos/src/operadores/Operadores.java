package operadores;+

public class Operadores {
	public static void main(String[] args) {
		// Operadores aritmeticos
		// +, -, /, *, %
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1+c);
		//resta
		System.out.println("El resultado de la resta es "+(a-b));
		//Division
		int division = a/b;
		System.out.println("El resultado de la división es: " + division);
		double division2 = (double)a / b;
		System.out.println("El resultado de la división es: "+ division2);
		// por lo menos uno de los datos debe ser de tipo double para que nos represente 
		// los decimales correctamente
		// 10.0 /20 = 0.5
		System.out.println("El resultado de la división es: "+ division2);
		//multiplicacion
		double multiplicacion = c*a;
		System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
		//modulo
		double modulo = a%c;
		System.out.println("El modulo del residuo es: "+modulo);
		
		/*
		 * 
		 * Operador de asignación
		 * =
		 */
		int d = 5, e; // inicializar las variables vacías
		e=6;
		System.out.println(d+ " - "+ e);
		//operadores de declaracion compuesta
		// +=, -=, *=,/=, %=
		//una operacion simplificada
		int f = 0, g = 5;
		f += 5;
		System.out.println(f);
		//operadores relacionales
		/*
		 * <,>,<=,>=
		 * == igualdad
		 * != diferencia
		 * 
		 * */
		int h= 15, i= 25;
		String j = "Hola";
		System.out.println(h>1); // false

		System.out.println(i!=h);
		//System.out.println(h!=j); son valores distintos y no se pueden comparar
		//operador unario
		/*
		 * ++, --
		 * preasignacion -- ++k se le asigna un valor antes de usarse
		 * postasignacion -- k++ primero lee el valor y despues le suma 1
		 */
		int k =0, l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		//Precedencia de operadores
		int operacion = (4+5) *6 /3; //14
		// 5*6= 30
		//30/3=10
		//4+10 = 14
		System.out.println(operacion);
		int x= 0, y= 0;
		int operacion2 = ++x + y--;
		// x = 1, Y= 0 ;
		System.out.println(operacion2);//1
		//Operador ternario
		// es un if...else abreviado
		//solo nos permite tomar una decisión
		int edad = 19, valor1 = 0, valor2= 1;
		
		int resultado = (edad <=18)? (valor1 = 2) : (valor1 = 3);
		// int resultado = (edad<=18) ? "Uno" : "dos";
		//parentesis son opcionales
		System.out.println(resultado);
		
		// Operadores Lógicos
		// And - &&
		// or - ||
		// not !
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		System.out.println(true||false);//true
		System.out.println(true&&!false);//true
		
				}
}
