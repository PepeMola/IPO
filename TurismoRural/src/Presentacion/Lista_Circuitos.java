package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Lista_Circuitos extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_Circuitos frame = new Lista_Circuitos();
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
	public Lista_Circuitos() {
		setBounds(100, 100, 450, 300);

	}

}
