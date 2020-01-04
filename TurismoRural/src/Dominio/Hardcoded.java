package Dominio;

import java.util.ArrayList;

public class Hardcoded {

	private ArrayList<Grupo_turistas> grupoTuristas = new ArrayList<Grupo_turistas>();
	private ArrayList<Guia_turistico> guia = new ArrayList<Guia_turistico>();
	private ArrayList<Historial_circuitos> historial = new ArrayList<Historial_circuitos>();
	private ArrayList<Monumento> monumento = new ArrayList<Monumento>();
	private ArrayList<Rutas_turisticas> ruta = new ArrayList<Rutas_turisticas>();
	private ArrayList<Turista> turistas = new ArrayList<Turista>();
	private ArrayList<Usuario> usuario = new ArrayList<Usuario>();


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

	public Hardcoded() {
		
	}

	public ArrayList<Grupo_turistas> getGrupoTuristas() {
		Grupo_turistas gt1 = new Grupo_turistas(5,"Grupo de amigos","Trabajo","Comer bien");
		Grupo_turistas gt2 = new Grupo_turistas(6,"Viaje de matrimonios","Viaje Swinger","Conocer gente nueva");
		Grupo_turistas gt3 = new Grupo_turistas(20,"Niños de colegio","Colegio","Aprender muchas cosas");
		
		grupoTuristas.add(gt1);
		grupoTuristas.add(gt2);
		grupoTuristas.add(gt3);
		
		return grupoTuristas;
	}
	public void setGrupoTuristas(Grupo_turistas grupoTuristas) {
		this.grupoTuristas.add(grupoTuristas);
	}
	public ArrayList<Guia_turistico> getGuia() {
		Guia_turistico g1 = new Guia_turistico("Pepe", "Arias Ramos", "00000001A", "pepe@gmail.com", "666555444", "Castellano, Ingles y Frances",
				true, "1,2,3,4", 17.50, 8.6, "");
		Guia_turistico g2 = new Guia_turistico("David", "Utrilla Patón", "00000002A", "david@gmail.com", "666555446", "Castellano y Frances", 
				true, "3,4", 19.95, 9.3, "");
		Guia_turistico g3 = new Guia_turistico("Diego", "Arche Claudio", "00000003A", "diego@gmail.com", "666555449", "Castellano y Portugues",
				false, "1,2,4", 15.50, 6.7, "");
		
		guia.add(g1);
		guia.add(g2);
		guia.add(g3);
		
		return guia;
	}
	public void setGuia(Guia_turistico guia) {
		this.guia.add(guia);
	}
	public ArrayList<Historial_circuitos> getHistorial() {
		Historial_circuitos h1 = new Historial_circuitos(15, 500, "Ninguna",
				"Todo perfecto", "Aprobar a Pepe");
		Historial_circuitos h2 = new Historial_circuitos(6, 150, "David mintió, no sabe Francés",
				"Bonita ciudad", "Suspender a David");
		Historial_circuitos h3 = new Historial_circuitos(12, 340, "Murió un señor",
				"Quitando al muerto, todo bien", "Incluir pack Funerario");
		
		historial.add(h1);
		historial.add(h1);
		historial.add(h1);
		
		return historial;
	}
	public void setHistorial(Historial_circuitos historial) {
		this.historial.add(historial);
	}
	public ArrayList<Monumento> getMonumento() {
		Monumento m1 = new Monumento(0.0,"09.00-14.00","1 hora","Icono de la ciudad","","Iglesia");
		Monumento m2 = new Monumento(10.0,"10.00-14.00","2 horas","Lleno de cultura","","Museo");
		Monumento m3 = new Monumento(5.0,"08.00-14.00","1 hora","Patrimonio Provincial","","Estatua");
		
		monumento.add(m1);
		monumento.add(m2);
		monumento.add(m3);
		
		return monumento;
	}
	public void setMonumento(Monumento monumento) {
		this.monumento.add(monumento);
	}
	public ArrayList<Rutas_turisticas> getRuta() {
		Rutas_turisticas r1 = new Rutas_turisticas("Puertollano","Minero, Plaza Villarreal y Fuente Agria",
				"El Rubio","Confecciones la Abuela");
		Rutas_turisticas r2 = new Rutas_turisticas("Ciudad Real","Parque Gasset, Plaza Ayuntamiento y Plaza Correos",
				"Casa Pepe","H&M, Zara y Sfera");
		Rutas_turisticas r3 = new Rutas_turisticas("Valdepeñas","Bodegas El Paleto, Parque Ayuntamiento y Museo de la Hazada",
				"El Patio de Maria","Navajas Kevin");
		
		ruta.add(r1);
		ruta.add(r2);
		ruta.add(r3);
		
		return ruta;
	}
	public void setRuta(Rutas_turisticas ruta) {
		this.ruta.add(ruta);
	}
	public ArrayList<Turista> getTuristas() {
		Turista t1 = new Turista("01234567W","Maria","Galvez Perez","654321987","maria@gmail.com","");
		Turista t2 = new Turista("01234567P","Andres","Rodriguez Sanz","645321987","andres@gmail.com","");
		Turista t3 = new Turista("01234567M","Juan Manuel","Duque Santana","654231987","rojaco@gmail.com","");
		
		turistas.add(t1);
		turistas.add(t2);
		turistas.add(t3);
		
		return turistas;
	}
	public void setTuristas(Turista turistas) {
		this.turistas.add(turistas);

	}
	public ArrayList<Usuario> getUsuario() {
		Usuario u1 = new Usuario("Profesora","Informatica","01237894Q","ipo1","");
		Usuario u2 = new Usuario("Pepe","Arias","00000001A","hola","");
		Usuario u3 = new Usuario("David","Utrilla","00000001B","adios","");
		
		usuario.add(u1);
		usuario.add(u2);
		usuario.add(u3);
		
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario.add(usuario);
	}

}
