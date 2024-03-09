package com.grupoi.poo.conexion;

import com.grupoi.poo.objetos.Producto;

public class Oracle implements IConexion{

	public void guardar(Producto nuevo) {
		System.out.println("GUARDANDO DESDE ORACLE");
	}
	
	public void guardarSinTildes(Producto nuevo) {
		this.guardar(nuevo);
	}
	public void guardarConTildes(Producto nuevo) {
		this.guardar(nuevo);
	}

	
}
