package com.grupoi.poo.conexion;

import com.grupoi.poo.objetos.Producto;

public class SqlServer implements IConexion {

	public void guardar(Producto nuevo) {
		System.out.println("GUARDANDO DESDE SQL SERVER");
	}
}
