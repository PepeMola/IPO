package Dominio;

public class Historial_circuitos {
	
	private int num_personas;
	private double coste;
	private String incidencias;
	private String opiniones;
	private String sugerencias;
	

	public Historial_circuitos(int num_personas, double coste, String incidencias, String opiniones,
			String sugerencias) {
		super();
		this.num_personas = num_personas;
		this.coste = coste;
		this.incidencias = incidencias;
		this.opiniones = opiniones;
		this.sugerencias = sugerencias;
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
