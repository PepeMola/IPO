package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Dominio.Rutas_turisticas;
import java.awt.Color;

public class Nuevo_Circuito extends JFrame {

	private JPanel contentPane;
	private JTextField textPDI;
	private JTextField textTiendas;
	private JTextField textRestaurantes;
	private JTextField textMonumentos;
	private JTextField textLocalidades;
	private JTextField textID;

	

	/**
	 * Create the frame.
	 */
	public Nuevo_Circuito() {
		setBounds(100, 100, 482, 344);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 29, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 1;
		contentPane.add(lblId, gbc_lblId);
		
		textID = new JTextField();
		textID.setEditable(false);
		GridBagConstraints gbc_textID = new GridBagConstraints();
		gbc_textID.gridwidth = 3;
		gbc_textID.insets = new Insets(0, 0, 5, 5);
		gbc_textID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textID.gridx = 2;
		gbc_textID.gridy = 1;
		contentPane.add(textID, gbc_textID);
		textID.setColumns(10);
		
		JLabel lblLocalidades = new JLabel("Localidades");
		GridBagConstraints gbc_lblLocalidades = new GridBagConstraints();
		gbc_lblLocalidades.anchor = GridBagConstraints.EAST;
		gbc_lblLocalidades.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidades.gridx = 1;
		gbc_lblLocalidades.gridy = 2;
		contentPane.add(lblLocalidades, gbc_lblLocalidades);
		
		textLocalidades = new JTextField();
		GridBagConstraints gbc_textLocalidades = new GridBagConstraints();
		gbc_textLocalidades.gridwidth = 3;
		gbc_textLocalidades.insets = new Insets(0, 0, 5, 5);
		gbc_textLocalidades.fill = GridBagConstraints.HORIZONTAL;
		gbc_textLocalidades.gridx = 2;
		gbc_textLocalidades.gridy = 2;
		contentPane.add(textLocalidades, gbc_textLocalidades);
		textLocalidades.setColumns(10);
		
		JLabel lblMonumentos = new JLabel("Monumentos");
		GridBagConstraints gbc_lblMonumentos = new GridBagConstraints();
		gbc_lblMonumentos.anchor = GridBagConstraints.EAST;
		gbc_lblMonumentos.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonumentos.gridx = 1;
		gbc_lblMonumentos.gridy = 3;
		contentPane.add(lblMonumentos, gbc_lblMonumentos);
		
		textMonumentos = new JTextField();
		GridBagConstraints gbc_textMonumentos = new GridBagConstraints();
		gbc_textMonumentos.gridwidth = 3;
		gbc_textMonumentos.insets = new Insets(0, 0, 5, 5);
		gbc_textMonumentos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textMonumentos.gridx = 2;
		gbc_textMonumentos.gridy = 3;
		contentPane.add(textMonumentos, gbc_textMonumentos);
		textMonumentos.setColumns(10);
		
		JLabel lblRestaurantes = new JLabel("Restaurantes");
		GridBagConstraints gbc_lblRestaurantes = new GridBagConstraints();
		gbc_lblRestaurantes.anchor = GridBagConstraints.EAST;
		gbc_lblRestaurantes.insets = new Insets(0, 0, 5, 5);
		gbc_lblRestaurantes.gridx = 1;
		gbc_lblRestaurantes.gridy = 4;
		contentPane.add(lblRestaurantes, gbc_lblRestaurantes);
		
		textRestaurantes = new JTextField();
		GridBagConstraints gbc_textRestaurantes = new GridBagConstraints();
		gbc_textRestaurantes.gridwidth = 3;
		gbc_textRestaurantes.insets = new Insets(0, 0, 5, 5);
		gbc_textRestaurantes.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRestaurantes.gridx = 2;
		gbc_textRestaurantes.gridy = 4;
		contentPane.add(textRestaurantes, gbc_textRestaurantes);
		textRestaurantes.setColumns(10);
		
		JLabel lblTiendas = new JLabel("Tiendas");
		GridBagConstraints gbc_lblTiendas = new GridBagConstraints();
		gbc_lblTiendas.anchor = GridBagConstraints.EAST;
		gbc_lblTiendas.insets = new Insets(0, 0, 5, 5);
		gbc_lblTiendas.gridx = 1;
		gbc_lblTiendas.gridy = 5;
		contentPane.add(lblTiendas, gbc_lblTiendas);
		
		textTiendas = new JTextField();
		GridBagConstraints gbc_textTiendas = new GridBagConstraints();
		gbc_textTiendas.gridwidth = 3;
		gbc_textTiendas.insets = new Insets(0, 0, 5, 5);
		gbc_textTiendas.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTiendas.gridx = 2;
		gbc_textTiendas.gridy = 5;
		contentPane.add(textTiendas, gbc_textTiendas);
		textTiendas.setColumns(10);
		
		JLabel lblPuntosDeInteres = new JLabel("Puntos de Interes");
		GridBagConstraints gbc_lblPuntosDeInteres = new GridBagConstraints();
		gbc_lblPuntosDeInteres.anchor = GridBagConstraints.EAST;
		gbc_lblPuntosDeInteres.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntosDeInteres.gridx = 1;
		gbc_lblPuntosDeInteres.gridy = 6;
		contentPane.add(lblPuntosDeInteres, gbc_lblPuntosDeInteres);
		
		textPDI = new JTextField();
		GridBagConstraints gbc_textPDI = new GridBagConstraints();
		gbc_textPDI.gridwidth = 3;
		gbc_textPDI.insets = new Insets(0, 0, 5, 5);
		gbc_textPDI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPDI.gridx = 2;
		gbc_textPDI.gridy = 6;
		contentPane.add(textPDI, gbc_textPDI);
		textPDI.setColumns(10);
		
		JButton btnGuardarCircuito = new JButton("Guardar Circuito");
		btnGuardarCircuito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// este metodo crea una nueva ruta turistica
				int a=JOptionPane.showConfirmDialog(contentPane, "�Esta seguro que desea guardar este circuito nuevo?");
				if(a==0) {
				Rutas_turisticas cliente = new Rutas_turisticas
						(textLocalidades.getText(),textMonumentos.getText(),textRestaurantes.getText()
						,textTiendas.getText());
				
				dispose();
				}
			}
		});
		
		JButton button = new JButton("Diseñar Ruta");
		button.setToolTipText("Diseña ruta manualmente");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 8;
		contentPane.add(button, gbc_button);
		
		GridBagConstraints gbc_btnGuardarCircuito = new GridBagConstraints();
		gbc_btnGuardarCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarCircuito.gridx = 3;
		gbc_btnGuardarCircuito.gridy = 8;
		contentPane.add(btnGuardarCircuito, gbc_btnGuardarCircuito);
		
		JButton btnLimpiarCampo = new JButton("Limpiar Campo");
		btnLimpiarCampo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textLocalidades.setText("");
				textMonumentos.setText("");
				textRestaurantes.setText("");
				textTiendas.setText("");
				textPDI.setText("");
			}
		});
		GridBagConstraints gbc_btnLimpiarCampo = new GridBagConstraints();
		gbc_btnLimpiarCampo.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarCampo.gridx = 4;
		gbc_btnLimpiarCampo.gridy = 8;
		contentPane.add(btnLimpiarCampo, gbc_btnLimpiarCampo);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 5;
		gbc_btnAtras.gridy = 8;
		contentPane.add(btnAtras, gbc_btnAtras);
	}

	
}
