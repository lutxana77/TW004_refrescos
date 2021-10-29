package com.maquina.TW004_refrescos;

public class PruebasMaquina {

	
	
	
	private static Maquina abba;

	public static void main(String[] args) {
		
	
		
		
	Refresco ab = new Refresco("Cola",80,25);
		
	 abba = new Maquina( 200, ab);
	 
	 abba.venta(110);
	 abba.estadoActual();
	 abba.crearInformes();
	 
	 abba.venta(100);
	 abba.estadoActual();
	 abba.crearInformes();
		
	}

}
