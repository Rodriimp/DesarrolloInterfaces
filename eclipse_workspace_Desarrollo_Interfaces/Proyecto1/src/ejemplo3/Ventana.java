package ejemplo3;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void inicializar() {

		setTitle("Esto es una prueba");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creo un botón
		JButton boton = new JButton();
		boton.setText("Probando");
		JButton boton2 = new JButton();
		boton2.setText("CANCELANDO");

		// Obtengo el contenedor y añado el botón
		Container contenedor = getContentPane();

		GridLayout layout = new GridLayout(4, 2);
		setLayout(layout);

		// Creamos un panel para la primera celda y le establecemos su propio layout
		JPanel panelPrimeraCelda = new JPanel();
		GridLayout layoutPrimeraCelda = new GridLayout(1, 2);
		panelPrimeraCelda.setLayout(layoutPrimeraCelda);

		contenedor.add(panelPrimeraCelda);

		for (int i = 1; i <= 7; i++) {
			JButton b = new JButton();
			b.setText("Boton " + i);
			contenedor.add(b);

		}

		for (int i = 1; i <= 2; i++) {
			JButton b = new JButton();
			panelPrimeraCelda.add(b);
			b.setText("B. 1era celda " + i);

		}

	}
}
