package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Vista_Historial extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista_Historial frame = new Vista_Historial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista_Historial() {
		setBounds(100, 100, 450, 300);

	}

}
