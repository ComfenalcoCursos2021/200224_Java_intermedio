package com.grupo.poo;

public class Principal {
	
	public static void main(String[] args) {
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia
		Contenedor contenedor20Lts = new Contenedor();
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia2
		Contenedor fotocopia2 = new Contenedor();
		
		// voy a crear una instancia de la clase Contenedor que se llamará miPrimerContenedor
		Contenedor miPrimerContenedor = new Contenedor();
		
		
		OrganizadorCerveza canasta = new OrganizadorCerveza();
		
		canasta.cantidadCervezas = 30;
		
		OrganizadorCerveza sixpack = new OrganizadorCerveza();
		sixpack.cantidadCervezas = 6;
		
		
		contenedor20Lts.cantidadCajas = 15;
		contenedor20Lts.cantidadArticulosEnCaja = 30;
		
		fotocopia2.cantidadCajas = 10;
		
		System.out.println(contenedor20Lts.cantidadCajas);
		System.out.println(contenedor20Lts.cantidadArticulosEnCaja);
		int cantidadTotalArticulos = contenedor20Lts.cantidadCajas * contenedor20Lts.cantidadArticulosEnCaja;
		System.out.println(cantidadTotalArticulos);
		System.out.println("==========================");
		System.out.println(fotocopia2.cantidadCajas);
		
		System.out.println("Nuevo Termino !!");
	}
}
