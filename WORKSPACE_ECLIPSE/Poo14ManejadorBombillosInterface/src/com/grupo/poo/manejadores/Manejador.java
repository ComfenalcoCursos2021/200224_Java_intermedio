package com.grupo.poo.manejadores;

import com.grupo.poo.interfaces.IEncendedor;
import com.grupo.poo.objetos.Bombillo;

public class Manejador {

	
	/*
	public void encendedorBombillo(Bombillo bombilloNormal) {
		bombilloNormal.encender();
		System.out.println("El bombillo esta encendido");
	}*/
	
	public void encendedorUniversal(IEncendedor algo) {
		algo.encender();
	}
}
