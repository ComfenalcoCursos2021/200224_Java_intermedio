package com.grupo.poo;

public class Principal {
	
	public static void main(String[] args) {
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia
		Contenedor contenedor20Lts = new Contenedor();
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia2
		Contenedor fotocopia2 = new Contenedor();		
		
		contenedor20Lts.cantidadCajas = 15;
		contenedor20Lts.cantidadArticulosEnCaja = 30;
		
		fotocopia2.cantidadCajas = 10;
		
		System.out.println(contenedor20Lts.cantidadCajas);
		System.out.println(fotocopia2.cantidadCajas);
		
		System.out.println("=======================");
		fotocopia2 = contenedor20Lts;
		fotocopia2.cantidadCajas = 500;
		System.out.println("contenedor20Lts->"+contenedor20Lts.cantidadCajas);
		System.out.println("fotocopia2->"+fotocopia2.cantidadCajas);
		
		System.out.println("Nuevo Termino !!");
	}
}
