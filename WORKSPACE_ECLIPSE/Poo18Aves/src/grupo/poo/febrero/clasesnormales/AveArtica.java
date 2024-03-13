package grupo.poo.febrero.clasesnormales;

import grupo.poo.febrero.comportamientos.INadar;

public class AveArtica extends Ave implements INadar{

	@Override
	public void nadar() {
		System.out.println(this.getNombre() + " NADANDO DESDE LA CLASE AVE ARTICA");		
	}

}
