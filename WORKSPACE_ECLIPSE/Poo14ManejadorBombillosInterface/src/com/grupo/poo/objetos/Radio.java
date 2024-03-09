package com.grupo.poo.objetos;

import com.grupo.poo.interfaces.IEncendedor;

public class Radio implements IEncendedor {

	private float frecuencia;

	public float getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(float frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public void encender() {
		System.out.println("ENCENDIENDO RADIO");		
	}

	@Override
	public void apagar() {
		System.out.println("APAGANDO RADIO");		
	}

	
	
	
	
}
