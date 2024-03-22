package com.grupo.poo.lanzador;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.grupo.poo.manejadores.ManejadorGeneral;

import grupo.poo.baldes.Camino;
import grupo.poo.baldes.Paso;

public class Principal {

	
	
	
	public static void main(String[] args) {
		
		ManejadorGeneral manejador = new ManejadorGeneral();
		
		Camino caminoUno = new Camino();		
		Paso primero = new Paso(3,5);
		int meta = 4;
		
		caminoUno.agregarPaso(primero);
		
		Paso generadoEnElManager = new Paso(0,0);


		while(generadoEnElManager != null) {
			manejador.imprimirCamino(caminoUno);
			generadoEnElManager = manejador.generarSiguientePaso(caminoUno);
			if(generadoEnElManager != null) {
				
				caminoUno.agregarPaso(generadoEnElManager);
				if(generadoEnElManager.getUno().getContenidoActual() == meta 
						|| generadoEnElManager.getDos().getContenidoActual() == meta) {
					System.out.println("Encontro el camino ganador");
					manejador.imprimirCamino(caminoUno);
					generadoEnElManager = null;
				}
			}
		}
		
		System.out.println("TERMINO !!!");
	}

}
