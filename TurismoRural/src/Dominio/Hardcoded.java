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
	private ArrayList<Promocion> promocion = new ArrayList<Promocion>();


	public Hardcoded() {

		rellenarGuias();
		rellenarPromocion();
		rellenarGrupoTuristas();
		rellenarHistorial();
		rellenarMonumento();
		rellenarTuristas();
		rellenarUsuario();
		rellenarRuta();
	}

	public Hardcoded(ArrayList<Grupo_turistas> grupoTuristas, ArrayList<Guia_turistico> guia,
			ArrayList<Historial_circuitos> historial, ArrayList<Monumento> monumento, ArrayList<Rutas_turisticas> ruta,
			ArrayList<Turista> turistas, ArrayList<Usuario> usuario, ArrayList<Promocion> promocion) {

		this.grupoTuristas = grupoTuristas;
		this.guia = guia;
		this.historial = historial;
		this.monumento = monumento;
		this.ruta = ruta;
		this.turistas = turistas;
		this.usuario = usuario;
		this.promocion = promocion;
	}

	public ArrayList<Promocion> rellenarPromocion() {
		Promocion p1 = new Promocion("25%","1","<html>Este descuento es aplicado con<br/>motivo de nuestro 25 aniversario.</html>","<html>Inicio: 01/01/20.<br/>Fin: 30/12/20</html>");
		Promocion p2 = new Promocion("50%","3","Descuento navideño.","<html>Inicio: 24/12/19<br/>Fin: 07/01/20</html>");
		Promocion p3 = new Promocion("10%","2","<html>Descuento extra si son mas<br/>de 10 personas por grupo.</html>","<html>Inicio: 01/01/20.<br/>Fin: 01/04/20</html>");

		promocion.add(p1);
		promocion.add(p2);
		promocion.add(p3);

		return promocion;
	}

	public ArrayList<Promocion> getPromocion(){
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion.add(promocion);
	}

	public ArrayList<Grupo_turistas> rellenarGrupoTuristas() {
		Grupo_turistas gt1 = new Grupo_turistas(1, "5" ,"Grupo de amigos","Trabajo","Comer bien");
		Grupo_turistas gt2 = new Grupo_turistas(2, "6" ,"Viaje de matrimonios","Viaje Swinger","Conocer gente nueva");
		Grupo_turistas gt3 = new Grupo_turistas(3, "20" ,"Niños de colegio","Colegio","Aprender muchas cosas");

		grupoTuristas.add(gt1);
		grupoTuristas.add(gt2);
		grupoTuristas.add(gt3);

		return grupoTuristas;
	}

	public ArrayList<Grupo_turistas> getGrupoTuristas() {
		return grupoTuristas;
	}

	public void setGrupoTuristas(Grupo_turistas grupoTuristas) {
		this.grupoTuristas.add(grupoTuristas);
	}

	public ArrayList<Guia_turistico> rellenarGuias() {
		Guia_turistico g1 = new Guia_turistico("Pepe", "Arias Ramos", "00000001A", "pepe@gmail.com", "666555444", "<html>Castellano<br/>Ingles<br/>Frances</html>",
				true, "1,2,3,4", 17.50, 8.6, "Presentacion/Yo.png");
		Guia_turistico g2 = new Guia_turistico("David", "Utrilla Patón", "00000002A", "david@gmail.com", "666555446", "<html>Castellano<br/>Frances</html>", 
				true, "3,4", 19.95, 9.3, "Presentacion/utrilla.png");
		Guia_turistico g3 = new Guia_turistico("Diego", "Arche Claudio", "00000003A", "diego@gmail.com", "666555449", "<html>Castellano<br/>Portugues</html>",
				false, "1,2,4", 15.50, 6.7, "");

		guia.add(g1);
		guia.add(g2);
		guia.add(g3);

		return guia;
	}
	public ArrayList<Guia_turistico> getGuia() {
		return guia;
	}
	public void setGuia(Guia_turistico nuevo) {
		this.guia.add(nuevo);
	}

	public ArrayList<Historial_circuitos> rellenarHistorial() {
		Historial_circuitos h1 = new Historial_circuitos("1, 2", 15, 1500, "Ninguna",
				"Todo perfecto", "Aprobar a Pepe", false);
		Historial_circuitos h2 = new Historial_circuitos("3", 6, 450, "<html>David mintió.<br/>No sabe Francés</html>",
				"Bonita ciudad", "Suspender a David", false);
		Historial_circuitos h3 = new Historial_circuitos("2, 4", 12, 1340, "Murió un señor",
				"<html>Quitando al muerto,<br/>todo bien</html>", "Incluir pack Funerario", false);
		Historial_circuitos h4 = new Historial_circuitos("2, 3", 10, 420, "<html>Aun no se ha realizado<br/>el circuito</html>",
				"<html>Aun no se ha realizado<br/>el circuito</html>", "Conocer toda la ciudad.", true);
		Historial_circuitos h5 = new Historial_circuitos("2", 4, 230, "<html>Aun no se ha realizado<br/>el circuito</html>",
				"<html>Aun no se ha realizado<br/>el circuito</html>", "<html>Probar todas las tapas<br/>de las ciudades.</html>", true);
		Historial_circuitos h6 = new Historial_circuitos("1, 3", 8, 420, "<html>Aun no se ha realizado<br/>el circuito</html>",
				"<html>Aun no se ha realizado<br/>el circuito</html>", "<html>Visitar las calles<br/>mas antiguas.</html>", true);

		historial.add(h1);
		historial.add(h2);
		historial.add(h3);
		historial.add(h4);
		historial.add(h5);
		historial.add(h6);

		return historial;
	}
	public ArrayList<Historial_circuitos> getHistorial(){
		return historial;
	}

	public void setHistorial(Historial_circuitos historial) {
		this.historial.add(historial);
	}

	public ArrayList<Monumento> rellenarMonumento() {
		Monumento m1 = new Monumento(0.0,"09.00-14.00","1 hora","Icono de la ciudad","","Iglesia");
		Monumento m2 = new Monumento(10.0,"10.00-14.00","2 horas","Lleno de cultura","","Museo");
		Monumento m3 = new Monumento(5.0,"08.00-14.00","1 hora","Patrimonio Provincial","","Estatua");

		monumento.add(m1);
		monumento.add(m2);
		monumento.add(m3);

		return monumento;
	}
	
	public ArrayList<Monumento> getMonumento() {
		return monumento;
	}

	public void setMonumento(Monumento monumento) {
		this.monumento.add(monumento);
	}

	public ArrayList<Rutas_turisticas> rellenarRuta() {
		Rutas_turisticas r1 = new Rutas_turisticas("Puertollano","<html>Minero<br/>Plaza Villarreal<br/>Fuente Agria</html>",
				"El Rubio","Confecciones la Abuela");
		Rutas_turisticas r2 = new Rutas_turisticas("Ciudad Real","<html>Parque Gasset<br/>Plaza Ayuntamiento<br/>Plaza Correos</html>",
				"Casa Pepe","<html>H&M<br/>Zara<br/>Sfera</html>");
		Rutas_turisticas r3 = new Rutas_turisticas("Valdepeñas","<html>Bodegas El Paleto<br/>Parque Ayuntamiento<br/>Museo de la Hazada</html>",
				"El Patio de Maria","Navajas Kevin");

		ruta.add(r1);
		ruta.add(r2);
		ruta.add(r3);

		return ruta;
	}

	public ArrayList<Rutas_turisticas> getRuta() {
		return ruta;
	}

	public void setRuta(Rutas_turisticas ruta) {
		this.ruta.add(ruta);
	}

	public ArrayList<Turista> rellenarTuristas() {
		Turista t1 = new Turista(1, "01234567W","Maria","Galvez Perez","654321987","maria@gmail.com","");
		Turista t2 = new Turista(2, "01234567P","Andres","Rodriguez Sanz","645321987","andres@gmail.com","");
		Turista t3 = new Turista(3, "01234567M","Juan Manuel","Duque Santana","654231987","rojaco@gmail.com","");

		turistas.add(t1);
		turistas.add(t2);
		turistas.add(t3);

		return turistas;
	}
	
	public ArrayList<Turista> getTuristas() {
		return turistas;
	}

	public void setTuristas(Turista turistas) {
		this.turistas.add(turistas);

	}

	public ArrayList<Usuario> rellenarUsuario() {
		Usuario u1 = new Usuario("Profesora","Informatica","01237894Q","ipo1","");
		Usuario u2 = new Usuario("Pepe","Arias","00000001A","hola","/Presentacion/Yo.png");
		Usuario u3 = new Usuario("David","Utrilla","00000001B","adios","/Presentacion/utrilla.png");

		usuario.add(u1);
		usuario.add(u2);
		usuario.add(u3);

		return usuario;
	}
	
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario.add(usuario);
	}

}
