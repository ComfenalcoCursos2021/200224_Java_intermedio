package com.grupo.poo.manejadores;

import grupo.poo.baldes.Camino;
import grupo.poo.baldes.Paso;

public class SolucionadorBaldes {

	private int capacidadMaximaUno;
	private int capacidadMaximaDos;
	private int meta;
	
	private Camino caminoSolucion;
	
	
	public SolucionadorBaldes(int maxUno,int maxDos, int objetivo) {
		this.capacidadMaximaUno = maxUno;
		this.capacidadMaximaDos = maxDos;
		this.meta = objetivo;
		
		caminoSolucion = new Camino();
		Paso inicial = new Paso(this.capacidadMaximaUno, this.capacidadMaximaDos);
		caminoSolucion.agregarPaso(inicial);
	}
	
	public void imprimirCamino() {
		int numeroPaso = 1;
		System.out.println("======================================");
		for (Paso paso : this.caminoSolucion.getPasos()) {
			System.out.println(numeroPaso + " " +  paso+" ");
			numeroPaso = numeroPaso + 1;
		}
		System.out.println("\n======================================");
	}	
	
	public void solucionar() {
		Paso generadoEnElManager = new Paso(0,0);
		
		while(generadoEnElManager != null) {
			//this.imprimirCamino();
			generadoEnElManager = this.generarSiguientePaso(this.caminoSolucion);
			if(generadoEnElManager != null) {
				
				this.caminoSolucion.agregarPaso(generadoEnElManager);
				if(generadoEnElManager.getUno().getContenidoActual() == meta 
						|| generadoEnElManager.getDos().getContenidoActual() == meta) {
					//System.out.println("Encontro el camino ganador");
					//this.imprimirCamino();
					generadoEnElManager = null;
				}
			}
		}
	}
	
	
	private Paso generarSiguientePaso(Camino camino) {

		Paso ultimo = camino.obtenerUltimo();
		Paso generado = new Paso(ultimo);

		// LLENAR Uno
		generado.getUno().llenar();
		if(!camino.tieneEstePaso(generado)) {
			return generado;
		} 
		
		// LLENAR Dos
		generado = new Paso(ultimo);
		generado.getDos().llenar();
		if(!camino.tieneEstePaso(generado)) {
			return generado;
		}
		
		// VACIAR Uno
		generado = new Paso(ultimo);
		generado.getUno().vaciar();
		if(!camino.tieneEstePaso(generado)) {
			return generado;
		}
		// VACIAR Dos
		generado = new Paso(ultimo);
		generado.getDos().vaciar();
		if(!camino.tieneEstePaso(generado)) {
			return generado;
		}
		// PASAR Uno-Dos
		generado = new Paso(ultimo);
		generado.getUno().traspasarA(generado.getDos());
		if(!camino.tieneEstePaso(generado)) {
			return generado;
		}
		// PASAR Dos-Uno
		generado = new Paso(ultimo);
		generado.getDos().traspasarA(generado.getUno());
		if(!camino.tieneEstePaso(generado)) {
			return generado;
		}

		return null;

	}
	
}
