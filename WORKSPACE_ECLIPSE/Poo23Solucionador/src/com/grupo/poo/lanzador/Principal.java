package com.grupo.poo.lanzador;

import com.grupo.poo.manejadores.ManejadorGeneral;
import com.grupo.poo.manejadores.SolucionadorBaldes;

public class Principal {

	
	
	
	public static void main(String[] args) {
		
		
		
		SolucionadorBaldes solucionador = new SolucionadorBaldes(37,59,4);

		solucionador.solucionar();
		
		solucionador.imprimirCamino();
		
		System.out.println("TERMINO !!!");
	}

}
