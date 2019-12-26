package Dominio;

public class Monumento {
	/*Añadir boton en jframe para poder ver los detalles del monumento*/
	private double precio;
	private String horario;
	private String duracion;
	private String descripcion;
	private String foto;
	private String tipo; /*Iglesia, museo, plaza, estatua,...*/
	
	public Monumento(double precio, String horario, String duracion, String descripcion, String foto, String tipo) {
		this.precio=precio;
		this.horario=horario;
		this.duracion=duracion;
		this.descripcion=descripcion;
		this.foto=foto;
		this.tipo=tipo;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Monumento() {
		
	}
}
