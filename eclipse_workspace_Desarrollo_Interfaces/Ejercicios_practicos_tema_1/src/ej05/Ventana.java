package ej05;

import java.awt.Container;
import java.awt.GridLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void inicializar() {

		setTitle("Ejercicio 3 (Botones)");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cargarComponentes();
	}

	public void cargarComponentes() {
		GridLayout layout = new GridLayout(2, 1);
		Container contenedorPrincipal = getContentPane();

		JButton boton = new JButton();
		JLabel label = new JLabel();
		label.setText("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contenedorPrincipal.setLayout(layout);

		MouseListener mouseListener = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				if (label.getText().isEmpty()) {
					label.setText("1");
				} else {
					int i = Integer.parseInt(label.getText()) + 1;
					label.setText(String.valueOf(i));
				}
			}
		};

		boton.addMouseListener(mouseListener);
		boton.setText("SUMAR");
		contenedorPrincipal.add(boton);
		contenedorPrincipal.add(label);
	}
}
