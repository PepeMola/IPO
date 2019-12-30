package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		login();
	}
	public static void login() {
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
	

}
