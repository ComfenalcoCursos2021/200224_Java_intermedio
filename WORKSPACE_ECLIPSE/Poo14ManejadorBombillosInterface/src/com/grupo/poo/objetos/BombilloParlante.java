package com.grupo.poo.objetos;

public class BombilloParlante extends BombilloSmart {

	private int volumen;
	public BombilloParlante(int cantidadLumens, String colorLuz, String tipoAhorro, String tipoBombillo) {
		super(cantidadLumens, colorLuz, tipoAhorro, tipoBombillo);
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	

}
