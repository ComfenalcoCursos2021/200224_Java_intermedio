package grupo.poo.febrero.lanzador;

import grupo.poo.febrero.aves.Colibri;
import grupo.poo.febrero.aves.Paloma;
import grupo.poo.febrero.aves.Pelicano;

public class Principal {

	public static void main(String[] args) {
		
		Paloma p = new Paloma();
		p.setNombre("Pancho");
		Pelicano pel = new Pelicano();
		pel.setNombre("Pepe");
		Colibri fulanito = new Colibri();
		fulanito.setNombre("Fulanito");
		
		
		p.caminar();
		p.volar();
		pel.caminar();
		pel.volar();
		pel.nadar();
		fulanito.caminar();
		fulanito.volar();
		System.out.println("TERMINO!!");

	}

}
