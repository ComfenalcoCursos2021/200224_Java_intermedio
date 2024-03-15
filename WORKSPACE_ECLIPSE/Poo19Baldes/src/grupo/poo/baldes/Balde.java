package grupo.poo.baldes;

public class Balde {
	public String nombre;
	private int capacidadMax;
	private int contenidoActual;
	
	public Balde(int valorCapacidadMaxima) {
		this.capacidadMax = valorCapacidadMaxima;
	}
	
	public int getCapacidadMax() {
		return capacidadMax;
	}


	public void vaciar() {
		this.contenidoActual = 0;
	}

	public void llenar() {
		this.contenidoActual = this.capacidadMax;
	}
	
	
	
	public int getContenidoActual() {
		return contenidoActual;
	}



	public void setContenidoActual(int contenidoActual) {
		if(contenidoActual >= this.capacidadMax) {
			this.contenidoActual = capacidadMax;
		} else {
			this.contenidoActual = contenidoActual;	
		}
		
	}



	public String estaLleno() {
		if(contenidoActual >= capacidadMax) {
			return "SI";
		} else {
			return "NO";
		} 			
	}
	public String tieneAgua() {
		if(contenidoActual > 0) {
			return "SI";
		} else {
			return "NO";
		}		
	}
	
	public void traspasarA(Balde otro) {
		int totalAgua = this.contenidoActual + otro.contenidoActual;
		if(totalAgua > otro.capacidadMax) {
			otro.llenar();
			int sobrante = totalAgua - otro.contenidoActual;
			this.contenidoActual = sobrante;
		} else {
			otro.contenidoActual = totalAgua;
			this.vaciar();
		}
		
	}
	
	//traspasar
	
}
