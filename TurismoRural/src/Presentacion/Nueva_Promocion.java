package Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Dominio.Hardcoded;
import Dominio.Promocion;

import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

public class Nueva_Promocion extends JFrame {

	private JPanel contentPane;
	private JLabel lblDescuento;
	private JLabel lblRuta;
	private JLabel lblDuracion;
	private JButton btnInsertarPromocion;
	private JLabel lblDescripcion;
	private JTextField tfDescuento;
	private JTextField tfRuta;
	private JTextField tfDuracion;
	private JTextPane tpDescripcion;
	private JLabel lblInfo;

	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private JButton btnLimpiar;

	/**
	 * Create the frame.
	 */
	public Nueva_Promocion(Hardcoded h) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Nueva_Promocion.class.getResource("/Presentacion/ok.png")));
		setTitle("Nueva Promocion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		{
			lblDescuento = new JLabel("Descuento:");
			lblDescuento.setHorizontalTextPosition(SwingConstants.LEFT);
			lblDescuento.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblDescuento = new GridBagConstraints();
			gbc_lblDescuento.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescuento.gridx = 1;
			gbc_lblDescuento.gridy = 1;
			contentPane.add(lblDescuento, gbc_lblDescuento);
		}
		{
			tfDescuento = new JTextField();
			tfDescuento.addActionListener(new TfDescuentoActionListener());
			GridBagConstraints gbc_tfDescuento = new GridBagConstraints();
			gbc_tfDescuento.gridwidth = 3;
			gbc_tfDescuento.insets = new Insets(0, 0, 5, 5);
			gbc_tfDescuento.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDescuento.gridx = 2;
			gbc_tfDescuento.gridy = 1;
			contentPane.add(tfDescuento, gbc_tfDescuento);
			tfDescuento.setColumns(10);
		}
		{
			lblRuta = new JLabel("Ruta: ");
			lblRuta.setHorizontalTextPosition(SwingConstants.LEFT);
			lblRuta.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblRuta = new GridBagConstraints();
			gbc_lblRuta.insets = new Insets(0, 0, 5, 5);
			gbc_lblRuta.gridx = 1;
			gbc_lblRuta.gridy = 2;
			contentPane.add(lblRuta, gbc_lblRuta);
		}
		{
			tfRuta = new JTextField();
			tfRuta.addActionListener(new TfRutaActionListener());
			tfRuta.addFocusListener(new MiFocusListener());

			GridBagConstraints gbc_tfRuta = new GridBagConstraints();
			gbc_tfRuta.gridwidth = 3;
			gbc_tfRuta.insets = new Insets(0, 0, 5, 5);
			gbc_tfRuta.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfRuta.gridx = 2;
			gbc_tfRuta.gridy = 2;
			contentPane.add(tfRuta, gbc_tfRuta);
			tfRuta.setColumns(10);
		}
		{
			lblDuracion = new JLabel("Duracion:");
			lblDuracion.setHorizontalTextPosition(SwingConstants.LEFT);
			lblDuracion.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblDuracion = new GridBagConstraints();
			gbc_lblDuracion.insets = new Insets(0, 0, 5, 5);
			gbc_lblDuracion.gridx = 1;
			gbc_lblDuracion.gridy = 3;
			contentPane.add(lblDuracion, gbc_lblDuracion);
		}
		{
			tfDuracion = new JTextField();
			tfDuracion.addActionListener(new TfDuracionActionListener());
			tfDuracion.addFocusListener(new MiFocusListener());
			GridBagConstraints gbc_tfDuracion = new GridBagConstraints();
			gbc_tfDuracion.gridwidth = 3;
			gbc_tfDuracion.insets = new Insets(0, 0, 5, 5);
			gbc_tfDuracion.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDuracion.gridx = 2;
			gbc_tfDuracion.gridy = 3;
			contentPane.add(tfDuracion, gbc_tfDuracion);
			tfDuracion.setColumns(10);
		}
		{
			lblDescripcion = new JLabel("Descripcion:");
			lblDescripcion.setHorizontalTextPosition(SwingConstants.LEFT);
			lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
			gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescripcion.gridx = 1;
			gbc_lblDescripcion.gridy = 4;
			contentPane.add(lblDescripcion, gbc_lblDescripcion);
		}
		{
			tpDescripcion = new JTextPane();
			GridBagConstraints gbc_tpDescripcion = new GridBagConstraints();
			gbc_tpDescripcion.gridheight = 2;
			gbc_tpDescripcion.gridwidth = 3;
			gbc_tpDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_tpDescripcion.fill = GridBagConstraints.BOTH;
			gbc_tpDescripcion.gridx = 2;
			gbc_tpDescripcion.gridy = 4;
			contentPane.add(tpDescripcion, gbc_tpDescripcion);
		}
		{
			lblInfo = new JLabel("");
			GridBagConstraints gbc_lblInfo = new GridBagConstraints();
			gbc_lblInfo.gridheight = 2;
			gbc_lblInfo.gridwidth = 2;
			gbc_lblInfo.insets = new Insets(0, 0, 0, 5);
			gbc_lblInfo.gridx = 1;
			gbc_lblInfo.gridy = 6;
			contentPane.add(lblInfo, gbc_lblInfo);
		}
		{
			btnInsertarPromocion = new JButton("Insertar Promocion");
			btnInsertarPromocion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Promocion p = new Promocion();

					if(tfDescuento == null) {
						tfDescuento.setBorder(bordeRojo);
					}else {
						tfDescuento.setBorder(bordeVerde);
					}
					if(tfDuracion == null) {
						tfDuracion.setBorder(bordeRojo);
					}else {
						tfDuracion.setBorder(bordeVerde);
					}
					if(tfRuta == null) {
						tfRuta.setBorder(bordeRojo);
					}else {
						tfRuta.setBorder(bordeVerde);
					}

					int codigo=JOptionPane.showConfirmDialog(contentPane, "¿Esta seguro de que quiere añadir el nuevo guia?", "Alerta", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE);
					if (codigo==JOptionPane.YES_OPTION){
						p.setDto(tfDescuento.getText());
						p.setRuta(tfRuta.getText());
						p.setDuracion(tfDuracion.getText());
						p.setDescripcion(tpDescripcion.getText());

						h.setPromocion(p);
						dispose();
					}	

				}
			});
			{
				btnLimpiar = new JButton("Limpiar");
				GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
				gbc_btnLimpiar.insets = new Insets(0, 0, 0, 5);
				gbc_btnLimpiar.gridx = 3;
				gbc_btnLimpiar.gridy = 7;
				contentPane.add(btnLimpiar, gbc_btnLimpiar);
			}
			
			GridBagConstraints gbc_btnInsertarPromocion = new GridBagConstraints();
			gbc_btnInsertarPromocion.gridwidth = 2;
			gbc_btnInsertarPromocion.gridx = 4;
			gbc_btnInsertarPromocion.gridy = 7;
			contentPane.add(btnInsertarPromocion, gbc_btnInsertarPromocion);
		}
	}

	private class MiFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
		}
	}
	
	
	private class BtnInsertarPromocionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Promocion p = new Promocion();
			int codigo=JOptionPane.showConfirmDialog(contentPane, "¿Esta seguro de que quiere añadir el nuevo guia?", "Alerta", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE);
			if (codigo==JOptionPane.YES_OPTION){
				p.setDto(tfDescuento.getText());
				p.setRuta(tfRuta.getText());
				p.setDuracion(tfDuracion.getText());
				p.setDescripcion(tpDescripcion.getText());

				dispose();
			}	

		}
	}
	private class TfDescuentoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfDescuento == null) {
				tfDescuento.setBorder(bordeRojo);
				tfDescuento.requestFocus();
			}else {
				tfDescuento.setBorder(bordeVerde);
				tfRuta.requestFocus();
			}
			
		}
	}
	private class TfRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfRuta == null) {
				tfRuta.setBorder(bordeRojo);
				tfRuta.requestFocus();
			}else {
				tfRuta.setBorder(bordeVerde);
				tfDuracion.requestFocus();
			}
			
		}
	}
	private class TfDuracionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(tfDuracion == null) {
				tfDuracion.setBorder(bordeRojo);
				tfDuracion.requestFocus();
			}else {
				tfDuracion.setBorder(bordeVerde);
				tpDescripcion.requestFocus();
			}
		}
	}
	
}
