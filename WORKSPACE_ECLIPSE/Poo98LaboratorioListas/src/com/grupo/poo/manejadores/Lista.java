package com.grupo.poo.manejadores;

import com.grupo.poo.objetos.Balde;
import com.grupo.poo.objetos.Caja;

public class Lista {

	private Caja primero;
	private Caja ultimo;
	
	public void agregar(Balde balde) {
		if(primero == null) {
			primero = new Caja();
			primero.setDato(balde);
			ultimo = primero;
		} else {
			Caja nueva = new Caja();
			nueva.setDato(balde);
			ultimo.setPestaña(nueva);			
			ultimo = nueva;
		}
	}
	
	public void imprimir() {
		Caja temporal = primero;
		
		do {
			System.out.println(temporal.getDato().getCapacidadMax());
			temporal = temporal.getPestaña();
		} while(temporal != null);
		
	}
}
