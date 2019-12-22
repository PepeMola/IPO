package Dominio;

public class Usuario {
	
	private String nombre;
	private String apellidos;
	private String nif;
	private int telefono;
	private String password;
	

	public Usuario (String nombre, String apellidos, String nif, int telefono, String password) {
		nombre = this.nombre;
		apellidos = this.apellidos;
		nif = this.nif;
		telefono = this.telefono;
		password = this.password;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
