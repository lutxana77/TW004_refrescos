package com.maquina.TW004_refrescos;
import java.util.Arrays;
import java.util.List;


public class Maquina {

	//Atributos
	private int	 cantidadVentas;
	private int ganancias;
	private int dineroCambio;
	private Refresco refresco;
	private int indexRefresco;	
	public static Refresco[] refrescosActual= new Refresco[]{
				new Refresco("Cola",80,25),
				new Refresco("Naranja",70,25),
				new Refresco("Limon",60,25),		
				};
	
	//Constructor
	public Maquina(int dineroCambio, Refresco refresco) {
		super();
		this.ganancias = 0;
		this.dineroCambio= dineroCambio;
		this.refresco = refresco;
		
		//Reconozco el index de refresco
		for (int i = 0; i <refrescosActual.length-1; i++ ) {
			
			if(refresco.getTipo()==refrescosActual[i].getTipo()) 
			{this.indexRefresco = i;}
		}
	}
	
	//Metodos
	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	
	public double getGanancias() {
		return ganancias;
	}

	public void setGanancias(int cantidadDinero) {
		this.ganancias = cantidadDinero;
	}

	public int getCambios() {
		return dineroCambio;
	}
	public Refresco getRefresco() {
		return refresco;
	}

	public void setRefresco(Refresco refresco) {
		this.refresco = refresco;
	}
	
	//PARTE DE GESTION
	public void crearInformes() {
		
		 System.out.println("-----------------------------------------");
		System.out.println(refresco.toString());
		System.out.println("Ventas realizadas "+ getCantidadVentas());
		System.out.println("Ganancias obtenidas "+ getGanancias());
		 System.out.println("-----------------------------------------");
	}
	
	public void estadoActual() {
		System.out.println("La maquina tiene "+ numRefrescos()+" refrescos  y "+dineroCambio+" ctms para cambios" );
	}
	
	public void venta(int dineroIngresado) {
		
		
		if(dineroIngresado - refresco.getPrecio() >= 0 && dineroIngresado - refresco.getPrecio() <= dineroCambio ) {
			
				if(refresco.cantidad > 0 ) {
					
					cantidadVentas += 1;
					ganancias += refresco.getPrecio();
					dineroCambio += refresco.getPrecio();
					refrescosActual[indexRefresco].cantidad -=1;
					crearInformes();
					estadoActual();
					
				}else {System.out.println("No se puede comprar por falta de Stock");}
				
		}else {System.out.println("Dinero insuficiente");};
			
	}
	
	public int numRefrescos() {
		int m=0;
		for (Refresco r : refrescosActual) {
			m += r.getCantidad();
		}  		
		return m;
	}

}
