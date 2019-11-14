package principal;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int boton=0, suma=0, resta=0, cero=0, numero=0;
		
		System.out.println("Bienvenido, con este programa podras usar la calculadora.");
		System.out.println("Para sumar pulse 1.");
		System.out.println("Para restar pulse 2.");
		System.out.println("Para miltiplicar pulse 3.");
		System.out.println("Para dividir pulse 4.");
		boton=Leer.datoInt();
		
		switch (boton) {
		case 1:
			System.out.println("Introduzca los números que quiere sumar separados por intro.");
			System.out.println("Para parar de introducir números y obtener el resultado introduzca 0");
			
			do {
				numero=Leer.datoInt();
				suma=suma+numero;
			} while (numero!=cero);
			System.out.printf("La suma de los números es %d",suma);
			break;
		case 2:
			System.out.println("Introduzca los números que quiere sumar separados por intro.");
			System.out.println("Para parar de introducir números y obtener el resultado introduzca 0");
			
			do {
				numero=Leer.datoInt();
				resta=resta+numero;
			} while (numero!=cero);
			System.out.printf("La suma de los números es %d",resta);
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 0:
			
			break;
			
		default:
			System.out.println("No exixte esta opción.");
			break;
		}
	}

}
