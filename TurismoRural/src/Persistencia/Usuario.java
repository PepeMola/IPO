package Persistencia;

public class Usuario {
	private String usuario;
	private String contrase�a;
	private int identificador;
	public void Usuario(String usuario, String contrase�a) {
		this.usuario=usuario;
		this.contrase�a=contrase�a;
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


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}


}
