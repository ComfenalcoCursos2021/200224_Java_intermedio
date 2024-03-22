package grupo.poo.baldes;

import java.util.ArrayList;
import java.util.List;

public class Camino {
	
	private List<Paso> pasos;
	
	public Camino() {
		pasos = new ArrayList<Paso>();
	}
	
	public void agregarPaso(Paso nuevo) {
		this.pasos.add(nuevo);
	}
	public Paso obtenerUltimo() {
		return this.pasos.getLast();
	}
	
	public boolean tieneEstePaso(Paso buscado) {
		for (Paso paso : this.pasos) {
			if(paso.getUno().getContenidoActual() == buscado.getUno().getContenidoActual()
				&&
				paso.getDos().getContenidoActual() == buscado.getDos().getContenidoActual()){
					return true;
				}
		}
		return false;
	}
	
	

	public List<Paso> getPasos() {
		return pasos;
	}

	public void setPasos(List<Paso> pasos) {
		this.pasos = pasos;
	}
	
	
}
