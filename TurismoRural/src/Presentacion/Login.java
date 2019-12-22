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
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Window.Type;
import java.awt.Frame;

public class Login {

	private JFrame frmLogin;
	private JTextField txtUsuario;
	private JTextField pfPassword;
	private JLabel lblPassword;
	private JButton btnAcceder;
	private JButton btnLimpiar;
	private JButton btnAyuda;
	private JLabel lblIcono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
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
		frmLogin = new JFrame();
		frmLogin.setTitle("\t\t\t\t\tLOGIN\r\n");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Presentacion/key.png")));
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlinicio = new JPanel();
		pnlinicio.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmLogin.getContentPane().add(pnlinicio, BorderLayout.CENTER);
		GridBagLayout gbl_pnlinicio = new GridBagLayout();
		gbl_pnlinicio.columnWidths = new int[]{0, 65, 47, 0, 85, 85, 49, 0};
		gbl_pnlinicio.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlinicio.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlinicio.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlinicio.setLayout(gbl_pnlinicio);
		
		lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/grupo_usuarios.png")));
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.gridheight = 4;
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 1;
		gbc_lblIcono.gridy = 1;
		pnlinicio.add(lblIcono, gbc_lblIcono);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 4;
		gbc_lblUsuario.gridy = 2;
		pnlinicio.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.gridx = 5;
		gbc_txtUsuario.gridy = 2;
		pnlinicio.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 4;
		gbc_lblContrasea.gridy = 3;
		pnlinicio.add(lblPassword, gbc_lblContrasea);
		
		pfPassword = new JTextField();
		GridBagConstraints gbc_pfPassword = new GridBagConstraints();
		gbc_pfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_pfPassword.insets = new Insets(0, 0, 5, 5);
		gbc_pfPassword.gridx = 5;
		gbc_pfPassword.gridy = 3;
		pnlinicio.add(pfPassword, gbc_pfPassword);
		pfPassword.setColumns(10);
		
		btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 4;
		gbc_btnLimpiar.gridy = 6;
		pnlinicio.add(btnLimpiar, gbc_btnLimpiar);
		
		btnAcceder = new JButton("Acceder");
		GridBagConstraints gbc_btnAcceder = new GridBagConstraints();
		gbc_btnAcceder.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAcceder.insets = new Insets(0, 0, 5, 5);
		gbc_btnAcceder.gridx = 5;
		gbc_btnAcceder.gridy = 6;
		pnlinicio.add(btnAcceder, gbc_btnAcceder);
		
		btnAyuda = new JButton("\r\nAyuda");
		btnAyuda.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/help.png")));
		GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
		gbc_btnAyuda.insets = new Insets(0, 0, 0, 5);
		gbc_btnAyuda.gridx = 1;
		gbc_btnAyuda.gridy = 7;
		pnlinicio.add(btnAyuda, gbc_btnAyuda);
	}

}
