package com.grupo.poo;

import java.util.Scanner;

import com.grupo.poo.utilitarios.Calculadora;

public class Principal {
	
	public static void main(String[] args) {
		
		
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia
		Contenedor c20 = new Contenedor();
		// voy a crear una instancia de la clase Contenedor que se llamará fotocopia2
		Contenedor f2 = new Contenedor();		
		
		//c20.cantidadCajas = 15;
		c20.setCantidadCajas(15);
		
		//f2.cantidadCajas = 10;
		f2.setCantidadCajas(10);
		
		//System.out.println(c20.cantidadCajas);
		System.out.println(c20.getCantidadCajas());
		//System.out.println(f2.cantidadCajas);
		System.out.println(f2.getCantidadCajas());
		
		System.out.println("=======================");
		f2 = c20;
		//f2.cantidadCajas = 500;
		f2.setCantidadCajas(500);
		//System.out.println("contenedor20Lts->"+c20.cantidadCajas);
		System.out.println("contenedor20Lts->"+c20.getCantidadCajas());
		//System.out.println("fotocopia2->"+f2.cantidadCajas);
		System.out.println("fotocopia2->"+f2.getCantidadCajas());
		
		System.out.println("=======================");
		
		//Calculadora calc = new Calculadora();
		
		Calculadora calc = new Calculadora();
		
		int suma = calc.suma(15, 30);
		System.out.println(suma);
		
		Scanner teclado =  new Scanner(System.in);
		System.out.println("ingrese un valor para la escala");
		int valorEscala = teclado.nextInt();
		
		System.out.println("ingrese un valor para la cantidad de escalas");
		int cantEscalas = teclado.nextInt();
		
		calc.pintarEscala(valorEscala,cantEscalas);
		
		
		
		System.out.println("Nuevo Termino !!");
	}
}
