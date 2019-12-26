package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Dominio.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTree;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista_Usuario extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pnlUsuario;
	private JPanel pnlGuias;
	private JPanel pnlCircuitos;
	private JPanel pnlPromociones;
	private JLabel lblNombre;
	private JLabel lblFoto;
	private JButton btnAyuda;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JButton btnAlta;
	private JButton btnModificacion;
	private JButton btnBaja;
	private JLabel lblNombre2;
	private JLabel lblApellido2;
	private JLabel lblDni2;
	
	private String nombreUsuario;
	private String apellidoUsuario;
	private String dniUsuario;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista_Usuario frame = new Vista_Usuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	public Vista_Usuario(String nombre, String apellido, String dni) {
		this.nombreUsuario = nombre;
		this.apellidoUsuario = apellido;
		this.dniUsuario = dni;
		setTitle("Usuario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vista_Usuario.class.getResource("/Presentacion/usuario.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setSelectedIndex(-1);
			tabbedPane.setToolTipText("");
			tabbedPane.setBounds(0, 0, 600, 400);
			contentPane.add(tabbedPane);
			{
			}
			pnlUsuario = new JPanel();
			tabbedPane.addTab("Usuario", null, pnlUsuario, null);
			tabbedPane.setEnabledAt(0, true);
			pnlUsuario.setLayout(null);
			{
				lblNombre = new JLabel("Nombre:");
				lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblNombre.setBounds(194, 47, 105, 51);
				pnlUsuario.add(lblNombre);
			}
			{
				lblFoto = new JLabel("Foto");
				lblFoto.setBounds(31, 47, 77, 91);
				pnlUsuario.add(lblFoto);
			}
			{
				btnAyuda = new JButton("");
				
				btnAyuda.setIcon(new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/help.png")));
				btnAyuda.setBounds(10, 293, 53, 51);
				pnlUsuario.add(btnAyuda);
			}
			{
				lblApellido = new JLabel("Apellido:");
				lblApellido.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblApellido.setBounds(194, 109, 105, 51);
				pnlUsuario.add(lblApellido);
			}
			{
				lblDni = new JLabel("DNI:");
				lblDni.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblDni.setBounds(194, 171, 105, 51);
				pnlUsuario.add(lblDni);
			}
			{
				btnAlta = new JButton("ALTA");
				btnAlta.setBounds(128, 293, 134, 51);
				pnlUsuario.add(btnAlta);
			}
			{
				btnModificacion = new JButton("MODIFICACION");
				btnModificacion.setBounds(272, 293, 134, 51);
				pnlUsuario.add(btnModificacion);
			}
			{
				btnBaja = new JButton("BAJA");
				btnBaja.setBounds(416, 293, 134, 51);
				pnlUsuario.add(btnBaja);
			}
			{
				lblNombre2 = new JLabel(this.nombreUsuario);
				lblNombre2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblNombre2.setBounds(309, 47, 105, 51);
				pnlUsuario.add(lblNombre2);
			}
			{
				lblApellido2 = new JLabel(this.apellidoUsuario);
				lblApellido2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblApellido2.setBounds(309, 109, 105, 51);
				pnlUsuario.add(lblApellido2);
			}
			{
				lblDni2 = new JLabel(this.dniUsuario);
				lblDni2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblDni2.setBounds(272, 171, 142, 51);
				pnlUsuario.add(lblDni2);
			}
			{
				pnlGuias = new JPanel();
				tabbedPane.addTab("Guias Turísticos", null, pnlGuias, null);
			}
			{
				pnlCircuitos = new JPanel();
				tabbedPane.addTab("Circuitos Turísticos", null, pnlCircuitos, null);
			}
			{
				pnlPromociones = new JPanel();
				tabbedPane.addTab("Promociones", null, pnlPromociones, null);
			}
		}
	}
	
}
