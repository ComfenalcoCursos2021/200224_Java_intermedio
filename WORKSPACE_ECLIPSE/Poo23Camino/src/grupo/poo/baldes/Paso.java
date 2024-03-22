package grupo.poo.baldes;

public class Paso {

	private Balde uno;
	private Balde dos;
	
	public Paso(int capacidadMaximaUno, int capacidadMaximaDos) {
		this.uno = new Balde(capacidadMaximaUno);
		this.dos = new Balde(capacidadMaximaDos);
	}
	public Paso(Paso paso) {
		this.uno = new Balde(paso.getUno().getCapacidadMax());
		this.dos = new Balde(paso.getDos().getCapacidadMax());
		this.setContenidos(paso.getUno().getContenidoActual(), paso.getDos().getContenidoActual());
	}
	
	public void setContenidos(int contenidoActualUno, int contenidoActualDos) {
		
		this.uno.setContenidoActual(contenidoActualUno);
		this.dos.setContenidoActual(contenidoActualDos);
	}
	
	public Balde getUno() {
		return uno;
	}
	public void setUno(Balde uno) {
		this.uno = uno;
	}
	public Balde getDos() {
		return dos;
	}
	public void setDos(Balde dos) {
		this.dos = dos;
	}
	
	@Override
	public String toString() {
		return "[ " + this.uno.getContenidoActual() + " : " + this.dos.getContenidoActual() + " ]";
	}
}
