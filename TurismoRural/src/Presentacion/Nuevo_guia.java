package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class Nuevo_guia extends JFrame {

	private JPanel contentPane;
	private JLabel lblInfo;
	private JLabel lblNombre;
	private JTextField tfNombre;
	private JLabel lblApellidos;
	private JTextField tfApellidos;
	private JLabel lblNif;
	private JTextField tfNif;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JLabel lblTelefono;
	private JTextField tfTelefono;
	private JLabel lblIdiomas;
	private JPanel pnlDisponibilidad;
	private JLabel lblDisponibilidad;
	private JRadioButton rbSi;
	private JRadioButton rbNo;
	private JPanel pnlBotones;
	private JButton btnAadirGuia;
	private JButton btnLimpiar;


	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private JPanel pnlIdiomas;
	private JCheckBox cbCastellano;
	private JCheckBox cbIngles;
	private JCheckBox cbPortugues;
	private JCheckBox cbFrances;


	/**
	 * Create the frame.
	 */
	public Nuevo_guia() {
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Nuevo_guia.class.getResource("/Presentacion/grupo_usuarios.png")));
		setBounds(100, 100, 609, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nuevo Guia Turistico", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		{
			lblInfo = new JLabel("Por favor, introduzca sus datos.");
			GridBagConstraints gbc_lblInfo = new GridBagConstraints();
			gbc_lblInfo.gridwidth = 4;
			gbc_lblInfo.insets = new Insets(0, 0, 5, 5);
			gbc_lblInfo.gridx = 1;
			gbc_lblInfo.gridy = 0;
			contentPane.add(lblInfo, gbc_lblInfo);
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 1;
			contentPane.add(lblNombre, gbc_lblNombre);
		}
		{
			tfNombre = new JTextField();
			tfNombre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfNombre.addActionListener(new TfNombreActionListener());
			GridBagConstraints gbc_tfNombre = new GridBagConstraints();
			gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
			gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNombre.gridx = 2;
			gbc_tfNombre.gridy = 1;
			contentPane.add(tfNombre, gbc_tfNombre);
			tfNombre.setColumns(10);
		}
		{
			lblApellidos = new JLabel("Apellidos:");
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 3;
			gbc_lblApellidos.gridy = 1;
			contentPane.add(lblApellidos, gbc_lblApellidos);
		}
		{
			tfApellidos = new JTextField();
			tfApellidos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfApellidos.addActionListener(new TfApellidosActionListener());
			GridBagConstraints gbc_tfApellidos = new GridBagConstraints();
			gbc_tfApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_tfApellidos.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfApellidos.gridx = 4;
			gbc_tfApellidos.gridy = 1;
			contentPane.add(tfApellidos, gbc_tfApellidos);
			tfApellidos.setColumns(10);
		}
		{
			lblNif = new JLabel("NIF:");
			GridBagConstraints gbc_lblNif = new GridBagConstraints();
			gbc_lblNif.insets = new Insets(0, 0, 5, 5);
			gbc_lblNif.gridx = 1;
			gbc_lblNif.gridy = 2;
			contentPane.add(lblNif, gbc_lblNif);
		}
		{
			tfNif = new JTextField();
			tfNif.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfNif.addActionListener(new TfNifActionListener());
			GridBagConstraints gbc_tfNif = new GridBagConstraints();
			gbc_tfNif.insets = new Insets(0, 0, 5, 5);
			gbc_tfNif.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNif.gridx = 2;
			gbc_tfNif.gridy = 2;
			contentPane.add(tfNif, gbc_tfNif);
			tfNif.setColumns(10);
		}
		{
			lblEmail = new JLabel("E-mail:");
			lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblEmail = new GridBagConstraints();
			gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmail.gridx = 3;
			gbc_lblEmail.gridy = 2;
			contentPane.add(lblEmail, gbc_lblEmail);
		}
		{
			tfEmail = new JTextField();
			tfEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfEmail.addActionListener(new TfEmailActionListener());
			GridBagConstraints gbc_tfEmail = new GridBagConstraints();
			gbc_tfEmail.insets = new Insets(0, 0, 5, 5);
			gbc_tfEmail.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfEmail.gridx = 4;
			gbc_tfEmail.gridy = 2;
			contentPane.add(tfEmail, gbc_tfEmail);
			tfEmail.setColumns(10);
		}
		{
			lblTelefono = new JLabel("Telefono:");
			GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
			gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelefono.gridx = 1;
			gbc_lblTelefono.gridy = 3;
			contentPane.add(lblTelefono, gbc_lblTelefono);
		}
		{
			tfTelefono = new JTextField();
			tfTelefono.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfTelefono.addActionListener(new TfTelefonoActionListener());
			GridBagConstraints gbc_tfTelefono = new GridBagConstraints();
			gbc_tfTelefono.insets = new Insets(0, 0, 5, 5);
			gbc_tfTelefono.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfTelefono.gridx = 2;
			gbc_tfTelefono.gridy = 3;
			contentPane.add(tfTelefono, gbc_tfTelefono);
			tfTelefono.setColumns(10);
		}
		{
			lblIdiomas = new JLabel("Idiomas:");
			GridBagConstraints gbc_lblIdiomas = new GridBagConstraints();
			gbc_lblIdiomas.insets = new Insets(0, 0, 5, 5);
			gbc_lblIdiomas.gridx = 3;
			gbc_lblIdiomas.gridy = 3;
			contentPane.add(lblIdiomas, gbc_lblIdiomas);
		}
		{
			pnlIdiomas = new JPanel();
			pnlIdiomas.setLayout(null);
			GridBagConstraints gbc_pnlIdiomas = new GridBagConstraints();
			gbc_pnlIdiomas.gridwidth = 2;
			gbc_pnlIdiomas.insets = new Insets(0, 0, 5, 5);
			gbc_pnlIdiomas.fill = GridBagConstraints.BOTH;
			gbc_pnlIdiomas.gridx = 4;
			gbc_pnlIdiomas.gridy = 3;
			contentPane.add(pnlIdiomas, gbc_pnlIdiomas);
			{
				cbIngles = new JCheckBox("Ingles");
				cbIngles.setFont(new Font("Tahoma", Font.BOLD, 10));
				cbIngles.setBounds(6, 5, 83, 23);
				pnlIdiomas.add(cbIngles);
			}
			{
				cbCastellano = new JCheckBox("Castellano");
				cbCastellano.setFont(new Font("Tahoma", Font.BOLD, 10));
				cbCastellano.setBounds(99, 5, 89, 23);
				pnlIdiomas.add(cbCastellano);
			}
			{
				cbPortugues = new JCheckBox("Portugues");
				cbPortugues.setFont(new Font("Tahoma", Font.BOLD, 10));
				cbPortugues.setBounds(6, 31, 83, 23);
				pnlIdiomas.add(cbPortugues);
			}
			{
				cbFrances = new JCheckBox("Frances");
				cbFrances.setFont(new Font("Tahoma", Font.BOLD, 10));
				cbFrances.setBounds(99, 31, 89, 23);
				pnlIdiomas.add(cbFrances);
			}
		}
		{
			pnlDisponibilidad = new JPanel();
			pnlDisponibilidad.setLayout(null);
			GridBagConstraints gbc_pnlDisponibilidad = new GridBagConstraints();
			gbc_pnlDisponibilidad.gridwidth = 2;
			gbc_pnlDisponibilidad.insets = new Insets(0, 0, 5, 5);
			gbc_pnlDisponibilidad.fill = GridBagConstraints.BOTH;
			gbc_pnlDisponibilidad.gridx = 1;
			gbc_pnlDisponibilidad.gridy = 4;
			contentPane.add(pnlDisponibilidad, gbc_pnlDisponibilidad);
			{
				lblDisponibilidad = new JLabel("Disponibilidad:");
				lblDisponibilidad.setBounds(10, 11, 76, 14);
				pnlDisponibilidad.add(lblDisponibilidad);
			}
			{
				rbSi = new JRadioButton("Si");
				rbSi.setSelected(true);
				rbSi.setBounds(90, 7, 40, 22);
				pnlDisponibilidad.add(rbSi);
			}
			{
				rbNo = new JRadioButton("No");
				rbNo.setEnabled(false);
				rbNo.setBounds(130, 7, 40, 22);
				pnlDisponibilidad.add(rbNo);
			}
		}
		{
			pnlBotones = new JPanel();
			GridBagConstraints gbc_pnlBotones = new GridBagConstraints();
			gbc_pnlBotones.gridwidth = 6;
			gbc_pnlBotones.fill = GridBagConstraints.BOTH;
			gbc_pnlBotones.gridx = 0;
			gbc_pnlBotones.gridy = 5;
			contentPane.add(pnlBotones, gbc_pnlBotones);
			{
				btnLimpiar = new JButton("Limpiar");
				btnLimpiar.addActionListener(new BtnLimpiarActionListener());
				pnlBotones.add(btnLimpiar);
			}
			{
				btnAadirGuia = new JButton("Añadir Guia");
				btnAadirGuia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int a=JOptionPane.showConfirmDialog(contentPane, "¿Esta seguro que desea guardar este nuevo Guia?");
						if(a==0) {
							dispose();
						}
					}
				});
				pnlBotones.add(btnAadirGuia);
			}
		}
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			tfNombre.setText("");
			tfNombre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfNombre.requestFocus();
			tfApellidos.setText("");
			tfApellidos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfTelefono.setText("");
			tfTelefono.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfEmail.setText("");
			tfEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tfNif.setText("");
			tfNif.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			cbIngles.setSelected(false);
			cbCastellano.setSelected(false);
			cbPortugues.setSelected(false);
			cbFrances.setSelected(false);


		}
	}

	private class TfTelefonoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfNombre.getText().isEmpty()) {
				lblInfo.setText("Introduzca su nombre en su correspondiente cuadro de texto, por favor.");
				tfNombre.setBorder(bordeRojo);
				tfNombre.requestFocus();
			}else {
				if(Character.isDigit(tfTelefono.getText().charAt(tfTelefono.getText().length()-1))) {
					if(tfTelefono.getText().length()<10) {
						tfTelefono.setBorder(bordeVerde);
						lblInfo.setText("Continue por favor.");
					}else {
						lblInfo.setText("Por favor, introduzca 9 digitos.");
						tfTelefono.setBorder(bordeRojo);
					}
				}
				else {
					lblInfo.setText("Por favor, introduzca un valor numÃ©rico.");
					tfTelefono.setBorder(bordeRojo);
					tfTelefono.setText(tfTelefono.getText().substring(0, tfTelefono.getText().length()-1));
				}
			}
		}
	}
	private class TfNombreActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfNombre.getText().isEmpty()) {
				lblInfo.setText("Introduzca su nombre en su correspondiente cuadro de texto, por favor.");
				tfNombre.setBorder(bordeRojo);
				tfNombre.requestFocus();
			}else {
				lblInfo.setText("Continue por favor.");
				tfApellidos.requestFocus();
				tfNombre.setBorder(bordeVerde);
			}
		}
	}
	private class TfApellidosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfApellidos.getText().isEmpty()) {
				lblInfo.setText("Introduzca sus apellidos en su correspondiente cuadro de texto, por favor.");
				tfApellidos.setBorder(bordeRojo);
				tfApellidos.requestFocus();
			}else {
				lblInfo.setText("Continue por favor.");
				tfNif.requestFocus();
				tfApellidos.setBorder(bordeVerde);
			}
		}
	}
	private class TfNifActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfNif.getText().isEmpty()) {
				lblInfo.setText("Introduzca su NIF en su correspondiente cuadro de texto, por favor.");
				tfNif.setBorder(bordeRojo);
				tfNif.requestFocus();
			}else {
				lblInfo.setText("Continue por favor.");
				tfEmail.requestFocus();
				tfNif.setBorder(bordeVerde);
			}
		}
	}
	private class TfEmailActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfEmail.getText().isEmpty()) {
				lblInfo.setText("Introduzca su e-mail en su correspondiente cuadro de texto, por favor.");
				tfEmail.setBorder(bordeRojo);
				tfEmail.requestFocus();
			}else {
				lblInfo.setText("Continue por favor.");
				tfTelefono.requestFocus();
				tfEmail.setBorder(bordeVerde);
			}
		}
	}



}

