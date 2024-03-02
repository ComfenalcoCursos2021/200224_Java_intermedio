package com.grupo.poo.principal;

import com.grupo.poo.objetos.Bombillo;

public class Lanzador {

	public static void main(String[] args) {

		Bombillo bombilloBodega = new Bombillo(1500,"Azul","ClaseA","Led");
				
		bombilloBodega.encender();	
		
		
		Bombillo bombilloPasillo = new Bombillo(8000,"Azul","ClaseA","Led");
		
		
		bombilloBodega.apagar();
		////asdf/a/df/asd/fa/sd/fa/d/fa/d/fa/df/a/sdfadf
		
		
		bombilloBodega.encender();
		
		////a/sd/asd//adg/a/df/asd/f/d/fa/df
		
		
		
		bombilloBodega.apagar();

		System.out.println("bombilloBodega -> " + bombilloBodega.getCantidadLumens());
		System.out.println("bombilloPasillo -> " + bombilloPasillo.getCantidadLumens());
		System.out.println("Termino!!!!");

	}

}
