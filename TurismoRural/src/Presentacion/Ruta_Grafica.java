package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class Ruta_Grafica extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ruta_Grafica frame = new Ruta_Grafica();
					frame.setVisible(true);
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
		setBounds(new Rectangle(0, 0, 700, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			tbBarraIconos = new JToolBar();
			contentPane.add(tbBarraIconos, BorderLayout.NORTH);
			{
				btnCargarMapa = new JButton("");
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

}
