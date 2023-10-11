package ejemplo2;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana extends JFrame {

	public void inicializar() {

		setTitle("TITULO");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container contenedor = getContentPane();
		JButton boton = new JButton();
		boton.setText("ESTO ES UN BOTON");
		contenedor.add(boton);

		setVisible(true);

	}
}
