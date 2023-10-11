package ej04;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		GridLayout layout = new GridLayout(4, 1);
		Container contenedorPrincipal = getContentPane();

		JLabel label = new JLabel();

		contenedorPrincipal.setLayout(layout);

		ActionListener listenerBotones = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String actionCommandOrigen = e.getActionCommand();
				label.setText("Has hecho click en el " + actionCommandOrigen);

			}
		};

		MouseListener mouseListener = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				JButton botonOrigen = (JButton) e.getSource();
				botonOrigen.setText(botonOrigen.getText() + "!");

			}

			@Override
			public void mouseExited(MouseEvent e) {
				JButton botonOrigen = (JButton) e.getSource();
				botonOrigen.setBackground(null);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				JButton botonOrigen = (JButton) e.getSource();

				if (Integer.parseInt(botonOrigen.getText().substring(0, 1)) == 1) {
					botonOrigen.setBackground(Color.yellow);

				} else if (Integer.parseInt(botonOrigen.getText().substring(0, 1)) == 2) {
					botonOrigen.setBackground(Color.CYAN);
				} else {
					botonOrigen.setBackground(Color.magenta);

				}
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		};

		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton();
			boton.addActionListener(listenerBotones);
			boton.addMouseListener(mouseListener);
			boton.setText(String.valueOf(i));
			boton.setActionCommand(String.valueOf(i));
			contenedorPrincipal.add(boton);
		}

		label.setText("¿Donde has hecho click?");
		contenedorPrincipal.add(label);
	}
}
