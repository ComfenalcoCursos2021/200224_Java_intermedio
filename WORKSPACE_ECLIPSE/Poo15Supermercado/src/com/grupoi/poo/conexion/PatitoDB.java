package com.grupoi.poo.conexion;

import com.grupoi.poo.objetos.Producto;

public class PatitoDB implements IConexion{

	@Override
	public void guardar(Producto nuevo) {
		System.out.println("GUARDANDO DESDE PATITO DB");
		
	}

}
