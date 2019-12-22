package Dominio;

public class Guia_turistico {
	private String nombre;
	private String apellidos;
	private String nif;
	private String email;
	private int telf;
	private String idiomas;
	private String disponibilidad;
	private int historial_rutas;
	private double precio;
	private double puntuacion;
	
	public Guia_turistico(String nombre, String apellidos, String nif, String email, int telf, String idiomas, String disponibilidad,
			int historial_rutas, double precio, double puntuacion) {
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

	public int getTelf() {
		return telf;
	}

	public void setTelf(int telf) {
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

	public int getHistorial_rutas() {
		return historial_rutas;
	}

	public void setHistorial_rutas(int historial_rutas) {
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
}
