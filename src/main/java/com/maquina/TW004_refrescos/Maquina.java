package com.maquina.TW004_refrescos;


public class Maquina {

	//Atributos
	private int	 cantidadVentas;
	private int cantidadDinero;
	private int dineroCambio;
	private Refresco refresco;
	
	//para usar aqui
		private Refresco[] refrescos= new Refresco[]{
				new Refresco("Cola",80,25),
				new Refresco("Naranja",70,25),
				new Refresco("Limon",60,25),		
		};
	
	//Metodos
	public Maquina(int dineroCambio, int cantidadDinero, Refresco refresco) {
		super();
		this.cantidadDinero = cantidadDinero;
		this.dineroCambio= dineroCambio;
		
		//Reconozco el tipo de refresco
		for (Refresco refrescoArray : refrescos) {
			
			if(refresco.getTipo()==refrescoArray.getTipo()) 
			{this.refresco = refrescoArray;}
		}
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}


	public double getCantidadDinero() {
		return cantidadDinero;
	}

	public void setCantidadDinero(int cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}

	public Refresco getRefresco() {
		return refresco;
	}

	public void setRefresco(Refresco refresco) {
		this.refresco = refresco;
	}

	public void estadoActual() {
		System.out.println("La maquina tiene "+ numRefrescos()+" refrescos  y "+cantidadDinero+" euros" );
	}
	
	public void venta(int dineroIngresado) {
		
		if(dineroCambio >= dineroIngresado - refresco.getPrecio()) {
			
			if(this.refresco.cantidad > 0 && this.cantidadDinero >0) {
				cantidadVentas += 1;
				cantidadDinero += refresco.getPrecio();
				dineroCambio = dineroIngresado - refresco.getPrecio();
				this.refresco.cantidad -=1;
			}else {System.out.println("No se puede comprar por falta de Stock");}
			
		}else {System.out.println("No se puede comprar por falta de cambios");};
			
	}
	
	public int numRefrescos() {
		
		return refrescos[0].cantidad + refrescos[1].cantidad + refrescos[2].cantidad;
	}

}
