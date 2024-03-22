package com.grupo.poo.manejadores;

import java.util.ArrayList;
import java.util.List;

import grupo.poo.baldes.Paso;

public class ManejadorGeneral {

	public void imprimirCamino(List<Paso> camino) {
		int numeroPaso = 1;
		System.out.println("======================================");
		for (Paso paso : camino) {
			System.out.println(numeroPaso + " " +  paso+" ");
			numeroPaso = numeroPaso + 1;
		}
		System.out.println("\n======================================");
	}
	
	public boolean elPasoEstaEnElCamino(ArrayList<Paso> camino, Paso nuevo) {

		for (Paso paso : camino) {
			if (paso.getUno().getContenidoActual() == nuevo.getUno().getContenidoActual()
					&& paso.getDos().getContenidoActual() == nuevo.getDos().getContenidoActual()) {
				return true;
			}
		}
		return false;
	}

	public Paso generarSiguientePaso(ArrayList<Paso> camino) {

		Paso ultimo = camino.getLast();
		Paso generado = new Paso(ultimo);

		// LLENAR Uno
		generado.getUno().llenar();
		if(elPasoEstaEnElCamino(camino, generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		
		// LLENAR Dos
		generado = new Paso(ultimo);
		generado.getDos().llenar();
		if(elPasoEstaEnElCamino(camino, generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		
		// VACIAR Uno
		generado = new Paso(ultimo);
		generado.getUno().vaciar();
		if(elPasoEstaEnElCamino(camino, generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		// VACIAR Dos
		generado = new Paso(ultimo);
		generado.getDos().vaciar();
		if(elPasoEstaEnElCamino(camino, generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		// PASAR Uno-Dos
		generado = new Paso(ultimo);
		generado.getUno().traspasarA(generado.getDos());
		if(elPasoEstaEnElCamino(camino, generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}
		// PASAR Dos-Uno
		generado = new Paso(ultimo);
		generado.getDos().traspasarA(generado.getUno());
		if(elPasoEstaEnElCamino(camino, generado)) {
			System.out.println("ESTA Y NO HAGO NADA");
		} else {
			return generado;
		}

		return null;

	}
}
