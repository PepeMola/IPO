package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ayuda extends JFrame {

	private JPanel contentPane;
	private JToolBar tbAyuda;
	private JButton btnInfo;
	private JButton btnAutores;

	
	/**
	 * Create the frame.
	 */
	public Ayuda() {
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/Presentacion/help.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			tbAyuda = new JToolBar();
			tbAyuda.setToolTipText("");
			contentPane.add(tbAyuda, BorderLayout.NORTH);
			{
				btnInfo = new JButton("Información");
				btnInfo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				tbAyuda.add(btnInfo);
			}
			{
				btnAutores = new JButton("Autores");
				tbAyuda.add(btnAutores);
			}
		}
	}

}
