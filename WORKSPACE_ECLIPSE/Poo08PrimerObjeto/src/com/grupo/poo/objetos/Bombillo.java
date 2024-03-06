package com.grupo.poo.objetos;

public class Bombillo {

	protected int cantidadLumens;
	protected String tipoAhorro;
	protected String colorLuz;	
	protected String tipoBombillo;
	
	private boolean prendido;

	//CONSTRUCTOR
	public Bombillo() {
		System.out.println("EL CONSTRUCTOR!!!!");
		this.cantidadLumens = 30000;
	}
	
	public Bombillo(int cantidadLumens,  String colorLuz, String tipoAhorro, String tipoBombillo) {
		super();
		this.cantidadLumens = cantidadLumens;
		this.tipoAhorro = tipoAhorro;
		this.colorLuz = colorLuz;
		this.tipoBombillo = tipoBombillo;		
	}	
	
	public int getCantidadLumens() {
		return cantidadLumens;
	}

	public String getTipoAhorro() {
		return tipoAhorro;
	}	

	public String getColorLuz() {
		return colorLuz;
	}		

	public String getTipoBombillo() {
		return tipoBombillo;
	}
	
	public boolean isPrendido() {
		return prendido;
	}

	public void encender() {
		this.prendido = true;
	}
	public void apagar() {
		this.prendido = false;
	}
	
	
	
}
