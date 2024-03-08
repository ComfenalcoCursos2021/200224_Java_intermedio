package com.grupo.poo.manejadores;

import com.grupo.poo.objetos.Bombillo;
import com.grupo.poo.objetos.BombilloSmart;

public class ManejadorBombillos {

	
	public void encendedorBombilloSmart(BombilloSmart bombillo) {
		bombillo.encender();
		System.out.println("El bombillo esta encendido");
	}
	public void encendedorBombillo(Bombillo bombilloNormal) {
		bombilloNormal.encender();
		System.out.println("El bombillo esta encendido");
	}
}
