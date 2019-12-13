package Persistencia;

public class Usuario {
	private String usuario;
	private String contraseña;
	private int identificador;
	public void Usuario(String usuario, String contraseña) {
		this.usuario=usuario;
		this.contraseña=contraseña;
		this.identificador=this.identificador+1;
	}
	
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getIdentificador() {
		return identificador;
	}


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


}
