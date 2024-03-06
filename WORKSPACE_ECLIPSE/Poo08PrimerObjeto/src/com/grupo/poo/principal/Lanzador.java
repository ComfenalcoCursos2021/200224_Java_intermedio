package com.grupo.poo.principal;

import com.grupo.poo.objetos.Bombillo;
import com.grupo.poo.objetos.BombilloSmart;

public class Lanzador {

	public static void main(String[] args) {

		Bombillo bombilloBodega = new Bombillo(1500,"Azul","ClaseA","Led");				
		bombilloBodega.encender();			
		
		Bombillo bombilloPasillo = new Bombillo(8000,"Azul","ClaseA","Led");	
		
		bombilloBodega.apagar();		
		bombilloBodega.encender();
		
		BombilloSmart bombilloOficina = new BombilloSmart(8000,"Azul","ClaseA","Led");
		System.out.println("bombilloOficina -> " + bombilloOficina.getColorLuz());
		bombilloOficina.encender();
		
		
		bombilloBodega.apagar();

		System.out.println("bombilloBodega -> " + bombilloBodega.getCantidadLumens());
		System.out.println("bombilloPasillo -> " + bombilloPasillo.getCantidadLumens());
		System.out.println("Termino!!!!");

	}

}
