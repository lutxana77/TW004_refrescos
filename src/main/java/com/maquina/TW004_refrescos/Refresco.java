package com.maquina.TW004_refrescos;

public class Refresco {

	//Atributos
	String tipo;
	int precio;
	int cantidad;
	
	//Metodos
	public Refresco(String tipo, int precio, int cantidad) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}
	
	public double estado()
	{
		return cantidad;
	}


}
