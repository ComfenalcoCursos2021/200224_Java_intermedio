package grupo.poo.febrero.aves;

import grupo.poo.febrero.clasesnormales.AveCiudad;

public class Colibri extends AveCiudad {

	@Override
	public void volar() {
		System.out.println(this.getNombre()+" ESTA VOLANDO DESDE COLIBRI A VELOCIDAD COLIBRI");
	}
}
