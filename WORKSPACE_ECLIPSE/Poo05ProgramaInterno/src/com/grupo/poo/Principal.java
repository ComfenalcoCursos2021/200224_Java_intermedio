package com.grupo.poo;

import com.grupo.poo.utilitarios.Calculadora;

public class Principal {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int         suma = 0;
		
		//calc.logaritmo(10);
		calc.programaLogaritmo();
		//System.out.println("---->" + calc.logaritmo(250));
		
		System.out.println("Termino !!");
	}
}
