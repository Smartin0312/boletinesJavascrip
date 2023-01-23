package boletin1;

public class actividad7 {
	public static void main(String[]args){
		/* a)*/
		System.out.println("este es el ejercicio a con while");
		int numero1 = 0;
		while(numero1!=101) {
			System.out.println(numero1);
			numero1++;
		}
		System.out.println("este es el ejercicio a con for ");
		for (int i=0; i<100; i+=1) { 
			System.out.println(i);}
		int numero11=0;
		System.out.println("este es el ejercicio a con DO while");
		do {System.out.println(numero11);
		numero11++;}
		while(numero11>101);
		
			
			
		/* b)*/		
		System.out.println("este es el ejercicio b con while");
		int numero2 = 100;
			while(numero2<0) {
				System.out.println(numero2);
				numero2=numero2-1;}
			System.out.println("este es el ejercicio b  con for ");
			
		for (int i11=100; i11<100; i11-=1) { 
			System.out.println(i11);}
		System.out.println("este es el ejercicio b con DO while");
		int numero3 = 100;
		do {System.out.println(numero3);
		numero3=numero3-1;}
		while(numero3>0);
		
		
		
		/* c)*/
		System.out.println("este es el ejercicio C con while");
		int numero4 = 0;	
		while(numero4<=100){
		System.out.println(numero4);
		numero4=numero4+5;
		}
		System.out.println("este es el ejercicio C con for");
		for (int i2=0;i2<=100;i2+=5) {
		System.out.println(i2);
		}
		System.out.println("este es el ejercicio C con DO while");
		int numero5 = 0;
		do {System.out.println(numero5);
		numero5=numero5+5;}
		while(numero5<=100);
		
		
	
	}
}
	
