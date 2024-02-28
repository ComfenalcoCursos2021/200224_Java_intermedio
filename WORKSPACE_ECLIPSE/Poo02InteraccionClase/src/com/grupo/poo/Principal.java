package com.grupo.poo;

public class Principal {
	
	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 7;
		int suma = a + b;
		System.out.println(suma);
		
		
		
		
		
		
		
		
		
		
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia
		Contenedor c20 = new Contenedor();
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia2
		Contenedor f2 = new Contenedor();		
		
		c20.cantidadCajas = 15;
		c20.cantidadArticulosEnCaja = 30;
		
		f2.cantidadCajas = 10;
		
		System.out.println(c20.cantidadCajas);
		System.out.println(f2.cantidadCajas);
		
		System.out.println("=======================");
		f2 = c20;
		f2.cantidadCajas = 500;
		System.out.println("contenedor20Lts->"+c20.cantidadCajas);
		System.out.println("fotocopia2->"+f2.cantidadCajas);
		
		System.out.println("Nuevo Termino !!");
	}
}
