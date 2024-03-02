package com.grupo.poo.utilitarios;

import java.util.Scanner;

public class Calculadora {

	public int suma(int primerValor, int segundoValor) {
		int resultado = primerValor + segundoValor;
		return resultado;
	}
	public double valorObsoluto(double valor) {
		return Math.abs(valor);
	}
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
	
	public double logaritmo(double valor) {
		double respuesta =  Math.log10(valor);
		return respuesta;
	}
	
	
	
	
	
	
	public void programaLogaritmo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("Ingrese un valor para hallarle el logaritmo");
		double numLog = teclado.nextDouble();
		double resultLog = this.logaritmo(numLog);
		System.out.println("El logaritmo es " + resultLog);
		System.out.println("===================================");
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
