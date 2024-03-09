package com.grupoi.poo.lanzador;


import com.grupoi.poo.conexion.*;
import com.grupoi.poo.objetos.Producto;

public class Principal {

	public static void main(String[] args) {

				
		IConexion baseDatos = ManejadorConexion.getConexion(1);
		
		//MariaDB baseDatos = new MariaDB();
		//MySQL baseDatos = new MySQL();
		//Oracle baseDatos = new Oracle();
		//SqlServer baseDatos = new SqlServer();
		//PatitoDB baseDatos = new PatitoDB();
		
		System.out.println("bienvenido a su programa de supermercado");
		System.out.println("que quiere hacer?");
		System.out.println("1. crear producto");
		System.out.println("2. consultar producto");
		Producto dummy = new Producto();
		dummy.setDescripcion("Es un dummy");
		dummy.setNombre("Dummy");
		dummy.setPrecio(1500);
		
		baseDatos.guardar(dummy);
		
		
		
		dummy = new Producto();
		dummy.setDescripcion("Es un dummy");
		dummy.setNombre("Dummy");
		dummy.setPrecio(1500);
		
		baseDatos.guardar(dummy);
		
		
		
		dummy = new Producto();
		dummy.setDescripcion("Es un dummy");
		dummy.setNombre("Dummy");
		dummy.setPrecio(1500);
		
		baseDatos.guardar(dummy);
		
		
		
		
		dummy = new Producto();
		dummy.setDescripcion("Es un dummy");
		dummy.setNombre("Dummy");
		dummy.setPrecio(1500);
		
		baseDatos.guardar(dummy);
		
		
		
		
		dummy = new Producto();
		dummy.setDescripcion("Es un dummy");
		dummy.setNombre("Dummy");
		dummy.setPrecio(1500);
		
		baseDatos.guardar(dummy);
		
		
	}

}
