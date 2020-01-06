package Dominio;

public class Promocion {
	
	private String dto;
	private String ruta;
	private String descripcion;
	private String duracion;
	
	public Promocion(String dto, String ruta, String descripcion, String duracion) {
		super();
		this.dto = dto;
		this.ruta = ruta;
		this.descripcion = descripcion;
		this.duracion = duracion;
	}
	
	public Promocion() {
		
	}

	public String getDto() {
		return dto;
	}

	public void setDto(String dto) {
		this.dto = dto;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Promocion [dto=" + dto + ", ruta=" + ruta + ", descripcion=" + descripcion + ", duracion=" + duracion
				+ "]";
	}

}
