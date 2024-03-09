package com.grupo.poo.principal;

import java.util.Scanner;

import com.grupo.poo.manejadores.Manejador;
import com.grupo.poo.objetos.Bombillo;
import com.grupo.poo.objetos.BombilloParlante;
import com.grupo.poo.objetos.BombilloSmart;
import com.grupo.poo.objetos.Radio;

public class Lanzador {

	public static void main(String[] args) throws Exception {
		
		Bombillo bombilloBodega = new Bombillo(1500,"Azul","ClaseA","Led");		
		Bombillo bombilloPasillo = new Bombillo(8000,"Azul","ClaseA","Led");		
		BombilloSmart bombilloOficina = new BombilloSmart(8000,"Azul","ClaseA","Led");
		
		Manejador manejador = new Manejador();
		
		System.out.println(bombilloOficina.isPrendido());
		manejador.encendedorUniversal(bombilloOficina);		
		System.out.println(bombilloOficina.isPrendido());
		
		System.out.println("===================");
		
		System.out.println(bombilloBodega.isPrendido());
		manejador.encendedorUniversal(bombilloBodega);		
		System.out.println(bombilloBodega.isPrendido());
		
		System.out.println("===================");
		BombilloParlante bombilloParlante = new BombilloParlante(9000, "Azul", "Clase!", "Led");
		System.out.println(bombilloParlante.isPrendido());
		manejador.encendedorUniversal(bombilloParlante);		
		System.out.println(bombilloParlante.isPrendido());
		System.out.println("===================");
		Radio radio = new Radio();
		manejador.encendedorUniversal(radio);
		System.out.println("Termino!!!!");

	}

}
