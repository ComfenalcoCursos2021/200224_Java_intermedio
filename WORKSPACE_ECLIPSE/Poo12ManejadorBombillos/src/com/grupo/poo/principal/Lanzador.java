package com.grupo.poo.principal;

import java.util.Scanner;

import com.grupo.poo.manejadores.ManejadorBombillos;
import com.grupo.poo.objetos.Bombillo;
import com.grupo.poo.objetos.BombilloSmart;

public class Lanzador {

	public static void main(String[] args) throws Exception {
		
		Bombillo bombilloBodega = new Bombillo(1500,"Azul","ClaseA","Led");		
		Bombillo bombilloPasillo = new Bombillo(8000,"Azul","ClaseA","Led");		
		BombilloSmart bombilloOficina = new BombilloSmart(8000,"Azul","ClaseA","Led");
		
		ManejadorBombillos manejador = new ManejadorBombillos();
		
		System.out.println(bombilloOficina.isPrendido());
		manejador.encendedorBombilloSmart(bombilloOficina);		
		System.out.println(bombilloOficina.isPrendido());
		
		System.out.println("===================");
		
		System.out.println(bombilloBodega.isPrendido());
		manejador.encendedorBombillo(bombilloBodega);		
		System.out.println(bombilloBodega.isPrendido());
		
		System.out.println("Termino!!!!");

	}

}
