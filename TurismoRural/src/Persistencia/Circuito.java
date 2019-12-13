package Persistencia;

public class Circuito {
	
	private int id;
	private String[] ciudades;
	private String[] monumentos;
	private String[] restaurantes;
	private String[] tiendas;
	public Circuito(int id, String[] ciudades, String[] monumentos, String[] restaurantes, String[] tiendas) {
		super();
		this.id = id;
		this.ciudades = ciudades;
		this.monumentos = monumentos;
		this.restaurantes = restaurantes;
		this.tiendas = tiendas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getCiudades() {
		return ciudades;
	}
	public void setCiudades(String[] ciudades) {
		this.ciudades = ciudades;
	}
	public String[] getMonumentos() {
		return monumentos;
	}
	public void setMonumentos(String[] monumentos) {
		this.monumentos = monumentos;
	}
	public String[] getRestaurantes() {
		return restaurantes;
	}
	public void setRestaurantes(String[] restaurantes) {
		this.restaurantes = restaurantes;
	}
	public String[] getTiendas() {
		return tiendas;
	}
	public void setTiendas(String[] tiendas) {
		this.tiendas = tiendas;
	}
	
	
}
