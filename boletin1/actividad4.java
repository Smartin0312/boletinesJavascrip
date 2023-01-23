package boletin1;

import java.util.Scanner;

public class actividad4 {
	public static void main(String asrg[]){
		
	System.out.println("dime la nota practica");
	double notaPractica = new Scanner (System.in).nextInt ();
	System.out.println("dime la nota de los problemas");
	double notaProblemas = new Scanner (System.in).nextInt ();
	System.out.println("dime la nota de la teoria");
	double notaTeorica = new Scanner (System.in).nextInt ();
	double notaFinal= (notaPractica*0.1)+(notaProblemas*0.5)+(notaTeorica*0.4);
	if(notaPractica<0||notaTeorica<0||notaProblemas>10||notaPractica>10||notaTeorica>10||notaProblemas>10 ) {
		System.out.println("error ");
	}else {
		System.out.println("tu nota final es "+ notaFinal);
		if (notaFinal>=9) {
			System.out.println("Tienes un Sobresaliente");
		}else if(notaFinal>=7&& notaFinal<=8){
			System.out.println("Tienes un Notable ");
		}else if(notaFinal<=7&& notaFinal>=6) {
			System.out.println("Tienes un Bien ");
		}else if (notaFinal>=5&&  notaFinal<6) {
			System.out.println("Tienes un Suficiente");
		}else {
			System.out.println("Tienes un insuficiente ");
		}
	}
	
	
		
		
		
		
		
		
		
		
	}




}
