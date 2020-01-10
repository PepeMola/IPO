package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import Dominio.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseEvent;



public class Vista_Usuario extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tbpVistaUsuario;
	private JPanel pnlGuias;
	private JPanel pnlRutas;
	private JPanel pnlPromociones;

	private JButton btnInsertarGuia;
	private JButton btnModificarGuia;
	private JButton btnEliminarGuia;
	private JButton btnInsertarRuta;
	private JButton btnModificarRuta;
	private JButton btnEliminarRuta;
	private JPanel pnlHistorial;
	private JPanel pnlUsuario;
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblUltimoAcceso;
	private JLabel lblIdentificador;
	private JButton btnAyuda;
	private JScrollPane scPnlRutas;
	private JTable table_Rutas;
	private JPanel pnlInfoRutas;
	private JTextArea taInfoRutas;
	private JScrollPane scPnlGuia;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfIdentificador;
	private JTextField tfAcceso;
	private JTable table_guia;
	private JPanel pnlInfoGuia;
	private JTextArea taInfoGuia;
	private JScrollPane scPnlPromocion;
	private JTable table_promocion;
	private JButton btnInsertarPromo;
	private JButton btnEliminarPromo;
	private JButton btnModificarPromo;
	private JScrollPane scPnlTurista;
	private JTable table_turista;
	private JScrollPane scPnlHistorial;
	private JTable table_historial;
	private JButton btnDisearRuta;
	private JButton btnEliminarTurista;
	private JButton btnModificarTurista;
	private JButton btnAgregarTurista;
	private JButton btnHistorialesPendientes;
	private JButton btnHistorialFinalizados;
	private JButton btnRefrescarTabla;
	Hardcoded h = new Hardcoded();
	private JScrollPane scPaneGrupos;
	private JPanel pnlInfoGrupo;
	private JLabel lblNmeroDeTuristas;
	private JTextField txtNumTuristas;
	private JLabel lblDescripcin;
	private JTextPane tpDescripcion;
	private JLabel lblTipo;
	private JLabel lblIntereses;
	private JTextField txtTipo;
	private JTextPane tpIntereses;
	private JButton btnRefrescarPromociones;

	public Vista_Usuario(Usuario u) {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Gestor de Turismo Rural");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vista_Usuario.class.getResource("/Presentacion/usuario.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centrarPantalla();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{667, 0};
		gbl_contentPane.rowHeights = new int[]{345, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		tbpVistaUsuario = new JTabbedPane(JTabbedPane.TOP);
		tbpVistaUsuario.setSelectedIndex(-1);
		tbpVistaUsuario.setToolTipText("");
		GridBagConstraints gbc_tbpVistaUsuario = new GridBagConstraints();
		gbc_tbpVistaUsuario.fill = GridBagConstraints.BOTH;
		gbc_tbpVistaUsuario.gridx = 0;
		gbc_tbpVistaUsuario.gridy = 0;
		contentPane.add(tbpVistaUsuario, gbc_tbpVistaUsuario);
		{
			pnlUsuario = new JPanel();
			pnlUsuario.setToolTipText("Informacion del usuario");
			tbpVistaUsuario.addTab("Usuario", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/grupo_usuarios.png")), pnlUsuario, null);
			tbpVistaUsuario.setEnabledAt(0, true);
			GridBagLayout gbl_pnlUsuario = new GridBagLayout();
			gbl_pnlUsuario.columnWidths = new int[]{44, 56, 0, 133, 0, 0, 0, 0, 0, 0};
			gbl_pnlUsuario.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlUsuario.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_pnlUsuario.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			pnlUsuario.setLayout(gbl_pnlUsuario);
			{
				lblFoto = new JLabel("");
				lblFoto.setIcon(new ImageIcon(Vista_Usuario.class.getResource(u.getFoto())));
				GridBagConstraints gbc_lblFoto = new GridBagConstraints();
				gbc_lblFoto.gridheight = 3;
				gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
				gbc_lblFoto.gridx = 1;
				gbc_lblFoto.gridy = 1;
				pnlUsuario.add(lblFoto, gbc_lblFoto);
			}
			{
				lblNombre = new JLabel("Nombre:");
				lblNombre.setHorizontalTextPosition(SwingConstants.LEFT);
				lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
				lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.WEST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 3;
				gbc_lblNombre.gridy = 1;
				pnlUsuario.add(lblNombre, gbc_lblNombre);
			}
			{
				tfNombre = new JTextField();
				tfNombre.setEditable(false);
				tfNombre.setText(u.getNombre());
				GridBagConstraints gbc_tfNombre = new GridBagConstraints();
				gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
				gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfNombre.gridx = 4;
				gbc_tfNombre.gridy = 1;
				pnlUsuario.add(tfNombre, gbc_tfNombre);
				tfNombre.setColumns(10);
			}
			{
				lblApellidos = new JLabel("Apellidos:");
				lblApellidos.setHorizontalTextPosition(SwingConstants.LEFT);
				lblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
				lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 16));
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 3;
				gbc_lblApellidos.gridy = 2;
				pnlUsuario.add(lblApellidos, gbc_lblApellidos);
			}
			{
				tfApellidos = new JTextField();
				tfApellidos.setEditable(false);
				tfApellidos.setText(u.getApellidos());
				GridBagConstraints gbc_tfApellidos = new GridBagConstraints();
				gbc_tfApellidos.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_tfApellidos.gridx = 4;
				gbc_tfApellidos.gridy = 2;
				pnlUsuario.add(tfApellidos, gbc_tfApellidos);
				tfApellidos.setColumns(10);
			}
			{
				lblUltimoAcceso = new JLabel("Ultimo Acceso:");
				lblUltimoAcceso.setHorizontalTextPosition(SwingConstants.LEFT);
				lblUltimoAcceso.setHorizontalAlignment(SwingConstants.CENTER);
				lblUltimoAcceso.setFont(new Font("Tahoma", Font.BOLD, 16));
				GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
				gbc_lblUltimoAcceso.anchor = GridBagConstraints.WEST;
				gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
				gbc_lblUltimoAcceso.gridx = 3;
				gbc_lblUltimoAcceso.gridy = 3;
				pnlUsuario.add(lblUltimoAcceso, gbc_lblUltimoAcceso);
			}
			{
				tfAcceso = new JTextField();
				tfAcceso.setEditable(false);
				Date date = new Date();
				tfAcceso.setText(date.toString());
				GridBagConstraints gbc_tfAcceso = new GridBagConstraints();
				gbc_tfAcceso.insets = new Insets(0, 0, 5, 5);
				gbc_tfAcceso.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfAcceso.gridx = 4;
				gbc_tfAcceso.gridy = 3;
				pnlUsuario.add(tfAcceso, gbc_tfAcceso);
				tfAcceso.setColumns(10);
			}
			{
				lblIdentificador = new JLabel("Identificador:");
				lblIdentificador.setHorizontalTextPosition(SwingConstants.LEFT);
				lblIdentificador.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdentificador.setFont(new Font("Tahoma", Font.BOLD, 16));
				GridBagConstraints gbc_lblIdentificador = new GridBagConstraints();
				gbc_lblIdentificador.anchor = GridBagConstraints.WEST;
				gbc_lblIdentificador.insets = new Insets(0, 0, 5, 5);
				gbc_lblIdentificador.gridx = 3;
				gbc_lblIdentificador.gridy = 4;
				pnlUsuario.add(lblIdentificador, gbc_lblIdentificador);
			}
			{
				tfIdentificador = new JTextField();
				tfIdentificador.setEditable(false);
				tfIdentificador.setText(u.getNif());
				GridBagConstraints gbc_tfIdentificador = new GridBagConstraints();
				gbc_tfIdentificador.insets = new Insets(0, 0, 5, 5);
				gbc_tfIdentificador.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfIdentificador.gridx = 4;
				gbc_tfIdentificador.gridy = 4;
				pnlUsuario.add(tfIdentificador, gbc_tfIdentificador);
				tfIdentificador.setColumns(10);
			}
			{
				btnAyuda = new JButton("");
				btnAyuda.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Ayuda_Usuario frame = new Ayuda_Usuario();
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
				});
				btnAyuda.setMargin(new Insets(2, 2, 2, 2));
				btnAyuda.setIcon(new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/help.png")));
				GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
				gbc_btnAyuda.insets = new Insets(0, 0, 0, 5);
				gbc_btnAyuda.gridx = 0;
				gbc_btnAyuda.gridy = 6;
				pnlUsuario.add(btnAyuda, gbc_btnAyuda);
			}
			{
				btnDisearRuta = new JButton("Diseñar Ruta");
			}
		}
		{
			pnlGuias = new JPanel();
			pnlGuias.setToolTipText("Gestor de Guias");
			tbpVistaUsuario.addTab("Guias Turisticos", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/networking.png")), pnlGuias, null);
			GridBagLayout gbl_pnlGuias = new GridBagLayout();
			gbl_pnlGuias.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlGuias.rowHeights = new int[]{0, 0, 71, 0, 0, 0};
			gbl_pnlGuias.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlGuias.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			pnlGuias.setLayout(gbl_pnlGuias);
			{
				{
					scPnlGuia = new JScrollPane();
					scPnlGuia.setBorder(new TitledBorder(null, "Nuestros Guias de confianza", TitledBorder.CENTER, TitledBorder.TOP, null, null));
					GridBagConstraints gbc_scPnlGuia = new GridBagConstraints();
					gbc_scPnlGuia.gridheight = 3;
					gbc_scPnlGuia.gridwidth = 7;
					gbc_scPnlGuia.insets = new Insets(0, 0, 5, 0);
					gbc_scPnlGuia.fill = GridBagConstraints.BOTH;
					gbc_scPnlGuia.gridx = 0;
					gbc_scPnlGuia.gridy = 0;
					pnlGuias.add(scPnlGuia, gbc_scPnlGuia);
					{
						table_guia = new JTable();
						table_guia.setModel(new DefaultTableModel(
								new Object[][] {
									{null, null, null, null, null, null, null, null, null, null, null, null},
									{null, null, null, null, null, null, null, null, null, null, null, null},
									{null, null, null, null, null, null, null, null, null, null, null, null},
								},
								new String[] {
										"ID", "Nombre", "Apellidos", "NIF", "e-mail", "Telefono", "Idiomas", "Disponibilidad", "Rutas", "Precio", "Puntuacion", "Foto"
								}
								) {
							Class[] columnTypes = new Class[] {
									Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, Double.class, Double.class, ImageIcon.class
							};
							public Class getColumnClass(int columnIndex) {
								return columnTypes[columnIndex];
							}
						});
						table_guia.getColumnModel().getColumn(0).setResizable(false);
						table_guia.getColumnModel().getColumn(0).setPreferredWidth(10);;
						table_guia.getColumnModel().getColumn(1).setResizable(false);
						table_guia.getColumnModel().getColumn(2).setResizable(false);
						table_guia.getColumnModel().getColumn(3).setResizable(false);
						table_guia.getColumnModel().getColumn(4).setResizable(false);
						table_guia.getColumnModel().getColumn(5).setResizable(false);
						table_guia.getColumnModel().getColumn(6).setResizable(false);
						table_guia.getColumnModel().getColumn(7).setResizable(false);
						table_guia.getColumnModel().getColumn(8).setResizable(false);
						table_guia.getColumnModel().getColumn(9).setResizable(false);
						table_guia.getColumnModel().getColumn(10).setResizable(false);
						table_guia.getColumnModel().getColumn(11).setResizable(false);
						table_guia.getColumnModel().getColumn(11).setPreferredWidth(36);
						table_guia.setRowHeight(51);

						scPnlGuia.setViewportView(table_guia);
						cargarTablaGuia();
					}
				}
				{
					pnlInfoGuia = new JPanel();
					GridBagConstraints gbc_pnlInfoGuia = new GridBagConstraints();
					gbc_pnlInfoGuia.gridheight = 2;
					gbc_pnlInfoGuia.gridwidth = 3;
					gbc_pnlInfoGuia.insets = new Insets(0, 0, 0, 5);
					gbc_pnlInfoGuia.fill = GridBagConstraints.BOTH;
					gbc_pnlInfoGuia.gridx = 0;
					gbc_pnlInfoGuia.gridy = 3;
					pnlGuias.add(pnlInfoGuia, gbc_pnlInfoGuia);
					pnlInfoGuia.setLayout(new BorderLayout(0, 0));
					{
						taInfoGuia = new JTextArea();
						pnlInfoGuia.add(taInfoGuia, BorderLayout.CENTER);
					}
				}
			}
			{
				btnInsertarGuia = new JButton("Insertar Guia");
				btnInsertarGuia.setToolTipText("Agrega un nuevo guia");
				btnInsertarGuia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Nuevo_guia frame = new Nuevo_guia(h);
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}

						});

					}
				});
				GridBagConstraints gbc_btnInsertarGuia = new GridBagConstraints();
				gbc_btnInsertarGuia.insets = new Insets(0, 0, 5, 5);
				gbc_btnInsertarGuia.gridx = 3;
				gbc_btnInsertarGuia.gridy = 3;
				pnlGuias.add(btnInsertarGuia, gbc_btnInsertarGuia);
			}
			{
				btnModificarGuia = new JButton("Modificar Guia");
				btnModificarGuia.setToolTipText("Modifica un guia existente");
				GridBagConstraints gbc_btnModificarGuia = new GridBagConstraints();
				gbc_btnModificarGuia.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificarGuia.gridx = 4;
				gbc_btnModificarGuia.gridy = 3;
				pnlGuias.add(btnModificarGuia, gbc_btnModificarGuia);
			}
			{
				btnEliminarGuia = new JButton("Eliminar Guia");
				btnEliminarGuia.setToolTipText("Elimina un guia existente");
				GridBagConstraints gbc_btnEliminarGuia = new GridBagConstraints();
				gbc_btnEliminarGuia.insets = new Insets(0, 0, 5, 5);
				gbc_btnEliminarGuia.gridx = 5;
				gbc_btnEliminarGuia.gridy = 3;
				pnlGuias.add(btnEliminarGuia, gbc_btnEliminarGuia);
			}
			{
				btnRefrescarTabla = new JButton("Refrescar Tabla");
				btnRefrescarTabla.addActionListener(new BtnRefrescarTablaActionListener());
				GridBagConstraints gbc_btnRefrescarTabla = new GridBagConstraints();
				gbc_btnRefrescarTabla.insets = new Insets(0, 0, 0, 5);
				gbc_btnRefrescarTabla.gridx = 4;
				gbc_btnRefrescarTabla.gridy = 4;
				pnlGuias.add(btnRefrescarTabla, gbc_btnRefrescarTabla);
			}
		}
		pnlRutas = new JPanel();
		pnlRutas.setToolTipText("Gestor de rutas");
		tbpVistaUsuario.addTab("Rutas Turisticas", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/cargarMapa.png")), pnlRutas, null);
		GridBagLayout gbl_pnlRutas = new GridBagLayout();
		gbl_pnlRutas.columnWidths = new int[]{0, 0, 0, 0, 0, 25, 27, 0, 0, 0};
		gbl_pnlRutas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlRutas.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlRutas.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlRutas.setLayout(gbl_pnlRutas);

		{
			{
				scPnlRutas = new JScrollPane();
				scPnlRutas.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nuestras Rutas Establecidas", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
				GridBagConstraints gbc_scPnlRutas = new GridBagConstraints();
				gbc_scPnlRutas.gridheight = 3;
				gbc_scPnlRutas.gridwidth = 7;
				gbc_scPnlRutas.insets = new Insets(0, 0, 5, 5);
				gbc_scPnlRutas.fill = GridBagConstraints.BOTH;
				gbc_scPnlRutas.gridx = 1;
				gbc_scPnlRutas.gridy = 0;
				pnlRutas.add(scPnlRutas, gbc_scPnlRutas);
				{
					table_Rutas = new JTable();
					table_Rutas.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null},
							},
							new String[] {
									"ID", "Localidad/es", "Monumento/s", "Restaurante/s", "Tienda/s"
							}
							) {
						Class[] columnTypes = new Class[] {
								Integer.class, String.class, String.class, String.class, String.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						boolean[] columnEditables = new boolean[] {
								false, false, false, false, false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
					table_Rutas.getColumnModel().getColumn(0).setResizable(false);
					table_Rutas.getColumnModel().getColumn(0).setPreferredWidth(10);
					table_Rutas.getColumnModel().getColumn(1).setResizable(false);
					table_Rutas.getColumnModel().getColumn(2).setResizable(false);
					table_Rutas.getColumnModel().getColumn(3).setResizable(false);
					table_Rutas.getColumnModel().getColumn(4).setResizable(false);
					table_Rutas.getColumnModel().getColumn(4).setPreferredWidth(36);
					table_Rutas.setRowHeight(50);

					scPnlRutas.setViewportView(table_Rutas);
					cargarTablaRutas();
				}
			}
		}
		{
			pnlInfoRutas = new JPanel();
			GridBagConstraints gbc_pnlInfoRutas = new GridBagConstraints();
			gbc_pnlInfoRutas.gridheight = 2;
			gbc_pnlInfoRutas.gridwidth = 3;
			gbc_pnlInfoRutas.insets = new Insets(0, 0, 5, 5);
			gbc_pnlInfoRutas.fill = GridBagConstraints.BOTH;
			gbc_pnlInfoRutas.gridx = 1;
			gbc_pnlInfoRutas.gridy = 3;
			pnlRutas.add(pnlInfoRutas, gbc_pnlInfoRutas);
			pnlInfoRutas.setLayout(new BorderLayout(0, 0));
			{
				taInfoRutas = new JTextArea();
				pnlInfoRutas.add(taInfoRutas);
			}
		}
		btnInsertarRuta = new JButton("Insertar Ruta");
		btnInsertarRuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Nuevo_Circuito frame = new Nuevo_Circuito();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnInsertarRuta.setToolTipText("Agrega una ruta nueva");

		GridBagConstraints gbc_btnInsertarRuta = new GridBagConstraints();
		gbc_btnInsertarRuta.insets = new Insets(0, 0, 5, 5);
		gbc_btnInsertarRuta.gridx = 5;
		gbc_btnInsertarRuta.gridy = 4;
		pnlRutas.add(btnInsertarRuta, gbc_btnInsertarRuta);
		{
			btnModificarRuta = new JButton("Modificar Ruta");
			btnModificarRuta.setToolTipText("Modifica una ruta existente");
			GridBagConstraints gbc_btnModificarRuta = new GridBagConstraints();
			gbc_btnModificarRuta.insets = new Insets(0, 0, 5, 5);
			gbc_btnModificarRuta.gridx = 6;
			gbc_btnModificarRuta.gridy = 4;
			pnlRutas.add(btnModificarRuta, gbc_btnModificarRuta);
		}
		{
			btnEliminarRuta = new JButton("Eliminar Ruta");
			btnEliminarRuta.setToolTipText("Elimina una ruta existente");
			GridBagConstraints gbc_btnEliminarRuta = new GridBagConstraints();
			gbc_btnEliminarRuta.insets = new Insets(0, 0, 5, 5);
			gbc_btnEliminarRuta.gridx = 7;
			gbc_btnEliminarRuta.gridy = 4;
			pnlRutas.add(btnEliminarRuta, gbc_btnEliminarRuta);
		}
		{
			pnlPromociones = new JPanel();
			pnlPromociones.setToolTipText("Gestor de promociones");
			tbpVistaUsuario.addTab("Promociones", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/dinero.png")), pnlPromociones, null);
			GridBagLayout gbl_pnlPromociones = new GridBagLayout();
			gbl_pnlPromociones.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlPromociones.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_pnlPromociones.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_pnlPromociones.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			pnlPromociones.setLayout(gbl_pnlPromociones);
			{
				scPnlPromocion = new JScrollPane();
				scPnlPromocion.setBorder(new TitledBorder(null, "Nuestras Promociones", TitledBorder.CENTER, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_scPnlPromocion = new GridBagConstraints();
				gbc_scPnlPromocion.gridheight = 4;
				gbc_scPnlPromocion.gridwidth = 7;
				gbc_scPnlPromocion.insets = new Insets(0, 0, 5, 5);
				gbc_scPnlPromocion.fill = GridBagConstraints.BOTH;
				gbc_scPnlPromocion.gridx = 0;
				gbc_scPnlPromocion.gridy = 0;
				pnlPromociones.add(scPnlPromocion, gbc_scPnlPromocion);
				{
					table_promocion = new JTable();
					table_promocion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table_promocion.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null},
							},
							new String[] {
									"ID", "Descuento", "Ruta/s", "Descripcion", "Duracion Promo."
							}
							) {
						Class[] columnTypes = new Class[] {
								Integer.class, String.class, String.class, String.class, String.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						boolean[] columnEditables = new boolean[] {
								false, true, false, false, false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
					table_promocion.getColumnModel().getColumn(0).setResizable(false);
					table_promocion.getColumnModel().getColumn(0).setPreferredWidth(10);
					table_promocion.getColumnModel().getColumn(1).setResizable(false);
					table_promocion.getColumnModel().getColumn(2).setResizable(false);
					table_promocion.getColumnModel().getColumn(3).setResizable(false);
					table_promocion.getColumnModel().getColumn(4).setResizable(false);
					table_promocion.getColumnModel().getColumn(4).setPreferredWidth(36);
					table_promocion.setRowHeight(50);

					table_promocion.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					scPnlPromocion.setViewportView(table_promocion);
					cargarTablaPromo();
					{
						btnInsertarPromo = new JButton("Insertar Promo");
						btnInsertarPromo.addActionListener(new BtnInsertarPromoActionListener());

						btnInsertarPromo.setToolTipText("Agrega promocion nueva");
						GridBagConstraints gbc_btnInsertarPromo = new GridBagConstraints();
						gbc_btnInsertarPromo.insets = new Insets(0, 0, 5, 5);
						gbc_btnInsertarPromo.gridx = 5;
						gbc_btnInsertarPromo.gridy = 4;
						pnlPromociones.add(btnInsertarPromo, gbc_btnInsertarPromo);
					}
					{
						btnModificarPromo = new JButton("Modificar Promo");
						btnModificarPromo.setToolTipText("Modifica promocion existente");
						GridBagConstraints gbc_btnModificarPromo = new GridBagConstraints();
						gbc_btnModificarPromo.insets = new Insets(0, 0, 5, 5);
						gbc_btnModificarPromo.gridx = 6;
						gbc_btnModificarPromo.gridy = 4;
						pnlPromociones.add(btnModificarPromo, gbc_btnModificarPromo);
					}
					{
						btnEliminarPromo = new JButton("Eliminar Promo");
						btnEliminarPromo.setToolTipText("Elimina promocion existente");
						GridBagConstraints gbc_btnEliminarPromo = new GridBagConstraints();
						gbc_btnEliminarPromo.insets = new Insets(0, 0, 5, 5);
						gbc_btnEliminarPromo.gridx = 7;
						gbc_btnEliminarPromo.gridy = 4;
						pnlPromociones.add(btnEliminarPromo, gbc_btnEliminarPromo);
					}
				}
			}
			{
				btnRefrescarPromociones = new JButton("Refrescar Promociones");
				btnRefrescarPromociones.addActionListener(new BtnRefrescarPromocionesActionListener());
				GridBagConstraints gbc_btnRefrescarPromociones = new GridBagConstraints();
				gbc_btnRefrescarPromociones.insets = new Insets(0, 0, 0, 5);
				gbc_btnRefrescarPromociones.gridx = 6;
				gbc_btnRefrescarPromociones.gridy = 5;
				pnlPromociones.add(btnRefrescarPromociones, gbc_btnRefrescarPromociones);
			}
		}
		{
			pnlHistorial = new JPanel();
			pnlHistorial.setToolTipText("Panel de incidencias");
			tbpVistaUsuario.addTab("Historial", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/libro.png")), pnlHistorial, null);
			GridBagLayout gbl_pnlHistorial = new GridBagLayout();
			gbl_pnlHistorial.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlHistorial.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_pnlHistorial.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_pnlHistorial.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			pnlHistorial.setLayout(gbl_pnlHistorial);
			{
				scPnlHistorial = new JScrollPane();
				scPnlHistorial.setBorder(new TitledBorder(null, "Historial de nuestras ultimas Rutas", TitledBorder.CENTER, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_scPnlHistorial = new GridBagConstraints();
				gbc_scPnlHistorial.gridheight = 4;
				gbc_scPnlHistorial.gridwidth = 9;
				gbc_scPnlHistorial.insets = new Insets(0, 0, 5, 0);
				gbc_scPnlHistorial.fill = GridBagConstraints.BOTH;
				gbc_scPnlHistorial.gridx = 0;
				gbc_scPnlHistorial.gridy = 0;
				pnlHistorial.add(scPnlHistorial, gbc_scPnlHistorial);
				{
					table_historial = new JTable();
					table_historial.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table_historial.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null},
							},
							new String[] {
									"ID", "Rutas", "Num. Personas", "Coste", "Incidencias", "Opiniones", "Sugerencias"
							}
							) {
						Class[] columnTypes = new Class[] {
								Integer.class, String.class, Integer.class, Double.class, String.class, String.class, String.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
					});
					table_historial.getColumnModel().getColumn(0).setResizable(false);
					table_historial.getColumnModel().getColumn(1).setResizable(false);
					table_historial.getColumnModel().getColumn(2).setResizable(false);
					table_historial.getColumnModel().getColumn(3).setResizable(false);
					table_historial.getColumnModel().getColumn(4).setResizable(false);
					table_historial.getColumnModel().getColumn(5).setResizable(false);
					table_historial.getColumnModel().getColumn(1).setPreferredWidth(10);
					table_historial.setRowHeight(50);

					scPnlHistorial.setViewportView(table_historial);
					{
						btnHistorialesPendientes = new JButton("Historiales Pendientes");
						btnHistorialesPendientes.addActionListener(new BtnHistorialesPendientesActionListener());
						{
							btnHistorialFinalizados = new JButton("Historial Finalizados");
							btnHistorialFinalizados.addActionListener(new BtnHistorialFinalizadosActionListener());
							GridBagConstraints gbc_btnHistorialFinalizados = new GridBagConstraints();
							gbc_btnHistorialFinalizados.insets = new Insets(0, 0, 5, 5);
							gbc_btnHistorialFinalizados.gridx = 6;
							gbc_btnHistorialFinalizados.gridy = 4;
							pnlHistorial.add(btnHistorialFinalizados, gbc_btnHistorialFinalizados);
						}
						GridBagConstraints gbc_btnHistorialesPendientes = new GridBagConstraints();
						gbc_btnHistorialesPendientes.insets = new Insets(0, 0, 5, 5);
						gbc_btnHistorialesPendientes.gridx = 7;
						gbc_btnHistorialesPendientes.gridy = 4;
						pnlHistorial.add(btnHistorialesPendientes, gbc_btnHistorialesPendientes);
					}
					cargarTablaHistorial();
				}
			}
		}

		JPanel pnlTuristas = new JPanel();
		pnlTuristas.setToolTipText("Panel de turistas");
		tbpVistaUsuario.addTab("Turistas", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/usuario.png")), pnlTuristas, null);
		GridBagLayout gbl_pnlTuristas = new GridBagLayout();
		gbl_pnlTuristas.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlTuristas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlTuristas.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlTuristas.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlTuristas.setLayout(gbl_pnlTuristas);
		{
			scPnlTurista = new JScrollPane();
			scPnlTurista.setBorder(new TitledBorder(null, "Nuestros Turistas", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_scPnlTurista = new GridBagConstraints();
			gbc_scPnlTurista.gridheight = 4;
			gbc_scPnlTurista.gridwidth = 6;
			gbc_scPnlTurista.insets = new Insets(0, 0, 5, 5);
			gbc_scPnlTurista.fill = GridBagConstraints.BOTH;
			gbc_scPnlTurista.gridx = 0;
			gbc_scPnlTurista.gridy = 0;
			pnlTuristas.add(scPnlTurista, gbc_scPnlTurista);
			{
				table_turista = new JTable();
				table_turista.addMouseListener(new Table_turistaMouseListener());
				table_turista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table_turista.setModel(new DefaultTableModel(
						new Object[][] {
							{null, null, null, null, null, null, null},
						},
						new String[] {
								"ID", "DNI", "Nombre", "Apellidos", "Telefono", "email", "Foto"
						}
						) {
					Class[] columnTypes = new Class[] {
							Integer.class, String.class, String.class, String.class, String.class, String.class, ImageIcon.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
					boolean[] columnEditables = new boolean[] {
							false, false, false, false, false, false, false
					};
					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
				table_turista.getColumnModel().getColumn(0).setResizable(false);
				table_turista.getColumnModel().getColumn(0).setPreferredWidth(10);
				table_turista.getColumnModel().getColumn(1).setResizable(false);
				table_turista.getColumnModel().getColumn(2).setResizable(false);
				table_turista.getColumnModel().getColumn(3).setResizable(false);
				table_turista.getColumnModel().getColumn(4).setResizable(false);
				table_turista.getColumnModel().getColumn(5).setResizable(false);
				table_turista.getColumnModel().getColumn(6).setResizable(false);
				table_turista.getColumnModel().getColumn(4).setPreferredWidth(36);
				table_turista.setRowHeight(50);

				scPnlTurista.setViewportView(table_turista);
				{
					{
						scPaneGrupos = new JScrollPane();
						scPaneGrupos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion de Grupo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
						GridBagConstraints gbc_scPaneGrupos = new GridBagConstraints();
						gbc_scPaneGrupos.gridheight = 5;
						gbc_scPaneGrupos.gridwidth = 5;
						gbc_scPaneGrupos.insets = new Insets(0, 0, 5, 0);
						gbc_scPaneGrupos.fill = GridBagConstraints.BOTH;
						gbc_scPaneGrupos.gridx = 6;
						gbc_scPaneGrupos.gridy = 0;
						pnlTuristas.add(scPaneGrupos, gbc_scPaneGrupos);
						{
							pnlInfoGrupo = new JPanel();
							scPaneGrupos.setViewportView(pnlInfoGrupo);
							pnlInfoGrupo.setLayout(null);
							{
								lblNmeroDeTuristas = new JLabel("Número de Turistas:");
								lblNmeroDeTuristas.setBounds(10, 11, 104, 14);
								pnlInfoGrupo.add(lblNmeroDeTuristas);
							}
							{
								txtNumTuristas = new JTextField();
								txtNumTuristas.setEditable(false);
								txtNumTuristas.setBounds(126, 8, 37, 20);
								pnlInfoGrupo.add(txtNumTuristas);
								txtNumTuristas.setColumns(10);
							}
							{
								lblDescripcin = new JLabel("Descripción:");
								lblDescripcin.setBounds(10, 36, 77, 14);
								pnlInfoGrupo.add(lblDescripcin);
							}
							{
								tpDescripcion = new JTextPane();
								tpDescripcion.setEditable(false);
								tpDescripcion.setBounds(10, 53, 153, 46);
								pnlInfoGrupo.add(tpDescripcion);
							}
							{
								lblTipo = new JLabel("Tipo: ");
								lblTipo.setBounds(10, 106, 46, 14);
								pnlInfoGrupo.add(lblTipo);
							}
							{
								lblIntereses = new JLabel("Intereses:");
								lblIntereses.setBounds(10, 128, 62, 14);
								pnlInfoGrupo.add(lblIntereses);
							}
							{
								txtTipo = new JTextField();
								txtTipo.setEditable(false);
								txtTipo.setBounds(47, 103, 116, 20);
								pnlInfoGrupo.add(txtTipo);
								txtTipo.setColumns(10);
							}
							{
								tpIntereses = new JTextPane();
								tpIntereses.setEditable(false);
								tpIntereses.setBounds(10, 153, 153, 49);
								pnlInfoGrupo.add(tpIntereses);
							}
						}
					}
				}
				btnAgregarTurista = new JButton("Agregar Turista");
				btnAgregarTurista.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Nuevo_Cliente frame = new Nuevo_Cliente(h);
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
				});

				btnAgregarTurista.setToolTipText("A\u00F1ade un turista nuevo");
				GridBagConstraints gbc_btnAgregarTurista = new GridBagConstraints();
				gbc_btnAgregarTurista.insets = new Insets(0, 0, 5, 5);
				gbc_btnAgregarTurista.gridx = 3;
				gbc_btnAgregarTurista.gridy = 4;
				pnlTuristas.add(btnAgregarTurista, gbc_btnAgregarTurista);
				{
					btnModificarTurista = new JButton("Modificar Turista");
					btnModificarTurista.setToolTipText("Modifica un turista existente");
					GridBagConstraints gbc_btnModificarTurista = new GridBagConstraints();
					gbc_btnModificarTurista.insets = new Insets(0, 0, 5, 5);
					gbc_btnModificarTurista.gridx = 4;
					gbc_btnModificarTurista.gridy = 4;
					pnlTuristas.add(btnModificarTurista, gbc_btnModificarTurista);
				}
				{
					btnEliminarTurista = new JButton("Eliminar Turista");
					btnEliminarTurista.setToolTipText("Elimina un turista existente");
					GridBagConstraints gbc_btnEliminarTurista = new GridBagConstraints();
					gbc_btnEliminarTurista.insets = new Insets(0, 0, 5, 5);
					gbc_btnEliminarTurista.gridx = 5;
					gbc_btnEliminarTurista.gridy = 4;
					pnlTuristas.add(btnEliminarTurista, gbc_btnEliminarTurista);
				}
				cargarTablaTurista();
			}
		}

	}	

	/*Metodo para rellenar la tabla automaticamente con el ArrayList correspondiente*/
	private void cargarTablaHistorial() {

		ArrayList<Historial_circuitos> historial = new ArrayList<Historial_circuitos>();

		historial = h.getHistorial();
		Object[][] datos = new Object[historial.size()][7];

		for (int i = 0; i < historial.size(); i++) {
			datos[i][0] = i + 1;
			datos[i][1] = String.valueOf(historial.get(i).getRutas());
			datos[i][2] = historial.get(i).getNum_personas();
			datos[i][3] = historial.get(i).getCoste();
			datos[i][4] = String.valueOf(historial.get(i).getIncidencias());
			datos[i][5] = String.valueOf(historial.get(i).getOpiniones());
			datos[i][6] = String.valueOf(historial.get(i).getSugerencias());
		}
		table_historial.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"ID", "Rutas", "Num. Personas", "Coste", "Incidencias", "Opiniones", "Sugerencias"
				}
				) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, Integer.class, Double.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
	}

	private void cargarHistorialPendiente() {

		ArrayList<Historial_circuitos> historial = new ArrayList<Historial_circuitos>();
		int pendientes = 0;
		int pos = 0;
		historial = h.getHistorial();
		for (int i = 0; i < historial.size(); i++) {
			if(historial.get(i).isPendiente()) {
				pendientes++;
			}
		}

		Object[][] datos = new Object[pendientes][7];
		for (int i = 0; i < historial.size(); i++) {
			if(historial.get(i).isPendiente()) {
				datos[pos][0] = i + 1;
				datos[pos][1] = String.valueOf(historial.get(i).getRutas());
				datos[pos][2] = historial.get(i).getNum_personas();
				datos[pos][3] = historial.get(i).getCoste();
				datos[pos][4] = String.valueOf(historial.get(i).getIncidencias());
				datos[pos][5] = String.valueOf(historial.get(i).getOpiniones());
				datos[pos][6] = String.valueOf(historial.get(i).getSugerencias());
				pos++;
			}
		}
		table_historial.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"ID", "Rutas", "Num. Personas", "Coste", "Incidencias", "Opiniones", "Sugerencias"
				}
				) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, Integer.class, Double.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
	}

	/*Metodo para rellenar la tabla automaticamente con el ArrayList correspondiente*/
	private void cargarTablaTurista() {

		ArrayList<Turista> turista = new ArrayList<Turista>();

		turista = h.getTuristas();
		Object[][] datos = new Object[turista.size()][7];

		for (int i = 0; i < turista.size(); i++) {
			datos[i][0] = turista.get(i).getId_grupo();
			datos[i][1] = String.valueOf(turista.get(i).getDni());
			datos[i][2] = String.valueOf(turista.get(i).getNombre());
			datos[i][3] = String.valueOf(turista.get(i).getApellido());
			datos[i][4] = String.valueOf(turista.get(i).getTelefono());
			datos[i][5] = String.valueOf(turista.get(i).getEmail());
			datos[i][6] = String.valueOf(turista.get(i).getFoto());
		}
		table_turista.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"ID", "DNI", "Nombre", "Apellidos", "Telefono", "email", "Foto"
				}
				) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, String.class, String.class, String.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

	}

	/*Metodo para rellenar la tabla automaticamente con el ArrayList correspondiente*/
	private void cargarTablaPromo() {

		ArrayList<Promocion> promocion = new ArrayList<Promocion>();

		promocion = h.getPromocion();
		Object[][] datos = new Object[promocion.size()][5];

		for(int i = 0;i<promocion.size();i++) {
			datos[i][0] = i + 1;
			datos[i][1] = String.valueOf(promocion.get(i).getDto());
			datos[i][2] = String.valueOf(promocion.get(i).getRuta());
			datos[i][3] = String.valueOf(promocion.get(i).getDescripcion());
			datos[i][4] = String.valueOf(promocion.get(i).getDuracion());
		}
		table_promocion.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"ID", "Descuento", "Ruta/s", "Descripcion", "Duracion Promo."
				}
				) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
	}

	/*Metodo para rellenar la tabla automaticamente con el ArrayList correspondiente*/
	private void cargarTablaRutas() {
		ArrayList<Rutas_turisticas> rutasTuristicas = new ArrayList<Rutas_turisticas>();

		rutasTuristicas = h.getRuta();
		Object [][] datos = new Object[rutasTuristicas.size()][5];

		for (int i = 0; i < rutasTuristicas.size(); i++) {
			datos[i][0] = i + 1;
			datos[i][1] = String.valueOf(rutasTuristicas.get(i).getLocalidad());
			datos[i][2] = String.valueOf(rutasTuristicas.get(i).getMonumentos());
			datos[i][3] = String.valueOf(rutasTuristicas.get(i).getRestaurantes());
			datos[i][4] = String.valueOf(rutasTuristicas.get(i).getTiendas());
		}
		table_Rutas.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"ID", "Localidad/es", "Monumento/s", "Restaurante/s", "Tienda/s"
				}
				) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
	}

	/*Metodo para rellenar la tabla automaticamente con el ArrayList correspondiente*/
	private void cargarTablaGuia() {
		ArrayList<Guia_turistico> guiaTuristico = new ArrayList<Guia_turistico>();

		guiaTuristico = h.getGuia();
		Object [][] datos = new Object[guiaTuristico.size()][12];

		for (int i = 0; i < guiaTuristico.size(); i++) {
			datos[i][0] = i + 1;
			datos[i][1] = String.valueOf(guiaTuristico.get(i).getNombre());
			datos[i][2] = String.valueOf(guiaTuristico.get(i).getApellidos());
			datos[i][3] = String.valueOf(guiaTuristico.get(i).getNif());
			datos[i][4] = String.valueOf(guiaTuristico.get(i).getEmail());
			datos[i][5] = String.valueOf(guiaTuristico.get(i).getTelf());
			datos[i][6] = String.valueOf(guiaTuristico.get(i).getIdiomas());
			datos[i][7] = guiaTuristico.get(i).getDisponibilidad();
			datos[i][8] = String.valueOf(guiaTuristico.get(i).getHistorial_rutas());
			datos[i][9] = guiaTuristico.get(i).getPrecio();
			datos[i][10] = guiaTuristico.get(i).getPuntuacion();
			datos[i][11] = new ImageIcon(Vista_Usuario.class.getClassLoader().getResource(guiaTuristico.get(i).getFoto()));
		}

		table_guia.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"ID", "Nombre", "Apellidos", "NIF", "e-mail", "Telefono", "Idiomas", "Disponibilidad", "Rutas", "Precio", "Puntuacion", "Foto"
				}
				) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, Double.class, Double.class, ImageIcon.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					true, true, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
	}

	/*Metodo para centrar la aplicacion en cualquier pantalla que se ejecute*/
	private void centrarPantalla() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();

		Dimension sizePantalla = pantalla.getScreenSize();

		int alturaPantalla = sizePantalla.height;
		int anchoPantalla = sizePantalla.width;

		setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
	}

	/*private class BtnDisearRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Ruta_Grafica ruta = new Ruta_Grafica();
				ruta.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}*/

	/*	private class BtnDisearRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Ruta_Grafica ruta = new Ruta_Grafica();
			ruta.setVisible(true);
		}
	}*/
	private class BtnHistorialesPendientesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			cargarHistorialPendiente();
		}
	}
	private class BtnHistorialFinalizadosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cargarTablaHistorial();
		}
	}
	private class BtnRefrescarTablaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cargarTablaGuia();
		}
	}
	private class Table_turistaMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {
			int selected = table_turista.getSelectedRow();
			Grupo_turistas g = h.getGrupoTuristas().get(selected);
			txtNumTuristas.setText(g.getNum());
			tpDescripcion.setText(g.getDescripcion());
			tpIntereses.setText(g.getIntereses());
			txtTipo.setText(g.getTipo());
		}
	}
	private class BtnInsertarPromoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Nueva_Promocion promo = new Nueva_Promocion(h);
						promo.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
	private class BtnRefrescarPromocionesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cargarTablaPromo();
		}
	}
}



