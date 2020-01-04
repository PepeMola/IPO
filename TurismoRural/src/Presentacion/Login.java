package Presentacion;

import java.awt.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import Dominio.Guia_turistico;
import Dominio.Hardcoded;
import Dominio.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Login {

	JFrame frmLogin;
	private JLabel lblEncabezado;
	private JTextField txtUsuario;
	private JLabel lblPassword;
	private JButton btnAcceder;
	private JButton btnLimpiar;
	private JButton btnAyuda;
	private JLabel lblIcono;
	private JLabel lblMensaje;
	private JPasswordField pfPassword;
	
	/*Creacion objeto hardcoded para utilizar varios usuarios*/
	
	Hardcoded hardcoded = new Hardcoded();
	
	ArrayList<Usuario> listaUsuario = hardcoded.getUsuario();

	/*A partir de aqui crearemos las variables globales que necesitemos.*/
	//private final String user = "Profesora";
	//private final String pass = "ipo1";
	private int i = 3; /*Variable auxiliar para bucles*/

	/*Variables para los bordes de user y pass*/
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);


	public Login() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setVisible(true);
		frmLogin.setForeground(new Color(255, 255, 255));
		frmLogin.setResizable(false);
		frmLogin.setBackground(new Color(255, 255, 255));
		frmLogin.setTitle("LOGIN");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Presentacion/key.png")));
		centrarPantalla();/*Metodo para adaptar la ventana en la pantalla en la que se ejecute*/
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
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtUsuario.addActionListener(new TxtUsuarioActionListener());
		txtUsuario.setDisabledTextColor(Color.WHITE);
		txtUsuario.setSelectionColor(Color.LIGHT_GRAY);
		txtUsuario.setBackground(new Color(255, 255, 255));
		txtUsuario.setBounds(96, 77, 553, 35);
		pnlinicio.add(txtUsuario);
		txtUsuario.setColumns(10);

		lblPassword = new JLabel("");
		lblPassword.setEnabled(false);
		lblPassword.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/candado.png")));
		lblPassword.setBounds(36, 126, 32, 32);
		pnlinicio.add(lblPassword);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnLimpiar.setBorderPainted(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(102, 255, 153));
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setBounds(96, 182, 252, 51);
		pnlinicio.add(btnLimpiar);

		btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new BtnAccederActionListener());
		btnAcceder.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAcceder.setEnabled(false);
		btnAcceder.setBackground(new Color(102, 255, 153));
		btnAcceder.setBounds(397, 182, 252, 51);
		pnlinicio.add(btnAcceder);

		btnAyuda = new JButton("");
		btnAyuda.addActionListener(new BtnAyudaActionListener());
		btnAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnAyuda.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnAyuda.setBounds(10, 293, 53, 51);
		btnAyuda.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/help.png")));
		pnlinicio.add(btnAyuda);
		{
			lblMensaje = new JLabel("");
			lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
			lblMensaje.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblMensaje.setBounds(73, 244, 571, 100);
			pnlinicio.add(lblMensaje);
		}
		{
			pfPassword = new JPasswordField();
			pfPassword.setHorizontalAlignment(SwingConstants.CENTER);
			pfPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			pfPassword.addActionListener(new PfPasswordActionListener());
			pfPassword.setEnabled(false);
			pfPassword.setEchoChar('*');
			pfPassword.setBackground(new Color(255, 255, 255));
			pfPassword.setBounds(96, 123, 553, 35);
			pnlinicio.add(pfPassword);
		}

		{
			lblEncabezado = new JLabel("Interacción Persona-Ordenador I");
			lblEncabezado.setFont(new Font("Times New Roman", Font.BOLD, 30));
			lblEncabezado.setHorizontalAlignment(SwingConstants.CENTER);
			lblEncabezado.setBounds(96, 11, 553, 47);
			pnlinicio.add(lblEncabezado);

		}

		txtUsuario.addFocusListener(new MiFocusListener());
		pfPassword.addFocusListener(new MiFocusListener());

	}
	
	public boolean comprobarUser(String usuario) {
		for (int j = 0; j < listaUsuario.size(); j++) {
			if(usuario.equals(listaUsuario.get(j).getNombre())) {		
				return true;
			}
		}
		return false;
	}
	
	public boolean comprobarPass(String usuario, String password) {
		for (int j = 0; j < listaUsuario.size(); j++) {
			if(listaUsuario.get(j).getNombre().equals(usuario)) {
				if(listaUsuario.get(j).getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
	/*Con este metodo centraremos la pantalla.
	 * Nota: Podemos reutilizarlo para cualquier frame.*/
	private void centrarPantalla() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();

		Dimension sizePantalla = pantalla.getScreenSize();

		int alturaPantalla = sizePantalla.height;
		int anchoPantalla = sizePantalla.width;

		frmLogin.setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
	}

	private class TxtUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(comprobarUser(String.valueOf(txtUsuario.getText()))) {
				lblPassword.setEnabled(true);
				pfPassword.setEnabled(true);
				pfPassword.requestFocus();
				lblMensaje.setForeground(Color.BLACK);
				lblMensaje.setText("Por favor, introduzca su contraseña.");
				txtUsuario.setBorder(bordeVerde);
			}else{
				lblPassword.setEnabled(false);
				pfPassword.setEnabled(false);
				txtUsuario.requestFocus();
				lblMensaje.setForeground(Color.RED);
				lblMensaje.setText("Este usuario no pertenece al sistema.");
				txtUsuario.setText("");
				txtUsuario.setBorder(bordeRojo);
			}
		}
	}
	
	private class PfPasswordActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			/*Realizar una cuenta atras de 3 intentos para entrar*/
			if(i == 0) {
				JOptionPane.showMessageDialog(frmLogin, "Lo siento, has agotado todos tus intentos.");
				frmLogin.dispose();
			}
			if(comprobarPass(txtUsuario.getText(),String.copyValueOf(pfPassword.getPassword()))) {
				lblMensaje.setBackground(Color.GREEN);
				lblMensaje.setText("Contraseña correcta. Pulse Acceder para entrar en el sistema.");
				lblMensaje.setVisible(true);
				btnAcceder.setEnabled(true);
				lblPassword.setEnabled(false);
				pfPassword.setEnabled(false);
				pfPassword.setBorder(bordeVerde);
				txtUsuario.setEditable(false);
			}else {
				lblMensaje.setBackground(Color.RED);
				lblMensaje.setText("Contraseña incorrecta. Quendan "+ --i +" intentos.");
				lblMensaje.setVisible(true);
				btnAcceder.setEnabled(false);
				pfPassword.requestFocus();
				pfPassword.setText("");
				pfPassword.setBorder(bordeRojo);
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
			txtUsuario.setEditable(true);
		}
	}

	private class BtnAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Ayuda ayuda = new Ayuda();
						ayuda.setVisible(true);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			frmLogin.dispose();
		}
	}

	private class BtnAccederActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Vista_Usuario usuario = new Vista_Usuario("Alumno","Informatica","0000001A");
						usuario.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			frmLogin.dispose();

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
}
