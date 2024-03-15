package grupo.poo.baldes;

public class UtilidadesBaldes {

	public String formatear(Balde origen, Balde destino) {
		
		return "[ "+origen.getContenidoActual()+"/"+origen.getCapacidadMax()+" ; "+destino.getContenidoActual()+"/"+destino.getCapacidadMax()+" ]";
	}
	public void traspasar(Balde origen, Balde destino) {
		
		int totalAgua = destino.getContenidoActual() + origen.getContenidoActual();
		
		if(totalAgua > destino.getCapacidadMax()) {
			destino.llenar();
			int sobrante = totalAgua - destino.getContenidoActual();
			origen.setContenidoActual(sobrante);
		} else {
			destino.setContenidoActual(totalAgua);
			origen.vaciar();
		}
		
	}
}
