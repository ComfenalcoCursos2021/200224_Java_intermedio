package com.grupo.poo.utilitarios;

public class Calculadora {

	public int suma(int primerValor, int segundoValor) {
		int resultado = primerValor + segundoValor;
		return resultado;
	}

	public void pintarEscala(int valorInicial, int cantEscalasValor) {

		System.out.println("Valor inicial  -> " + valorInicial);

		for (int i = 2; i <= cantEscalasValor; i = i + 1) {
			int resultado = valorInicial * i;
			System.out.println(i + " x " + valorInicial + " = " + resultado);
			valorInicial = resultado;
		}
		
		for (int i = 2; i <= cantEscalasValor; i = i + 1) {
			int resultado = valorInicial / i;
			System.out.println(i + " / " + valorInicial + " = " + resultado);
			valorInicial = resultado;
		}

	}
}
