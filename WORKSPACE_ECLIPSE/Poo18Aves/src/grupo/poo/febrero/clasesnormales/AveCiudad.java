package grupo.poo.febrero.clasesnormales;

import grupo.poo.febrero.comportamientos.IVolar;

public class AveCiudad extends Ave implements IVolar{

	@Override
	public void volar() {
		System.out.println(this.getNombre()+" ESTA VOLANDO DESDE AVE CIUDAD");		
	}

}
