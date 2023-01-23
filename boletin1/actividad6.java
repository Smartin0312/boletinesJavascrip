package boletin1;

import java.util.Scanner;

public class actividad6 {
		public static void main (String[]args) {
		System.out.println("dime que dia es");
		double fechaDia=new Scanner (System.in).nextInt ();
		System.out.println("dime que mes es");
		double fechaMes=new Scanner (System.in).nextInt ();
		if (fechaMes>=6 && fechaMes<=12) {
			System.out.println("Es primavera ");
			
		}else if(fechaDia>=1 && fechaDia<=12) {
			System.out.println("Es verano");
			
		}else if(fechaDia>=1 && fechaDia<=12) {
			System.out.println("Es invierno");
		}
		else {
			System.out.println("Es otoño");
		} 
	
	
	
	}
}
