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
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ayuda extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pnlInfo;
	private JPanel pnlAutores;

	
	/**
	 * Create the frame.
	 */
	public Ayuda() {
		setTitle("Ayuda");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/Presentacion/help.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centrarPantalla();/*Contiene el setBounds del frame*/
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			contentPane.add(tabbedPane, BorderLayout.CENTER);
			{
				pnlInfo = new JPanel();
				tabbedPane.addTab("Informacion", new ImageIcon(Ayuda.class.getResource("/Presentacion/usuario.png")), pnlInfo, null);
				tabbedPane.setEnabledAt(0, true);
			}
			{
				pnlAutores = new JPanel();
				pnlAutores.setToolTipText("");
				tabbedPane.addTab("Autores", new ImageIcon(Ayuda.class.getResource("/Presentacion/libro.png")), pnlAutores, null);
			}
		}
	}

	private void centrarPantalla() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();

		Dimension sizePantalla = pantalla.getScreenSize();

		int alturaPantalla = sizePantalla.height;
		int anchoPantalla = sizePantalla.width;

		setBounds(anchoPantalla/3, alturaPantalla/3, anchoPantalla/4, alturaPantalla/3);
	}
	
}
