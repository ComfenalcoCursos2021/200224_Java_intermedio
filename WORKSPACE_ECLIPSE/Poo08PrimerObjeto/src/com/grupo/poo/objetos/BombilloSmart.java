package com.grupo.poo.objetos;

public class BombilloSmart extends Bombillo {
	
	private String nombre;
	private String tipoConexion; //bluetooth/wifi/
	private int minutosParaApagar;
	private int intensidad;
	
	
	public BombilloSmart(int cantidadLumens,  String colorLuz, String tipoAhorro, String tipoBombillo) {
		this.tipoAhorro = tipoAhorro+"_Smart"; 
		this.cantidadLumens = cantidadLumens;		
		this.colorLuz = colorLuz+"_Smart";
		this.tipoBombillo = tipoBombillo+"_Smart";	
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoConexion() {
		return tipoConexion;
	}
	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}
	public int getMinutosParaApagar() {
		return minutosParaApagar;
	}
	public void setMinutosParaApagar(int minutosParaApagar) {
		this.minutosParaApagar = minutosParaApagar;
	}
	public int getIntensidad() {
		return intensidad;
	}
	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}
	
	public void dimer(int porcentaje) throws Exception {
		
		if(porcentaje > 100 || porcentaje < 0) {
			throw new Exception("FALLO POR EL PORCENTAJE MALO");
		}
		
		int lumen = (cantidadLumens * porcentaje) / 100;
		this.intensidad = lumen;
		//System.out.println("El bombillo esta al "+lumen+"%");		
		
	}
	
	
}
