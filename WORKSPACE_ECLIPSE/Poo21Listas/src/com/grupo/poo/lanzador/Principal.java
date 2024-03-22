package com.grupo.poo.lanzador;

import java.util.ArrayList;
import java.util.List;

import com.grupo.poo.objetos.Bombillo;
import com.grupo.poo.objetos.BombilloParlante;
import com.grupo.poo.objetos.BombilloSmart;

public class Principal {

	public static void main(String[] args) {
		
		List<Bombillo> bombillosParlantes = new ArrayList<Bombillo>();
		List<String> abc = new ArrayList<String>();

		abc.add("A");
		abc.add("B");
		abc.add("C");
		
		BombilloParlante nuevo = new BombilloParlante(1500, "Azul", "ClaseB", "Led");
		BombilloSmart nuevoSmart = new BombilloSmart(1500, "Azul", "ClaseB", "Led");
		bombillosParlantes.add(nuevo);
		bombillosParlantes.add(nuevoSmart);
		
		System.out.println("================================");
		for (String item : abc) {
			System.out.println(item);
		}
		System.out.println("================================");
		for (int i = 0; i < abc.size(); i = i + 1) {

			System.out.println(abc.get(i));
		}
		System.out.println("================================");

		System.out.println("Termino!!!");

	}

}
