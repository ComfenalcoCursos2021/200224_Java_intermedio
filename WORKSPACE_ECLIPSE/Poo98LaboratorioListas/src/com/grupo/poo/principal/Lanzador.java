package com.grupo.poo.principal;

import com.grupo.poo.objetos.Balde;
import com.grupo.poo.objetos.Caja;

public class Lanzador {
	public static void main(String[] args) {
		
		Caja primera = new Caja();
		Balde uno = new Balde(1);		
		primera.setDato(uno);
		
		Caja segunda = new Caja();
		Balde dos = new Balde(2);
		segunda.setDato(dos);
		
		primera.setPestaña(segunda);
		
		Caja tercera = new Caja();
		Balde tres = new Balde(3);
		tercera.setDato(tres);
		
		segunda.setPestaña(tercera);
		//primera.getPestaña().setPestaña(tercera);
		
		
		Caja cuarta = new Caja();
		Balde cuatro = new Balde(4);
		cuarta.setDato(cuatro);
		
		tercera.setPestaña(cuarta);
		//primera.getPestaña().getPestaña().setPestaña(cuarta);
		
		System.out.println("TERMINO!!!!");
	}
}
