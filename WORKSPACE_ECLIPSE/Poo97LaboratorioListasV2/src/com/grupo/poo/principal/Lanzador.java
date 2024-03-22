package com.grupo.poo.principal;

import com.grupo.poo.manejadores.Lista;
import com.grupo.poo.objetos.Balde;

public class Lanzador {
	public static void main(String[] args) {
		
		Lista miLista = new Lista();
		Balde uno = new Balde(1);
		
		miLista.agregar(uno);
		
		Balde dos = new Balde(2);
		miLista.agregar(dos);
		
		Balde tres = new Balde(3);
		miLista.agregar(tres);
		
		Balde cuatro = new Balde(4);
		miLista.agregar(cuatro);
		
		miLista.agregar(new Balde(5));
		
		miLista.imprimir();
		
		System.out.println("TERMINO!!!!");
	}
}
