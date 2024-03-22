package com.grupo.poo.lanzador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.grupo.poo.manejadores.ManejadorGeneral;

import grupo.poo.baldes.Paso;

public class Principal {

	
	
	
	public static void main(String[] args) {
		Stack<Paso> pasosPila = new Stack<Paso>();
		
		pasosPila.pop();
		
		Queue<Paso> pasosCola = new LinkedList<Paso>();
		pasosCola.poll();
		
		ManejadorGeneral manejador = new ManejadorGeneral();
		
		ArrayList<Paso> caminoUno = new ArrayList<Paso>();		
		Paso primero = new Paso(89,97);
		int meta = 50;
		
		caminoUno.add(primero);
		
		Paso generadoEnElManager = new Paso(0,0);


		while(generadoEnElManager != null) {
			manejador.imprimirCamino(caminoUno);
			generadoEnElManager = manejador.generarSiguientePaso(caminoUno);
			if(generadoEnElManager != null) {
				
				caminoUno.add(generadoEnElManager);
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
