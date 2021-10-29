package com.maquina.TW004_refrescos;


public class Maquina {

	//Atributos
	private int	 cantidadVentas;
	private int ganancias;
	private int dineroCambio;
	private Refresco refresco;
	
	//para usar aqui
		private Refresco[] refrescos= new Refresco[]{
				new Refresco("Cola",80,25),
				new Refresco("Naranja",70,25),
				new Refresco("Limon",60,25),		
		};
	
	//Metodos
	public Maquina(int dineroCambio, Refresco refresco) {
		super();
		this.ganancias = 0;
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


	public double getGanancias() {
		return ganancias;
	}

	public void setGanancias(int cantidadDinero) {
		this.ganancias = cantidadDinero;
	}

	public Refresco getRefresco() {
		return refresco;
	}

	public void setRefresco(Refresco refresco) {
		this.refresco = refresco;
	}
	
	public void crearInformes() {
		
		System.out.println("------------------");
		System.out.println(refresco.toString());
		System.out.println("Ventas realizadas "+ getCantidadVentas());
		System.out.println("Ganancias obtenidas "+ getGanancias());
		System.out.println("------------------");
	}
	
	public void estadoActual() {
		System.out.println("La maquina tiene "+ numRefrescos()+" refrescos  y  "+dineroCambio+" euros para cambios" );
	}
	
	public void venta(int dineroIngresado) {
		
		if(dineroCambio >= dineroIngresado - refresco.getPrecio()) {
			
			if(refresco.cantidad > 0 ) {
				cantidadVentas += 1;
				ganancias += refresco.getPrecio();
				dineroCambio = dineroIngresado - refresco.getPrecio();
				this.refresco.cantidad -=1;
			}else {System.out.println("No se puede comprar por falta de Stock");}
			
		}else {System.out.println("No se puede comprar por falta de cambios");};
			
	}
	
	public int numRefrescos() {
		
		return refrescos[0].cantidad + refrescos[1].cantidad + refrescos[2].cantidad;
	}

}
