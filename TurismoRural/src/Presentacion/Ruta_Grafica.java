package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Ruta_Grafica extends JFrame {

	private Ruta_Grafica ruta;
	private JPanel contentPane;
	private JToolBar tbBarraIconos;
	private JButton btnCargarMapa;
	private JButton btnMonumento;
	private JButton btnRestaurante;
	private JButton btnIglesia;
	private JButton btnTienda;
	private JButton btnPlaza;
	private JButton btnFarmacia;
	private JScrollPane scPnlGrafico;

	private MiMapaDibujo miMapaDibujo;
	private ImageIcon mapa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		ruta = new Ruta_Grafica();
		setBounds(new Rectangle(0, 0, 700, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);

		miMapaDibujo = new MiMapaDibujo();
		miMapaDibujo.setIcon(null);
		scPnlGrafico.setViewportView(miMapaDibujo);

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
				btnMonumento.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/monumento.png")));
				tbBarraIconos.add(btnMonumento);
			}
			{
				btnRestaurante = new JButton("");
				btnRestaurante.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/restaurante.png")));
				tbBarraIconos.add(btnRestaurante);
			}
			{
				btnIglesia = new JButton("");
				btnIglesia.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/iglesia.png")));
				tbBarraIconos.add(btnIglesia);
			}
			{
				btnTienda = new JButton("");
				btnTienda.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/tienda.png")));
				tbBarraIconos.add(btnTienda);
			}
			{
				btnPlaza = new JButton("");
				btnPlaza.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/plaza.png")));
				tbBarraIconos.add(btnPlaza);
			}
			{
				btnFarmacia = new JButton("");
				btnFarmacia.setIcon(new ImageIcon(Ruta_Grafica.class.getResource("/Presentacion/farmacia.png")));
				tbBarraIconos.add(btnFarmacia);
			}
		}
		{
			scPnlGrafico = new JScrollPane();
			contentPane.add(scPnlGrafico, BorderLayout.CENTER);

		}
	}

	private class BtnCargarMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(ruta);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				mapa = new ImageIcon(file.getAbsolutePath());
				miMapaDibujo.setIcon(mapa);
			}
		}
	}
}
