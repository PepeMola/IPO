package Presentacion;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class EditorGrafico {

	private JFrame frame;
	private JLabel MiAreaDibujo;
	//Area de dibujo personalizada (creada extendiendo de JLabel)
	private MiAreaDibujo miAreaDibujo;
	//Imagen en la que se cargará el fichero seleccionado por el usuario
	private ImageIcon imagen;
	int modo = -1;
	private final int SOLEADO = 1;
	private final int NUBLADO = 2;
	private final int RECTANGULO = 3;
	private final int TEXTO = 4;
	private Toolkit toolkit;
	private Image imagSoleado;
	private Image imagNublado;
	private Image imagRectangulo;
	private Image imagTexto;
	private Image imagCursorSoleado;
	private Image imagCursorNublado;
	private Cursor cursorSoleado;
	private Cursor cursorNublado;
	private Cursor cursorRectangulo;
	private Cursor cursorTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorGrafico window = new EditorGrafico();
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
	public EditorGrafico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(0, 0, 700, 700));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JToolBar tbBarraDibujo = new JToolBar();
		frame.getContentPane().add(tbBarraDibujo, BorderLayout.NORTH);

		JButton btnCargarMapa = new JButton("");
		btnCargarMapa.setIcon(new ImageIcon(EditorGrafico.class.getResource("/Presentacion/cargarMapa.png")));
		btnCargarMapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(frame);
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					imagen = new ImageIcon(file.getAbsolutePath());
					miAreaDibujo.setIcon(imagen);
				}
			}
		});

		tbBarraDibujo.add(btnCargarMapa);

		JButton btnSoleado = new JButton("");
		btnSoleado.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		btnSoleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if (imagen != null)
				{
					switch (modo)
					{
					case SOLEADO:
						miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagSoleado));
						miAreaDibujo.repaint();
						break;
					case NUBLADO:
						miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagNublado));
						miAreaDibujo.repaint();
						break;
					case RECTANGULO:
					case TEXTO:
					}
				}

			}
		});
		btnSoleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = SOLEADO;
				frame.setCursor(cursorSoleado);
			}
		});
		btnSoleado.setIcon(new ImageIcon(EditorGrafico.class.getResource("/Presentacion/cursorSoleado.png")));
		tbBarraDibujo.add(btnSoleado);

		JButton btnNublado = new JButton("");
		btnNublado.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if (imagen != null)
				{
					switch (modo)
					{
					case SOLEADO:
						miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagSoleado));
						miAreaDibujo.repaint();
						break;
					case NUBLADO:
						miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagNublado));
						miAreaDibujo.repaint();
						break;
					case RECTANGULO:
					case TEXTO:
					}
				}

			}
		});
		btnNublado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = NUBLADO;
				frame.setCursor(cursorNublado);
			}
		});
		btnNublado.setIcon(new ImageIcon(EditorGrafico.class.getResource("/Presentacion/cursorNubesYClaros.png")));
		tbBarraDibujo.add(btnNublado);

		JButton btnRectangulo = new JButton("");
		btnRectangulo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (modo == RECTANGULO && imagen!=null) {
					((RectanguloGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
					((RectanguloGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setY1(e.getY());
					miAreaDibujo.repaint();
					}

			}
		});
		btnRectangulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				toolkit = Toolkit.getDefaultToolkit();
				if (imagen != null)
				{
					switch (modo)
					{
					case SOLEADO:
						
					case NUBLADO:
						
					case RECTANGULO:
						miAreaDibujo.addObjetoGrafico(new RectanguloGrafico(x,y,x,y,
								Color.RED));
						break;
					case TEXTO:
					}
				}

			}
		});
		btnRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = RECTANGULO;
				frame.setCursor(cursorRectangulo);
			}
		});

		btnRectangulo.setIcon(new ImageIcon(EditorGrafico.class.getResource("/Presentacion/rectangulo.png")));
		tbBarraDibujo.add(btnRectangulo);

		JButton btnAnotacion = new JButton("");
		btnAnotacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = TEXTO;
				frame.setCursor(cursorTexto);
			}
		});
		btnAnotacion.setIcon(new ImageIcon(EditorGrafico.class.getResource("/Presentacion/aniadirAnotacion.png")));
		tbBarraDibujo.add(btnAnotacion);

		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

		//Creación del área de dibujo personalizada
		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.setIcon(null);
		scrollPane.setViewportView(miAreaDibujo);
		toolkit = Toolkit.getDefaultToolkit();
		imagSoleado =
				toolkit.getImage(getClass().getClassLoader().getResource("presentacion/soleado.png"));
		imagNublado =
				toolkit.getImage(getClass().getClassLoader().getResource("presentacion/nubesYClaros.png"));
		imagRectangulo =
				toolkit.getImage(getClass().getClassLoader().getResource("presentacion/rectangulo.png"));
		imagTexto =
				toolkit.getImage(getClass().getClassLoader().getResource("presentacion/aniadirAnotacion.png"));
		imagCursorSoleado =
				toolkit.getImage(getClass().getClassLoader().getResource("presentacion/cursorSoleado.png"));
		imagCursorNublado =
				toolkit.getImage(getClass().getClassLoader().getResource("presentacion/cursorNubesYClaros.png"));
		//Creación de los cursores
		cursorRectangulo = toolkit.createCustomCursor(imagRectangulo,new Point(0,0),"CURSOR_RECTANGULO");
		cursorTexto= toolkit.createCustomCursor(imagTexto,new Point(0,0),"CURSOR_TEXTO");
		cursorSoleado = toolkit.createCustomCursor(imagCursorSoleado,new Point(0,0),"CURSOR_SOL");
		cursorNublado = toolkit.createCustomCursor(imagCursorNublado,new Point(0,0),"CURSOR_NUBLADO");
		

	}

}
