package Presentacion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;

public class Login {

	private JFrame frmLogin;
	private JTextField txtUsuario;
	private JLabel lblPassword;
	private JButton btnAcceder;
	private JButton btnLimpiar;
	private JButton btnAyuda;
	private JLabel lblIcono;
	private JLabel lblMensaje;
	private JPasswordField pfPassword;

	/*A partir de aqui crearemos las variables globales que necesitemos.*/
	private final String user = "Profesora";
	private final String pass = "ipo1";
	private int i; 
	private JLabel lblEncabezado;/*Variable auxiliar para bucles*/

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
		frmLogin.setForeground(new Color(255, 255, 255));
		frmLogin.setResizable(false);
		frmLogin.setBackground(new Color(255, 255, 255));
		frmLogin.setTitle("LOGIN");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Presentacion/key.png")));
		frmLogin.setBounds(100, 100, 550, 347);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnlinicio = new JPanel();
		pnlinicio.setBackground(new Color(153, 204, 153));
		pnlinicio.setForeground(new Color(255, 255, 255));
		pnlinicio.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmLogin.getContentPane().add(pnlinicio, BorderLayout.CENTER);
		pnlinicio.setLayout(null);

		lblIcono = new JLabel("");
		lblIcono.setBounds(36, 77, 32, 35);
		lblIcono.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/grupo_usuarios.png")));
		pnlinicio.add(lblIcono);

		txtUsuario = new JTextField();
		txtUsuario.addActionListener(new TxtUsuarioActionListener());
		txtUsuario.setDisabledTextColor(Color.WHITE);
		txtUsuario.setSelectionColor(Color.LIGHT_GRAY);
		txtUsuario.setBackground(new Color(255, 255, 255));
		txtUsuario.setBounds(96, 77, 370, 35);
		pnlinicio.add(txtUsuario);
		txtUsuario.setColumns(10);

		lblPassword = new JLabel("");
		lblPassword.setEnabled(false);
		lblPassword.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/candado.png")));
		lblPassword.setBounds(36, 126, 32, 32);
		pnlinicio.add(lblPassword);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnLimpiar.setBorderPainted(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(102, 255, 153));
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setBounds(96, 182, 176, 51);
		pnlinicio.add(btnLimpiar);

		btnAcceder = new JButton("Acceder");
		btnAcceder.setEnabled(false);
		btnAcceder.setBackground(new Color(102, 255, 153));
		btnAcceder.setBounds(282, 182, 184, 51);
		pnlinicio.add(btnAcceder);

		btnAyuda = new JButton("");
		btnAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnAyuda.setBorder(null);
		btnAyuda.setBounds(10, 244, 53, 51);
		btnAyuda.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/help.png")));
		pnlinicio.add(btnAyuda);
		{
			lblMensaje = new JLabel("");
			lblMensaje.setBounds(78, 244, 456, 51);
			pnlinicio.add(lblMensaje);
		}
		{
			pfPassword = new JPasswordField();
			pfPassword.addActionListener(new PfPasswordActionListener());
			pfPassword.setEnabled(false);
			pfPassword.setEchoChar('*');
			pfPassword.setBackground(new Color(255, 255, 255));
			pfPassword.setBounds(96, 123, 369, 35);
			pnlinicio.add(pfPassword);
		}
		{
			lblEncabezado = new JLabel("Interacción Persona-Ordenador I");
			lblEncabezado.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblEncabezado.setHorizontalAlignment(SwingConstants.CENTER);
			lblEncabezado.setBounds(96, 11, 370, 47);
			pnlinicio.add(lblEncabezado);
		}
	}

	private class TxtUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(txtUsuario.getText().equals(user)) {
				lblPassword.setEnabled(true);
				pfPassword.setEnabled(true);
				pfPassword.requestFocus();
				lblMensaje.setBackground(Color.GREEN);
				lblMensaje.setText("Por favor, introduzca su contraseña.");
			}else{
				lblPassword.setEnabled(false);
				pfPassword.setEnabled(false);
				txtUsuario.requestFocus();
				lblMensaje.setBackground(Color.RED);
				lblMensaje.setText("Este usuario no pertenece al sistema.");
				txtUsuario.setText("");
			}
		}
	}

	private class PfPasswordActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			/*Realizar una cuenta atras de 3 intentos para entrar*/
			if(String.copyValueOf(pfPassword.getPassword()).equals(pass)) {
				lblMensaje.setBackground(Color.GREEN);
				lblMensaje.setText("Contraseña correcta. Pulse Acceder para entrar en el sistema.");
				lblMensaje.setVisible(true);
				btnAcceder.setEnabled(true);
				lblPassword.setEnabled(false);
				pfPassword.setEnabled(false);
				btnAcceder.requestFocus();
			}else {
				lblMensaje.setBackground(Color.RED);
				lblMensaje.setText("Contraseña incorrecta. Quendan "+ --i +" intentos.");
				lblMensaje.setVisible(true);
				btnAcceder.setEnabled(false);
				pfPassword.requestFocus();
			}
		}
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			txtUsuario.setText("");
			pfPassword.setText("");
			txtUsuario.getFocusListeners();
			btnAcceder.setEnabled(false);
			lblPassword.setEnabled(false);
			pfPassword.setEnabled(false);
		}
	}
}
