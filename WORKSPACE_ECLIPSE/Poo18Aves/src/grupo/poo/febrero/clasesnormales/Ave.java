package grupo.poo.febrero.clasesnormales;

import grupo.poo.febrero.comportamientos.ICaminar;

public class Ave implements ICaminar {
	
	private String nombre;
	private String color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void caminar() {		
		System.out.println(this.nombre+" ESTA CAMINANDO DESDE LA CLASE AVE");
	}
	
	
}
