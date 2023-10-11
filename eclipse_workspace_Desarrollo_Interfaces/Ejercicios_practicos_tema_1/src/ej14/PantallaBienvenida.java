package ej14;

import javax.swing.JLabel;
import javax.swing.JMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PantallaBienvenida extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7049195173385890712L;
	private JMenuBar menuBar;

	public PantallaBienvenida(App appControler) {
		super(appControler);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("BIENVENIDO A MI APLICACIÓN");
		lblNewLabel.setBounds(141, 58, 202, 14);
		add(lblNewLabel);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(166, 146, 89, 23);
		add(btnEntrar);

		btnEntrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appControler.irAPantalla1("");
			}
		});

	}

	public void quitarMenu() {

		menuBar.setVisible(false);
	}
}
