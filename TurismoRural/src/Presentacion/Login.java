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

import Dominio.Guia_turistico;
import Dominio.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Cursor;

public class Login {

	JFrame frmLogin;
	private JTextField txtUsuario;
	private JLabel lblPassword;
	private JButton btnAcceder;
	private JButton btnLimpiar;
	private JButton btnAyuda;
	private JLabel lblIcono;
	private JLabel lblMensaje;
	private JPasswordField pfPassword;

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
		frmLogin.setBackground(new Color(135, 206, 250));
		frmLogin.setResizable(false);
		frmLogin.setTitle("LOGIN\r\n");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Presentacion/key.png")));
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlinicio = new JPanel();
		pnlinicio.setBackground(new Color(175, 238, 238));
		pnlinicio.setForeground(new Color(255, 255, 255));
		pnlinicio.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmLogin.getContentPane().add(pnlinicio, BorderLayout.CENTER);
		pnlinicio.setLayout(null);

		lblIcono = new JLabel("");
		lblIcono.setBounds(36, 47, 32, 35);
		lblIcono.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/grupo_usuarios.png")));
		pnlinicio.add(lblIcono);

		txtUsuario = new JTextField();
		txtUsuario.setBackground(new Color(211, 211, 211));
		txtUsuario.setBounds(78, 47, 325, 35);
		pnlinicio.add(txtUsuario);
		txtUsuario.setColumns(10);

		lblPassword = new JLabel("");
		lblPassword.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/candado.png")));
		lblPassword.setBounds(36, 99, 32, 32);
		pnlinicio.add(lblPassword);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnLimpiar.setBorderPainted(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(30, 144, 255));
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setBounds(78, 147, 158, 51);
		pnlinicio.add(btnLimpiar);

		btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new BtnAccederActionListener());
		btnAcceder.setBounds(246, 147, 157, 51);
		pnlinicio.add(btnAcceder);

		btnAyuda = new JButton("");
		btnAyuda.setBounds(10, 209, 53, 51);
		btnAyuda.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/help.png")));
		pnlinicio.add(btnAyuda);
		{
			lblMensaje = new JLabel("");
			lblMensaje.setBounds(78, 209, 325, 51);
			pnlinicio.add(lblMensaje);
		}
		{
			pfPassword = new JPasswordField();
			pfPassword.setBackground(new Color(211, 211, 211));
			pfPassword.setBounds(78, 93, 325, 38);
			pnlinicio.add(pfPassword);
		}
	}
	private class BtnAccederActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			String clave = new String(pfPassword.getPassword());

			if(txtUsuario.getText().equals("Pepe") && clave.equals("1234")) {
				
				Vista_Usuario pepe = new Vista_Usuario(txtUsuario.getText(), clave, "hola");
				pepe.setVisible(true);
				lblMensaje.setText(clave);
			}else {
				txtUsuario.setText("");
				pfPassword.setText("");
				txtUsuario.getFocusListeners();
				lblMensaje.setText("Usuario o Clave incorrecta.");
			}

		}
	}
	
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			txtUsuario.setText("");
			pfPassword.setText("");
			txtUsuario.getFocusListeners();
		}
	}
	//Aquí creo los objetos, para la base de datos, Añadir en cada clase diferente este metodo
	public void crearVariables() {
		Usuario utrilla=new Usuario("David","Utrilla","05936385Q","1234","");
		Guia_turistico david=new Guia_turistico("David", "Utrilla","05936385Q", "davidu@hotmail.com" ,"123456789","Ingles-Castellano", "Solo tardes",  "1-2", 13.00, 6.5,"");
		Guia_turistico pepe=new Guia_turistico("Pepe", "Arias","1234567K", "pepea@hotmail.com" ,"132456789","Ingles-Castellano", "Total",  "2", 34.00, 8.5,"");
		Guia_turistico custodio=new Guia_turistico("Custodio", "Gamero","05936385E", "CG@hotmail.com" ,"143256789","Italiano", "Total",  "1-2", 13.00, 6.49,"");
		Guia_turistico valentin=new Guia_turistico("Valentin", "Stoyanov","05936385V", "VS@hotmail.com" ,"142356789","Ruso-Castellano", "Solo tardes",  "1-2", 8.50, 7.5,"");
		
	}
}
