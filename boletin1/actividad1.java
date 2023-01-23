package boletin1;

import java.util.Scanner;


public class actividad1 {

	
	public static void main (String [ ] args) {	
		System.out.println ("Por favor introduzca un numero por teclado:");
        int primerNumero = new Scanner (System.in).nextInt ();
        
        System.out.println ("Por favor introduzca un numero por teclado:");
        int segundNumero = new Scanner (System.in).nextInt ();
        
       if (primerNumero%segundNumero==0) {
    	   System.out.println ("Son multiplos ");
       }else {
    	   System.out.println ("no son multiplos ");
       }
      
        
}
		 
}
