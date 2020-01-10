package Dominio;

public class Grupo_turistas {
	private int id;
	private String num; /*numero de turistas en el grupo*/
	private String descripcion;
	private String tipo; /*Supongo que se refiere a colegio, residencia, trabajo, familia,...*/
	private String intereses;
	
	public Grupo_turistas(int id, String num, String descripcion, String tipo, String intereses) {
		this.id=id;
		this.num=num;
		this.descripcion = descripcion;
		this.tipo=tipo;
		this.intereses=intereses;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIntereses() {
		return intereses;
	}

	public void setIntereses(String intereses) {
		this.intereses = intereses;
	}

	public Grupo_turistas() {
		
	}
}
