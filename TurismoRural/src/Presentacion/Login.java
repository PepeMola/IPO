package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import Persistencia.Usuario;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frame;
	private JTextField textUsuario;
	private JTextField textPassword;
	private JLabel lblPassword;
	private JButton btnAcceder;
	private JButton btnLimpiar;
	private JLabel labelImagen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Presentacion/Icono (1).jpg")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlinicio = new JPanel();
		pnlinicio.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(pnlinicio, BorderLayout.CENTER);
		GridBagLayout gbl_pnlinicio = new GridBagLayout();
		gbl_pnlinicio.columnWidths = new int[]{0, 65, 47, 0, 0, 0, 49, 0, 0, 0};
		gbl_pnlinicio.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlinicio.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlinicio.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlinicio.setLayout(gbl_pnlinicio);
		
		JLabel lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.gridx = 6;
		gbc_lblUsuario.gridy = 2;
		pnlinicio.add(lblUsuario, gbc_lblUsuario);
		
		textUsuario = new JTextField();
		GridBagConstraints gbc_textUsuario = new GridBagConstraints();
		gbc_textUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsuario.gridx = 7;
		gbc_textUsuario.gridy = 2;
		pnlinicio.add(textUsuario, gbc_textUsuario);
		textUsuario.setColumns(10);
		
		labelImagen = new JLabel("");
		labelImagen.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Icono (1).jpg")));
		GridBagConstraints gbc_labelImagen = new GridBagConstraints();
		gbc_labelImagen.gridwidth = 2;
		gbc_labelImagen.gridheight = 3;
		gbc_labelImagen.insets = new Insets(0, 0, 5, 5);
		gbc_labelImagen.gridx = 1;
		gbc_labelImagen.gridy = 2;
		pnlinicio.add(labelImagen, gbc_labelImagen);
		
		lblPassword = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.gridx = 6;
		gbc_lblContrasea.gridy = 3;
		pnlinicio.add(lblPassword, gbc_lblContrasea);
		
		textPassword = new JTextField();
		GridBagConstraints gbc_textPassword = new GridBagConstraints();
		gbc_textPassword.insets = new Insets(0, 0, 5, 5);
		gbc_textPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPassword.gridx = 7;
		gbc_textPassword.gridy = 3;
		pnlinicio.add(textPassword, gbc_textPassword);
		textPassword.setColumns(10);
		
		btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 6;
		gbc_btnLimpiar.gridy = 6;
		pnlinicio.add(btnLimpiar, gbc_btnLimpiar);
		
		btnAcceder = new JButton("Acceder");
		GridBagConstraints gbc_btnAcceder = new GridBagConstraints();
		gbc_btnAcceder.insets = new Insets(0, 0, 5, 5);
		gbc_btnAcceder.gridx = 7;
		gbc_btnAcceder.gridy = 6;
		pnlinicio.add(btnAcceder, gbc_btnAcceder);
	}

}
