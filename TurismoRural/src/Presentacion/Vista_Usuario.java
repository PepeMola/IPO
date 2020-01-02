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
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

import java.awt.Window.Type;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dimension;

public class Vista_Usuario extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tbpVistaUsuario;
	private JPanel pnlUsuario;
	private JPanel pnlGuias;
	private JPanel pnlCircuitos;
	private JPanel pnlPromociones;
	private JLabel lblNombre;
	private JLabel lblFoto;
	private JButton btnAyuda;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JLabel lblNombre2;
	private JLabel lblApellido2;
	private JLabel lblDni2;

	private String nombreUsuario;
	private String apellidoUsuario;
	private String dniUsuario;
	private JTable table;
	private JButton btnInsertarGuia;
	private JButton btnModificarTabla;
	private JButton btnDarDeBaja;
	private JButton btnDarDeAlta;
	private JButton btnModificarTabla_1;
	private JButton btnDarDeBaja_1;
	private JTable table_1;
	private JPanel panel;

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
		setFont(new Font("Dialog", Font.BOLD, 12));
		this.nombreUsuario = nombre;
		this.apellidoUsuario = apellido;
		this.dniUsuario = dni;
		setTitle("USUARIO");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vista_Usuario.class.getResource("/Presentacion/usuario.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centrarPantalla();
		//setBounds(100, 100, 613, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			tbpVistaUsuario = new JTabbedPane(JTabbedPane.TOP);
			tbpVistaUsuario.setSelectedIndex(-1);
			tbpVistaUsuario.setToolTipText("");
			tbpVistaUsuario.setBounds(0, 0, 667, 345);
			contentPane.add(tbpVistaUsuario);
			{
			}
			pnlUsuario = new JPanel();
			tbpVistaUsuario.addTab("Usuario", null, pnlUsuario, null);
			tbpVistaUsuario.setEnabledAt(0, true);
			pnlUsuario.setLayout(null);
			{
				lblNombre = new JLabel("Nombre:");
				lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblNombre.setBounds(194, 24, 105, 51);
				pnlUsuario.add(lblNombre);
			}
			{
				lblFoto = new JLabel("Foto");
				lblFoto.setBounds(31, 47, 105, 113);
				pnlUsuario.add(lblFoto);
			}
			{
				btnAyuda = new JButton("");
				btnAyuda.addActionListener(new BtnAyudaActionListener());

				btnAyuda.setIcon(new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/help.png")));
				btnAyuda.setBounds(10, 265, 40, 40);
				pnlUsuario.add(btnAyuda);
			}
			{
				lblApellido = new JLabel("Apellido:");
				lblApellido.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblApellido.setBounds(194, 73, 105, 51);
				pnlUsuario.add(lblApellido);
			}
			{
				lblDni = new JLabel("DNI:");
				lblDni.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblDni.setBounds(194, 135, 105, 51);
				pnlUsuario.add(lblDni);
			}
			{
				lblNombre2 = new JLabel(this.nombreUsuario);
				lblNombre2.setBackground(Color.WHITE);
				lblNombre2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblNombre2.setBounds(309, 47, 276, 51);
				pnlUsuario.add(lblNombre2);
			}
			{
				lblApellido2 = new JLabel(this.apellidoUsuario);
				lblApellido2.setBackground(Color.WHITE);
				lblApellido2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblApellido2.setBounds(309, 109, 276, 51);
				pnlUsuario.add(lblApellido2);
			}
			{
				lblDni2 = new JLabel(this.dniUsuario);
				lblDni2.setBackground(Color.WHITE);
				lblDni2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				lblDni2.setBounds(309, 171, 276, 51);
				pnlUsuario.add(lblDni2);
			}
			{
				pnlGuias = new JPanel();
				tbpVistaUsuario.addTab("Guias Turisticos", null, pnlGuias, null);
				GridBagLayout gbl_pnlGuias = new GridBagLayout();
				gbl_pnlGuias.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
				gbl_pnlGuias.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
				gbl_pnlGuias.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_pnlGuias.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlGuias.setLayout(gbl_pnlGuias);
				{
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {


					});
					table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{"Nombre", "Apellidos", "Idioma", "Disponibilidad", "Tlf. contacto", "e-mail", "Historial de rutas", "Precio/Hora", "Puntuacion"},
								{"David", "Utrilla", "Ingles-Castellano", "Solo tardes", "123456789", "davidu@hotmail.com", "1-2", "13", "6.5"},
								{"Jose Antonio", "Arias", "Ingles-Castellano", "Total", "132456789", "pepea@hotmail.com", "1", "34", "8"},
								{"Valentin ", "Stoyanov", "Ruso", "Ma\u00F1anas", "142356789", "VS@hotmail.com", "2", "3", "4"},
								{"Custodio", "Gamero", "Italiano", "Total", "152346789", "CG@hotmail.com", "1-2", "13", null},
								{null, null, null, null, null, null, null, null, null},
							},
							new String[] {
									"Nombre", "Apellidos", "Idioma", "Disponibilidad", "Tlf. contacto", "e-mail", "Historial de rutas", "Precio/Hora", "Puntuacion"
							}
							));
					table.getColumnModel().getColumn(0).setPreferredWidth(66);
					table.getColumnModel().getColumn(0).setMinWidth(66);
					table.getColumnModel().getColumn(1).setPreferredWidth(64);
					table.getColumnModel().getColumn(1).setMinWidth(64);
					table.getColumnModel().getColumn(2).setMinWidth(75);
					table.getColumnModel().getColumn(3).setMinWidth(75);
					table.getColumnModel().getColumn(4).setMinWidth(75);
					table.getColumnModel().getColumn(5).setMinWidth(75);
					table.getColumnModel().getColumn(6).setMinWidth(75);
					table.getColumnModel().getColumn(7).setPreferredWidth(65);
					table.getColumnModel().getColumn(7).setMinWidth(65);
					table.getColumnModel().getColumn(8).setPreferredWidth(63);
					table.getColumnModel().getColumn(8).setMinWidth(60);
					GridBagConstraints gbc_table = new GridBagConstraints();
					gbc_table.gridwidth = 6;
					gbc_table.insets = new Insets(0, 0, 5, 5);
					gbc_table.fill = GridBagConstraints.BOTH;
					gbc_table.gridx = 0;
					gbc_table.gridy = 1;
					pnlGuias.add(table, gbc_table);
				}
				{
					btnInsertarGuia = new JButton("Insertar Guia");
					GridBagConstraints gbc_btnInsertarGuia = new GridBagConstraints();
					gbc_btnInsertarGuia.insets = new Insets(0, 0, 5, 5);
					gbc_btnInsertarGuia.gridx = 3;
					gbc_btnInsertarGuia.gridy = 2;
					pnlGuias.add(btnInsertarGuia, gbc_btnInsertarGuia);
				}
				{
					btnModificarTabla = new JButton("Modificar Tabla");
					GridBagConstraints gbc_btnModificarTabla = new GridBagConstraints();
					gbc_btnModificarTabla.insets = new Insets(0, 0, 5, 5);
					gbc_btnModificarTabla.gridx = 4;
					gbc_btnModificarTabla.gridy = 2;
					pnlGuias.add(btnModificarTabla, gbc_btnModificarTabla);
				}
				{
					btnDarDeBaja = new JButton("Dar de Baja");
					GridBagConstraints gbc_btnDarDeBaja = new GridBagConstraints();
					gbc_btnDarDeBaja.insets = new Insets(0, 0, 5, 5);
					gbc_btnDarDeBaja.gridx = 5;
					gbc_btnDarDeBaja.gridy = 2;
					pnlGuias.add(btnDarDeBaja, gbc_btnDarDeBaja);
				}
			}
			{
				pnlCircuitos = new JPanel();
				tbpVistaUsuario.addTab("Circuitos Turisticos", null, pnlCircuitos, null);
				GridBagLayout gbl_pnlCircuitos = new GridBagLayout();
				gbl_pnlCircuitos.columnWidths = new int[]{0, 0, 0, 0, 25, 27, 0, 0, 0};
				gbl_pnlCircuitos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
				gbl_pnlCircuitos.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_pnlCircuitos.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlCircuitos.setLayout(gbl_pnlCircuitos);
				{
					{
						JTable table_Circuitos = new JTable();
						table_Circuitos.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
						table_Circuitos.setRowSelectionAllowed(false);
						table_Circuitos.setFillsViewportHeight(true);
						table_Circuitos.setModel(new DefaultTableModel(
								new Object[][] {
									{"ID", "Localidades", "Monumentos", "Restaurantes", "Tiendas", "Puntos de inter\u00E9s"},
									{"1", "Ciudad-Real", "Puerta de Toledo", "Bar el Estudiante", "H&M,Mango,Pull&Bear", "Plaza del Ayuntamiento"},
									{"2", "Puertollano", "Fuente Agria", "El Bomba", "Sprinfield", "Paseo San Gregrio"},
								},
								new String[] {
										"ID", "Localidades", "Monumentos", "Restaurantes", "Tiendas", "Puntos de inter\u00E9s"
								}
								) {
							Class[] columnTypes=new Class[]{
									String.class,String.class,String.class,String.class,String.class,String.class,
							};

							public Class getColumnClass(int columnIndex) {
								return columnTypes[columnIndex];
							}
						});


						table_Circuitos.getColumnModel().getColumn(0).setPreferredWidth(24);
						table_Circuitos.getColumnModel().getColumn(0).setMinWidth(11);
						table_Circuitos.getColumnModel().getColumn(1).setPreferredWidth(65);
						table_Circuitos.getColumnModel().getColumn(1).setMinWidth(65);
						table_Circuitos.getColumnModel().getColumn(2).setMinWidth(75);
						table_Circuitos.getColumnModel().getColumn(3).setMinWidth(75);
						table_Circuitos.getColumnModel().getColumn(4).setMinWidth(70);
						table_Circuitos.getColumnModel().getColumn(5).setPreferredWidth(94);
						table_Circuitos.getColumnModel().getColumn(5).setMinWidth(94);
						GridBagConstraints gbc_table_Circuitos = new GridBagConstraints();
						gbc_table_Circuitos.gridwidth = 6;
						gbc_table_Circuitos.insets = new Insets(0, 0, 5, 5);
						gbc_table_Circuitos.fill = GridBagConstraints.BOTH;
						gbc_table_Circuitos.gridx = 1;
						gbc_table_Circuitos.gridy = 1;
						pnlCircuitos.add(table_Circuitos, gbc_table_Circuitos);
					}
				}
				{
					btnDarDeAlta = new JButton("Dar de alta");
					GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
					gbc_btnDarDeAlta.insets = new Insets(0, 0, 5, 5);
					gbc_btnDarDeAlta.gridx = 3;
					gbc_btnDarDeAlta.gridy = 2;
					pnlCircuitos.add(btnDarDeAlta, gbc_btnDarDeAlta);
				}
				{
					btnModificarTabla_1 = new JButton("Modificar Tabla");
					GridBagConstraints gbc_btnModificarTabla_1 = new GridBagConstraints();
					gbc_btnModificarTabla_1.insets = new Insets(0, 0, 5, 5);
					gbc_btnModificarTabla_1.gridx = 4;
					gbc_btnModificarTabla_1.gridy = 2;
					pnlCircuitos.add(btnModificarTabla_1, gbc_btnModificarTabla_1);
				}
				{
					btnDarDeBaja_1 = new JButton("Dar de baja");
					GridBagConstraints gbc_btnDarDeBaja_1 = new GridBagConstraints();
					gbc_btnDarDeBaja_1.insets = new Insets(0, 0, 5, 5);
					gbc_btnDarDeBaja_1.gridx = 5;
					gbc_btnDarDeBaja_1.gridy = 2;
					pnlCircuitos.add(btnDarDeBaja_1, gbc_btnDarDeBaja_1);
				}
			}
			{
				pnlPromociones = new JPanel();
				tbpVistaUsuario.addTab("Promociones", null, pnlPromociones, null);
				GridBagLayout gbl_pnlPromociones = new GridBagLayout();
				gbl_pnlPromociones.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_pnlPromociones.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
				gbl_pnlPromociones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_pnlPromociones.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlPromociones.setLayout(gbl_pnlPromociones);
				{
					table_1 = new JTable();
					table_1.setModel(new DefaultTableModel(

							new Object[][] {
								{"1", "-50%", "Ciudad Real"},
								{"2", "2x1", "Puertollano"},
								{"3", "-20%", "Puertollano"},
							},
							new String[] {
									"ID", "Promocion", "Localidad"
							}
							));

					table_1.getColumnModel().getColumn(0).setPreferredWidth(21);
					table_1.getColumnModel().getColumn(0).setMinWidth(21);
					table_1.getColumnModel().getColumn(1).setPreferredWidth(59);
					table_1.getColumnModel().getColumn(1).setMinWidth(59);
					table_1.getColumnModel().getColumn(2).setPreferredWidth(66);
					table_1.getColumnModel().getColumn(2).setMinWidth(65);
					GridBagConstraints gbc_table_1 = new GridBagConstraints();
					gbc_table_1.gridheight = 3;
					gbc_table_1.insets = new Insets(0, 0, 5, 5);
					gbc_table_1.fill = GridBagConstraints.BOTH;
					gbc_table_1.gridx = 1;
					gbc_table_1.gridy = 1;
					pnlPromociones.add(table_1, gbc_table_1);
				}
			}
			{
				panel = new JPanel();
				tbpVistaUsuario.addTab("Historial", null, panel, null);
			}
		}
	}	
	private void centrarPantalla() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();

		Dimension sizePantalla = pantalla.getScreenSize();

		int alturaPantalla = sizePantalla.height;
		int anchoPantalla = sizePantalla.width;

		setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
	}
	
	private class BtnAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Ayuda frame = new Ayuda();
			frame.setVisible(true);
			
		}
	}
}
