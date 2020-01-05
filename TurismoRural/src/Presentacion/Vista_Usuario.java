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
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.JTextField;



public class Vista_Usuario extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tbpVistaUsuario;
	private JPanel pnlGuias;
	private JPanel pnlRutas;
	private JPanel pnlPromociones;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String dniUsuario;
	private JButton btnInsertarGuia;
	private JButton btnModificarGuia;
	private JButton btnEliminarGuia;
	private JButton btnInsertarRuta;
	private JButton btnModificarRuta;
	private JButton btnEliminarRuta;
	private JTable table_promociones;
	private JPanel pnlHistorial;
	private JPanel pnlUsuario;
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblUltimoAcceso;
	private JLabel lblIdentificador;
	private JButton btnAyuda;
	private JScrollPane sPRutas;
	private JTable table_Rutas;
	private JPanel pnlInfo;
	private JTextArea taInfo;
	private JPopupMenu popMenu;
	private JScrollPane scrollPane;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfIdentificador;
	private JTextField tfAcceso;
	private JTable table_rutas;


	public Vista_Usuario(String nombre, String apellido, String dni) {
		setFont(new Font("Dialog", Font.BOLD, 12));
		this.nombreUsuario = nombre;
		this.apellidoUsuario = apellido;
		this.dniUsuario = dni;
		setTitle("USUARIO");
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
				lblFoto.setIcon(new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/grupo_usuarios.png")));
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
				btnAyuda.setMargin(new Insets(2, 2, 2, 2));
				btnAyuda.setIcon(new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/help.png")));
				GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
				gbc_btnAyuda.insets = new Insets(0, 0, 0, 5);
				gbc_btnAyuda.gridx = 0;
				gbc_btnAyuda.gridy = 6;
				pnlUsuario.add(btnAyuda, gbc_btnAyuda);
			}
		}
		{
			pnlGuias = new JPanel();
			tbpVistaUsuario.addTab("Guias Turisticos", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/networking.png")), pnlGuias, null);
			GridBagLayout gbl_pnlGuias = new GridBagLayout();
			gbl_pnlGuias.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlGuias.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_pnlGuias.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlGuias.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnlGuias.setLayout(gbl_pnlGuias);
			{
				btnInsertarGuia = new JButton("Insertar Guia");
				btnInsertarGuia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Nuevo_Guia frame = new Nuevo_Guia();
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
				});
				{
					scrollPane = new JScrollPane();
					GridBagConstraints gbc_scrollPane = new GridBagConstraints();
					gbc_scrollPane.gridwidth = 7;
					gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
					gbc_scrollPane.fill = GridBagConstraints.BOTH;
					gbc_scrollPane.gridx = 0;
					gbc_scrollPane.gridy = 1;
					pnlGuias.add(scrollPane, gbc_scrollPane);
					{
						table_rutas = new JTable();
						table_rutas.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null, null, null, null, null, null},
							},
							new String[] {
								"ID", "Nombre", "Apellidos", "NIF", "e-mail", "Telefono", "Idiomas", "Disponibilidad", "Rutas", "Precio", "Puntuacion", "Foto"
							}
						) {
							Class[] columnTypes = new Class[] {
								Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, Double.class, Double.class, String.class
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
						table_rutas.getColumnModel().getColumn(0).setResizable(false);
						table_rutas.getColumnModel().getColumn(1).setResizable(false);
						table_rutas.getColumnModel().getColumn(2).setResizable(false);
						table_rutas.getColumnModel().getColumn(3).setResizable(false);
						table_rutas.getColumnModel().getColumn(4).setResizable(false);
						table_rutas.getColumnModel().getColumn(5).setResizable(false);
						table_rutas.getColumnModel().getColumn(6).setResizable(false);
						table_rutas.getColumnModel().getColumn(7).setResizable(false);
						table_rutas.getColumnModel().getColumn(8).setResizable(false);
						table_rutas.getColumnModel().getColumn(9).setResizable(false);
						table_rutas.getColumnModel().getColumn(10).setResizable(false);
						table_rutas.getColumnModel().getColumn(11).setResizable(false);
						scrollPane.setViewportView(table_rutas);
					}
				}
				GridBagConstraints gbc_btnInsertarGuia = new GridBagConstraints();
				gbc_btnInsertarGuia.insets = new Insets(0, 0, 5, 5);
				gbc_btnInsertarGuia.gridx = 3;
				gbc_btnInsertarGuia.gridy = 3;
				pnlGuias.add(btnInsertarGuia, gbc_btnInsertarGuia);
			}
			{
				btnModificarGuia = new JButton("Modificar Guia");
				GridBagConstraints gbc_btnModificarGuia = new GridBagConstraints();
				gbc_btnModificarGuia.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificarGuia.gridx = 4;
				gbc_btnModificarGuia.gridy = 3;
				pnlGuias.add(btnModificarGuia, gbc_btnModificarGuia);
			}
			{
				btnEliminarGuia = new JButton("Dar de Baja");
				GridBagConstraints gbc_btnEliminarGuia = new GridBagConstraints();
				gbc_btnEliminarGuia.insets = new Insets(0, 0, 5, 5);
				gbc_btnEliminarGuia.gridx = 5;
				gbc_btnEliminarGuia.gridy = 3;
				pnlGuias.add(btnEliminarGuia, gbc_btnEliminarGuia);
			}
		}
		pnlRutas = new JPanel();
		tbpVistaUsuario.addTab("Rutas Turisticas", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/cargarMapa.png")), pnlRutas, null);
		GridBagLayout gbl_pnlRutas = new GridBagLayout();
		gbl_pnlRutas.columnWidths = new int[]{0, 0, 0, 0, 0, 25, 27, 0, 0, 0};
		gbl_pnlRutas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlRutas.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlRutas.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlRutas.setLayout(gbl_pnlRutas);
		
		{
			{
				sPRutas = new JScrollPane();
				GridBagConstraints gbc_sPRutas = new GridBagConstraints();
				gbc_sPRutas.gridheight = 2;
				gbc_sPRutas.gridwidth = 7;
				gbc_sPRutas.insets = new Insets(0, 0, 5, 5);
				gbc_sPRutas.fill = GridBagConstraints.BOTH;
				gbc_sPRutas.gridx = 1;
				gbc_sPRutas.gridy = 1;
				pnlRutas.add(sPRutas, gbc_sPRutas);
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
					table_Rutas.getColumnModel().getColumn(1).setResizable(false);
					table_Rutas.getColumnModel().getColumn(2).setResizable(false);
					table_Rutas.getColumnModel().getColumn(3).setResizable(false);
					table_Rutas.getColumnModel().getColumn(4).setResizable(false);
					sPRutas.setViewportView(table_Rutas);
					cargarTablaRutas();
				}
			}
		}
		{
			pnlInfo = new JPanel();
			GridBagConstraints gbc_pnlInfo = new GridBagConstraints();
			gbc_pnlInfo.gridheight = 2;
			gbc_pnlInfo.gridwidth = 3;
			gbc_pnlInfo.insets = new Insets(0, 0, 5, 5);
			gbc_pnlInfo.fill = GridBagConstraints.BOTH;
			gbc_pnlInfo.gridx = 1;
			gbc_pnlInfo.gridy = 3;
			pnlRutas.add(pnlInfo, gbc_pnlInfo);
			pnlInfo.setLayout(new BorderLayout(0, 0));
			{
				taInfo = new JTextArea();
				pnlInfo.add(taInfo);
			}
		}
		btnInsertarRuta = new JButton("Dar de alta");
		
			GridBagConstraints gbc_btnInsertarRuta = new GridBagConstraints();
			gbc_btnInsertarRuta.insets = new Insets(0, 0, 5, 5);
			gbc_btnInsertarRuta.gridx = 5;
			gbc_btnInsertarRuta.gridy = 4;
			pnlRutas.add(btnInsertarRuta, gbc_btnInsertarRuta);
		{
			btnModificarRuta = new JButton("Modificar Ruta");
			GridBagConstraints gbc_btnModificarRuta = new GridBagConstraints();
			gbc_btnModificarRuta.insets = new Insets(0, 0, 5, 5);
			gbc_btnModificarRuta.gridx = 6;
			gbc_btnModificarRuta.gridy = 4;
			pnlRutas.add(btnModificarRuta, gbc_btnModificarRuta);
		}
		{
			btnEliminarRuta = new JButton("Dar de baja");
			GridBagConstraints gbc_btnEliminarRuta = new GridBagConstraints();
			gbc_btnEliminarRuta.insets = new Insets(0, 0, 5, 5);
			gbc_btnEliminarRuta.gridx = 7;
			gbc_btnEliminarRuta.gridy = 4;
			pnlRutas.add(btnEliminarRuta, gbc_btnEliminarRuta);
		}
		{
			pnlPromociones = new JPanel();
			tbpVistaUsuario.addTab("Promociones", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/dinero.png")), pnlPromociones, null);
			GridBagLayout gbl_pnlPromociones = new GridBagLayout();
			gbl_pnlPromociones.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlPromociones.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_pnlPromociones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlPromociones.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnlPromociones.setLayout(gbl_pnlPromociones);
			{
				table_promociones = new JTable();
				table_promociones.setModel(new DefaultTableModel(

						new Object[][] {
							{"1", "-50%", "Ciudad Real"},
							{"2", "2x1", "Puertollano"},
							{"3", "-20%", "Puertollano"},
						},
						new String[] {
								"ID", "Promocion", "Localidad"
						}
						));

				table_promociones.getColumnModel().getColumn(0).setPreferredWidth(21);
				table_promociones.getColumnModel().getColumn(0).setMinWidth(21);
				table_promociones.getColumnModel().getColumn(1).setPreferredWidth(59);
				table_promociones.getColumnModel().getColumn(1).setMinWidth(59);
				table_promociones.getColumnModel().getColumn(2).setPreferredWidth(66);
				table_promociones.getColumnModel().getColumn(2).setMinWidth(65);
				GridBagConstraints gbc_table_promociones = new GridBagConstraints();
				gbc_table_promociones.gridheight = 3;
				gbc_table_promociones.insets = new Insets(0, 0, 5, 5);
				gbc_table_promociones.fill = GridBagConstraints.BOTH;
				gbc_table_promociones.gridx = 1;
				gbc_table_promociones.gridy = 1;
				pnlPromociones.add(table_promociones, gbc_table_promociones);
			}
		}
		{
			pnlHistorial = new JPanel();
			tbpVistaUsuario.addTab("Historial", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/libro.png")), pnlHistorial, null);
			GridBagLayout gbl_pnlHistorial = new GridBagLayout();
			gbl_pnlHistorial.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlHistorial.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_pnlHistorial.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlHistorial.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnlHistorial.setLayout(gbl_pnlHistorial);
		}

		JPanel pnlTuristas = new JPanel();
		tbpVistaUsuario.addTab("Turistas", new ImageIcon(Vista_Usuario.class.getResource("/Presentacion/usuario.png")), pnlTuristas, null);
		GridBagLayout gbl_pnlTuristas = new GridBagLayout();
		gbl_pnlTuristas.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlTuristas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlTuristas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlTuristas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlTuristas.setLayout(gbl_pnlTuristas);
		
	}	
	private void cargarTablaRutas() {
		Hardcoded rutas = new Hardcoded();
		ArrayList<Rutas_turisticas> rutasTuristicas = new ArrayList<Rutas_turisticas>();
		
		rutasTuristicas = rutas.getRuta();
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

	private void cargarTablaGuia() {
		Hardcoded guia = new Hardcoded();
		ArrayList<Guia_turistico> guiaTuristico = new ArrayList<Guia_turistico>();
		
		guiaTuristico = guia.getGuia();
		Object [][] datos = new Object[guiaTuristico.size()][12];
	}
	
	
	
	
	private void centrarPantalla() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();

		Dimension sizePantalla = pantalla.getScreenSize();

		int alturaPantalla = sizePantalla.height;
		int anchoPantalla = sizePantalla.width;

		setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
	}

}
