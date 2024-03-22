package com.grupo.poo.manejadores;

import java.util.ArrayList;

import grupo.poo.baldes.Camino;
import grupo.poo.baldes.Paso;

public class ManejadorGeneral {

	public void imprimirCamino(Camino camino) {
		int numeroPaso = 1;
		System.out.println("======================================");
		for (Paso paso : camino.getPasos()) {
			System.out.println(numeroPaso + " " +  paso+" ");
			numeroPaso = numeroPaso + 1;
		}
		System.out.println("\n======================================");
	}	
	

	public Paso generarSiguientePaso(Camino camino) {

		Paso ultimo = camino.obtenerUltimo();
		Paso generado = new Paso(ultimo);

		// LLENAR Uno
		generado.getUno().llenar();
		if(camino.tieneEstePaso(generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		
		// LLENAR Dos
		generado = new Paso(ultimo);
		generado.getDos().llenar();
		if(camino.tieneEstePaso(generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		
		// VACIAR Uno
		generado = new Paso(ultimo);
		generado.getUno().vaciar();
		if(camino.tieneEstePaso(generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		// VACIAR Dos
		generado = new Paso(ultimo);
		generado.getDos().vaciar();
		if(camino.tieneEstePaso(generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		// PASAR Uno-Dos
		generado = new Paso(ultimo);
		generado.getUno().traspasarA(generado.getDos());
		if(camino.tieneEstePaso(generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		// PASAR Dos-Uno
		generado = new Paso(ultimo);
		generado.getDos().traspasarA(generado.getUno());
		if(camino.tieneEstePaso(generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}

		return null;

	}
}
