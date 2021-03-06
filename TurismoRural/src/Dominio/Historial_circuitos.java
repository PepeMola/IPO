package Dominio;

public class Historial_circuitos {
	
	private String rutas;
	private int num_personas;
	private double coste;
	private String incidencias;//En el caso de circuitos pendientes estará vacio
	private String opiniones;//En el caso de circuitos pendientes estara vacio
	private String sugerencias;//En el caso de circuitos pendientes sera sugerencia de cara al circuito
	private boolean pendiente;
	

	public Historial_circuitos(String rutas, int num_personas, double coste, String incidencias, String opiniones,
			String sugerencias, boolean pendiente) {
		super();
		this.rutas = rutas;
		this.num_personas = num_personas;
		this.coste = coste;
		this.incidencias = incidencias;
		this.opiniones = opiniones;
		this.sugerencias = sugerencias;
		this.pendiente = pendiente;
	}
	
	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(boolean pendiente) {
		this.pendiente = pendiente;
	}

	public String getRutas() {
		return rutas;
	}

	public void setRutas(String rutas) {
		this.rutas = rutas;
	}

	public int getNum_personas() {
		return num_personas;
	}

	public void setNum_personas(int num_personas) {
		this.num_personas = num_personas;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public String getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}

	public String getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(String opiniones) {
		this.opiniones = opiniones;
	}

	public String getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(String sugerencias) {
		this.sugerencias = sugerencias;
	}
	

}
