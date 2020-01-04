package Dominio;

import java.util.ArrayList;

public class Hardcoded {

	ArrayList<Grupo_turistas> grupoTuristas = new ArrayList<Grupo_turistas>();
	ArrayList<Guia_turistico> guia = new ArrayList<Guia_turistico>();
	ArrayList<Historial_circuitos> historial = new ArrayList<Historial_circuitos>();
	ArrayList<Monumento> monumento = new ArrayList<Monumento>();
	ArrayList<Rutas_turisticas> ruta = new ArrayList<Rutas_turisticas>();
	ArrayList<Turista> turistas = new ArrayList<Turista>();
	ArrayList<Usuario> usuario = new ArrayList<Usuario>();


	public Hardcoded(ArrayList<Grupo_turistas> grupoTuristas, ArrayList<Guia_turistico> guia,
			ArrayList<Historial_circuitos> historial, ArrayList<Monumento> monumento, ArrayList<Rutas_turisticas> ruta,
			ArrayList<Turista> turistas, ArrayList<Usuario> usuario) {
		this.grupoTuristas = grupoTuristas;
		this.guia = guia;
		this.historial = historial;
		this.monumento = monumento;
		this.ruta = ruta;
		this.turistas = turistas;
		this.usuario = usuario;
	}

	public ArrayList<Grupo_turistas> getGrupoTuristas() {
		return grupoTuristas;
	}
	public void setGrupoTuristas(Grupo_turistas grupoTuristas) {
		this.grupoTuristas.add(grupoTuristas);
	}
	public ArrayList<Guia_turistico> getGuia() {
		return guia;
	}
	public void setGuia(Guia_turistico guia) {
		this.guia.add(guia);
		/*try {

		}catch(Exception a) {

		}*/
	}
	public ArrayList<Historial_circuitos> getHistorial() {
		return historial;
	}
	public void setHistorial(Historial_circuitos historial) {
		this.historial.add(historial);
	}
	public ArrayList<Monumento> getMonumento() {
		return monumento;
	}
	public void setMonumento(Monumento monumento) {
		this.monumento.add(monumento);
	}
	public ArrayList<Rutas_turisticas> getRuta() {
		return ruta;
	}
	public void setRuta(Rutas_turisticas ruta) {
		this.ruta.add(ruta);
	}
	public ArrayList<Turista> getTuristas() {
		return turistas;
	}
	public void setTuristas(Turista turistas) {
		this.turistas.add(turistas);

	}
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario.add(usuario);
	}

}
