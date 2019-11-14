package principal;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int boton=0;
		
		System.out.println("Bienvenido, con este programa podras usar la calculadora.");
		System.out.println("Para sumar pulse 1.");
		System.out.println("Para restar pulse 2.");
		System.out.println("Para miltiplicar pulse 3.");
		System.out.println("Para dividir pulse 4.");
		boton=Leer.datoInt();
		
		switch (boton) {
		case 1:
			
			break;
		case 2:
			
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
