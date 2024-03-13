package grupo.poo.febrero.clasesnormales;

import grupo.poo.febrero.comportamientos.INadar;
import grupo.poo.febrero.comportamientos.IVolar;

public class AveMarina extends Ave implements IVolar, INadar{

	@Override
	public void nadar() {
		System.out.println(this.getNombre() + " NADANDO DESDE AVEMARINA");
		
	}

	@Override
	public void volar() {
		System.out.println(this.getNombre() + " VOLANDO DESDE AVE MARINA");
		
	}

}
