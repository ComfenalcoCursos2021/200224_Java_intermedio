package com.grupo.poo.utilitarios;

import java.util.Scanner;

public class Calculadora {

	/**
	 * Esta funcion suma
	 * @param primerValor el primer valor para sumar
	 * @param segundoValor el segundo valor para sumar
	 * @return el valor sumado
	 */
	public int suma(int primerValor, int segundoValor) {
		int resultado = primerValor + segundoValor;
		return resultado;
	}
	/**
	 * Esta funcion eleva un numero a otro
	 * @param base la base
	 * @param exponente el exponente
	 * @return el resultade de elevar el numero
	 */
	public double elevar(double base, double exponente) {
		double  resultado = Math.pow(base, exponente);
		return resultado;
	}
	public double raizCuadrada(double valor) {
		double respuesta =  Math.sqrt(valor);
		
		return respuesta;
	}
	
	public void pintarEscala(double valorInicial, int cantEscalasValor) {

		System.out.println("Valor inicial  -> " + valorInicial);

		for (int i = 2; i <= cantEscalasValor; i = i + 1) {
			double resultado = valorInicial * i;
			System.out.println(i + " x " + valorInicial + " = " + resultado);
			valorInicial = resultado;
		}

		for (int i = 2; i <= cantEscalasValor; i = i + 1) {
			double resultado = valorInicial / i;
			System.out.println(i + " / " + valorInicial + " = " + resultado);
			valorInicial = resultado;
		}

	}
	/**
	 * Esta funcion calcula el logaritmo de un nuemero.
	 * Este logaritmo esta en base 10
	 * @param valor El valor al cual se le quiere calcular el logaritmo
	 * @return el valor del logaritmo calculado
	 */	
	public double logaritmo(double valor) {
		double respuesta =  Math.log10(valor);
		return respuesta;
	}
	
	
	
	/**
	 * Esta funcion se encarga de 
	 */
	
	private void imprimirLogaritmoMenu() {
		String menu = "  _                        _ _                    \r\n"+
				" | | ___   __ _  __ _ _ __(_) |_ _ __ ___   ___   \r\n"+
				" | |/ _ \\ / _` |/ _` | '__| | __| '_ ` _ \\ / _ \\  \r\n"+
				" | | (_) | (_| | (_| | |  | | |_| | | | | | (_) | \r\n"+
				" |_|\\___/ \\__, |\\__,_|_|  |_|\\__|_| |_| |_|\\___/  \r\n"+
				"          |___/                                   \r\n";
		
		
		//System.out.println(menu);
		
		
		
		System.out.println("  _                        _ _                    ");
		System.out.println(" | | ___   __ _  __ _ _ __(_) |_ _ __ ___   ___   ");
		System.out.println(" | |/ _ \\ / _` |/ _` | '__| | __| '_ ` _ \\ / _ \\  ");
		System.out.println(" | | (_) | (_| | (_| | |  | | |_| | | | | | (_) | ");
		System.out.println(" |_|\\___/ \\__, |\\__,_|_|  |_|\\__|_| |_| |_|\\___/  ");
		System.out.println("          |___/                                   ");
	}
	
	
	public void programaLogaritmo() {
		Scanner teclado = new Scanner(System.in);
		double numLog = 0;
		this.imprimirLogaritmoMenu();
		
		System.out.println("===================================");
		System.out.println("=== PARA SALIR INGRESE UN NUMERO===");
		System.out.println("=== NEGATIVO=======================");
		System.out.println("===================================");
		while(numLog >= 0 ) {
			
			System.out.println("Ingrese un valor para hallarle el logaritmo");
			numLog = teclado.nextDouble();			
			double resultLog = this.logaritmo(numLog);
			System.out.println("El logaritmo es " + resultLog);
			System.out.println("===================================");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void progranaAreaCirculo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        double radio = entrada.nextDouble();
        double pi = Math.PI;
        double resultado = pi * Math.pow(radio, 2);
        System.out.println("El area del cilulo es: "+ resultado);
    }
}
