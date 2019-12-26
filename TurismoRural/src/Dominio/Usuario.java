package Dominio;

public class Usuario {
	
	private String nombre;
	private String apellidos;
	private String nif;
	private String password;
	private String foto;
	
	
	public Usuario (String nombre, String apellidos, String nif, String password, String foto) {
		nombre = this.nombre;
		apellidos = this.apellidos;
		nif = this.nif;
		password = this.password;
		this.foto = foto;
	}
	
	public Usuario() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
