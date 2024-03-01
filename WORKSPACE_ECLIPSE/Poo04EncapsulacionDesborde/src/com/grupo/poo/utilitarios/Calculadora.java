package com.grupo.poo.utilitarios;

public class Calculadora {

	public int suma(int primerValor, int segundoValor) {
		int resultado = primerValor + segundoValor;
		return resultado;
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
}
