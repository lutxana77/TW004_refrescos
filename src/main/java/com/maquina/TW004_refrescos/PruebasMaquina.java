package com.maquina.TW004_refrescos;

import java.util.Random;

public class PruebasMaquina {

	
	
	
	private static Maquina abba;

	public static void main(String[] args) {
		
	
		Random r = new Random(3);
		
		 Refresco[] refrescos= new Refresco[]{
				new Refresco("Cola",80,25),
				new Refresco("Naranja",70,25),
				new Refresco("Limon",60,25),		
		};
		
	 int abc = r.nextInt(3);
		
	 abba = new Maquina( 200, refrescos[abc]);
	 
	 abba.venta(110);
	 abba.estadoActual();
	 abba.crearInformes();
	 
	 abba.venta(100);
	 abba.estadoActual();
	 abba.crearInformes();
		
	}

}
