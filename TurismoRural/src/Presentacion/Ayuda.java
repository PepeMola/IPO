package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;

public class Ayuda {

	private JFrame frame;
	private JPanel pnlAyuda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda window = new Ayuda();
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
	public Ayuda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.controlShadow);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/Presentacion/help.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			pnlAyuda = new JPanel();
			frame.getContentPane().add(pnlAyuda, BorderLayout.CENTER);
		}
	}

}
