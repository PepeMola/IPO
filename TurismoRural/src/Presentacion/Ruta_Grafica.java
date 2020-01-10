package Presentacion;

import Dominio.ImagenGrafico;
import Dominio.MiMapaDibujo;
import Dominio.RectanguloGrafico;
import Dominio.TextoGrafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Ruta_Grafica extends JFrame {

	//	private Ruta_Grafica ruta;
	private JPanel contentPane;
	private JToolBar tbBarraIconos;
	private JButton btnCargarMapa;
	private JButton btnMonumento;
	private JButton btnRestaurante;
	private JButton btnIglesia;
	private JButton btnTienda;
	private JButton btnPlaza;
	private JButton btnFarmacia;
	private JButton btnRectangulo;
	private JButton btnTexto;
	private JScrollPane scPnlGrafico;
	private JLabel miAreaDibujo;
	private JTextField txtTexto = new JTextField();

	private MiMapaDibujo miMapaDibujo;
	private ImageIcon mapa;

	int modo = -1;
	private final int MONUMENTO = 1;
	private final int RESTAURANTE = 2;
	private final int IGLESIA = 3;
	private final int TIENDA = 4;
	private final int PLAZA = 5;
	private final int FARMACIA = 6;
	private final int RECTANGULO = 7;
	private final int TEXTO = 8;

	//Cursores e imagenes
	private Toolkit toolkit;
	private Image imagMonumento;
	private Image imagRestaurante;
	private Image imagIglesia;
	private Image imagTienda;
	private Image imagPlaza;
	private Image imagFarmacia;
	private Image imagRectangulo;
	private Image imagTexto;

	private Cursor cursorMonumento;
	private Cursor cursorRestaurante;
	private Cursor cursorIglesia;
	private Cursor cursorTienda;
	private Cursor cursorPlaza;
	private Cursor cursorFarmacia;
	private Cursor cursorRectangulo;
	private Cursor cursorTexto;

	private int x, y;
	private Ruta_Grafica ruta;
	private JButton btnAtras;
	
	public static void main (String args []) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				Ruta_Grafica ruta = new Ruta_Grafica();
					ruta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ruta_Grafica() {
		//ruta = new Ruta_Grafica();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ruta_Grafica.class.getResource("/Presentacion/usuario.png")));
		setTitle("Diseño de Ruta");
		setResizable(false);
		setBounds(new Rectangle(0, 0, 700, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			tbBarraIconos = new JToolBar();
			contentPane.add(tbBarraIconos, BorderLayout.NORTH);
			{
				btnCargarMapa = new JButton("");
				btnCargarMapa.addActionListener(new BtnCargarMapaActionListener());
				btnCargarMapa.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/cargarMapa.png")));
				tbBarraIconos.add(btnCargarMapa);
			}
			{
				btnMonumento = new JButton("");
				btnMonumento.addActionListener(new BtnMonumentoActionListener());
				btnMonumento.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/monumento.png")));
				tbBarraIconos.add(btnMonumento);
			}
			{
				btnRestaurante = new JButton("");
				btnRestaurante.addActionListener(new BtnRestauranteActionListener());
				btnRestaurante.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/restaurante.png")));
				tbBarraIconos.add(btnRestaurante);
			}
			{
				btnIglesia = new JButton("");
				btnIglesia.addActionListener(new BtnIglesiaActionListener());
				btnIglesia.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/iglesia.png")));
				tbBarraIconos.add(btnIglesia);
			}
			{
				btnTienda = new JButton("");
				btnTienda.addActionListener(new BtnTiendaActionListener());
				btnTienda.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/tienda.png")));
				tbBarraIconos.add(btnTienda);
			}
			{
				btnPlaza = new JButton("");
				btnPlaza.addActionListener(new BtnPlazaActionListener());
				btnPlaza.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/plaza.png")));
				tbBarraIconos.add(btnPlaza);
			}
			{
				btnFarmacia = new JButton("");
				btnFarmacia.addActionListener(new BtnFarmaciaActionListener());
				btnFarmacia.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/farmacia.png")));
				tbBarraIconos.add(btnFarmacia);
			}
			{
				btnRectangulo = new JButton("");
				btnRectangulo.addActionListener(new BtnRectanguloActionListener());
				btnRectangulo.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/rectangulo.png")));
				tbBarraIconos.add(btnRectangulo);
			}
			{
				btnTexto = new JButton("");
				btnTexto.addActionListener(new BtnTextoActionListener());
				btnTexto.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/aniadirAnotacion.png")));
				tbBarraIconos.add(btnTexto);
			}
		}
		{
			scPnlGrafico = new JScrollPane();
			miMapaDibujo = new MiMapaDibujo();
			miMapaDibujo.setIcon(null);
			contentPane.add(scPnlGrafico, BorderLayout.CENTER);
			{
				miAreaDibujo = new JLabel("");
				miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
				miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
				scPnlGrafico.setViewportView(miAreaDibujo);
			}

		}
		{
			btnAtras = new JButton("Atras");
			btnAtras.addActionListener(new BtnAtrasActionListener());
			contentPane.add(btnAtras, BorderLayout.SOUTH);
		}
		//Creación de imágenes
		toolkit = Toolkit.getDefaultToolkit();
		imagMonumento = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/monumento.png"));
		imagRestaurante = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/restaurante.png"));
		imagIglesia = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/iglesia.png"));
		imagTienda = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/tienda.png"));
		imagPlaza = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/plaza.png"));
		imagFarmacia = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/farmacia.png"));
		imagRectangulo = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/rectangulo.png"));
		imagTexto = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/aniadirAnotacion.png"));

		//Creación de cursores
		cursorMonumento = toolkit.createCustomCursor(imagMonumento,new Point(0,0),"MONUMENTO");
		cursorRestaurante = toolkit.createCustomCursor(imagRestaurante,new Point(0,0),"RESTAURANTE");
		cursorIglesia = toolkit.createCustomCursor(imagIglesia,new Point(0,0),"IGLESIA");
		cursorTienda = toolkit.createCustomCursor(imagTienda,new Point(0,0),"TIENDA");
		cursorPlaza = toolkit.createCustomCursor(imagPlaza,new Point(0,0),"PLAZA");
		cursorFarmacia = toolkit.createCustomCursor(imagFarmacia,new Point(0,0),"FARMACIA");
		cursorRectangulo = toolkit.createCustomCursor(imagRectangulo,new Point(0,0),"RECTANGULO");
		cursorTexto = toolkit.createCustomCursor(imagRectangulo,new Point(0,0),"TEXTO");
	}

	private class BtnCargarMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();

			int valorDevuelto = fcAbrir.showOpenDialog(ruta);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				System.out.println("Ruta correcta");
				File file = fcAbrir.getSelectedFile();
				System.out.println(fcAbrir.getSelectedFile().getAbsolutePath());
				mapa = new ImageIcon(file.getAbsolutePath());
				miAreaDibujo.setIcon(mapa);
			}
		}
	}

	private class BtnMonumentoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			modo = MONUMENTO;
			ruta.setCursor(cursorMonumento);
		}
	}

	private class BtnRestauranteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RESTAURANTE;
			ruta.setCursor(cursorRestaurante);
		}
	}

	private class BtnIglesiaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = IGLESIA;
			ruta.setCursor(cursorIglesia);
		}
	}

	private class BtnTiendaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TIENDA;
			ruta.setCursor(cursorTienda);
		}
	}

	private class BtnPlazaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = PLAZA;
			ruta.setCursor(cursorPlaza);
		}
	}

	private class BtnFarmaciaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FARMACIA;
			ruta.setCursor(cursorFarmacia);
		}
	}

	private class BtnRectanguloActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RECTANGULO;
			ruta.setCursor(cursorRectangulo);
		}
	}

	private class BtnTextoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
			ruta.setCursor(cursorTexto);
		}
	}

	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();

			toolkit = Toolkit.getDefaultToolkit();

			if (mapa != null)
			{
				switch (modo)
				{
				case MONUMENTO:
					miMapaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagMonumento));
					miMapaDibujo.repaint();
					break;
				case RESTAURANTE:
					miMapaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagRestaurante));
					miMapaDibujo.repaint();
					break;
				case IGLESIA:
					miMapaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagIglesia));
					miMapaDibujo.repaint();
					break;
				case TIENDA:
					miMapaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagTienda));
					miMapaDibujo.repaint();
					break;
				case PLAZA:
					miMapaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagPlaza));
					miMapaDibujo.repaint();
					break;
				case FARMACIA:
					miMapaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagFarmacia));
					miMapaDibujo.repaint();
					break;
				case RECTANGULO:
					miMapaDibujo.addObjetoGrafico(new RectanguloGrafico(x,y,x,y,Color.RED));
					miMapaDibujo.repaint();
					break;
				case TEXTO:
					txtTexto.setBounds(x, y, 200,30);
					txtTexto.setVisible(true);
					txtTexto.requestFocus();
					txtTexto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg) {
							if(!txtTexto.getText().equals(""))
								miMapaDibujo.addObjetoGrafico(new TextoGrafico(x, y+15, txtTexto.getText(),Color.BLUE));
							txtTexto.setText("");
							txtTexto.setVisible(false);
							miAreaDibujo.repaint();
						}
					});
					miAreaDibujo.add(txtTexto);
				}
			}
		}
	}

	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == RECTANGULO && mapa !=null) {
				((RectanguloGrafico)miMapaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
				((RectanguloGrafico)miMapaDibujo.getUltimoObjetoGrafico()).setY1(e.getY());
				miAreaDibujo.repaint();
			}
		}
	}
	private class BtnAtrasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}


}
