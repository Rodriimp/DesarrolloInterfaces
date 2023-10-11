package ej01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

		Container contenedor = getContentPane();

		GridLayout layout = new GridLayout(3, 2);
		setLayout(layout);

		JPanel panelUltimaCelda = new JPanel();
		GridLayout layoutUltimaCelda = new GridLayout(2, 2);
		panelUltimaCelda.setLayout(layoutUltimaCelda);

		for (int i = 1; i <= 6; i++) {
			
			JLabel L = new JLabel();
			L.setText("Texto " + i);

			if (i == 6) {
				contenedor.add(panelUltimaCelda);
				for (int j = 1; j <= 4; j++) {
					
					JLabel L2 = new JLabel();
					panelUltimaCelda.add(L2);
					L2.setText("Texto" + i + j);
				}

			} else {
				contenedor.add(L);

			}

		}

	}
}
