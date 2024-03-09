package com.grupoi.poo.conexion;

import com.grupoi.poo.objetos.Producto;

public class MariaDB implements IConexion{

	public void guardar(Producto nuevo) {
		System.out.println("GUARDANDO EL PRODUCTO DESDE MARIADB");
	}
}
