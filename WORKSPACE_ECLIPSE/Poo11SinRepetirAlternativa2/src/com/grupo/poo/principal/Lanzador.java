package com.grupo.poo.principal;

import java.util.Scanner;

import com.grupo.poo.objetos.Bombillo;
import com.grupo.poo.objetos.BombilloSmart;

public class Lanzador {

	public static void main(String[] args) throws Exception {

		Bombillo bombilloBodega = new Bombillo(1500,"Azul","ClaseA","Led");				
		bombilloBodega.encender();			
		
		Bombillo bombilloPasillo = new Bombillo(8000,"Azul","ClaseA","Led");	
		
		bombilloBodega.apagar();		
		bombilloBodega.encender();
		
		BombilloSmart bombilloOficina = new BombilloSmart(8000,"Azul","ClaseA","Led");
		System.out.println("bombilloOficina -> " + bombilloOficina.getColorLuz());
		bombilloOficina.encender();
		
		System.out.println("bombilloOficina->intensidad-> " + bombilloOficina.getIntensidad() + "/" + bombilloOficina.getCantidadLumens());
		Scanner sc = new Scanner(System.in);
		int porcentajeLumen = 0;
		System.out.println("Ingrese el valor de la lumniciencia que quiere en porcentaje de 0 a 100");
		porcentajeLumen = sc.nextInt();
		while(porcentajeLumen > 100 || porcentajeLumen < 0) {
			System.out.println("El valor que ingreso es incorrecto");
			System.out.println("Ingrese el valor de la lumniciencia que quiere en porcentaje de 0 a 100");
			porcentajeLumen = sc.nextInt();		
		} 
		
		bombilloOficina.dimer(porcentajeLumen);
		System.out.println("bombilloOficina->intensidad-> " + bombilloOficina.getIntensidad() + "/" + bombilloOficina.getCantidadLumens());
		
		bombilloBodega.apagar();

		System.out.println("bombilloBodega -> " + bombilloBodega.getCantidadLumens());
		System.out.println("bombilloPasillo -> " + bombilloPasillo.getCantidadLumens());
		System.out.println("Termino!!!!");

	}

}
