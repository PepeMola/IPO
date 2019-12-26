package Dominio;

public class Rutas_turisticas {

	private String localidad;
	private String monumentos;
	private String restaurantes;
	private String tiendas;
	
	public Rutas_turisticas(String localidad, String monumentos, String restaurantes, String tiendas) {
		this.localidad=localidad;
		this.restaurantes=restaurantes;
		this.monumentos=monumentos;
		this.tiendas=tiendas;
	}
	
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMonumentos() {
		return monumentos;
	}

	public void setMonumentos(String monumentos) {
		this.monumentos = monumentos;
	}

	public String getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(String restaurantes) {
		this.restaurantes = restaurantes;
	}

	public String getTiendas() {
		return tiendas;
	}

	public void setTiendas(String tiendas) {
		this.tiendas = tiendas;
	}

	public Rutas_turisticas() {
		
	}
}
