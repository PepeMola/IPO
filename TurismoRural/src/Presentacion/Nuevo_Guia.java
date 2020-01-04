package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dominio.Guia_turistico;
import Dominio.Hardcoded;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nuevo_Guia extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textIdioma;
	private JTextField textDisponibilidad;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTextField textHistorial;
	private JTextField textPrecio;
	private JTextField textNif;
	private JTextField textPuntuacion;

	

	/**
	 * Create the frame.
	 */
	public Nuevo_Guia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{20, 70, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 3;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 1;
		contentPane.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 2;
		contentPane.add(lblApellidos, gbc_lblApellidos);
		
		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 3;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 2;
		gbc_textApellidos.gridy = 2;
		contentPane.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 1;
		gbc_lblIdioma.gridy = 3;
		contentPane.add(lblIdioma, gbc_lblIdioma);
		
		textIdioma = new JTextField();
		GridBagConstraints gbc_textIdioma = new GridBagConstraints();
		gbc_textIdioma.gridwidth = 3;
		gbc_textIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_textIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_textIdioma.gridx = 2;
		gbc_textIdioma.gridy = 3;
		contentPane.add(textIdioma, gbc_textIdioma);
		textIdioma.setColumns(10);
		
		JLabel lblDisponibilidad = new JLabel("Disponibilidad");
		GridBagConstraints gbc_lblDisponibilidad = new GridBagConstraints();
		gbc_lblDisponibilidad.anchor = GridBagConstraints.EAST;
		gbc_lblDisponibilidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblDisponibilidad.gridx = 1;
		gbc_lblDisponibilidad.gridy = 4;
		contentPane.add(lblDisponibilidad, gbc_lblDisponibilidad);
		
		textDisponibilidad = new JTextField();
		GridBagConstraints gbc_textDisponibilidad = new GridBagConstraints();
		gbc_textDisponibilidad.gridwidth = 3;
		gbc_textDisponibilidad.insets = new Insets(0, 0, 5, 5);
		gbc_textDisponibilidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDisponibilidad.gridx = 2;
		gbc_textDisponibilidad.gridy = 4;
		contentPane.add(textDisponibilidad, gbc_textDisponibilidad);
		textDisponibilidad.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 5;
		contentPane.add(lblTelefono, gbc_lblTelefono);
		
		textTelefono = new JTextField();
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.gridwidth = 3;
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 2;
		gbc_textTelefono.gridy = 5;
		contentPane.add(textTelefono, gbc_textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblEmail = new JLabel("email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 6;
		contentPane.add(lblEmail, gbc_lblEmail);
		
		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 3;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 2;
		gbc_textEmail.gridy = 6;
		contentPane.add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);
		
		JLabel lblHistorial = new JLabel("Historial");
		GridBagConstraints gbc_lblHistorial = new GridBagConstraints();
		gbc_lblHistorial.anchor = GridBagConstraints.EAST;
		gbc_lblHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistorial.gridx = 1;
		gbc_lblHistorial.gridy = 7;
		contentPane.add(lblHistorial, gbc_lblHistorial);
		
		textHistorial = new JTextField();
		GridBagConstraints gbc_textHistorial = new GridBagConstraints();
		gbc_textHistorial.gridwidth = 3;
		gbc_textHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_textHistorial.fill = GridBagConstraints.HORIZONTAL;
		gbc_textHistorial.gridx = 2;
		gbc_textHistorial.gridy = 7;
		contentPane.add(textHistorial, gbc_textHistorial);
		textHistorial.setColumns(10);
		
		JLabel lblPuntuacion = new JLabel("Puntuacion");
		GridBagConstraints gbc_lblPuntuacion = new GridBagConstraints();
		gbc_lblPuntuacion.anchor = GridBagConstraints.EAST;
		gbc_lblPuntuacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntuacion.gridx = 1;
		gbc_lblPuntuacion.gridy = 8;
		contentPane.add(lblPuntuacion, gbc_lblPuntuacion);
		
		textPuntuacion = new JTextField();
		GridBagConstraints gbc_textPuntuacion = new GridBagConstraints();
		gbc_textPuntuacion.gridwidth = 3;
		gbc_textPuntuacion.insets = new Insets(0, 0, 5, 5);
		gbc_textPuntuacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPuntuacion.gridx = 2;
		gbc_textPuntuacion.gridy = 8;
		contentPane.add(textPuntuacion, gbc_textPuntuacion);
		textPuntuacion.setColumns(10);
		
		JLabel lblPreciohora = new JLabel("Precio/Hora");
		GridBagConstraints gbc_lblPreciohora = new GridBagConstraints();
		gbc_lblPreciohora.anchor = GridBagConstraints.EAST;
		gbc_lblPreciohora.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreciohora.gridx = 1;
		gbc_lblPreciohora.gridy = 9;
		contentPane.add(lblPreciohora, gbc_lblPreciohora);
		
		textPrecio = new JTextField();
		GridBagConstraints gbc_textPrecio = new GridBagConstraints();
		gbc_textPrecio.gridwidth = 3;
		gbc_textPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecio.gridx = 2;
		gbc_textPrecio.gridy = 9;
		contentPane.add(textPrecio, gbc_textPrecio);
		textPrecio.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombre.setText("");
				textApellidos.setText("");
				textDisponibilidad.setText("");
				textIdioma.setText("");
				textTelefono.setText("");
				textEmail.setText("");
				textHistorial.setText("");
				textPrecio.setText("");
				textNif.setText("");
				textPuntuacion.setText("");
			}
		});
		
		JLabel lblNif = new JLabel("NIF");
		GridBagConstraints gbc_lblNif = new GridBagConstraints();
		gbc_lblNif.anchor = GridBagConstraints.EAST;
		gbc_lblNif.insets = new Insets(0, 0, 5, 5);
		gbc_lblNif.gridx = 1;
		gbc_lblNif.gridy = 10;
		contentPane.add(lblNif, gbc_lblNif);
		
		textNif = new JTextField();
		GridBagConstraints gbc_textNif = new GridBagConstraints();
		gbc_textNif.gridwidth = 3;
		gbc_textNif.insets = new Insets(0, 0, 5, 5);
		gbc_textNif.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNif.gridx = 2;
		gbc_textNif.gridy = 10;
		contentPane.add(textNif, gbc_textNif);
		textNif.setColumns(10);
		
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 3;
		gbc_btnLimpiar.gridy = 12;
		contentPane.add(btnLimpiar, gbc_btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		/*btnGuardar.addActionListener(new ActionListener() {//revisar este metodo, y preguntar a pepe por problema de numeros y puntos
			public void actionPerformed(ActionEvent e) {
				Hardcoded hc=new Hardcoded(null, null, null, null, null, null, null);
				double precio=0.00;
				double puntuacion=0.00;
				//precio=Double.parseDouble(textPrecio.getText());	
				//puntuacion=Double.parseDouble(textPrecio.getText());
				Guia_turistico guia=new Guia_turistico(textNombre.getText(),
						textApellidos.getText(),
						textNif.getText(),
						textEmail.getText(),
						textTelefono.getText(),
						textIdioma.getText(),
						textDisponibilidad.getText(),
						textHistorial.getText(),
						precio,//modificar
						puntuacion,//modificar
						"");//la foto
				guia.toString();
				hc.setGuia(guia);
				dispose();
				}
		});*/
			
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 4;
		gbc_btnGuardar.gridy = 12;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 5;
		gbc_btnAtras.gridy = 12;
		contentPane.add(btnAtras, gbc_btnAtras);
	}

}
