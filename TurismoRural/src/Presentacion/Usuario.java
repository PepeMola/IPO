package Presentacion;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Usuario extends JPanel {
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textUltimoAcceso;
	private JTextField textIdentificador;

	/**
	 * Create the panel.
	 */
	public Usuario() {
		setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 82, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 5;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 6;
		gbc_textNombre.gridy = 1;
		add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 5;
		gbc_lblApellidos.gridy = 2;
		add(lblApellidos, gbc_lblApellidos);
		
		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 6;
		gbc_textApellidos.gridy = 2;
		add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblUltimoAcceso = new JLabel("Ultimo Acceso");
		GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
		gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimoAcceso.gridx = 5;
		gbc_lblUltimoAcceso.gridy = 3;
		add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		
		textUltimoAcceso = new JTextField();
		GridBagConstraints gbc_textUltimoAcceso = new GridBagConstraints();
		gbc_textUltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_textUltimoAcceso.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUltimoAcceso.gridx = 6;
		gbc_textUltimoAcceso.gridy = 3;
		add(textUltimoAcceso, gbc_textUltimoAcceso);
		textUltimoAcceso.setColumns(10);
		
		JLabel lblIdentificador = new JLabel("Identificador");
		GridBagConstraints gbc_lblIdentificador = new GridBagConstraints();
		gbc_lblIdentificador.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificador.gridx = 5;
		gbc_lblIdentificador.gridy = 4;
		add(lblIdentificador, gbc_lblIdentificador);
		
		textIdentificador = new JTextField();
		GridBagConstraints gbc_textIdentificador = new GridBagConstraints();
		gbc_textIdentificador.insets = new Insets(0, 0, 5, 5);
		gbc_textIdentificador.fill = GridBagConstraints.HORIZONTAL;
		gbc_textIdentificador.gridx = 6;
		gbc_textIdentificador.gridy = 4;
		add(textIdentificador, gbc_textIdentificador);
		textIdentificador.setColumns(10);
		
		JButton btnAyuda = new JButton("Ayuda");
		GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
		gbc_btnAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_btnAyuda.gridx = 6;
		gbc_btnAyuda.gridy = 6;
		add(btnAyuda, gbc_btnAyuda);

	}

}
