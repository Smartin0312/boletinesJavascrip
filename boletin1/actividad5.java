package boletin1;

import java.util.Scanner;

public class actividad5 {
	public static void main (String[]args) {
		System.out.println("dime que hora es");
		double hora=new Scanner (System.in).nextInt ();
		if (hora>=6 && hora<=12) {
			System.out.println("buenos dias ");
			
		}else if(hora>=13 && hora<=20) {
			System.out.println("buenas tardes");
			
		}else {
			System.out.println("buenas noches");
		}
		
	}
	
	
	
	
	
	
	

}
