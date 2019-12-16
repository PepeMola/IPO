package Persistencia;

public class Usuario {
	private String usuario;
	private String password;
	private int identificador;
	public void Usuario(String usuario, String password) {
		this.usuario=usuario;
		this.password=password;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


}
