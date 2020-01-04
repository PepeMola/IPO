package Dominio;

public class Guia_turistico {

	private String nombre;
	private String apellidos;
	private String nif;
	private String email;
	private String telf;
	private String idiomas;
	private String disponibilidad;
	private String historial_rutas;
	private double precio;
	private double puntuacion;
	private String foto;
	
	public Guia_turistico(String nombre, String apellidos, String nif, String email, String telf, String idiomas, String disponibilidad,
			String historial_rutas, double precio, double puntuacion, String foto) {
		nombre = this.nombre;
		apellidos=this.apellidos;
		nif=this.nif;
		email=this.email;
		telf=this.telf;
		idiomas=this.idiomas;
		disponibilidad=this.disponibilidad;
		historial_rutas=this.historial_rutas;
		precio=this.precio;
		puntuacion=this.puntuacion;
		this.foto=foto;
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

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
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
	public String toString() {
		return "Guia_turistico [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", email=" + email
				+ ", telf=" + telf + ", idiomas=" + idiomas + ", disponibilidad=" + disponibilidad
				+ ", historial_rutas=" + historial_rutas + ", precio=" + precio + ", puntuacion=" + puntuacion
				+ ", foto=" + foto + "]";
	}
}
