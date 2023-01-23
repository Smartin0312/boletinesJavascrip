package boletin1;

import java.util.Scanner;

public class actividad3{

	public static void main(String[]args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("dime que dia quieres saber");
		String dia =scanner.nextLine();
		char character= dia.charAt(0);
		
				
		switch (dia) {
		case ("lunes"): {
			System.out.println("Es lunes , a primera tienes entorno de desarrollo");
			break;
		}
		case ("martes"): {
			System.out.println("Es martes , a primera tienes fol");
			break;
		}
		case ("miercoles"): {
			System.out.println("Es miercoles , a primera tienes sistemas");
			break;
		}
		case ("jueves"): {
			System.out.println("Es jueves , a primera tienes base de datos");
			break;
		}case ("viernes"): {
			System.out.println("Es viernes , a primera tienes sistemas");
			break;
		}
		default:
			System.out.println("el dia no es correcto");
		}
	
		
	
	
	}
}
