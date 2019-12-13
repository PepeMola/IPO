package Persistencia;

public class Promocion {
	
	
	private int id;
	private int descuento;
	private boolean cena ;
	private boolean dosPorUno;
	private boolean entradaGratis;
	private String localidad;
	
	public Promocion(int id, int descuento, boolean cena, boolean dosPorUno, boolean entradaGratis, String localidad) {
		super();
		this.id = id;
		this.descuento = descuento;
		this.cena = cena;
		this.dosPorUno = dosPorUno;
		this.entradaGratis = entradaGratis;
		this.localidad = localidad;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public boolean isCena() {
		return cena;
	}
	public void setCena(boolean cena) {
		this.cena = cena;
	}
	public boolean isDosPorUno() {
		return dosPorUno;
	}
	public void setDosPorUno(boolean dosPorUno) {
		this.dosPorUno = dosPorUno;
	}
	public boolean isEntradaGratis() {
		return entradaGratis;
	}
	public void setEntradaGratis(boolean entradaGratis) {
		this.entradaGratis = entradaGratis;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
}
