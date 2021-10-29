package com.maquina.TW004_refrescos;

import java.util.Random;

public class PruebasMaquina {

	//atributos
	  public static Refresco[] refrescos= new Refresco[]{
			new Refresco("Cola",80,25),
			new Refresco("Naranja",70,25),
			new Refresco("Limon",60,25),		
	};
	
	

	public static void main(String[] args) {
		
		Random r = new Random();
		Random r2 = new Random();
 
		
	 Maquina abba = new Maquina( 50, refrescos[r.nextInt(3)]);
	 
	 //Ventas al azar
	 for (int i = 0; i < 6; i++) {
		
		 		 
		 if(abba.getCambios()>0) //compruebo que haya cambios
		 {	
			 System.out.println("*****************************************");
			 System.out.println("Intento "+ (i+1) +" de vender un refresco");
			 System.out.println("-----------------------------------------");
			 abba.venta(r.nextInt(60)+60);//dinero ingresado al azar
			 }; 
		 
		 abba.setRefresco(refrescos[r2.nextInt(3)]);//cambio de refresco vendido al azar
		 		 
	}
	 	
		
	}//fin main
	
	

}
