package Dominio;

public class Guia_turistico {

	private String nombre;
	private String apellidos;
	private String nif;
	private String email;
	private String telf;
	private String idiomas;
	private boolean disponibilidad;
	private String historial_rutas;
	private double precio;
	private double puntuacion;
	private String foto;
	
	public Guia_turistico() {
		
	}

	public Guia_turistico(String nombre, String apellidos, String nif, String email, String telf, String idiomas,
			boolean disponibilidad, String historial_rutas, double precio, double puntuacion, String foto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.email = email;
		this.telf = telf;
		this.idiomas = idiomas;
		this.disponibilidad = disponibilidad;
		this.historial_rutas = historial_rutas;
		this.precio = precio;
		this.puntuacion = puntuacion;
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getHistorial_rutas() {
		return historial_rutas;
	}

	public void setHistorial_rutas(String historial_rutas) {
		this.historial_rutas = historial_rutas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String toString() {
		return "Guia_turistico [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", email=" + email
				+ ", telf=" + telf + ", idiomas=" + idiomas + ", disponibilidad=" + disponibilidad
				+ ", historial_rutas=" + historial_rutas + ", precio=" + precio + ", puntuacion=" + puntuacion
				+ ", foto=" + foto + "]";
	}
}
